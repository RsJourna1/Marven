package com.entity;

import java.math.BigDecimal;

/**
 * Created by 郑晓辉 on 2016/8/25.
 */
public class BrowseDemographic {
    //Neighborhood
    private String ndName;
    //CensusTract
    private double ctId;
    private short ndId;
    private short ctYear;
    //CensusAgeGroupPopulation
    private Short b_TlPop;
    private Short b_Age04Pop;
    private Short b_Age59Pop;
    private Short b_Age1014Pop;
    private Short b_Age1519Pop;
    private Short b_Age15Pop;
    private Short b_Age16Pop;
    private Short b_Age17Pop;
    private Short b_Age18Pop;
    private Short b_Age19Pop;
    private Short b_Age2024Pop;
    private Short b_Age2529Pop;
    private Short b_Age3034Pop;
    private Short b_Age3539Pop;
    private Short b_Age4044Pop;
    private Short b_Age4549Pop;
    private Short b_Age5054Pop;
    private Short b_Age5559Pop;
    private Short b_Age6064Pop;
    private Short b_Age6569Pop;
    private Short b_Age7074Pop;
    private Short b_Age7579Pop;
    private Short b_Age8084Pop;
    private Short b_AgeOver85Pop;
    private Double medianAgePop;
    private Double ageOver15Rate;
    private Short m_TlPop;
    private Short m_Age04Pop;
    private Short m_Age59Pop;
    private Short m_Age1014Pop;
    private Short m_Age1519Pop;
    private Short m_Age2024Pop;
    private Short m_Age2529Pop;
    private Short m_Age3034Pop;
    private Short m_Age3539Pop;
    private Short m_Age4044Pop;
    private Short m_Age4549Pop;
    private Short m_Age5054Pop;
    private Short m_Age5559Pop;
    private Short m_Age6064Pop;
    private Short m_Age6569Pop;
    private Short m_Age7074Pop;
    private Short m_Age7579Pop;
    private Short m_Age8084Pop;
    private Short m_AgeOver85Pop;
    private Short f_TlPop;
    private Short f_Age04Pop;
    private Short f_Age59Pop;
    private Short f_Age1014Pop;
    private Short f_Age1519Pop;
    private Short f_Age2024Pop;
    private Short f_Age2529Pop;
    private Short f_Age3034Pop;
    private Short f_Age3539Pop;
    private Short f_Age4044Pop;
    private Short f_Age4549Pop;
    private Short f_Age5054Pop;
    private Short f_Age5559Pop;
    private Short f_Age6064Pop;
    private Short f_Age6569Pop;
    private Short f_Age7074Pop;
    private Short f_Age7579Pop;
    private Short f_Age8084Pop;
    private Short f_AgeOver85Pop;
    //NeighborhoodMinority
    private Integer tlVisibleMinorityNdPop;
    private Integer chineseNdPop;
    private Integer southAsianNdPop;
    private Integer blackNdPop;
    private Integer filipinoNdPop;
    private Integer latinAmericanNdPop;
    private Integer southeastAsianNdPop;
    private Integer arabNdPop;
    private Integer westAsianNdPop;
    private Integer koreanNdPop;
    private Integer japaneseNdPop;
    private Integer otherVisibleMinorityNdPop;
    private Integer multipleVisibleMinorityNdPop;
    private Integer noVisibleMinorityNdTPop;
    private Integer aboriginalNdPop;
    private Integer tlHomeLanguageNdTPop;
    private Integer lanChineseNdPop;
    private Integer lanItalianNdPop;
    private Integer lanKoreanNdPop;
    private Integer lanPersianFarsiNdPop;
    private Integer lanPortugueseNdPop;
    private Integer lanRussianNdPop;
    private Integer lanSpanishNdPop;
    private Integer lanTagalogNdPop;
    private Integer lanTamilNdPop;
    private Integer lanUrduNdPop;
    //NeighborhoodCategoryPopulation
    private Integer tlNdPop;
    private Integer tlMNdPop;
    private Integer tlF_NdPop;
    private Integer agegroup04NdPop;
    private Integer agegroup59NdPop;
    private Integer agegroup1014NdPop;
    private Integer agegroup1519NdPop;
    private Integer agegroup2024NdPop;
    private Integer agegroup2529NdPop;
    private Integer agegroup3034NdPop;
    private Integer agegroup3539NdPop;
    private Integer agegroup4044NdPop;
    private Integer agegroup4549NdPop;
    private Integer agegroup5054NdPop;
    private Integer agegroup5559NdPop;
    private Integer agegroup6064NdPop;
    private Integer agegroup6569NdPop;
    private Integer agegroup7074NdPop;
    private Integer agegroup7579NdPop;
    private Integer agegroup8084NdPop;
    private Integer agegroup85OverNdPop;
    private Integer agegroup612NdPop;
    private Integer childAge014NdPop;
    private Integer youthAge1524NdPop;
    private Integer senior55OverNdPop;
    private Integer senior65OverNdPop;
    private Integer seniorLiveAloneNdPop;

    //Sex & Wellbeing Toronto & year=2006、2011

    public BrowseDemographic(String ndName, Integer tlF_NdPop, Integer tlMNdPop) {
        this.ndName = ndName;
        this.tlF_NdPop = tlF_NdPop;
        this.tlMNdPop = tlMNdPop;
    }

    //Age & Wellbeing Toronto & year=2006

    public BrowseDemographic(
            String ndName, Integer tlMNdPop, Integer tlF_NdPop, Integer agegroup04NdPop, Integer agegroup59NdPop, Integer agegroup612NdPop, Integer agegroup1014NdPop, Integer agegroup1519NdPop, Integer agegroup2024NdPop, Integer agegroup3034NdPop, Integer agegroup2529NdPop, Integer agegroup3539NdPop, Integer agegroup4044NdPop, Integer agegroup4549NdPop, Integer agegroup5054NdPop, Integer agegroup5559NdPop, Integer agegroup6064NdPop, Integer agegroup6569NdPop, Integer agegroup7074NdPop, Integer agegroup7579NdPop, Integer agegroup8084NdPop, Integer agegroup85OverNdPop) {
        this.ndName = ndName;
        this.agegroup612NdPop = agegroup612NdPop;
        this.tlMNdPop = tlMNdPop;
        this.tlF_NdPop = tlF_NdPop;
        this.agegroup04NdPop = agegroup04NdPop;
        this.agegroup1014NdPop = agegroup1014NdPop;
        this.agegroup1519NdPop = agegroup1519NdPop;
        this.agegroup2024NdPop = agegroup2024NdPop;
        this.agegroup3034NdPop = agegroup3034NdPop;
        this.agegroup2529NdPop = agegroup2529NdPop;
        this.agegroup3539NdPop = agegroup3539NdPop;
        this.agegroup4044NdPop = agegroup4044NdPop;
        this.agegroup4549NdPop = agegroup4549NdPop;
        this.agegroup5054NdPop = agegroup5054NdPop;
        this.agegroup5559NdPop = agegroup5559NdPop;
        this.agegroup59NdPop = agegroup59NdPop;
        this.agegroup6064NdPop = agegroup6064NdPop;
        this.agegroup6569NdPop = agegroup6569NdPop;
        this.agegroup7074NdPop = agegroup7074NdPop;
        this.agegroup7579NdPop = agegroup7579NdPop;
        this.agegroup8084NdPop = agegroup8084NdPop;
        this.agegroup85OverNdPop = agegroup85OverNdPop;
    }
    //Ethnicity & Wellbeing Toronto & 2011

