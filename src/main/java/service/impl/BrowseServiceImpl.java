package service.impl;

import com.entity.Indicator;
import com.entity.PagerModel;
import com.entity.QueryParam;
import dao.BrowseByPageDao;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.transaction.annotation.Transactional;
import service.BrowseService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by 郑晓辉 on 2016/8/29.
 */
public class BrowseServiceImpl implements BrowseService {
    private BrowseByPageDao<Object[]> browseDao;

    @Transactional
    public long findTotalRecords(QueryParam queryParam, List<Indicator> indicatorList) {
        String hql = buildHql(queryParam, indicatorList);
        return browseDao.findTotalRecords(hql);
    }

    @Transactional
    public JSONArray findByPage(QueryParam queryParam, List<Indicator> indicatorList, PagerModel pagerModel) {
        String hql = buildHql(queryParam, indicatorList);
        List<Object[]> testData = browseDao.findByPages(hql, pagerModel.getPageNo(), pagerModel.getPageSize());
        return buildJSONArray(indicatorList, testData);
    }

    private String buildHql(QueryParam queryParam, List<Indicator> indicatorList) {
        if (indicatorList.size() <= 0) {
            return null;
        }
        Set<String> fromEntity = new HashSet<String>();
        StringBuffer selectBuffer = new StringBuffer();
        StringBuffer whereBuffer = new StringBuffer();
        fromEntity.add("Neighborhood AS nd");
        if (queryParam.getMainClass().equals("Chronic Disease") && queryParam.getSubClass().equals("Diabetes")) {
            if (queryParam.getDataSource().equals("Toronto Community Health Profiles Partnership")) {
                whereBuffer.append(" WHERE nd.ndId=ndp.ndId");
                whereBuffer.append(" AND ndp.ctDiaYear like '%" + queryParam.getYear() + "%'");
            }
        }
        if (queryParam.getMainClass().equals("Demographic profiles")) {
            if (queryParam.getSubClass().equals("Population")) {
                if (queryParam.getDataSource().equals("Canada Census")) {
                    if (queryParam.getYear().equals("2006") || queryParam.getYear().equals("2011")) {
                        fromEntity.add("CensusTract AS ct");
                        whereBuffer.append(" WHERE ct.ctId=cagp.ctId AND ct.ctYear=cagp.ctYear");
                        whereBuffer.append(" AND nd.ndId=ct.ndId");
                        whereBuffer.append(" AND cagp.ctYear LIKE '%" + queryParam.getYear() + "%'");
                    }
                }
                if (queryParam.getDataSource().equals("Wellbeing Toronto")) {
                    if (queryParam.getYear().equals("2006") || queryParam.getYear().equals("2011")) {
                        whereBuffer.append(" WHERE nd.ndId=ncp.ndId AND ncp.ndId=nm.ndId AND ncp.ctYear=nm.ctYear");
                        whereBuffer.append(" AND ncp.ctYear LIKE '%" + queryParam.getYear() + "%'");
                    }
                }
            }
            if (queryParam.getSubClass().equals("Age")) {
                if (queryParam.getDataSource().equals("Canada Census")) {
                    if (queryParam.getYear().equals("2006") || queryParam.getYear().equals("2011")) {
                        fromEntity.add("CensusTract AS ct");
                        whereBuffer.append(" WHERE ct.ctId=cagp.ctId AND ct.ctYear=cagp.ctYear");
                        whereBuffer.append(" AND cagp.ctYear LIKE '%" + queryParam.getYear() + "%'");
                        whereBuffer.append(" AND nd.ndId=ct.ndId");
                    }
                }
                if (queryParam.getDataSource().equals("Wellbeing Toronto")) {
                    if (queryParam.getYear().equals("2006") || queryParam.getYear().equals("2011")) {
                        whereBuffer.append(" WHERE ncp.ndId=nd.ndId AND ncp.ctYear LIKE '%" + queryParam.getYear() + "%'");
                    }
                }
            }
            if (queryParam.getSubClass().equals("Sex")) {
                if (queryParam.getDataSource().equals("Canada Census")) {
                    if (queryParam.getYear().equals("2006") || queryParam.getYear().equals("2011")) {
                        fromEntity.add("CensusTract AS ct");
                        whereBuffer.append(" WHERE ct.ctId=cagp.ctId AND ct.ctYear=cagp.ctYear AND nd.ndId=ct.ndId");
                        whereBuffer.append(" AND cagp.ctYear LIKE '%" + queryParam.getYear() + "%'");
                    }
                }
                if (queryParam.getDataSource().equals("Wellbeing Toronto")) {
                    if (queryParam.getYear().equals("2006") || queryParam.getYear().equals("2011")) {
                        whereBuffer.append(" WHERE ncp.ndId=nd.ndId AND ncp.ctYear LIKE '%" + queryParam.getYear() + "%'");
                    }
                }
            }
            if (queryParam.getSubClass().equals("Ethnicity")) {
                if (queryParam.getDataSource().equals("Canada Census")) {
                    if (queryParam.getYear().equals("2006")) {
                    }
                    if (queryParam.getYear().equals("2011")) {
                    }
                }
                if (queryParam.getDataSource().equals("Wellbeing Toronto")) {
                    if (queryParam.getYear().equals("2006") || queryParam.getYear().equals("2011")) {
                        whereBuffer.append(" WHERE nm.ndId=nd.ndId AND nm.ctYear LIKE '%" + queryParam.getYear() + "%'");
                    }
                }
            }
        }
        if (queryParam.getMainClass().equals("socio-economic status")){
            if (queryParam.getSubClass().equals("Immigrant status")){
                if (queryParam.getDataSource().equals("Canada Census")){
                    if (queryParam.getYear().equals("2006")){

                    }
                    if (queryParam.getYear().equals("2011")){

                    }
                }
                if (queryParam.getDataSource().equals("Wellbeing Toronto")){
                    if (queryParam.getYear().equals("2006")){

                    }
                    if (queryParam.getYear().equals("2011")){

                    }
                }
            }
        }

        selectBuffer.append("SELECT ");
        selectBuffer.append("nd.ndName,");
        for (int i = 0; i < indicatorList.size(); i++) {
            selectBuffer.append(indicatorList.get(i).getEntityAlias() + "." + indicatorList.get(i).getEntityIdentity());
            fromEntity.add(indicatorList.get(i).getEntityName() + " AS " + indicatorList.get(i).getEntityAlias());
            if (i + 1 == indicatorList.size()) {
                break;
            }
            selectBuffer.append(",");
        }
        System.out.println(" Select: " + selectBuffer.toString());
        StringBuffer fromBuffer = new StringBuffer();
        fromBuffer.append(" FROM ");
        int i = 0;
        for (String str : fromEntity) {
            if (i + 1 >= fromEntity.size()) {
                fromBuffer.append(str);
                break;
            }
            fromBuffer.append(str + ",");
            i++;
        }
        System.out.println(" fromBuffer : " + fromBuffer.toString());
        System.out.println(" hql : " + selectBuffer.toString() + fromBuffer.toString() + whereBuffer.toString());
        return selectBuffer.toString() + fromBuffer.toString() + whereBuffer.toString();
    }

    private JSONArray buildJSONArray(List<Indicator> indicatorList, List<Object[]> respondData) {
        JSONArray jsonArray = new JSONArray();
        System.out.println("List<Object[]> respondData.size() :" + respondData.size());
        for (Object[] object : respondData) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("Nd_name", object[0].toString());
            for (int i = 0; i < indicatorList.size(); i++) {
                jsonObject.put(indicatorList.get(i).getFieldName(), object[i + 1]);
            }
            jsonArray.add(jsonObject);
        }
        return jsonArray;
    }

    public BrowseByPageDao<Object[]> getBrowseDao() {
        return browseDao;
    }

    public void setBrowseDao(BrowseByPageDao<Object[]> browseDao) {
        this.browseDao = browseDao;
    }
}
