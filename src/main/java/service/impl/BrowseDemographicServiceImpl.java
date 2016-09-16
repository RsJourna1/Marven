package service.impl;

import com.entity.*;
import com.entity.PagerModel;
import dao.BrowseByPageDao;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.transaction.annotation.Transactional;
import service.BrowseDemographicService;

import java.util.List;

/**
 * Created by 郑晓辉 on 2016/8/25.
 */
public class BrowseDemographicServiceImpl implements BrowseDemographicService {
    private BrowseByPageDao<BrowseDemographic> browseByPageDao;

    /**
     * 根据year dataSource 来查询数据
     *
     * @param year
     * @param dataSource
     * @param subClass
     * @param pagerModel
     * @return
     */
    @Transactional
    public JSONArray findData(String year, String dataSource, String subClass, PagerModel pagerModel) {
        System.out.println();
        System.out.println("BrowseDemographic Service :");

        String hql = buildHql(year, dataSource, subClass);
        List<BrowseDemographic> dataList = browseByPageDao.findByPages(hql, pagerModel.getPageNo(), pagerModel.getPageSize());
        return listToJson(dataList, year, dataSource, subClass);
    }

    /**
     * 根据year、dataSource 来获取总计录数
     *
     * @param year
     * @param dataSource
     * @param subClass
     * @return
     */
    @Transactional
    public long findTotalRecords(String year, String dataSource, String subClass) {
        String hql = buildHql(year, dataSource, subClass);
        return browseByPageDao.findTotalRecords(hql);
    }