    public BrowseDemographic(
            String ndName, Integer tlHomeLanguageNdTPop, Integer lanChineseNdPop, Integer lanItalianNdPop, Integer lanKoreanNdPop, Integer lanPersianFarsiNdPop, Integer lanPortugueseNdPop, Integer lanRussianNdPop, Integer lanSpanishNdPop, Integer lanTagalogNdPop, Integer lanTamilNdPop, Integer lanUrduNdPop) {
        this.tlHomeLanguageNdTPop = tlHomeLanguageNdTPop;
        this.lanChineseNdPop = lanChineseNdPop;
        this.lanItalianNdPop = lanItalianNdPop;
        this.lanKoreanNdPop = lanKoreanNdPop;
        this.lanPersianFarsiNdPop = lanPersianFarsiNdPop;
        this.lanPortugueseNdPop = lanPortugueseNdPop;
        this.lanRussianNdPop = lanRussianNdPop;
        this.lanSpanishNdPop = lanSpanishNdPop;
        this.lanTagalogNdPop = lanTagalogNdPop;
        this.lanTamilNdPop = lanTamilNdPop;
        this.lanUrduNdPop = lanUrduNdPop;
        this.ndName = ndName;
    }

    //Ethnicity & Wellbeing Toronto & year=2006
    public BrowseDemographic(
            Integer tlVisibleMinorityNdPop, Integer tlHomeLanguageNdTPop, Integer arabNdPop, Integer blackNdPop, Integer chineseNdPop, Integer filipinoNdPop, Integer japaneseNdPop, Integer koreanNdPop, Integer lanChineseNdPop, Integer lanItalianNdPop, Integer lanKoreanNdPop, Integer lanPersianFarsiNdPop, Integer lanPortugueseNdPop, Integer lanRussianNdPop, Integer lanSpanishNdPop, Integer lanTagalogNdPop, Integer lanTamilNdPop, Integer lanUrduNdPop, Integer latinAmericanNdPop, Integer multipleVisibleMinorityNdPop, Integer noVisibleMinorityNdTPop, Integer otherVisibleMinorityNdPop, Integer southAsianNdPop, Integer southeastAsianNdPop, Integer westAsianNdPop, String ndName) {
        this.tlVisibleMinorityNdPop = tlVisibleMinorityNdPop;
        this.tlHomeLanguageNdTPop = tlHomeLanguageNdTPop;
        this.arabNdPop = arabNdPop;
        this.blackNdPop = blackNdPop;
        this.chineseNdPop = chineseNdPop;
        this.filipinoNdPop = filipinoNdPop;
        this.japaneseNdPop = japaneseNdPop;
        this.koreanNdPop = koreanNdPop;
        this.lanChineseNdPop = lanChineseNdPop;
        this.lanItalianNdPop = lanItalianNdPop;
        this.lanKoreanNdPop = lanKoreanNdPop;
        this.lanPersianFarsiNdPop = lanPersianFarsiNdPop;
        this.lanPortugueseNdPop = lanPortugueseNdPop;
        this.lanRussianNdPop = lanRussianNdPop;
        this.lanSpanishNdPop = lanSpanishNdPop;
        this.lanTagalogNdPop = lanTagalogNdPop;
        this.lanTamilNdPop = lanTamilNdPop;
        this.lanUrduNdPop = lanUrduNdPop;
        this.latinAmericanNdPop = latinAmericanNdPop;
        this.multipleVisibleMinorityNdPop = multipleVisibleMinorityNdPop;
        this.noVisibleMinorityNdTPop = noVisibleMinorityNdTPop;
        this.otherVisibleMinorityNdPop = otherVisibleMinorityNdPop;
        this.southAsianNdPop = southAsianNdPop;
        this.southeastAsianNdPop = southeastAsianNdPop;
        this.westAsianNdPop = westAsianNdPop;
        this.ndName = ndName;
    }

    //Age & Wellbeing Toronto & year=2011

    public BrowseDemographic(
            String ndName, Integer tlF_NdPop, Integer tlMNdPop, Integer youthAge1524NdPop, Integer senior55OverNdPop, Integer senior65OverNdPop, Integer seniorLiveAloneNdPop, Integer childAge014NdPop, Integer agegroup04NdPop, Integer agegroup59NdPop, Integer agegroup1014NdPop, Integer agegroup1519NdPop, Integer agegroup2024NdPop, Integer agegroup2529NdPop, Integer agegroup3034NdPop, Integer agegroup3539NdPop, Integer agegroup4044NdPop, Integer agegroup4549NdPop, Integer agegroup5054NdPop, Integer agegroup5559NdPop, Integer agegroup6064NdPop, Integer agegroup6569NdPop, Integer agegroup7074NdPop, Integer agegroup7579NdPop, Integer agegroup8084NdPop, Integer agegroup85OverNdPop) {
        this.ndName = ndName;
        this.tlF_NdPop = tlF_NdPop;
        this.tlMNdPop = tlMNdPop;
        this.youthAge1524NdPop = youthAge1524NdPop;
        this.senior55OverNdPop = senior55OverNdPop;
        this.senior65OverNdPop = senior65OverNdPop;
        this.seniorLiveAloneNdPop = seniorLiveAloneNdPop;
        this.childAge014NdPop = childAge014NdPop;
        this.agegroup04NdPop = agegroup04NdPop;
        this.agegroup1014NdPop = agegroup1014NdPop;
        this.agegroup1519NdPop = agegroup1519NdPop;
        this.agegroup2024NdPop = agegroup2024NdPop;
        this.agegroup2529NdPop = agegroup2529NdPop;
        this.agegroup3034NdPop = agegroup3034NdPop;
        this.agegroup3539NdPop = agegroup3539NdPop;
        this.agegroup4044NdPop = agegroup4044NdPop;
        this.agegroup4549NdPop = agegroup4549NdPop;
        this.agegroup5054NdPop = agegroup5054NdPop;
        this.agegroup5559NdPop = agegroup5559NdPop;
        this.agegroup59NdPop = agegroup59NdPop;
        this.agegroup6064NdPop = agegroup6064NdPop;
        this.agegroup6569NdPop = agegroup6569NdPop;
        this.agegroup7074NdPop = agegroup7074NdPop;
        this.agegroup7579NdPop = agegroup7579NdPop;
        this.agegroup8084NdPop = agegroup8084NdPop;
        this.agegroup85OverNdPop = agegroup85OverNdPop;
    }

