package service.impl;

import com.entity.BrowseChronic;
import com.entity.PagerModel;
import dao.BrowseByPageDao;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.transaction.annotation.Transactional;
import service.BrowseChrDiePreService;

import java.util.List;

/**
 * Created by 郑晓辉 on 2016/8/22.
 */
public class BrowseChrDiePreServiceImpl implements BrowseChrDiePreService {

    private BrowseByPageDao<BrowseChronic> browseByPageDao;

    /**
     * 分页查询数据
     *
     * @param year
     * @param pagerModel
     * @return
     */
    @Transactional
    public JSONArray findDataByYear(String year, PagerModel pagerModel) {
        System.out.println();
        System.out.println("BrowseChrDiePre Service");

        String hql = buildHqlQuery(year);
        System.out.println("hql : " + hql);
        List<BrowseChronic> browseChronicList = browseByPageDao.findByPages(hql, pagerModel.getPageNo(), pagerModel.getPageSize());
        JSONArray chronicJsonArray = listToJson(year, browseChronicList);
        return chronicJsonArray;
    }

    /**
     * 根据HQL查询实体总数
     *
     * @param year
     * @return
     */
    @Transactional
    public long findTotalRecords(String year) {
        String hql = buildHqlQuery(year);
        return browseByPageDao.findTotalRecords(hql);
    }