    /**
     * 根据year和dataSource来构建Hql语句
     *
     * @param year
     * @param dataSource
     * @param subClass
     * @return
     */
    private String buildHql(String year, String dataSource, String subClass) {
        StringBuffer hqlBuffer = new StringBuffer();

        if (year.equals("2006")) {
            if (dataSource.equals("Canada Census")) {
                if (subClass.equals("Population") || subClass.equals("Age") || subClass.equals("Sex")) {
                    hqlBuffer.append("SELECT new com.entity.BrowseDemographic(");
                    hqlBuffer.append("nd.ndName,ca.b_TlPop,ca.m_TlPop,ca.f_TlPop,ca.b_Age04Pop,ca.b_Age1014Pop,ca.b_Age1519Pop,ca.b_Age15Pop,ca.b_Age16Pop,ca.b_Age17Pop,ca.b_Age18Pop,ca.b_Age19Pop,ca.b_Age2024Pop,ca.b_Age2529Pop,ca.b_Age3034Pop,ca.b_Age3539Pop,ca.b_Age4044Pop,ca.b_Age4549Pop,ca.b_Age5054Pop,ca.b_Age5559Pop,ca.b_Age59Pop,ca.b_Age6064Pop,ca.b_Age6569Pop,ca.b_Age7074Pop,ca.b_Age7579Pop,ca.b_Age8084Pop,ca.b_AgeOver85Pop,ca.f_Age04Pop,ca.f_Age1014Pop,ca.f_Age1519Pop,ca.f_Age2024Pop,ca.f_Age2529Pop,ca.f_Age3034Pop,ca.f_Age3539Pop,ca.f_Age4044Pop,ca.f_Age4549Pop,ca.f_Age5054Pop,ca.f_Age5559Pop,ca.f_Age59Pop,ca.f_Age6064Pop,ca.f_Age6569Pop,ca.f_Age7074Pop,ca.f_Age7579Pop,ca.f_Age8084Pop,ca.f_AgeOver85Pop,ca.m_Age04Pop,ca.m_Age1014Pop,ca.m_Age1519Pop,ca.m_Age2024Pop,ca.m_Age2529Pop,ca.m_Age3034Pop,ca.m_Age3539Pop,ca.m_Age4044Pop,ca.m_Age4549Pop,ca.m_Age5054Pop,ca.m_Age5559Pop,ca.m_Age59Pop,ca.m_Age6064Pop,ca.m_Age6569Pop,ca.m_Age7074Pop,ca.m_Age7579Pop,ca.m_Age8084Pop,ca.m_AgeOver85Pop)");
                    hqlBuffer.append(" FROM CensusAgeGroupPopulation AS ca,Neighborhood AS nd,CensusTract AS ct");
                    hqlBuffer.append(" WHERE ca.ctYear LIKE '%" + year + "%'");
                    hqlBuffer.append(" AND ca.ctYear=ct.ctYear AND ca.ctId=ct.ctId");
                    hqlBuffer.append(" AND nd.ndId=ct.ndId");
                }
            }
            if (dataSource.equals("Wellbeing Toronto")) {
                if (subClass.equals("Population")) {
                    hqlBuffer.append("SELECT new com.entity.BrowseDemographic(");
                    hqlBuffer.append("nd.ndName,nc.tlF_NdPop, nc.tlNdPop, nc.tlMNdPop,nc.agegroup04NdPop, nc.agegroup612NdPop, nc.agegroup1014NdPop, nc.agegroup1519NdPop, nc.agegroup2024NdPop,nc.agegroup2529NdPop,nc.agegroup3034NdPop, nc.agegroup3539NdPop, nc.agegroup4044NdPop, nc.agegroup4549NdPop, nc.agegroup5054NdPop, nc.agegroup5559NdPop, nc.agegroup59NdPop, nc.agegroup6064NdPop, nc.agegroup6569NdPop,nc.agegroup7074NdPop,nc.agegroup7579NdPop,nc.agegroup8084NdPop,nc.agegroup85OverNdPop,nm.arabNdPop, nm.blackNdPop, nm.koreanNdPop, nm.chineseNdPop, nm.lanUrduNdPop, nm.filipinoNdPop,nm.japaneseNdPop, nm.lanTamilNdPop, nm.westAsianNdPop, nm.lanKoreanNdPop, nm.southAsianNdPop, nm.lanChineseNdPop,nm.lanItalianNdPop,nm.lanRussianNdPop,nm.lanSpanishNdPop,nm.lanTagalogNdPop, nm.latinAmericanNdPop, nm.lanPortugueseNdPop, nm.southeastAsianNdPop,nm.tlHomeLanguageNdTPop, nm.tlVisibleMinorityNdPop,nm.lanPersianFarsiNdPop,nm.noVisibleMinorityNdTPop, nm.otherVisibleMinorityNdPop, nm.multipleVisibleMinorityNdPop)");
                    hqlBuffer.append(" FROM Neighborhood AS nd,NeighborhoodCategoryPopulation AS nc,NeighborhoodMinority AS nm,CensusTract AS ct");
                    hqlBuffer.append(" WHERE nc.ctYear LIKE '%" + year + "%'");
                    hqlBuffer.append(" AND nc.ctYear=nm.ctYear AND nc.ndId=nm.ndId");
                    hqlBuffer.append(" AND ct.ctYear=nc.ctYear AND ct.ndId=nc.ndId");
                    hqlBuffer.append(" AND nd.ndId=ct.ndId");
                }
                if (subClass.equals("Age")) {
                    hqlBuffer.append("SELECT new com.entity.BrowseDemographic(");
                    hqlBuffer.append("nd.ndName,nc.tlMNdPop,nc.tlF_NdPop,nc.agegroup04NdPop,nc.agegroup59NdPop,nc.agegroup612NdPop,nc.agegroup1014NdPop,nc.agegroup1519NdPop,nc.agegroup2024NdPop,nc.agegroup3034NdPop,nc.agegroup2529NdPop,nc.agegroup3539NdPop,nc.agegroup4044NdPop,nc.agegroup4549NdPop,nc.agegroup5054NdPop,nc.agegroup5559NdPop,nc.agegroup6064NdPop,nc.agegroup6569NdPop,nc.agegroup7074NdPop,nc.agegroup7579NdPop,nc.agegroup8084NdPop,nc.agegroup85OverNdPop");
                    hqlBuffer.append(") FROM Neighborhood nd,NeighborhoodCategoryPopulation AS nc");
                    hqlBuffer.append(" WHERE nc.ctYear LIKE '%" + year + "%'");
                    hqlBuffer.append(" AND nd.ndId=nc.ndId");
                }
                if (subClass.equals("Sex")) {
                    hqlBuffer.append("SELECT new com.entity.BrowseDemographic(");
                    hqlBuffer.append("nd.ndName,nc.tlF_NdPop,nc.tlMNdPop");
                    hqlBuffer.append(") FROM Neighborhood nd,NeighborhoodCategoryPopulation nc");
                    hqlBuffer.append(" WHERE nc.ctYear LIKE '%" + year + "%'");
                    hqlBuffer.append(" AND nc.ndId=nd.ndId");
                }
                if (subClass.equals("Ethnicity")) {
                    hqlBuffer.append("SELECT new com.entity.BrowseDemographic(");
                    hqlBuffer.append("nm.tlVisibleMinorityNdPop, nm.tlHomeLanguageNdTPop, nm.arabNdPop,nm.blackNdPop, nm.chineseNdPop, nm.filipinoNdPop, nm.japaneseNdPop, nm.koreanNdPop, nm.lanChineseNdPop, nm.lanItalianNdPop,nm.lanKoreanNdPop,nm.lanPersianFarsiNdPop,nm.lanPortugueseNdPop, nm.lanRussianNdPop, nm.lanSpanishNdPop, nm.lanTagalogNdPop,nm.lanTamilNdPop, nm.lanUrduNdPop, nm.latinAmericanNdPop, nm.multipleVisibleMinorityNdPop,nm.noVisibleMinorityNdTPop,nm.otherVisibleMinorityNdPop,nm.southAsianNdPop, nm.southeastAsianNdPop, nm.westAsianNdPop,nd.ndName");
                    hqlBuffer.append(") FROM Neighborhood nd,NeighborhoodMinority nm");
                    hqlBuffer.append(" WHERE nd.ndId=nm.ndId");
                    hqlBuffer.append(" AND nm.ctYear LIKE '%" + year + "%'");

                }
            }
        }
        if (year.equals("2011")) {
            if (dataSource.equals("Canada Census")) {
                if (subClass.equals("Population") || subClass.equals("Age")) {
                    hqlBuffer.append("SELECT new com.entity.BrowseDemographic(");
                    hqlBuffer.append("nb.ndName,ca.b_TlPop,ca.medianAgePop,ca.ageOver15Rate,ca.b_Age15Pop,ca.b_Age16Pop,ca.b_Age17Pop,ca.b_Age18Pop,ca.b_Age19Pop,ca.b_Age04Pop,ca.b_Age59Pop,ca.b_Age1014Pop,ca.b_Age1519Pop,ca.b_Age2024Pop,ca.b_Age2529Pop,ca.b_Age3034Pop,ca.b_Age3539Pop,ca.b_Age4044Pop,ca.b_Age4549Pop,ca.b_Age5054Pop,ca.b_Age5559Pop,ca.b_Age6064Pop,ca.b_Age6569Pop,ca.b_Age7074Pop,ca.b_Age7579Pop,ca.b_Age8084Pop,ca.b_AgeOver85Pop");
                    hqlBuffer.append(") FROM Neighborhood AS nb,CensusAgeGroupPopulation AS ca,CensusTract AS ct");
                    hqlBuffer.append(" WHERE ca.ctYear LIKE '%" + year + "%'");
                    hqlBuffer.append(" AND ct.ctId=ca.ctId AND ct.ctYear=ca.ctYear");
                    hqlBuffer.append(" AND nb.ndId=ct.ndId");
                }
                if(subClass.equals("Sex")){
                    hqlBuffer.append("SELECT new com.entity.BrowseDemographic(");
                    hqlBuffer.append("nb.ndName,ca.b_TlPop, ca.b_Age04Pop, ca.b_Age1014Pop, ca.b_Age1519Pop, ca.b_Age15Pop, ca.b_Age16Pop, ca.b_Age17Pop, ca.b_Age18Pop, ca.b_Age19Pop, ca.b_Age2024Pop, ca.b_Age2529Pop, ca.b_Age3034Pop, ca.b_Age3539Pop, ca.b_Age4044Pop, ca.b_Age4549Pop, ca.b_Age5054Pop, ca.b_Age5559Pop, ca.b_Age59Pop, ca.b_Age6064Pop, ca.b_Age6569Pop, ca.b_Age7074Pop, ca.b_Age7579Pop, ca.b_Age8084Pop, ca.b_AgeOver85Pop");
                    hqlBuffer.append(") FROM Neighborhood AS nb,CensusAgeGroupPopulation AS ca,CensusTract AS ct");
                    hqlBuffer.append(" WHERE ca.ctYear LIKE '%" + year + "%'");
                    hqlBuffer.append(" AND ct.ctId=ca.ctId AND ct.ctYear=ca.ctYear");
                    hqlBuffer.append(" AND nb.ndId=ct.ndId");
                }
            }
            if (dataSource.equals("Wellbeing Toronto")) {
                if (subClass.equals("Population")) {
                    hqlBuffer.append("SELECT new com.entity.BrowseDemographic(");
                    hqlBuffer.append("nd.ndName,nc.tlNdPop, nc.tlF_NdPop, nc.tlMNdPop,nm.tlHomeLanguageNdTPop,nc.childAge014NdPop,nc.senior55OverNdPop,nc.senior65OverNdPop,nc.youthAge1524NdPop,nc.seniorLiveAloneNdPop,nc.agegroup04NdPop, nc.agegroup59NdPop,nc.agegroup1014NdPop, nc.agegroup1519NdPop, nc.agegroup2024NdPop, nc.agegroup2529NdPop, nc.agegroup3034NdPop, nc.agegroup3539NdPop, nc.agegroup4044NdPop, nc.agegroup4549NdPop, nc.agegroup5054NdPop,nc.agegroup5559NdPop, nc.agegroup6064NdPop, nc.agegroup6569NdPop,nc.agegroup7074NdPop, nc.agegroup8084NdPop, nc.agegroup85OverNdPop, nm.lanUrduNdPop, nm.lanTamilNdPop, nm.lanKoreanNdPop, nm.lanChineseNdPop, nm.lanItalianNdPop, nm.lanRussianNdPop, nm.lanSpanishNdPop, nm.lanTagalogNdPop, nm.lanPortugueseNdPop, nm.lanPersianFarsiNdPop)");
                    hqlBuffer.append(" FROM Neighborhood AS nd,NeighborhoodCategoryPopulation AS nc,NeighborhoodMinority AS nm,CensusTract AS ct");
                    hqlBuffer.append(" WHERE nc.ctYear LIKE '%" + year + "%'");
                    hqlBuffer.append(" AND nc.ctYear=nm.ctYear AND nc.ndId=nm.ndId");
                    hqlBuffer.append(" AND ct.ctYear=nc.ctYear AND ct.ndId=nc.ndId");
                    hqlBuffer.append(" AND nd.ndId=ct.ndId");
                    System.out.println(" hql : " + hqlBuffer.toString());
                }
                if (subClass.equals("Age")) {
                    hqlBuffer.append("SELECT new com.entity.BrowseDemographic(");
                    hqlBuffer.append("nd.ndName,nc.tlF_NdPop,nc.tlMNdPop,nc.youthAge1524NdPop,nc.senior55OverNdPop,nc.senior65OverNdPop,nc.seniorLiveAloneNdPop,nc.childAge014NdPop,nc.agegroup04NdPop,nc.agegroup59NdPop,nc.agegroup1014NdPop,nc.agegroup1519NdPop,nc.agegroup2024NdPop,nc.agegroup2529NdPop,nc.agegroup3034NdPop,nc.agegroup3539NdPop,nc.agegroup4044NdPop,nc.agegroup4549NdPop,nc.agegroup5054NdPop,nc.agegroup5559NdPop,nc.agegroup6064NdPop,nc.agegroup6569NdPop,nc.agegroup7074NdPop,nc.agegroup7579NdPop,nc.agegroup8084NdPop,nc.agegroup85OverNdPop");
                    hqlBuffer.append(") FROM Neighborhood nd,NeighborhoodCategoryPopulation nc");
                    hqlBuffer.append(" WHERE nd.ndId=nc.ndId");
                    hqlBuffer.append(" AND nc.ctYear LIKE '%" + year + "%'");
                }
                if (subClass.equals("Sex")) {
                    hqlBuffer.append("SELECT new com.entity.BrowseDemographic(");
                    hqlBuffer.append("nd.ndName,nc.tlF_NdPop,nc.tlMNdPop");
                    hqlBuffer.append(") FROM Neighborhood nd,NeighborhoodCategoryPopulation nc");
                    hqlBuffer.append(" WHERE nc.ctYear LIKE '%" + year + "%'");
                    hqlBuffer.append(" AND nc.ndId=nd.ndId ");
                }
                if (subClass.equals("Ethnicity")){
                    hqlBuffer.append("SELECT new com.entity.BrowseDemographic(");
                    hqlBuffer.append("nd.ndName,nm.tlHomeLanguageNdTPop, nm.lanChineseNdPop, nm.lanItalianNdPop, nm.lanKoreanNdPop, nm.lanPersianFarsiNdPop, nm.lanPortugueseNdPop, nm.lanRussianNdPop, nm.lanSpanishNdPop,nm.lanTagalogNdPop, nm.lanTamilNdPop,nm.lanUrduNdPop");
                    hqlBuffer.append(") FROM Neighborhood nd,NeighborhoodMinority nm");
                    hqlBuffer.append(" WHERE nm.ctYear LIKE '%"+year+"%'");
                    hqlBuffer.append(" AND nm.ndId=nd.ndId");
                }
            }

        }
        String hql = hqlBuffer.toString();
        System.out.println("hql :" + hql);
        return hql;
    }