    //Sex、Age、Population & DataSource = Canada Census & year=2006
    public BrowseDemographic(
            String ndName, Short b_TlPop, Short m_TlPop, Short f_TlPop, Short b_Age04Pop, Short b_Age1014Pop, Short b_Age1519Pop, Short b_Age15Pop, Short b_Age16Pop, Short b_Age17Pop, Short b_Age18Pop, Short b_Age19Pop, Short b_Age2024Pop, Short b_Age2529Pop, Short b_Age3034Pop, Short b_Age3539Pop, Short b_Age4044Pop, Short b_Age4549Pop, Short b_Age5054Pop, Short b_Age5559Pop, Short b_Age59Pop, Short b_Age6064Pop, Short b_Age6569Pop, Short b_Age7074Pop, Short b_Age7579Pop, Short b_Age8084Pop, Short b_AgeOver85Pop, Short f_Age04Pop, Short f_Age1014Pop, Short f_Age1519Pop, Short f_Age2024Pop, Short f_Age2529Pop, Short f_Age3034Pop, Short f_Age3539Pop, Short f_Age4044Pop, Short f_Age4549Pop, Short f_Age5054Pop, Short f_Age5559Pop, Short f_Age59Pop, Short f_Age6064Pop, Short f_Age6569Pop, Short f_Age7074Pop, Short f_Age7579Pop, Short f_Age8084Pop, Short f_AgeOver85Pop, Short m_Age04Pop, Short m_Age1014Pop, Short m_Age1519Pop, Short m_Age2024Pop, Short m_Age2529Pop, Short m_Age3034Pop, Short m_Age3539Pop, Short m_Age4044Pop, Short m_Age4549Pop, Short m_Age5054Pop, Short m_Age5559Pop, Short m_Age59Pop, Short m_Age6064Pop, Short m_Age6569Pop, Short m_Age7074Pop, Short m_Age7579Pop, Short m_Age8084Pop, Short m_AgeOver85Pop) {
        this.b_Age04Pop = b_Age04Pop;
        this.b_Age1014Pop = b_Age1014Pop;
        this.b_Age1519Pop = b_Age1519Pop;
        this.b_Age15Pop = b_Age15Pop;
        this.b_Age16Pop = b_Age16Pop;
        this.b_Age17Pop = b_Age17Pop;
        this.b_Age18Pop = b_Age18Pop;
        this.b_Age19Pop = b_Age19Pop;
        this.b_Age2024Pop = b_Age2024Pop;
        this.b_Age2529Pop = b_Age2529Pop;
        this.b_Age3034Pop = b_Age3034Pop;
        this.b_Age3539Pop = b_Age3539Pop;
        this.b_Age4044Pop = b_Age4044Pop;
        this.b_Age4549Pop = b_Age4549Pop;
        this.b_Age5054Pop = b_Age5054Pop;
        this.b_Age5559Pop = b_Age5559Pop;
        this.b_Age59Pop = b_Age59Pop;
        this.b_Age6064Pop = b_Age6064Pop;
        this.b_Age6569Pop = b_Age6569Pop;
        this.b_Age7074Pop = b_Age7074Pop;
        this.b_Age7579Pop = b_Age7579Pop;
        this.b_Age8084Pop = b_Age8084Pop;
        this.b_AgeOver85Pop = b_AgeOver85Pop;
        this.b_TlPop = b_TlPop;
        this.f_Age04Pop = f_Age04Pop;
        this.f_Age1014Pop = f_Age1014Pop;
        this.f_Age1519Pop = f_Age1519Pop;
        this.f_Age2024Pop = f_Age2024Pop;
        this.f_Age2529Pop = f_Age2529Pop;
        this.f_Age3034Pop = f_Age3034Pop;
        this.f_Age3539Pop = f_Age3539Pop;
        this.f_Age4044Pop = f_Age4044Pop;
        this.f_Age4549Pop = f_Age4549Pop;
        this.f_Age5054Pop = f_Age5054Pop;
        this.f_Age5559Pop = f_Age5559Pop;
        this.f_Age59Pop = f_Age59Pop;
        this.f_Age6064Pop = f_Age6064Pop;
        this.f_Age6569Pop = f_Age6569Pop;
        this.f_Age7074Pop = f_Age7074Pop;
        this.f_Age7579Pop = f_Age7579Pop;
        this.f_Age8084Pop = f_Age8084Pop;
        this.f_AgeOver85Pop = f_AgeOver85Pop;
        this.f_TlPop = f_TlPop;
        this.m_Age04Pop = m_Age04Pop;
        this.m_Age1014Pop = m_Age1014Pop;
        this.m_Age1519Pop = m_Age1519Pop;
        this.m_Age2024Pop = m_Age2024Pop;
        this.m_Age2529Pop = m_Age2529Pop;
        this.m_Age3034Pop = m_Age3034Pop;
        this.m_Age3539Pop = m_Age3539Pop;
        this.m_Age4044Pop = m_Age4044Pop;
        this.m_Age4549Pop = m_Age4549Pop;
        this.m_Age5054Pop = m_Age5054Pop;
        this.m_Age5559Pop = m_Age5559Pop;
        this.m_Age59Pop = m_Age59Pop;
        this.m_Age6064Pop = m_Age6064Pop;
        this.m_Age6569Pop = m_Age6569Pop;
        this.m_Age7074Pop = m_Age7074Pop;
        this.m_Age7579Pop = m_Age7579Pop;
        this.m_Age8084Pop = m_Age8084Pop;
        this.m_AgeOver85Pop = m_AgeOver85Pop;
        this.m_TlPop = m_TlPop;
        this.ndName = ndName;
    }
    //Sex & Canada Census & 2011

    public BrowseDemographic(
            String ndName, Short b_TlPop, Short b_Age04Pop, Short b_Age1014Pop, Short b_Age1519Pop, Short b_Age15Pop, Short b_Age16Pop, Short b_Age17Pop, Short b_Age18Pop, Short b_Age19Pop, Short b_Age2024Pop, Short b_Age2529Pop, Short b_Age3034Pop, Short b_Age3539Pop, Short b_Age4044Pop, Short b_Age4549Pop, Short b_Age5054Pop, Short b_Age5559Pop, Short b_Age59Pop, Short b_Age6064Pop, Short b_Age6569Pop, Short b_Age7074Pop, Short b_Age7579Pop, Short b_Age8084Pop, Short b_AgeOver85Pop) {
        this.b_TlPop = b_TlPop;
        this.b_Age04Pop = b_Age04Pop;
        this.b_Age1014Pop = b_Age1014Pop;
        this.b_Age1519Pop = b_Age1519Pop;
        this.b_Age15Pop = b_Age15Pop;
        this.b_Age16Pop = b_Age16Pop;
        this.b_Age17Pop = b_Age17Pop;
        this.b_Age18Pop = b_Age18Pop;
        this.b_Age19Pop = b_Age19Pop;
        this.b_Age2024Pop = b_Age2024Pop;
        this.b_Age2529Pop = b_Age2529Pop;
        this.b_Age3034Pop = b_Age3034Pop;
        this.b_Age3539Pop = b_Age3539Pop;
        this.b_Age4044Pop = b_Age4044Pop;
        this.b_Age4549Pop = b_Age4549Pop;
        this.b_Age5054Pop = b_Age5054Pop;
        this.b_Age5559Pop = b_Age5559Pop;
        this.b_Age59Pop = b_Age59Pop;
        this.b_Age6064Pop = b_Age6064Pop;
        this.b_Age6569Pop = b_Age6569Pop;
        this.b_Age7074Pop = b_Age7074Pop;
        this.b_Age7579Pop = b_Age7579Pop;
        this.b_Age8084Pop = b_Age8084Pop;
        this.b_AgeOver85Pop = b_AgeOver85Pop;
        this.ndName = ndName;
    }