    /**
     * 根据年份构建hql查询语句
     *
     * @param year
     * @return
     */
    private String buildHqlQuery(String year) {
        StringBuffer hqlBuffer = new StringBuffer();
        if (year.equals("2007")) {
            hqlBuffer.append(" SELECT new com.entity.BrowseChronic(");
            hqlBuffer.append("nd.ndName," +
                    "ne.b_Age20Pop," +
                    "ne.b_Age20PopDia," +
                    "ne.b_Age20StdPre," +
                    "ne.b_Age2044Pop," +
                    "ne.b_Age2044PopDia," +
                    "ne.b_Age2044Pre," +
                    "ne.b_Age4564Pop," +
                    "ne.b_Age4564PopDia," +
                    "ne.b_Age4564Pre," +
                    "ne.b_Age65Pop," +
                    "ne.b_Age65PopDia," +
                    "ne.b_Age65Pre," +
                    "ne.f_Age20Pop," +
                    "ne.f_Age20PopDia," +
                    "ne.f_Age20StdPre," +
                    "ne.f_Age2044Pop," +
                    "ne.f_Age2044PopDia," +
                    "ne.f_Age2044Pre," +
                    "ne.f_Age4564Pop," +
                    "ne.f_Age4564PopDia," +
                    "ne.f_Age4564Pre," +
                    "ne.f_Age65Pop," +
                    "ne.f_Age65PopDia," +
                    "ne.f_Age65Pre," +
                    "ne.m_Age20Pop," +
                    "ne.m_Age20PopDia," +
                    "ne.m_Age20StdPre," +
                    "ne.m_Age2044Pop," +
                    "ne.m_Age2044PopDia," +
                    "ne.m_Age2044Pre," +
                    "ne.m_Age4564Pop," +
                    "ne.m_Age4564PopDia," +
                    "ne.m_Age4564Pre," +
                    "ne.m_Age65Pop," +
                    "ne.m_Age65PopDia," +
                    "ne.m_Age65Pre");
            hqlBuffer.append(") FROM Neighborhood nd,NeighborhoodDiabetesPrevalence ne ");
            hqlBuffer.append(" WHERE ne.ctDiaYear LIKE '%" + year + "%'");
            hqlBuffer.append(" AND nd.ndId=ne.ndId ");
        }
        if (year.equals("2011")) {
            hqlBuffer.append("SELECT new com.entity.BrowseChronic(");
            hqlBuffer.append("nd.ndName," +
                    "ne.b_Age20Pop," +
                    "ne.b_Age20PopDia," +
                    "ne.b_Age20Pre," +
                    "ne.b_Age20StdPre," +
                    "ne.b_Age2044Pop," +
                    "ne.b_Age2044PopDia," +
                    "ne.b_Age2044Pre," +
                    "ne.b_Age4564Pop," +
                    "ne.b_Age4564PopDia," +
                    "ne.b_Age4564Pre," +
                    "ne.b_Age6584Pop," +
                    "ne.b_Age6584PopDia," +
                    "ne.b_Age6584Pre," +
                    "ne.b_Age85Pop," +
                    "ne.b_Age85PopDia," +
                    "ne.b_Age85Pre," +
                    "ne.f_Age20Pop," +
                    "ne.f_Age20PopDia," +
                    "ne.f_Age20Pre," +
                    "ne.f_Age2044Pop," +
                    "ne.f_Age2044PopDia," +
                    "ne.f_Age2044Pre," +
                    "ne.f_Age4564Pop," +
                    "ne.f_Age4564PopDia," +
                    "ne.f_Age4564Pre," +
                    "ne.f_Age6584Pop," +
                    "ne.f_Age6584PopDia," +
                    "ne.f_Age6584Pre," +
                    "ne.f_Age85Pop," +
                    "ne.f_Age85PopDia," +
                    "ne.f_Age85Pre," +
                    "ne.m_Age20Pop," +
                    "ne.m_Age20PopDia," +
                    "ne.m_Age20Pre," +
                    "ne.m_Age2044Pop," +
                    "ne.m_Age2044PopDia," +
                    "ne.m_Age2044Pre," +
                    "ne.m_Age4564Pop," +
                    "ne.m_Age4564PopDia," +
                    "ne.m_Age4564Pre," +
                    "ne.m_Age6584Pop," +
                    "ne.m_Age6584PopDia," +
                    "ne.m_Age6584Pre," +
                    "ne.m_Age85Pop," +
                    "ne.m_Age85PopDia," +
                    "ne.m_Age85Pre");
            hqlBuffer.append(") FROM Neighborhood nd,NeighborhoodDiabetesPrevalence ne ");
            hqlBuffer.append(" WHERE ne.ctDiaYear LIKE '%" + year + "%'");
            hqlBuffer.append(" AND nd.ndId=ne.ndId ");
        }
        if (year.equals("2012")) {
            hqlBuffer.append(" SELECT new com.entity.BrowseChronic(");
            hqlBuffer.append("nd.ndName," +
                    "ne.b_Age20Pop," +
                    "ne.b_Age20PopDia," +
                    "ne.b_Age20Pre," +
                    "ne.b_Age20StdPre," +
                    "ne.b_Age2044Pop," +
                    "ne.b_Age2044PopDia," +
                    "ne.b_Age2044Pre," +
                    "ne.b_Age4564Pop," +
                    "ne.b_Age4564PopDia," +
                    "ne.b_Age4564Pre," +
                    "ne.b_Age65Pop," +
                    "ne.b_Age65PopDia," +
                    "ne.b_Age65Pre," +
                    "ne.f_Age20Pop," +
                    "ne.f_Age20PopDia," +
                    "ne.f_Age20Pre," +
                    "ne.f_Age20StdPre," +
                    "ne.f_Age2044Pop," +
                    "ne.f_Age2044PopDia," +
                    "ne.f_Age2044Pre," +
                    "ne.f_Age4564Pop," +
                    "ne.f_Age4564PopDia," +
                    "ne.f_Age4564Pre," +
                    "ne.f_Age65Pop," +
                    "ne.f_Age65PopDia," +
                    "ne.f_Age65Pre," +
                    "ne.m_Age20Pop," +
                    "ne.m_Age20PopDia," +
                    "ne.m_Age20Pre," +
                    "ne.m_Age20StdPre," +
                    "ne.m_Age2044Pop," +
                    "ne.m_Age2044PopDia," +
                    "ne.m_Age2044Pre," +
                    "ne.m_Age4564Pop," +
                    "ne.m_Age4564PopDia," +
                    "ne.m_Age4564Pre," +
                    "ne.m_Age65Pop," +
                    "ne.m_Age65PopDia," +
                    "ne.m_Age65Pre");
            hqlBuffer.append(") FROM Neighborhood nd,NeighborhoodDiabetesPrevalence ne ");
            hqlBuffer.append(" WHERE ne.ctDiaYear LIKE '%" + year + "%'");
            hqlBuffer.append(" AND nd.ndId=ne.ndId ");
        }
        String hql = hqlBuffer.toString();
        return hql;
    }