    /**
     * List转为JSONArray
     *
     * @param dataList
     * @param year
     * @param dataSource
     * @return
     */
    private JSONArray listToJson(List<BrowseDemographic> dataList, String year, String dataSource, String subClass) {
        JSONArray jsonArray = new JSONArray();
        if (year.equals("2006")) {
            if (dataSource.equals("Canada Census")) {
                if (subClass.equals("Population") || subClass.equals("Age") || subClass.equals("Sex")) {
                    for (BrowseDemographic b : dataList) {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("Nd_name", b.getNdName());
                        jsonObject.put("B_TlPop", b.getB_TlPop());
                        jsonObject.put("M_TlPop", b.getM_TlPop());
                        jsonObject.put("F_TlPop", b.getF_TlPop());
                        jsonObject.put("B_Age0_4Pop", b.getB_Age04Pop());
                        jsonObject.put("B_Age5_9Pop", b.getB_Age59Pop());
                        jsonObject.put("B_Age10_14Pop", b.getB_Age1014Pop());
                        jsonObject.put("B_Age15Pop", b.getB_Age15Pop());
                        jsonObject.put("B_Age15_19Pop", b.getB_Age1519Pop());
                        jsonObject.put("B_Age16Pop", b.getB_Age16Pop());
                        jsonObject.put("B_Age17Pop", b.getB_Age17Pop());
                        jsonObject.put("B_Age18Pop", b.getB_Age18Pop());
                        jsonObject.put("B_Age19Pop", b.getB_Age19Pop());
                        jsonObject.put("B_Age20_24Pop", b.getB_Age2024Pop());
                        jsonObject.put("B_Age25_29Pop", b.getB_Age2529Pop());
                        jsonObject.put("B_Age30_34Pop", b.getB_Age3034Pop());
                        jsonObject.put("B_Age35_39Pop", b.getB_Age3539Pop());
                        jsonObject.put("B_Age40_44Pop", b.getB_Age4044Pop());
                        jsonObject.put("B_Age45_49Pop", b.getB_Age4549Pop());
                        jsonObject.put("B_Age50_54Pop", b.getB_Age5054Pop());
                        jsonObject.put("B_Age55_59Pop", b.getB_Age5559Pop());
                        jsonObject.put("B_Age60_64Pop", b.getB_Age6064Pop());
                        jsonObject.put("B_Age65_69Pop", b.getB_Age6569Pop());
                        jsonObject.put("B_Age70_74Pop", b.getB_Age7074Pop());
                        jsonObject.put("B_Age75_79Pop", b.getB_Age7579Pop());
                        jsonObject.put("B_Age80_84Pop", b.getB_Age8084Pop());
                        jsonObject.put("B_AgeOver85Pop", b.getB_AgeOver85Pop());
                        jsonObject.put("M_Age0_4Pop", b.getM_Age04Pop());
                        jsonObject.put("M_Age5_9Pop", b.getM_Age59Pop());
                        jsonObject.put("M_Age10_14Pop", b.getM_Age1014Pop());
                        jsonObject.put("M_Age15_19Pop", b.getM_Age1519Pop());
                        jsonObject.put("M_Age20_24Pop", b.getM_Age2024Pop());
                        jsonObject.put("M_Age25_29Pop", b.getM_Age2529Pop());
                        jsonObject.put("M_Age30_34Pop", b.getM_Age3034Pop());
                        jsonObject.put("M_Age35_39Pop", b.getM_Age3539Pop());
                        jsonObject.put("M_Age40_44Pop", b.getM_Age4044Pop());
                        jsonObject.put("M_Age45_49Pop", b.getM_Age4549Pop());
                        jsonObject.put("M_Age50_54Pop", b.getM_Age5054Pop());
                        jsonObject.put("M_Age55_59Pop", b.getM_Age5559Pop());
                        jsonObject.put("M_Age60_64Pop", b.getM_Age6064Pop());
                        jsonObject.put("M_Age65_69Pop", b.getM_Age6569Pop());
                        jsonObject.put("M_Age70_74Pop", b.getM_Age7074Pop());
                        jsonObject.put("M_Age75_79Pop", b.getM_Age7579Pop());
                        jsonObject.put("M_Age80_84Pop", b.getM_Age8084Pop());
                        jsonObject.put("M_AgeOver85Pop", b.getM_AgeOver85Pop());
                        jsonObject.put("F_Age0_4Pop", b.getF_Age04Pop());
                        jsonObject.put("F_Age5_9Pop", b.getF_Age59Pop());
                        jsonObject.put("F_Age10_14Pop", b.getF_Age1014Pop());
                        jsonObject.put("F_Age15_19Pop", b.getF_Age1519Pop());
                        jsonObject.put("F_Age20_24Pop", b.getF_Age2024Pop());
                        jsonObject.put("F_Age25_29Pop", b.getF_Age2529Pop());
                        jsonObject.put("F_Age30_34Pop", b.getF_Age3034Pop());
                        jsonObject.put("F_Age35_39Pop", b.getF_Age3539Pop());
                        jsonObject.put("F_Age40_44Pop", b.getF_Age4044Pop());
                        jsonObject.put("F_Age45_49Pop", b.getF_Age4549Pop());
                        jsonObject.put("F_Age50_54Pop", b.getF_Age5054Pop());
                        jsonObject.put("F_Age55_59Pop", b.getF_Age5559Pop());
                        jsonObject.put("F_Age60_64Pop", b.getF_Age6064Pop());
                        jsonObject.put("F_Age65_69Pop", b.getF_Age6569Pop());
                        jsonObject.put("F_Age70_74Pop", b.getF_Age7074Pop());
                        jsonObject.put("F_Age75_79Pop", b.getF_Age7579Pop());
                        jsonObject.put("F_Age80_84Pop", b.getF_Age8084Pop());
                        jsonObject.put("F_AgeOver85Pop", b.getF_AgeOver85Pop());
                        jsonArray.add(jsonObject);
                    }
                }
            }
            if (dataSource.equals("Wellbeing Toronto")) {
                if (subClass.equals("Population")) {
                    for (BrowseDemographic b : dataList) {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("Nd_name", b.getNdName());
                        jsonObject.put("TlNdPop", b.getTlNdPop());
                        jsonObject.put("Tl_F_NdPop", b.getTlF_NdPop());
                        jsonObject.put("Tl_M_NdPop", b.getTlMNdPop());
                        jsonObject.put("Agegroup0_4NdPop", b.getAgegroup04NdPop());
                        jsonObject.put("Agegroup5_9NdPop", b.getAgegroup59NdPop());
                        jsonObject.put("Agegroup6_12NdPop", b.getAgegroup612NdPop());
                        jsonObject.put("Agegroup10_14NdPop", b.getAgegroup1014NdPop());
                        jsonObject.put("Agegroup15_19NdPop", b.getAgegroup1519NdPop());
                        jsonObject.put("Agegroup20_24NdPop", b.getAgegroup2024NdPop());
                        jsonObject.put("Agegroup25_29NdPop", b.getAgegroup2529NdPop());
                        jsonObject.put("Agegroup30_34NdPop", b.getAgegroup3034NdPop());
                        jsonObject.put("Agegroup35_39NdPop", b.getAgegroup3539NdPop());
                        jsonObject.put("Agegroup40_44NdPop", b.getAgegroup4044NdPop());
                        jsonObject.put("Agegroup45_49NdPop", b.getAgegroup4549NdPop());
                        jsonObject.put("Agegroup50_54NdPop", b.getAgegroup5054NdPop());
                        jsonObject.put("Agegroup55_59NdPop", b.getAgegroup5559NdPop());
                        jsonObject.put("Agegroup60_64NdPop", b.getAgegroup6064NdPop());
                        jsonObject.put("Agegroup65_69NdPop", b.getAgegroup6569NdPop());
                        jsonObject.put("Agegroup70_74NdPop", b.getAgegroup7074NdPop());
                        jsonObject.put("Agegroup75_79NdPop", b.getAgegroup7579NdPop());
                        jsonObject.put("Agegroup80_84NdPop", b.getAgegroup8084NdPop());
                        jsonObject.put("Agegroup85OverNdPop", b.getAgegroup85OverNdPop());
                        jsonObject.put("Arab_NdPop", b.getArabNdPop());
                        jsonObject.put("Black_NdPop", b.getBlackNdPop());
                        jsonObject.put("Korean_NdPop", b.getKoreanNdPop());
                        jsonObject.put("Chinese_NdPop", b.getChineseNdPop());
                        jsonObject.put("Filipino_NdPop", b.getFilipinoNdPop());
                        jsonObject.put("Japanese_NdPop", b.getJapaneseNdPop());
                        jsonObject.put("WestAsian_NdPop", b.getWestAsianNdPop());
                        jsonObject.put("SouthAsian_NdPop", b.getSouthAsianNdPop());
                        jsonObject.put("lanUrdu_NdPop", b.getLanUrduNdPop());
                        jsonObject.put("lanTamil_NdPop", b.getLanTamilNdPop());
                        jsonObject.put("lanKorean_NdPop", b.getLanKoreanNdPop());
                        jsonObject.put("lanChinese_NdPop", b.getLanChineseNdPop());
                        jsonObject.put("lanItalian_NdPop", b.getLanItalianNdPop());
                        jsonObject.put("lanRussian_NdPop", b.getLanRussianNdPop());
                        jsonObject.put("lanSpanish_NdPop", b.getLanSpanishNdPop());
                        jsonObject.put("lanTagalog_NdPop", b.getLanTagalogNdPop());
                        jsonObject.put("LatinAmerican_NdPop", b.getLatinAmericanNdPop());
                        jsonObject.put("lanPortuguese_NdPop", b.getLanPortugueseNdPop());
                        jsonObject.put("SoutheastAsian_NdPop", b.getSoutheastAsianNdPop());
                        jsonObject.put("Tl_HomeLanguage_NdTPop", b.getTlHomeLanguageNdTPop());
                        jsonObject.put("TlVisible_minorityNdPop", b.getTlVisibleMinorityNdPop());
                        jsonObject.put("lan_Persian_Farsi_NdPop", b.getLanPersianFarsiNdPop());
                        jsonObject.put("No_Visible_Minority_NdTPop", b.getNoVisibleMinorityNdTPop());
                        jsonObject.put("Other_Visible_Minority_NdPop", b.getOtherVisibleMinorityNdPop());
                        jsonObject.put("Multiple_Visible_Minority_NdPop", b.getMultipleVisibleMinorityNdPop());
                        jsonArray.add(jsonObject);
                    }
                }
                if (subClass.equals("Age")) {
                    for (BrowseDemographic b : dataList) {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("Nd_name", b.getNdName());
                        jsonObject.put("Tl_F_NdPop", b.getTlF_NdPop());
                        jsonObject.put("Tl_M_NdPop", b.getTlMNdPop());
                        jsonObject.put("Agegroup0_4NdPop", b.getAgegroup04NdPop());
                        jsonObject.put("Agegroup5_9NdPop", b.getAgegroup59NdPop());
                        jsonObject.put("Agegroup6_12NdPop", b.getAgegroup612NdPop());
                        jsonObject.put("Agegroup10_14NdPop", b.getAgegroup1014NdPop());
                        jsonObject.put("Agegroup15_19NdPop", b.getAgegroup1519NdPop());
                        jsonObject.put("Agegroup20_24NdPop", b.getAgegroup2024NdPop());
                        jsonObject.put("Agegroup25_29NdPop", b.getAgegroup2529NdPop());
                        jsonObject.put("Agegroup30_34NdPop", b.getAgegroup3034NdPop());
                        jsonObject.put("Agegroup35_39NdPop", b.getAgegroup3539NdPop());
                        jsonObject.put("Agegroup40_44NdPop", b.getAgegroup4044NdPop());
                        jsonObject.put("Agegroup45_49NdPop", b.getAgegroup4549NdPop());
                        jsonObject.put("Agegroup50_54NdPop", b.getAgegroup5054NdPop());
                        jsonObject.put("Agegroup55_59NdPop", b.getAgegroup5559NdPop());
                        jsonObject.put("Agegroup60_64NdPop", b.getAgegroup6064NdPop());
                        jsonObject.put("Agegroup65_69NdPop", b.getAgegroup6569NdPop());
                        jsonObject.put("Agegroup70_74NdPop", b.getAgegroup7074NdPop());
                        jsonObject.put("Agegroup75_79NdPop", b.getAgegroup7579NdPop());
                        jsonObject.put("Agegroup80_84NdPop", b.getAgegroup8084NdPop());
                        jsonObject.put("Agegroup85OverNdPop", b.getAgegroup85OverNdPop());
                        jsonArray.add(jsonObject);
                    }
                }
                if (subClass.equals("Sex")) {
                    for (BrowseDemographic b : dataList) {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("Nd_name", b.getNdName());
                        jsonObject.put("Tl_F_NdPop", b.getTlF_NdPop());
                        jsonObject.put("Tl_M_NdPop", b.getTlMNdPop());
                        jsonArray.add(jsonObject);
                    }
                }
                if (subClass.equals("Ethnicity")){
                    for (BrowseDemographic b : dataList) {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("Nd_name",b.getNdName());
                        jsonObject.put("Tl_HomeLanguage_NdTPop", b.getTlHomeLanguageNdTPop());
                        jsonObject.put("TlVisible_minorityNdPop", b.getTlVisibleMinorityNdPop());
                        jsonObject.put("Arab_NdPop", b.getArabNdPop());
                        jsonObject.put("Black_NdPop", b.getBlackNdPop());
                        jsonObject.put("Korean_NdPop", b.getKoreanNdPop());
                        jsonObject.put("Chinese_NdPop", b.getChineseNdPop());
                        jsonObject.put("Filipino_NdPop", b.getFilipinoNdPop());
                        jsonObject.put("Japanese_NdPop", b.getJapaneseNdPop());
                        jsonObject.put("lanUrdu_NdPop", b.getLanUrduNdPop());
                        jsonObject.put("lanTamil_NdPop", b.getLanTamilNdPop());
                        jsonObject.put("lanKorean_NdPop", b.getLanKoreanNdPop());
                        jsonObject.put("lanChinese_NdPop", b.getLanChineseNdPop());
                        jsonObject.put("lanItalian_NdPop", b.getLanItalianNdPop());
                        jsonObject.put("lanRussian_NdPop", b.getLanRussianNdPop());
                        jsonObject.put("lanSpanish_NdPop", b.getLanSpanishNdPop());
                        jsonObject.put("lanTagalog_NdPop", b.getLanTagalogNdPop());
                        jsonObject.put("LatinAmerican_NdPop", b.getLatinAmericanNdPop());
                        jsonObject.put("lanPortuguese_NdPop", b.getLanPortugueseNdPop());
                        jsonObject.put("lan_Persian_Farsi_NdPop", b.getLanPersianFarsiNdPop());
                        jsonObject.put("SoutheastAsian_NdPop",b.getSoutheastAsianNdPop());
                        jsonObject.put("SouthAsian_NdPop",b.getSouthAsianNdPop());
                        jsonObject.put("WestAsian_NdPop",b.getWestAsianNdPop());
                        jsonObject.put("No_Visible_Minority_NdTPop", b.getNoVisibleMinorityNdTPop());
                        jsonObject.put("Other_Visible_Minority_NdPop", b.getOtherVisibleMinorityNdPop());
                        jsonObject.put("Multiple_Visible_Minority_NdPop", b.getMultipleVisibleMinorityNdPop());
                        jsonArray.add(jsonObject);
                    }
                }
            }
        }
        if (year.equals("2011")) {
            if (dataSource.equals("Canada Census")) {
                if (subClass.equals("Population") || subClass.equals("Age")) {
                    for (BrowseDemographic b : dataList) {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("Nd_name", b.getNdName());
                        jsonObject.put("MedianAgePop", b.getMedianAgePop());
                        jsonObject.put("AgeOver15Rate", b.getAgeOver15Rate());
                        jsonObject.put("B_Age15Pop", b.getB_Age15Pop());
                        jsonObject.put("B_Age16Pop", b.getB_Age16Pop());
                        jsonObject.put("B_Age17Pop", b.getB_Age17Pop());
                        jsonObject.put("B_Age18Pop", b.getB_Age18Pop());
                        jsonObject.put("B_Age19Pop", b.getB_Age19Pop());
                        jsonObject.put("B_TlPop", b.getB_TlPop());
                        jsonObject.put("B_Age0_4Pop", b.getB_Age04Pop());
                        jsonObject.put("B_Age5_9Pop", b.getB_Age59Pop());
                        jsonObject.put("B_Age10_14Pop", b.getB_Age1014Pop());
                        jsonObject.put("B_Age15_19Pop", b.getB_Age1519Pop());
                        jsonObject.put("B_Age20_24Pop", b.getB_Age2024Pop());
                        jsonObject.put("B_Age25_29Pop", b.getB_Age2529Pop());
                        jsonObject.put("B_Age30_34Pop", b.getB_Age3034Pop());
                        jsonObject.put("B_Age35_39Pop", b.getB_Age3539Pop());
                        jsonObject.put("B_Age40_44Pop", b.getB_Age4044Pop());
                        jsonObject.put("B_Age45_49Pop", b.getB_Age4549Pop());
                        jsonObject.put("B_Age50_54Pop", b.getB_Age5054Pop());
                        jsonObject.put("B_Age55_59Pop", b.getB_Age5559Pop());
                        jsonObject.put("B_Age60_64Pop", b.getB_Age6064Pop());
                        jsonObject.put("B_Age65_69Pop", b.getB_Age6569Pop());
                        jsonObject.put("B_Age70_74Pop", b.getB_Age7074Pop());
                        jsonObject.put("B_Age75_79Pop", b.getB_Age7579Pop());
                        jsonObject.put("B_Age80_84Pop", b.getB_Age8084Pop());
                        jsonObject.put("B_AgeOver85Pop", b.getB_AgeOver85Pop());
                        jsonArray.add(jsonObject);
                    }
                }
                if (subClass.equals("Sex")){
                    for (BrowseDemographic b : dataList) {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("Nd_name", b.getNdName());
                        jsonObject.put("B_TlPop", b.getB_TlPop());
                        jsonObject.put("B_Age0_4Pop", b.getB_Age04Pop());
                        jsonObject.put("B_Age5_9Pop", b.getB_Age59Pop());
                        jsonObject.put("B_Age10_14Pop", b.getB_Age1014Pop());
                        jsonObject.put("B_Age15_19Pop", b.getB_Age1519Pop());
                        jsonObject.put("B_Age15Pop", b.getB_Age15Pop());
                        jsonObject.put("B_Age16Pop", b.getB_Age16Pop());
                        jsonObject.put("B_Age17Pop", b.getB_Age17Pop());
                        jsonObject.put("B_Age18Pop", b.getB_Age18Pop());
                        jsonObject.put("B_Age19Pop", b.getB_Age19Pop());
                        jsonObject.put("B_Age20_24Pop", b.getB_Age2024Pop());
                        jsonObject.put("B_Age25_29Pop", b.getB_Age2529Pop());
                        jsonObject.put("B_Age30_34Pop", b.getB_Age3034Pop());
                        jsonObject.put("B_Age35_39Pop", b.getB_Age3539Pop());
                        jsonObject.put("B_Age40_44Pop", b.getB_Age4044Pop());
                        jsonObject.put("B_Age45_49Pop", b.getB_Age4549Pop());
                        jsonObject.put("B_Age50_54Pop", b.getB_Age5054Pop());
                        jsonObject.put("B_Age55_59Pop", b.getB_Age5559Pop());
                        jsonObject.put("B_Age60_64Pop", b.getB_Age6064Pop());
                        jsonObject.put("B_Age65_69Pop", b.getB_Age6569Pop());
                        jsonObject.put("B_Age70_74Pop", b.getB_Age7074Pop());
                        jsonObject.put("B_Age75_79Pop", b.getB_Age7579Pop());
                        jsonObject.put("B_Age80_84Pop", b.getB_Age8084Pop());
                        jsonObject.put("B_AgeOver85Pop", b.getB_AgeOver85Pop());
                        jsonArray.add(jsonObject);
                    }
                }
            }
            if (dataSource.equals("Wellbeing Toronto")) {
                if (subClass.equals("Population")) {
                    for (BrowseDemographic b : dataList) {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("Nd_name", b.getNdName());
                        jsonObject.put("TlNdPop", b.getTlNdPop());
                        jsonObject.put("Tl_F_NdPop", b.getTlF_NdPop());
                        jsonObject.put("Tl_M_NdPop", b.getTlMNdPop());
                        jsonObject.put("ChildAge0_14NdPop", b.getChildAge014NdPop());
                        jsonObject.put("YouthAge15_24NdPop", b.getYouthAge1524NdPop());
                        jsonObject.put("Senior55OverNdPop", b.getSenior55OverNdPop());
                        jsonObject.put("Senior65OverNdPop", b.getSenior65OverNdPop());
                        jsonObject.put("SeniorLiveAloneNdPop", b.getSeniorLiveAloneNdPop());
                        jsonObject.put("Agegroup0_4NdPop", b.getAgegroup04NdPop());
                        jsonObject.put("Agegroup5_9NdPop", b.getAgegroup59NdPop());
                        jsonObject.put("Agegroup10_14NdPop", b.getAgegroup1014NdPop());
                        jsonObject.put("Agegroup15_19NdPop", b.getAgegroup1519NdPop());
                        jsonObject.put("Agegroup20_24NdPop", b.getAgegroup2024NdPop());
                        jsonObject.put("Agegroup25_29NdPop", b.getAgegroup2529NdPop());
                        jsonObject.put("Agegroup30_34NdPop", b.getAgegroup3034NdPop());
                        jsonObject.put("Agegroup35_39NdPop", b.getAgegroup3539NdPop());
                        jsonObject.put("Agegroup40_44NdPop", b.getAgegroup4044NdPop());
                        jsonObject.put("Agegroup45_49NdPop", b.getAgegroup4549NdPop());
                        jsonObject.put("Agegroup50_54NdPop", b.getAgegroup5054NdPop());
                        jsonObject.put("Agegroup55_59NdPop", b.getAgegroup5559NdPop());
                        jsonObject.put("Agegroup60_64NdPop", b.getAgegroup6064NdPop());
                        jsonObject.put("Agegroup65_69NdPop", b.getAgegroup6569NdPop());
                        jsonObject.put("Agegroup70_74NdPop", b.getAgegroup7074NdPop());
                        jsonObject.put("Agegroup75_79NdPop", b.getAgegroup7579NdPop());
                        jsonObject.put("Agegroup80_84NdPop", b.getAgegroup8084NdPop());
                        jsonObject.put("Agegroup85OverNdPop", b.getAgegroup85OverNdPop());
                        jsonObject.put("Tl_HomeLanguage_NdTPop", b.getTlHomeLanguageNdTPop());
                        jsonObject.put("lanUrdu_NdPop", b.getLanUrduNdPop());
                        jsonObject.put("lanTamil_NdPop", b.getLanTamilNdPop());
                        jsonObject.put("lanKorean_NdPop", b.getLanKoreanNdPop());
                        jsonObject.put("lanChinese_NdPop", b.getLanChineseNdPop());
                        jsonObject.put("lanItalian_NdPop", b.getLanItalianNdPop());
                        jsonObject.put("lanRussian_NdPop", b.getLanRussianNdPop());
                        jsonObject.put("lanSpanish_NdPop", b.getLanSpanishNdPop());
                        jsonObject.put("lanTagalog_NdPop", b.getLanTagalogNdPop());
                        jsonObject.put("lanPortuguese_NdPop", b.getLanPortugueseNdPop());
                        jsonObject.put("lan_Persian_Farsi_NdPop", b.getLanPersianFarsiNdPop());
                        jsonArray.add(jsonObject);
                    }
                }
                if (subClass.equals("Age")) {
                    for (BrowseDemographic b : dataList) {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("Nd_name", b.getNdName());
                        jsonObject.put("Tl_F_NdPop", b.getTlF_NdPop());
                        jsonObject.put("Tl_M_NdPop", b.getTlMNdPop());
                        jsonObject.put("ChildAge0_14NdPop", b.getChildAge014NdPop());
                        jsonObject.put("YouthAge15_24NdPop", b.getYouthAge1524NdPop());
                        jsonObject.put("Senior55OverNdPop", b.getSenior55OverNdPop());
                        jsonObject.put("Senior65OverNdPop", b.getSenior65OverNdPop());
                        jsonObject.put("SeniorLiveAloneNdPop", b.getSeniorLiveAloneNdPop());
                        jsonObject.put("Agegroup0_4NdPop", b.getAgegroup04NdPop());
                        jsonObject.put("Agegroup5_9NdPop", b.getAgegroup59NdPop());
                        jsonObject.put("Agegroup10_14NdPop", b.getAgegroup1014NdPop());
                        jsonObject.put("Agegroup15_19NdPop", b.getAgegroup1519NdPop());
                        jsonObject.put("Agegroup20_24NdPop", b.getAgegroup2024NdPop());
                        jsonObject.put("Agegroup25_29NdPop", b.getAgegroup2529NdPop());
                        jsonObject.put("Agegroup30_34NdPop", b.getAgegroup3034NdPop());
                        jsonObject.put("Agegroup35_39NdPop", b.getAgegroup3539NdPop());
                        jsonObject.put("Agegroup40_44NdPop", b.getAgegroup4044NdPop());
                        jsonObject.put("Agegroup45_49NdPop", b.getAgegroup4549NdPop());
                        jsonObject.put("Agegroup50_54NdPop", b.getAgegroup5054NdPop());
                        jsonObject.put("Agegroup55_59NdPop", b.getAgegroup5559NdPop());
                        jsonObject.put("Agegroup60_64NdPop", b.getAgegroup6064NdPop());
                        jsonObject.put("Agegroup65_69NdPop", b.getAgegroup6569NdPop());
                        jsonObject.put("Agegroup70_74NdPop", b.getAgegroup7074NdPop());
                        jsonObject.put("Agegroup75_79NdPop", b.getAgegroup7579NdPop());
                        jsonObject.put("Agegroup80_84NdPop", b.getAgegroup8084NdPop());
                        jsonObject.put("Agegroup85OverNdPop", b.getAgegroup85OverNdPop());
                        jsonArray.add(jsonObject);
                    }
                }
                if (subClass.equals("Sex")) {
                    for (BrowseDemographic b : dataList) {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("Nd_name", b.getNdName());
                        jsonObject.put("Tl_F_NdPop", b.getTlF_NdPop());
                        jsonObject.put("Tl_M_NdPop", b.getTlMNdPop());
                        jsonArray.add(jsonObject);
                        System.out.println("");
                    }
                }
                if (subClass.equals("Ethnicity")){
                    for (BrowseDemographic b : dataList) {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("Nd_name", b.getNdName());
                        jsonObject.put("Tl_HomeLanguage_NdTPop", b.getTlHomeLanguageNdTPop());
                        jsonObject.put("lanUrdu_NdPop", b.getLanUrduNdPop());
                        jsonObject.put("lanTamil_NdPop", b.getLanTamilNdPop());
                        jsonObject.put("lanKorean_NdPop", b.getLanKoreanNdPop());
                        jsonObject.put("lanChinese_NdPop", b.getLanChineseNdPop());
                        jsonObject.put("lanItalian_NdPop", b.getLanItalianNdPop());
                        jsonObject.put("lanRussian_NdPop", b.getLanRussianNdPop());
                        jsonObject.put("lanSpanish_NdPop", b.getLanSpanishNdPop());
                        jsonObject.put("lanTagalog_NdPop", b.getLanTagalogNdPop());
                        jsonObject.put("lanPortuguese_NdPop", b.getLanPortugueseNdPop());
                        jsonObject.put("lan_Persian_Farsi_NdPop", b.getLanPersianFarsiNdPop());
                        jsonArray.add(jsonObject);
                    }
                }
            }
        }
        return jsonArray;
    }

    public BrowseByPageDao getBrowseByPageDao() {
        return browseByPageDao;
    }

    public void setBrowseByPageDao(BrowseByPageDao browseByPageDao) {
        this.browseByPageDao = browseByPageDao;
    }
}