    //Population & DataSource = Wellbeing Toronto & year=2006
    public BrowseDemographic(
            String ndName, Integer tlF_NdPop, Integer tlNdPop, Integer tlMNdPop, Integer agegroup04NdPop, Integer agegroup612NdPop, Integer agegroup1014NdPop, Integer agegroup1519NdPop, Integer agegroup2024NdPop, Integer agegroup2529NdPop, Integer agegroup3034NdPop, Integer agegroup3539NdPop, Integer agegroup4044NdPop, Integer agegroup4549NdPop, Integer agegroup5054NdPop, Integer agegroup5559NdPop, Integer agegroup59NdPop, Integer agegroup6064NdPop, Integer agegroup6569NdPop, Integer agegroup7074NdPop, Integer agegroup7579NdPop, Integer agegroup8084NdPop, Integer agegroup85OverNdPop, Integer arabNdPop, Integer blackNdPop, Integer koreanNdPop, Integer chineseNdPop, Integer lanUrduNdPop, Integer filipinoNdPop, Integer japaneseNdPop, Integer lanTamilNdPop, Integer westAsianNdPop, Integer lanKoreanNdPop, Integer southAsianNdPop, Integer lanChineseNdPop, Integer lanItalianNdPop, Integer lanRussianNdPop, Integer lanSpanishNdPop, Integer lanTagalogNdPop, Integer latinAmericanNdPop, Integer lanPortugueseNdPop, Integer southeastAsianNdPop, Integer tlHomeLanguageNdTPop, Integer tlVisibleMinorityNdPop, Integer lanPersianFarsiNdPop, Integer noVisibleMinorityNdTPop, Integer otherVisibleMinorityNdPop, Integer multipleVisibleMinorityNdPop) {
        this.tlF_NdPop = tlF_NdPop;
        this.tlNdPop = tlNdPop;
        this.tlMNdPop = tlMNdPop;
        this.ndName = ndName;
        this.agegroup04NdPop = agegroup04NdPop;
        this.agegroup612NdPop = agegroup612NdPop;
        this.agegroup1014NdPop = agegroup1014NdPop;
        this.agegroup1519NdPop = agegroup1519NdPop;
        this.agegroup2024NdPop = agegroup2024NdPop;
        this.agegroup2529NdPop = agegroup2529NdPop;
        this.agegroup3034NdPop = agegroup3034NdPop;
        this.agegroup3539NdPop = agegroup3539NdPop;
        this.agegroup4044NdPop = agegroup4044NdPop;
        this.agegroup4549NdPop = agegroup4549NdPop;
        this.agegroup5054NdPop = agegroup5054NdPop;
        this.agegroup5559NdPop = agegroup5559NdPop;
        this.agegroup59NdPop = agegroup59NdPop;
        this.agegroup6064NdPop = agegroup6064NdPop;
        this.agegroup6569NdPop = agegroup6569NdPop;
        this.agegroup7074NdPop = agegroup7074NdPop;
        this.agegroup7579NdPop = agegroup7579NdPop;
        this.agegroup8084NdPop = agegroup8084NdPop;
        this.agegroup85OverNdPop = agegroup85OverNdPop;
        this.arabNdPop = arabNdPop;
        this.blackNdPop = blackNdPop;
        this.koreanNdPop = koreanNdPop;
        this.chineseNdPop = chineseNdPop;
        this.lanUrduNdPop = lanUrduNdPop;
        this.filipinoNdPop = filipinoNdPop;
        this.japaneseNdPop = japaneseNdPop;
        this.lanTamilNdPop = lanTamilNdPop;
        this.westAsianNdPop = westAsianNdPop;
        this.lanKoreanNdPop = lanKoreanNdPop;
        this.southAsianNdPop = southAsianNdPop;
        this.lanChineseNdPop = lanChineseNdPop;
        this.lanItalianNdPop = lanItalianNdPop;
        this.lanRussianNdPop = lanRussianNdPop;
        this.lanSpanishNdPop = lanSpanishNdPop;
        this.lanTagalogNdPop = lanTagalogNdPop;
        this.latinAmericanNdPop = latinAmericanNdPop;
        this.lanPortugueseNdPop = lanPortugueseNdPop;
        this.southeastAsianNdPop = southeastAsianNdPop;
        this.tlHomeLanguageNdTPop = tlHomeLanguageNdTPop;
        this.tlVisibleMinorityNdPop = tlVisibleMinorityNdPop;
        this.lanPersianFarsiNdPop = lanPersianFarsiNdPop;
        this.noVisibleMinorityNdTPop = noVisibleMinorityNdTPop;
        this.otherVisibleMinorityNdPop = otherVisibleMinorityNdPop;
        this.multipleVisibleMinorityNdPop = multipleVisibleMinorityNdPop;
    }
    //Age、Population & DataSource = Canada Census && year=2011

    public BrowseDemographic(
            String ndName, Short b_TlPop, Double medianAgePop, Double ageOver15Rate, Short b_Age15Pop, Short b_Age16Pop, Short b_Age17Pop, Short b_Age18Pop, Short b_Age19Pop, Short b_Age04Pop, Short b_Age59Pop, Short b_Age1014Pop, Short b_Age1519Pop, Short b_Age2024Pop, Short b_Age2529Pop, Short b_Age3034Pop, Short b_Age3539Pop, Short b_Age4044Pop, Short b_Age4549Pop, Short b_Age5054Pop, Short b_Age5559Pop, Short b_Age6064Pop, Short b_Age6569Pop, Short b_Age7074Pop, Short b_Age7579Pop, Short b_Age8084Pop, Short b_AgeOver85Pop) {
        this.ndName = ndName;
        this.b_TlPop = b_TlPop;
        this.b_Age15Pop = b_Age15Pop;
        this.b_Age16Pop = b_Age16Pop;
        this.b_Age17Pop = b_Age17Pop;
        this.b_Age18Pop = b_Age18Pop;
        this.b_Age19Pop = b_Age19Pop;
        this.b_Age04Pop = b_Age04Pop;
        this.b_Age59Pop = b_Age59Pop;
        this.medianAgePop = medianAgePop;
        this.ageOver15Rate = ageOver15Rate;
        this.b_Age1014Pop = b_Age1014Pop;
        this.b_Age1519Pop = b_Age1519Pop;
        this.b_Age2024Pop = b_Age2024Pop;
        this.b_Age2529Pop = b_Age2529Pop;
        this.b_Age3034Pop = b_Age3034Pop;
        this.b_Age3539Pop = b_Age3539Pop;
        this.b_Age4044Pop = b_Age4044Pop;
        this.b_Age4549Pop = b_Age4549Pop;
        this.b_Age5054Pop = b_Age5054Pop;
        this.b_Age5559Pop = b_Age5559Pop;
        this.b_Age6064Pop = b_Age6064Pop;
        this.b_Age6569Pop = b_Age6569Pop;
        this.b_Age7074Pop = b_Age7074Pop;
        this.b_Age7579Pop = b_Age7579Pop;
        this.b_Age8084Pop = b_Age8084Pop;
        this.b_AgeOver85Pop = b_AgeOver85Pop;
    }

    //Population & DataSource = Wellbeing Toronto & year=2011