    /**
     * List<BrowseChronic>数据转为JSONArray数据
     *
     * @param year
     * @param browseChronicList
     * @return
     */
    private JSONArray listToJson(String year, List<BrowseChronic> browseChronicList) {
        JSONArray chronicJsonArray = new JSONArray();
        if (year.equals("2007")) {
            for (BrowseChronic b : browseChronicList) {
                JSONObject chronicJsonObject = new JSONObject();
                chronicJsonObject.put("Nd_name", b.getNdName());
                chronicJsonObject.put("B_Age20Pop", b.getB_Age20Pop());
                chronicJsonObject.put("B_Age20PopDia", b.getB_Age20PopDia());
                chronicJsonObject.put("B_Age20StdPre", b.getB_Age20StdPre());
                chronicJsonObject.put("B_Age20_44Pop", b.getB_Age2044Pop());
                chronicJsonObject.put("B_Age20_44PopDia", b.getB_Age2044PopDia());
                chronicJsonObject.put("B_Age20_44Pre", b.getB_Age2044Pre());
                chronicJsonObject.put("B_Age45_64Pop", b.getB_Age4564Pop());
                chronicJsonObject.put("B_Age45_64PopDia", b.getB_Age4564PopDia());
                chronicJsonObject.put("B_Age45_64Pre", b.getB_Age4564Pre());
                chronicJsonObject.put("B_Age65Pop", b.getB_Age65Pop());
                chronicJsonObject.put("B_Age65PopDia", b.getB_Age65PopDia());
                chronicJsonObject.put("B_Age65Pre", b.getB_Age65Pre());
                chronicJsonObject.put("F_Age20Pop", b.getF_Age20Pop());
                chronicJsonObject.put("F_Age20PopDia", b.getF_Age20PopDia());
                chronicJsonObject.put("F_Age20StdPre", b.getF_Age20StdPre());
                chronicJsonObject.put("F_Age20_44Pop", b.getF_Age2044Pop());
                chronicJsonObject.put("F_Age20_44PopDia", b.getF_Age2044PopDia());
                chronicJsonObject.put("F_Age20_44Pre", b.getF_Age2044Pre());
                chronicJsonObject.put("F_Age45_64Pop", b.getF_Age4564Pop());
                chronicJsonObject.put("F_Age45_64PopDia", b.getF_Age4564PopDia());
                chronicJsonObject.put("F_Age45_64Pre", b.getF_Age4564Pre());
                chronicJsonObject.put("F_Age65Pop", b.getF_Age65Pop());
                chronicJsonObject.put("F_Age65PopDia", b.getF_Age65PopDia());
                chronicJsonObject.put("F_Age65Pre", b.getF_Age65Pre());
                chronicJsonObject.put("M_Age20Pop", b.getM_Age20Pop());
                chronicJsonObject.put("M_Age20PopDia", b.getM_Age20PopDia());
                chronicJsonObject.put("M_Age20StdPre", b.getM_Age20StdPre());
                chronicJsonObject.put("M_Age20_44Pop", b.getM_Age2044Pop());
                chronicJsonObject.put("M_Age20_44PopDia", b.getM_Age2044PopDia());
                chronicJsonObject.put("M_Age20_44Pre", b.getM_Age2044Pre());
                chronicJsonObject.put("M_Age45_64Pop", b.getM_Age4564Pop());
                chronicJsonObject.put("M_Age45_64PopDia", b.getM_Age4564PopDia());
                chronicJsonObject.put("M_Age45_64Pre", b.getM_Age4564Pre());
                chronicJsonObject.put("M_Age65Pop", b.getM_Age65Pop());
                chronicJsonObject.put("M_Age65PopDia", b.getM_Age65PopDia());
                chronicJsonObject.put("M_Age65Pre", b.getM_Age65Pre());
                chronicJsonArray.add(chronicJsonObject);
            }
        }
        if (year.equals("2011")) {
            for (BrowseChronic b : browseChronicList) {
                JSONObject chronicJsonObject = new JSONObject();
                chronicJsonObject.put("Nd_name", b.getNdName());
                chronicJsonObject.put("B_Age20Pop", b.getB_Age20Pop());
                chronicJsonObject.put("B_Age20PopDia", b.getB_Age20PopDia());
                chronicJsonObject.put("B_Age20Pre", b.getB_Age20Pre());
                chronicJsonObject.put("B_Age20StdPre", b.getB_Age20StdPre());
                chronicJsonObject.put("B_Age20_44Pop", b.getB_Age2044Pop());
                chronicJsonObject.put("B_Age20_44PopDia", b.getB_Age2044PopDia());
                chronicJsonObject.put("B_Age20_44Pre", b.getB_Age2044Pre());
                chronicJsonObject.put("B_Age45_64Pop", b.getB_Age4564Pop());
                chronicJsonObject.put("B_Age45_64PopDia", b.getB_Age4564PopDia());
                chronicJsonObject.put("B_Age45_64Pre", b.getB_Age4564Pre());
                chronicJsonObject.put("B_Age65_84Pop", b.getB_Age6584Pop());
                chronicJsonObject.put("B_Age65_84PopDia", b.getB_Age6584PopDia());
                chronicJsonObject.put("B_Age65_84Pre", b.getB_Age6584Pre());
                chronicJsonObject.put("B_Age85Pop", b.getB_Age85Pop());
                chronicJsonObject.put("B_Age85PopDia", b.getB_Age85PopDia());
                chronicJsonObject.put("B_Age85Pre", b.getB_Age85Pre());
                chronicJsonObject.put("F_Age20Pop", b.getF_Age20Pop());
                chronicJsonObject.put("F_Age20PopDia", b.getF_Age20PopDia());
                chronicJsonObject.put("F_Age20Pre", b.getF_Age20Pre());
                chronicJsonObject.put("F_Age20_44Pop", b.getF_Age2044Pop());
                chronicJsonObject.put("F_Age20_44PopDia", b.getF_Age2044PopDia());
                chronicJsonObject.put("F_Age20_44Pre", b.getF_Age2044Pre());
                chronicJsonObject.put("F_Age45_64Pop", b.getF_Age4564Pop());
                chronicJsonObject.put("F_Age45_64PopDia", b.getF_Age4564PopDia());
                chronicJsonObject.put("F_Age45_64Pre", b.getF_Age4564Pre());
                chronicJsonObject.put("F_Age65_84Pop", b.getF_Age6584Pop());
                chronicJsonObject.put("F_Age65_84PopDia", b.getF_Age6584PopDia());
                chronicJsonObject.put("F_Age65_84Pre", b.getF_Age6584Pre());
                chronicJsonObject.put("F_Age85Pop", b.getF_Age85Pop());
                chronicJsonObject.put("F_Age85PopDia", b.getF_Age85PopDia());
                chronicJsonObject.put("F_Age85Pre", b.getF_Age85Pre());
                chronicJsonObject.put("M_Age20Pop", b.getM_Age20Pop());
                chronicJsonObject.put("M_Age20PopDia", b.getM_Age20PopDia());
                chronicJsonObject.put("M_Age20Pre", b.getM_Age20Pre());
                chronicJsonObject.put("M_Age20_44Pop", b.getM_Age2044Pop());
                chronicJsonObject.put("M_Age20_44PopDia", b.getM_Age2044PopDia());
                chronicJsonObject.put("M_Age20_44Pre", b.getM_Age2044Pre());
                chronicJsonObject.put("M_Age45_64Pop", b.getM_Age4564Pop());
                chronicJsonObject.put("M_Age45_64PopDia", b.getM_Age4564PopDia());
                chronicJsonObject.put("M_Age45_64Pre", b.getM_Age4564Pre());
                chronicJsonObject.put("M_Age65_84Pop", b.getM_Age6584Pop());
                chronicJsonObject.put("M_Age65_84PopDia", b.getM_Age6584PopDia());
                chronicJsonObject.put("M_Age65_84Pre", b.getM_Age6584Pre());
                chronicJsonObject.put("M_Age85Pop", b.getM_Age85Pop());
                chronicJsonObject.put("M_Age85PopDia", b.getM_Age85PopDia());
                chronicJsonObject.put("M_Age85Pre", b.getM_Age85Pre());
                chronicJsonArray.add(chronicJsonObject);
            }
        }
        if (year.equals("2012")) {
            for (BrowseChronic b : browseChronicList) {
                JSONObject chronicJsonObject = new JSONObject();
                chronicJsonObject.put("Nd_name", b.getNdName());
                chronicJsonObject.put("B_Age20Pop", b.getB_Age20Pop());
                chronicJsonObject.put("B_Age20PopDia", b.getB_Age20PopDia());
                chronicJsonObject.put("B_Age20Pre", b.getB_Age20Pre());
                chronicJsonObject.put("B_Age20StdPre", b.getB_Age20StdPre());
                chronicJsonObject.put("B_Age20_44Pop", b.getB_Age2044Pop());
                chronicJsonObject.put("B_Age20_44PopDia", b.getB_Age2044PopDia());
                chronicJsonObject.put("B_Age20_44Pre", b.getB_Age2044Pre());
                chronicJsonObject.put("B_Age45_64Pop", b.getB_Age4564Pop());
                chronicJsonObject.put("B_Age45_64PopDia", b.getB_Age4564PopDia());
                chronicJsonObject.put("B_Age45_64Pre", b.getB_Age4564Pre());
                chronicJsonObject.put("B_Age65Pop", b.getB_Age65Pop());
                chronicJsonObject.put("B_Age65PopDia", b.getB_Age65PopDia());
                chronicJsonObject.put("B_Age65Pre", b.getB_Age65Pre());
                chronicJsonObject.put("F_Age20Pop", b.getF_Age20Pop());
                chronicJsonObject.put("F_Age20PopDia", b.getF_Age20PopDia());
                chronicJsonObject.put("F_Age20Pre", b.getF_Age20Pre());
                chronicJsonObject.put("F_Age20StdPre", b.getF_Age20StdPre());
                chronicJsonObject.put("F_Age20_44Pop", b.getF_Age2044Pop());
                chronicJsonObject.put("F_Age20_44PopDia", b.getF_Age2044PopDia());
                chronicJsonObject.put("F_Age20_44Pre", b.getF_Age2044Pre());
                chronicJsonObject.put("F_Age45_64Pop", b.getF_Age4564Pop());
                chronicJsonObject.put("F_Age45_64PopDia", b.getF_Age4564PopDia());
                chronicJsonObject.put("F_Age45_64Pre", b.getF_Age4564Pre());
                chronicJsonObject.put("F_Age65Pop", b.getF_Age65Pop());
                chronicJsonObject.put("F_Age65PopDia", b.getF_Age65PopDia());
                chronicJsonObject.put("F_Age65Pre", b.getF_Age65Pre());
                chronicJsonObject.put("M_Age20Pop", b.getM_Age20Pop());
                chronicJsonObject.put("M_Age20PopDia", b.getM_Age20PopDia());
                chronicJsonObject.put("M_Age20Pre", b.getM_Age20Pre());
                chronicJsonObject.put("M_Age20StdPre", b.getM_Age20StdPre());
                chronicJsonObject.put("M_Age20_44Pop", b.getM_Age2044Pop());
                chronicJsonObject.put("M_Age20_44PopDia", b.getM_Age2044PopDia());
                chronicJsonObject.put("M_Age20_44Pre", b.getM_Age2044Pre());
                chronicJsonObject.put("M_Age45_64Pop", b.getM_Age4564Pop());
                chronicJsonObject.put("M_Age45_64PopDia", b.getM_Age4564PopDia());
                chronicJsonObject.put("M_Age45_64Pre", b.getM_Age4564Pre());
                chronicJsonObject.put("M_Age65Pop", b.getM_Age65Pop());
                chronicJsonObject.put("M_Age65PopDia", b.getM_Age65PopDia());
                chronicJsonObject.put("M_Age65Pre", b.getM_Age65Pre());
                chronicJsonArray.add(chronicJsonObject);
            }
        }
        return chronicJsonArray;
    }

    public BrowseByPageDao getBrowseByPageDao() {
        return browseByPageDao;
    }

    public void setBrowseByPageDao(BrowseByPageDao browseByPageDao) {
        this.browseByPageDao = browseByPageDao;
    }
}