    public BrowseDemographic(
            String ndName, Integer tlNdPop, Integer tlF_NdPop, Integer tlMNdPop, Integer tlHomeLanguageNdTPop, Integer childAge014NdPop, Integer senior55OverNdPop, Integer senior65OverNdPop, Integer youthAge1524NdPop, Integer seniorLiveAloneNdPop, Integer agegroup04NdPop, Integer agegroup59NdPop, Integer agegroup1014NdPop, Integer agegroup1519NdPop, Integer agegroup2024NdPop, Integer agegroup2529NdPop, Integer agegroup3034NdPop, Integer agegroup3539NdPop, Integer agegroup4044NdPop, Integer agegroup4549NdPop, Integer agegroup5054NdPop, Integer agegroup5559NdPop, Integer agegroup6064NdPop, Integer agegroup6569NdPop, Integer agegroup7074NdPop, Integer agegroup8084NdPop, Integer agegroup85OverNdPop, Integer lanUrduNdPop, Integer lanTamilNdPop, Integer lanKoreanNdPop, Integer lanChineseNdPop, Integer lanItalianNdPop, Integer lanRussianNdPop, Integer lanSpanishNdPop, Integer lanTagalogNdPop, Integer lanPortugueseNdPop, Integer lanPersianFarsiNdPop) {
        this.ndName = ndName;
        this.tlNdPop = tlNdPop;
        this.tlF_NdPop = tlF_NdPop;
        this.tlMNdPop = tlMNdPop;
        this.agegroup04NdPop = agegroup04NdPop;
        this.agegroup59NdPop = agegroup59NdPop;
        this.childAge014NdPop = childAge014NdPop;
        this.senior55OverNdPop = senior55OverNdPop;
        this.senior65OverNdPop = senior65OverNdPop;
        this.agegroup1014NdPop = agegroup1014NdPop;
        this.agegroup1519NdPop = agegroup1519NdPop;
        this.agegroup2024NdPop = agegroup2024NdPop;
        this.agegroup2529NdPop = agegroup2529NdPop;
        this.agegroup3034NdPop = agegroup3034NdPop;
        this.agegroup3539NdPop = agegroup3539NdPop;
        this.agegroup4044NdPop = agegroup4044NdPop;
        this.agegroup4549NdPop = agegroup4549NdPop;
        this.agegroup5054NdPop = agegroup5054NdPop;
        this.agegroup5559NdPop = agegroup5559NdPop;
        this.agegroup6064NdPop = agegroup6064NdPop;
        this.agegroup6569NdPop = agegroup6569NdPop;
        this.agegroup7074NdPop = agegroup7074NdPop;
        this.agegroup8084NdPop = agegroup8084NdPop;
        this.youthAge1524NdPop = youthAge1524NdPop;
        this.agegroup85OverNdPop = agegroup85OverNdPop;
        this.seniorLiveAloneNdPop = seniorLiveAloneNdPop;
        this.lanUrduNdPop = lanUrduNdPop;
        this.lanTamilNdPop = lanTamilNdPop;
        this.lanKoreanNdPop = lanKoreanNdPop;
        this.lanChineseNdPop = lanChineseNdPop;
        this.lanItalianNdPop = lanItalianNdPop;
        this.lanRussianNdPop = lanRussianNdPop;
        this.lanSpanishNdPop = lanSpanishNdPop;
        this.lanTagalogNdPop = lanTagalogNdPop;
        this.lanPortugueseNdPop = lanPortugueseNdPop;
        this.lanPersianFarsiNdPop = lanPersianFarsiNdPop;
        this.tlHomeLanguageNdTPop = tlHomeLanguageNdTPop;
    }

    public String getNdName() {
        return ndName;
    }

    public void setNdName(String ndName) {
        this.ndName = ndName;
    }

    public Integer getAboriginalNdPop() {
        return aboriginalNdPop;
    }

    public void setAboriginalNdPop(Integer aboriginalNdPop) {
        this.aboriginalNdPop = aboriginalNdPop;
    }

    public Integer getAgegroup04NdPop() {
        return agegroup04NdPop;
    }

    public void setAgegroup04NdPop(Integer agegroup04NdPop) {
        this.agegroup04NdPop = agegroup04NdPop;
    }

    public Integer getAgegroup1014NdPop() {
        return agegroup1014NdPop;
    }

    public void setAgegroup1014NdPop(Integer agegroup1014NdPop) {
        this.agegroup1014NdPop = agegroup1014NdPop;
    }

    public Integer getAgegroup1519NdPop() {
        return agegroup1519NdPop;
    }

    public void setAgegroup1519NdPop(Integer agegroup1519NdPop) {
        this.agegroup1519NdPop = agegroup1519NdPop;
    }

    public Integer getAgegroup2024NdPop() {
        return agegroup2024NdPop;
    }

    public void setAgegroup2024NdPop(Integer agegroup2024NdPop) {
        this.agegroup2024NdPop = agegroup2024NdPop;
    }

    public Integer getAgegroup2529NdPop() {
        return agegroup2529NdPop;
    }

    public void setAgegroup2529NdPop(Integer agegroup2529NdPop) {
        this.agegroup2529NdPop = agegroup2529NdPop;
    }

    public Integer getAgegroup3034NdPop() {
        return agegroup3034NdPop;
    }

    public void setAgegroup3034NdPop(Integer agegroup3034NdPop) {
        this.agegroup3034NdPop = agegroup3034NdPop;
    }

    public Integer getAgegroup3539NdPop() {
        return agegroup3539NdPop;
    }

    public void setAgegroup3539NdPop(Integer agegroup3539NdPop) {
        this.agegroup3539NdPop = agegroup3539NdPop;
    }

    public Integer getAgegroup4044NdPop() {
        return agegroup4044NdPop;
    }

    public void setAgegroup4044NdPop(Integer agegroup4044NdPop) {
        this.agegroup4044NdPop = agegroup4044NdPop;
    }

    public Integer getAgegroup4549NdPop() {
        return agegroup4549NdPop;
    }

    public void setAgegroup4549NdPop(Integer agegroup4549NdPop) {
        this.agegroup4549NdPop = agegroup4549NdPop;
    }

    public Integer getAgegroup5054NdPop() {
        return agegroup5054NdPop;
    }

    public void setAgegroup5054NdPop(Integer agegroup5054NdPop) {
        this.agegroup5054NdPop = agegroup5054NdPop;
    }

    public Integer getAgegroup5559NdPop() {
        return agegroup5559NdPop;
    }

    public void setAgegroup5559NdPop(Integer agegroup5559NdPop) {
        this.agegroup5559NdPop = agegroup5559NdPop;
    }

    public Integer getAgegroup59NdPop() {
        return agegroup59NdPop;
    }

    public void setAgegroup59NdPop(Integer agegroup59NdPop) {
        this.agegroup59NdPop = agegroup59NdPop;
    }

    public Integer getAgegroup6064NdPop() {
        return agegroup6064NdPop;
    }

    public void setAgegroup6064NdPop(Integer agegroup6064NdPop) {
        this.agegroup6064NdPop = agegroup6064NdPop;
    }

    public Integer getAgegroup612NdPop() {
        return agegroup612NdPop;
    }

    public void setAgegroup612NdPop(Integer agegroup612NdPop) {
        this.agegroup612NdPop = agegroup612NdPop;
    }

    public Integer getAgegroup6569NdPop() {
        return agegroup6569NdPop;
    }

    public void setAgegroup6569NdPop(Integer agegroup6569NdPop) {
        this.agegroup6569NdPop = agegroup6569NdPop;
    }

    public Integer getAgegroup7074NdPop() {
        return agegroup7074NdPop;
    }

    public void setAgegroup7074NdPop(Integer agegroup7074NdPop) {
        this.agegroup7074NdPop = agegroup7074NdPop;
    }

    public Integer getAgegroup7579NdPop() {
        return agegroup7579NdPop;
    }

    public void setAgegroup7579NdPop(Integer agegroup7579NdPop) {
        this.agegroup7579NdPop = agegroup7579NdPop;
    }

    public Integer getAgegroup8084NdPop() {
        return agegroup8084NdPop;
    }

    public void setAgegroup8084NdPop(Integer agegroup8084NdPop) {
        this.agegroup8084NdPop = agegroup8084NdPop;
    }

    public Integer getAgegroup85OverNdPop() {
        return agegroup85OverNdPop;
    }

    public void setAgegroup85OverNdPop(Integer agegroup85OverNdPop) {
        this.agegroup85OverNdPop = agegroup85OverNdPop;
    }

    public Double getAgeOver15Rate() {
        return ageOver15Rate;
    }

    public void setAgeOver15Rate(Double ageOver15Rate) {
        this.ageOver15Rate = ageOver15Rate;
    }

    public Integer getArabNdPop() {
        return arabNdPop;
    }

    public void setArabNdPop(Integer arabNdPop) {
        this.arabNdPop = arabNdPop;
    }

    public Short getB_Age04Pop() {
        return b_Age04Pop;
    }

    public void setB_Age04Pop(Short b_Age04Pop) {
        this.b_Age04Pop = b_Age04Pop;
    }

    public Short getB_Age1014Pop() {
        return b_Age1014Pop;
    }

    public void setB_Age1014Pop(Short b_Age1014Pop) {
        this.b_Age1014Pop = b_Age1014Pop;
    }

    public Short getB_Age1519Pop() {
        return b_Age1519Pop;
    }

    public void setB_Age1519Pop(Short b_Age1519Pop) {
        this.b_Age1519Pop = b_Age1519Pop;
    }

    public Short getB_Age15Pop() {
        return b_Age15Pop;
    }

    public void setB_Age15Pop(Short b_Age15Pop) {
        this.b_Age15Pop = b_Age15Pop;
    }

    public Short getB_Age16Pop() {
        return b_Age16Pop;
    }

    public void setB_Age16Pop(Short b_Age16Pop) {
        this.b_Age16Pop = b_Age16Pop;
    }

    public Short getB_Age17Pop() {
        return b_Age17Pop;
    }

    public void setB_Age17Pop(Short b_Age17Pop) {
        this.b_Age17Pop = b_Age17Pop;
    }

    public Short getB_Age18Pop() {
        return b_Age18Pop;
    }

    public void setB_Age18Pop(Short b_Age18Pop) {
        this.b_Age18Pop = b_Age18Pop;
    }

    public Short getB_Age19Pop() {
        return b_Age19Pop;
    }

    public void setB_Age19Pop(Short b_Age19Pop) {
        this.b_Age19Pop = b_Age19Pop;
    }

    public Short getB_Age2024Pop() {
        return b_Age2024Pop;
    }

    public void setB_Age2024Pop(Short b_Age2024Pop) {
        this.b_Age2024Pop = b_Age2024Pop;
    }

    public Short getB_Age2529Pop() {
        return b_Age2529Pop;
    }

    public void setB_Age2529Pop(Short b_Age2529Pop) {
        this.b_Age2529Pop = b_Age2529Pop;
    }

    public Short getB_Age3034Pop() {
        return b_Age3034Pop;
    }

    public void setB_Age3034Pop(Short b_Age3034Pop) {
        this.b_Age3034Pop = b_Age3034Pop;
    }

    public Short getB_Age3539Pop() {
        return b_Age3539Pop;
    }

    public void setB_Age3539Pop(Short b_Age3539Pop) {
        this.b_Age3539Pop = b_Age3539Pop;
    }

    public Short getB_Age4044Pop() {
        return b_Age4044Pop;
    }

    public void setB_Age4044Pop(Short b_Age4044Pop) {
        this.b_Age4044Pop = b_Age4044Pop;
    }

    public Short getB_Age4549Pop() {
        return b_Age4549Pop;
    }

    public void setB_Age4549Pop(Short b_Age4549Pop) {
        this.b_Age4549Pop = b_Age4549Pop;
    }

    public Short getB_Age5054Pop() {
        return b_Age5054Pop;
    }

    public void setB_Age5054Pop(Short b_Age5054Pop) {
        this.b_Age5054Pop = b_Age5054Pop;
    }

    public Short getB_Age5559Pop() {
        return b_Age5559Pop;
    }

    public void setB_Age5559Pop(Short b_Age5559Pop) {
        this.b_Age5559Pop = b_Age5559Pop;
    }

    public Short getB_Age59Pop() {
        return b_Age59Pop;
    }

    public void setB_Age59Pop(Short b_Age59Pop) {
        this.b_Age59Pop = b_Age59Pop;
    }

    public Short getB_Age6064Pop() {
        return b_Age6064Pop;
    }

    public void setB_Age6064Pop(Short b_Age6064Pop) {
        this.b_Age6064Pop = b_Age6064Pop;
    }

    public Short getB_Age6569Pop() {
        return b_Age6569Pop;
    }

    public void setB_Age6569Pop(Short b_Age6569Pop) {
        this.b_Age6569Pop = b_Age6569Pop;
    }

    public Short getB_Age7074Pop() {
        return b_Age7074Pop;
    }

    public void setB_Age7074Pop(Short b_Age7074Pop) {
        this.b_Age7074Pop = b_Age7074Pop;
    }

    public Short getB_Age7579Pop() {
        return b_Age7579Pop;
    }

    public void setB_Age7579Pop(Short b_Age7579Pop) {
        this.b_Age7579Pop = b_Age7579Pop;
    }

    public Short getB_Age8084Pop() {
        return b_Age8084Pop;
    }

    public void setB_Age8084Pop(Short b_Age8084Pop) {
        this.b_Age8084Pop = b_Age8084Pop;
    }

    public Short getB_AgeOver85Pop() {
        return b_AgeOver85Pop;
    }

    public void setB_AgeOver85Pop(Short b_AgeOver85Pop) {
        this.b_AgeOver85Pop = b_AgeOver85Pop;
    }

    public Short getB_TlPop() {
        return b_TlPop;
    }

    public void setB_TlPop(Short b_TlPop) {
        this.b_TlPop = b_TlPop;
    }

    public Integer getBlackNdPop() {
        return blackNdPop;
    }

    public void setBlackNdPop(Integer blackNdPop) {
        this.blackNdPop = blackNdPop;
    }

    public Integer getChildAge014NdPop() {
        return childAge014NdPop;
    }

    public void setChildAge014NdPop(Integer childAge014NdPop) {
        this.childAge014NdPop = childAge014NdPop;
    }

    public Integer getChineseNdPop() {
        return chineseNdPop;
    }

    public void setChineseNdPop(Integer chineseNdPop) {
        this.chineseNdPop = chineseNdPop;
    }

    public double getCtId() {
        return ctId;
    }

    public void setCtId(double ctId) {
        this.ctId = ctId;
    }

    public short getCtYear() {
        return ctYear;
    }

    public void setCtYear(short ctYear) {
        this.ctYear = ctYear;
    }

    public Short getF_Age04Pop() {
        return f_Age04Pop;
    }

    public void setF_Age04Pop(Short f_Age04Pop) {
        this.f_Age04Pop = f_Age04Pop;
    }

    public Short getF_Age1014Pop() {
        return f_Age1014Pop;
    }

    public void setF_Age1014Pop(Short f_Age1014Pop) {
        this.f_Age1014Pop = f_Age1014Pop;
    }

    public Short getF_Age1519Pop() {
        return f_Age1519Pop;
    }

    public void setF_Age1519Pop(Short f_Age1519Pop) {
        this.f_Age1519Pop = f_Age1519Pop;
    }

    public Short getF_Age2024Pop() {
        return f_Age2024Pop;
    }

    public void setF_Age2024Pop(Short f_Age2024Pop) {
        this.f_Age2024Pop = f_Age2024Pop;
    }

    public Short getF_Age2529Pop() {
        return f_Age2529Pop;
    }

    public void setF_Age2529Pop(Short f_Age2529Pop) {
        this.f_Age2529Pop = f_Age2529Pop;
    }

    public Short getF_Age3034Pop() {
        return f_Age3034Pop;
    }

    public void setF_Age3034Pop(Short f_Age3034Pop) {
        this.f_Age3034Pop = f_Age3034Pop;
    }

    public Short getF_Age3539Pop() {
        return f_Age3539Pop;
    }

    public void setF_Age3539Pop(Short f_Age3539Pop) {
        this.f_Age3539Pop = f_Age3539Pop;
    }

    public Short getF_Age4044Pop() {
        return f_Age4044Pop;
    }

    public void setF_Age4044Pop(Short f_Age4044Pop) {
        this.f_Age4044Pop = f_Age4044Pop;
    }

    public Short getF_Age4549Pop() {
        return f_Age4549Pop;
    }

    public void setF_Age4549Pop(Short f_Age4549Pop) {
        this.f_Age4549Pop = f_Age4549Pop;
    }

    public Short getF_Age5054Pop() {
        return f_Age5054Pop;
    }

    public void setF_Age5054Pop(Short f_Age5054Pop) {
        this.f_Age5054Pop = f_Age5054Pop;
    }

    public Short getF_Age5559Pop() {
        return f_Age5559Pop;
    }

    public void setF_Age5559Pop(Short f_Age5559Pop) {
        this.f_Age5559Pop = f_Age5559Pop;
    }

    public Short getF_Age59Pop() {
        return f_Age59Pop;
    }

    public void setF_Age59Pop(Short f_Age59Pop) {
        this.f_Age59Pop = f_Age59Pop;
    }

    public Short getF_Age6064Pop() {
        return f_Age6064Pop;
    }

    public void setF_Age6064Pop(Short f_Age6064Pop) {
        this.f_Age6064Pop = f_Age6064Pop;
    }

    public Short getF_Age6569Pop() {
        return f_Age6569Pop;
    }

    public void setF_Age6569Pop(Short f_Age6569Pop) {
        this.f_Age6569Pop = f_Age6569Pop;
    }

    public Short getF_Age7074Pop() {
        return f_Age7074Pop;
    }

    public void setF_Age7074Pop(Short f_Age7074Pop) {
        this.f_Age7074Pop = f_Age7074Pop;
    }

    public Short getF_Age7579Pop() {
        return f_Age7579Pop;
    }

    public void setF_Age7579Pop(Short f_Age7579Pop) {
        this.f_Age7579Pop = f_Age7579Pop;
    }

    public Short getF_Age8084Pop() {
        return f_Age8084Pop;
    }

    public void setF_Age8084Pop(Short f_Age8084Pop) {
        this.f_Age8084Pop = f_Age8084Pop;
    }

    public Short getF_AgeOver85Pop() {
        return f_AgeOver85Pop;
    }

    public void setF_AgeOver85Pop(Short f_AgeOver85Pop) {
        this.f_AgeOver85Pop = f_AgeOver85Pop;
    }

    public Short getF_TlPop() {
        return f_TlPop;
    }

    public void setF_TlPop(Short f_TlPop) {
        this.f_TlPop = f_TlPop;
    }

    public Integer getFilipinoNdPop() {
        return filipinoNdPop;
    }

    public void setFilipinoNdPop(Integer filipinoNdPop) {
        this.filipinoNdPop = filipinoNdPop;
    }

    public Integer getJapaneseNdPop() {
        return japaneseNdPop;
    }

    public void setJapaneseNdPop(Integer japaneseNdPop) {
        this.japaneseNdPop = japaneseNdPop;
    }

    public Integer getKoreanNdPop() {
        return koreanNdPop;
    }

    public void setKoreanNdPop(Integer koreanNdPop) {
        this.koreanNdPop = koreanNdPop;
    }

    public Integer getLanChineseNdPop() {
        return lanChineseNdPop;
    }

    public void setLanChineseNdPop(Integer lanChineseNdPop) {
        this.lanChineseNdPop = lanChineseNdPop;
    }

    public Integer getLanItalianNdPop() {
        return lanItalianNdPop;
    }

    public void setLanItalianNdPop(Integer lanItalianNdPop) {
        this.lanItalianNdPop = lanItalianNdPop;
    }

    public Integer getLanKoreanNdPop() {
        return lanKoreanNdPop;
    }

    public void setLanKoreanNdPop(Integer lanKoreanNdPop) {
        this.lanKoreanNdPop = lanKoreanNdPop;
    }

    public Integer getLanPersianFarsiNdPop() {
        return lanPersianFarsiNdPop;
    }

    public void setLanPersianFarsiNdPop(Integer lanPersianFarsiNdPop) {
        this.lanPersianFarsiNdPop = lanPersianFarsiNdPop;
    }

    public Integer getLanPortugueseNdPop() {
        return lanPortugueseNdPop;
    }

    public void setLanPortugueseNdPop(Integer lanPortugueseNdPop) {
        this.lanPortugueseNdPop = lanPortugueseNdPop;
    }

    public Integer getLanRussianNdPop() {
        return lanRussianNdPop;
    }

    public void setLanRussianNdPop(Integer lanRussianNdPop) {
        this.lanRussianNdPop = lanRussianNdPop;
    }

    public Integer getLanSpanishNdPop() {
        return lanSpanishNdPop;
    }

    public void setLanSpanishNdPop(Integer lanSpanishNdPop) {
        this.lanSpanishNdPop = lanSpanishNdPop;
    }

    public Integer getLanTagalogNdPop() {
        return lanTagalogNdPop;
    }

    public void setLanTagalogNdPop(Integer lanTagalogNdPop) {
        this.lanTagalogNdPop = lanTagalogNdPop;
    }

    public Integer getLanTamilNdPop() {
        return lanTamilNdPop;
    }

    public void setLanTamilNdPop(Integer lanTamilNdPop) {
        this.lanTamilNdPop = lanTamilNdPop;
    }

    public Integer getLanUrduNdPop() {
        return lanUrduNdPop;
    }

    public void setLanUrduNdPop(Integer lanUrduNdPop) {
        this.lanUrduNdPop = lanUrduNdPop;
    }

    public Integer getLatinAmericanNdPop() {
        return latinAmericanNdPop;
    }

    public void setLatinAmericanNdPop(Integer latinAmericanNdPop) {
        this.latinAmericanNdPop = latinAmericanNdPop;
    }

    public Short getM_Age04Pop() {
        return m_Age04Pop;
    }

    public void setM_Age04Pop(Short m_Age04Pop) {
        this.m_Age04Pop = m_Age04Pop;
    }

    public Short getM_Age1014Pop() {
        return m_Age1014Pop;
    }

    public void setM_Age1014Pop(Short m_Age1014Pop) {
        this.m_Age1014Pop = m_Age1014Pop;
    }

    public Short getM_Age1519Pop() {
        return m_Age1519Pop;
    }

    public void setM_Age1519Pop(Short m_Age1519Pop) {
        this.m_Age1519Pop = m_Age1519Pop;
    }

    public Short getM_Age2024Pop() {
        return m_Age2024Pop;
    }

    public void setM_Age2024Pop(Short m_Age2024Pop) {
        this.m_Age2024Pop = m_Age2024Pop;
    }

    public Short getM_Age2529Pop() {
        return m_Age2529Pop;
    }

    public void setM_Age2529Pop(Short m_Age2529Pop) {
        this.m_Age2529Pop = m_Age2529Pop;
    }

    public Short getM_Age3034Pop() {
        return m_Age3034Pop;
    }

    public void setM_Age3034Pop(Short m_Age3034Pop) {
        this.m_Age3034Pop = m_Age3034Pop;
    }

    public Short getM_Age3539Pop() {
        return m_Age3539Pop;
    }

    public void setM_Age3539Pop(Short m_Age3539Pop) {
        this.m_Age3539Pop = m_Age3539Pop;
    }

    public Short getM_Age4044Pop() {
        return m_Age4044Pop;
    }

    public void setM_Age4044Pop(Short m_Age4044Pop) {
        this.m_Age4044Pop = m_Age4044Pop;
    }

    public Short getM_Age4549Pop() {
        return m_Age4549Pop;
    }

    public void setM_Age4549Pop(Short m_Age4549Pop) {
        this.m_Age4549Pop = m_Age4549Pop;
    }

    public Short getM_Age5054Pop() {
        return m_Age5054Pop;
    }

    public void setM_Age5054Pop(Short m_Age5054Pop) {
        this.m_Age5054Pop = m_Age5054Pop;
    }

    public Short getM_Age5559Pop() {
        return m_Age5559Pop;
    }

    public void setM_Age5559Pop(Short m_Age5559Pop) {
        this.m_Age5559Pop = m_Age5559Pop;
    }

    public Short getM_Age59Pop() {
        return m_Age59Pop;
    }

    public void setM_Age59Pop(Short m_Age59Pop) {
        this.m_Age59Pop = m_Age59Pop;
    }

    public Short getM_Age6064Pop() {
        return m_Age6064Pop;
    }

    public void setM_Age6064Pop(Short m_Age6064Pop) {
        this.m_Age6064Pop = m_Age6064Pop;
    }

    public Short getM_Age6569Pop() {
        return m_Age6569Pop;
    }

    public void setM_Age6569Pop(Short m_Age6569Pop) {
        this.m_Age6569Pop = m_Age6569Pop;
    }

    public Short getM_Age7074Pop() {
        return m_Age7074Pop;
    }

    public void setM_Age7074Pop(Short m_Age7074Pop) {
        this.m_Age7074Pop = m_Age7074Pop;
    }

    public Short getM_Age7579Pop() {
        return m_Age7579Pop;
    }

    public void setM_Age7579Pop(Short m_Age7579Pop) {
        this.m_Age7579Pop = m_Age7579Pop;
    }

    public Short getM_Age8084Pop() {
        return m_Age8084Pop;
    }

    public void setM_Age8084Pop(Short m_Age8084Pop) {
        this.m_Age8084Pop = m_Age8084Pop;
    }

    public Short getM_AgeOver85Pop() {
        return m_AgeOver85Pop;
    }

    public void setM_AgeOver85Pop(Short m_AgeOver85Pop) {
        this.m_AgeOver85Pop = m_AgeOver85Pop;
    }

    public Short getM_TlPop() {
        return m_TlPop;
    }

    public void setM_TlPop(Short m_TlPop) {
        this.m_TlPop = m_TlPop;
    }

    public Double getMedianAgePop() {
        return medianAgePop;
    }

    public void setMedianAgePop(Double medianAgePop) {
        this.medianAgePop = medianAgePop;
    }

    public Integer getMultipleVisibleMinorityNdPop() {
        return multipleVisibleMinorityNdPop;
    }

    public void setMultipleVisibleMinorityNdPop(Integer multipleVisibleMinorityNdPop) {
        this.multipleVisibleMinorityNdPop = multipleVisibleMinorityNdPop;
    }

    public short getNdId() {
        return ndId;
    }

    public void setNdId(short ndId) {
        this.ndId = ndId;
    }

    public Integer getNoVisibleMinorityNdTPop() {
        return noVisibleMinorityNdTPop;
    }

    public void setNoVisibleMinorityNdTPop(Integer noVisibleMinorityNdTPop) {
        this.noVisibleMinorityNdTPop = noVisibleMinorityNdTPop;
    }

    public Integer getOtherVisibleMinorityNdPop() {
        return otherVisibleMinorityNdPop;
    }

    public void setOtherVisibleMinorityNdPop(Integer otherVisibleMinorityNdPop) {
        this.otherVisibleMinorityNdPop = otherVisibleMinorityNdPop;
    }

    public Integer getSenior55OverNdPop() {
        return senior55OverNdPop;
    }

    public void setSenior55OverNdPop(Integer senior55OverNdPop) {
        this.senior55OverNdPop = senior55OverNdPop;
    }

    public Integer getSenior65OverNdPop() {
        return senior65OverNdPop;
    }

    public void setSenior65OverNdPop(Integer senior65OverNdPop) {
        this.senior65OverNdPop = senior65OverNdPop;
    }

    public Integer getSeniorLiveAloneNdPop() {
        return seniorLiveAloneNdPop;
    }

    public void setSeniorLiveAloneNdPop(Integer seniorLiveAloneNdPop) {
        this.seniorLiveAloneNdPop = seniorLiveAloneNdPop;
    }

    public Integer getSouthAsianNdPop() {
        return southAsianNdPop;
    }

    public void setSouthAsianNdPop(Integer southAsianNdPop) {
        this.southAsianNdPop = southAsianNdPop;
    }

    public Integer getSoutheastAsianNdPop() {
        return southeastAsianNdPop;
    }

    public void setSoutheastAsianNdPop(Integer southeastAsianNdPop) {
        this.southeastAsianNdPop = southeastAsianNdPop;
    }

    public Integer getTlF_NdPop() {
        return tlF_NdPop;
    }

    public void setTlF_NdPop(Integer tlF_NdPop) {
        this.tlF_NdPop = tlF_NdPop;
    }

    public Integer getTlHomeLanguageNdTPop() {
        return tlHomeLanguageNdTPop;
    }

    public void setTlHomeLanguageNdTPop(Integer tlHomeLanguageNdTPop) {
        this.tlHomeLanguageNdTPop = tlHomeLanguageNdTPop;
    }

    public Integer getTlMNdPop() {
        return tlMNdPop;
    }

    public void setTlMNdPop(Integer tlMNdPop) {
        this.tlMNdPop = tlMNdPop;
    }

    public Integer getTlNdPop() {
        return tlNdPop;
    }

    public void setTlNdPop(Integer tlNdPop) {
        this.tlNdPop = tlNdPop;
    }

    public Integer getTlVisibleMinorityNdPop() {
        return tlVisibleMinorityNdPop;
    }

    public void setTlVisibleMinorityNdPop(Integer tlVisibleMinorityNdPop) {
        this.tlVisibleMinorityNdPop = tlVisibleMinorityNdPop;
    }

    public Integer getWestAsianNdPop() {
        return westAsianNdPop;
    }

    public void setWestAsianNdPop(Integer westAsianNdPop) {
        this.westAsianNdPop = westAsianNdPop;
    }

    public Integer getYouthAge1524NdPop() {
        return youthAge1524NdPop;
    }

    public void setYouthAge1524NdPop(Integer youthAge1524NdPop) {
        this.youthAge1524NdPop = youthAge1524NdPop;
    }
}
