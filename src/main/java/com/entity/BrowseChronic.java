package com.entity;


import java.math.BigDecimal;

/**
 * Created by 郑晓辉 on 2016/5/26.
 */
public class BrowseChronic {
    //Neighborhood
    private short ndId_Neighborhood;
    private String ndName;
    private BigDecimal ndArea;
    private BigDecimal ndCenterX;
    private BigDecimal ndCenterY;
    //NeighborhoodDiabetesPrevalence
    private short ctDiaYear;
    private short ndId;
    private Integer b_Age20Pop;
    private Short b_Age20PopDia;
    private BigDecimal b_Age20Pre;
    private BigDecimal b_Age20StdPre;
    private Short f_Age20Pop;
    private Short f_Age20PopDia;
    private BigDecimal f_Age20Pre;
    private BigDecimal f_Age20StdPre;
    private Integer m_Age20Pop;
    private Integer m_Age20PopDia;
    private BigDecimal m_Age20Pre;
    private BigDecimal m_Age20StdPre;
    private Integer b_Age2044Pop;
    private Integer b_Age2044PopDia;
    private BigDecimal b_Age2044Pre;
    private Integer f_Age2044Pop;
    private Integer f_Age2044PopDia;
    private BigDecimal f_Age2044Pre;
    private Integer m_Age2044Pop;
    private Integer m_Age2044PopDia;
    private BigDecimal m_Age2044Pre;
    private Integer b_Age4564Pop;
    private Integer b_Age4564PopDia;
    private BigDecimal b_Age4564Pre;
    private Integer f_Age4564Pop;
    private Integer f_Age4564PopDia;
    private BigDecimal f_Age4564Pre;
    private Integer m_Age4564Pop;
    private Integer m_Age4564PopDia;
    private BigDecimal m_Age4564Pre;
    private Integer b_Age65Pop;
    private Integer b_Age65PopDia;
    private BigDecimal b_Age65Pre;
    private Integer f_Age65Pop;
    private Integer f_Age65PopDia;
    private BigDecimal f_Age65Pre;
    private Integer m_Age65Pop;
    private Integer m_Age65PopDia;
    private BigDecimal m_Age65Pre;
    private Integer b_Age6584Pop;
    private Integer b_Age6584PopDia;
    private BigDecimal b_Age6584Pre;
    private Integer f_Age6584Pop;
    private Integer f_Age6584PopDia;
    private BigDecimal f_Age6584Pre;
    private Integer m_Age6584Pop;
    private Integer m_Age6584PopDia;
    private BigDecimal m_Age6584Pre;
    private Integer b_Age85Pop;
    private Integer b_Age85PopDia;
    private BigDecimal b_Age85Pre;
    private Integer f_Age85Pop;
    private Integer f_Age85PopDia;
    private BigDecimal f_Age85Pre;
    private Integer m_Age85Pop;
    private Integer m_Age85PopDia;
    private BigDecimal m_Age85Pre;

    public BrowseChronic() {
    }

    //ctDiaYear=2007
    public BrowseChronic(
            String ndName,
            Integer b_Age20Pop,
            Short b_Age20PopDia,
            BigDecimal b_Age20StdPre,
            Integer b_Age2044Pop,
            Integer b_Age2044PopDia,
            BigDecimal b_Age2044Pre,
            Integer b_Age4564Pop,
            Integer b_Age4564PopDia,
            BigDecimal b_Age4564Pre,
            Integer b_Age65Pop,
            Integer b_Age65PopDia,
            BigDecimal b_Age65Pre,
            Short f_Age20Pop,
            Short f_Age20PopDia,
            BigDecimal f_Age20StdPre,
            Integer f_Age2044Pop,
            Integer f_Age2044PopDia,
            BigDecimal f_Age2044Pre,
            Integer f_Age4564Pop,
            Integer f_Age4564PopDia,
            BigDecimal f_Age4564Pre,
            Integer f_Age65Pop,
            Integer f_Age65PopDia,
            BigDecimal f_Age65Pre,
            Integer m_Age20Pop,
            Integer m_Age20PopDia,
            BigDecimal m_Age20StdPre,
            Integer m_Age2044Pop,
            Integer m_Age2044PopDia,
            BigDecimal m_Age2044Pre,
            Integer m_Age4564Pop,
            Integer m_Age4564PopDia,
            BigDecimal m_Age4564Pre,
            Integer m_Age65Pop,
            Integer m_Age65PopDia,
            BigDecimal m_Age65Pre) {
        this.m_Age20Pop = m_Age20Pop;
        this.b_Age2044Pop = b_Age2044Pop;
        this.b_Age2044PopDia = b_Age2044PopDia;
        this.b_Age2044Pre = b_Age2044Pre;
        this.b_Age20Pop = b_Age20Pop;
        this.b_Age20PopDia = b_Age20PopDia;
        this.b_Age20StdPre = b_Age20StdPre;
        this.b_Age4564Pop = b_Age4564Pop;
        this.b_Age4564PopDia = b_Age4564PopDia;
        this.b_Age4564Pre = b_Age4564Pre;
        this.b_Age65Pop = b_Age65Pop;
        this.b_Age65PopDia = b_Age65PopDia;
        this.b_Age65Pre = b_Age65Pre;
        this.f_Age2044Pop = f_Age2044Pop;
        this.f_Age2044PopDia = f_Age2044PopDia;
        this.f_Age2044Pre = f_Age2044Pre;
        this.f_Age20Pop = f_Age20Pop;
        this.f_Age20PopDia = f_Age20PopDia;
        this.f_Age20StdPre = f_Age20StdPre;
        this.f_Age4564PopDia = f_Age4564PopDia;
        this.f_Age4564Pop = f_Age4564Pop;
        this.f_Age4564Pre = f_Age4564Pre;
        this.f_Age65Pop = f_Age65Pop;
        this.f_Age65PopDia = f_Age65PopDia;
        this.f_Age65Pre = f_Age65Pre;
        this.m_Age2044Pop = m_Age2044Pop;
        this.m_Age2044PopDia = m_Age2044PopDia;
        this.m_Age2044Pre = m_Age2044Pre;
        this.m_Age20PopDia = m_Age20PopDia;
        this.m_Age20StdPre = m_Age20StdPre;
        this.m_Age4564Pop = m_Age4564Pop;
        this.m_Age4564PopDia = m_Age4564PopDia;
        this.m_Age4564Pre = m_Age4564Pre;
        this.m_Age65Pop = m_Age65Pop;
        this.m_Age65PopDia = m_Age65PopDia;
        this.m_Age65Pre = m_Age65Pre;
        this.ndName = ndName;
    }
    //ctDiaYear=2011

    public BrowseChronic(
            String ndName,
            Integer b_Age20Pop,
            Short b_Age20PopDia,
            BigDecimal b_Age20Pre,
            BigDecimal b_Age20StdPre,
            Integer b_Age2044Pop,
            Integer b_Age2044PopDia,
            BigDecimal b_Age2044Pre,
            Integer b_Age4564Pop,
            Integer b_Age4564PopDia,
            BigDecimal b_Age4564Pre,
            Integer b_Age6584Pop,
            Integer b_Age6584PopDia,
            BigDecimal b_Age6584Pre,
            Integer b_Age85Pop,
            Integer b_Age85PopDia,
            BigDecimal b_Age85Pre,
            Short f_Age20Pop,
            Short f_Age20PopDia,
            BigDecimal f_Age20Pre,
            Integer f_Age2044Pop,
            Integer f_Age2044PopDia,
            BigDecimal f_Age2044Pre,
            Integer f_Age4564Pop,
            Integer f_Age4564PopDia,
            BigDecimal f_Age4564Pre,
            Integer f_Age6584Pop,
            Integer f_Age6584PopDia,
            BigDecimal f_Age6584Pre,
            Integer f_Age85Pop,
            Integer f_Age85PopDia,
            BigDecimal f_Age85Pre,
            Integer m_Age20Pop,
            Integer m_Age20PopDia,
            BigDecimal m_Age20Pre,
            Integer m_Age2044Pop,
            Integer m_Age2044PopDia,
            BigDecimal m_Age2044Pre,
            Integer m_Age4564Pop,
            Integer m_Age4564PopDia,
            BigDecimal m_Age4564Pre,
            Integer m_Age6584Pop,
            Integer m_Age6584PopDia,
            BigDecimal m_Age6584Pre,
            Integer m_Age85Pop,
            Integer m_Age85PopDia,
            BigDecimal m_Age85Pre) {
        this.b_Age20Pop = b_Age20Pop;
        this.b_Age20PopDia = b_Age20PopDia;
        this.b_Age20Pre = b_Age20Pre;
        this.b_Age20StdPre = b_Age20StdPre;
        this.b_Age2044Pop = b_Age2044Pop;
        this.b_Age2044PopDia = b_Age2044PopDia;
        this.b_Age2044Pre = b_Age2044Pre;
        this.b_Age4564Pop = b_Age4564Pop;
        this.b_Age4564PopDia = b_Age4564PopDia;
        this.b_Age4564Pre = b_Age4564Pre;
        this.b_Age6584Pop = b_Age6584Pop;
        this.b_Age6584PopDia = b_Age6584PopDia;
        this.b_Age6584Pre = b_Age6584Pre;
        this.b_Age85Pop = b_Age85Pop;
        this.b_Age85PopDia = b_Age85PopDia;
        this.b_Age85Pre = b_Age85Pre;
        this.f_Age2044Pop = f_Age2044Pop;
        this.f_Age2044PopDia = f_Age2044PopDia;
        this.f_Age2044Pre = f_Age2044Pre;
        this.f_Age20Pop = f_Age20Pop;
        this.f_Age20PopDia = f_Age20PopDia;
        this.f_Age20Pre = f_Age20Pre;
        this.f_Age4564Pop = f_Age4564Pop;
        this.f_Age4564PopDia = f_Age4564PopDia;
        this.f_Age4564Pre = f_Age4564Pre;
        this.f_Age6584Pop = f_Age6584Pop;
        this.f_Age6584PopDia = f_Age6584PopDia;
        this.f_Age6584Pre = f_Age6584Pre;
        this.f_Age85Pop = f_Age85Pop;
        this.f_Age85PopDia = f_Age85PopDia;
        this.f_Age85Pre = f_Age85Pre;
        this.m_Age2044Pop = m_Age2044Pop;
        this.m_Age2044PopDia = m_Age2044PopDia;
        this.m_Age2044Pre = m_Age2044Pre;
        this.m_Age20Pop = m_Age20Pop;
        this.m_Age20PopDia = m_Age20PopDia;
        this.m_Age20Pre = m_Age20Pre;
        this.m_Age4564Pop = m_Age4564Pop;
        this.m_Age4564PopDia = m_Age4564PopDia;
        this.m_Age4564Pre = m_Age4564Pre;
        this.m_Age6584Pop = m_Age6584Pop;
        this.m_Age6584PopDia = m_Age6584PopDia;
        this.m_Age6584Pre = m_Age6584Pre;
        this.m_Age85Pop = m_Age85Pop;
        this.m_Age85PopDia = m_Age85PopDia;
        this.m_Age85Pre = m_Age85Pre;
        this.ndName = ndName;
    }

    //ctDiaYear=2012

    public BrowseChronic(
            String ndName,
            Integer b_Age20Pop,
            Short b_Age20PopDia,
            BigDecimal b_Age20Pre,
            BigDecimal b_Age20StdPre,
            Integer b_Age2044Pop,
            Integer b_Age2044PopDia,
            BigDecimal b_Age2044Pre,
            Integer b_Age4564Pop,
            Integer b_Age4564PopDia,
            BigDecimal b_Age4564Pre,
            Integer b_Age65Pop,
            Integer b_Age65PopDia,
            BigDecimal b_Age65Pre,
            Short f_Age20Pop,
            Short f_Age20PopDia,
            BigDecimal f_Age20Pre,
            BigDecimal f_Age20StdPre,
            Integer f_Age2044Pop,
            Integer f_Age2044PopDia,
            BigDecimal f_Age2044Pre,
            Integer f_Age4564Pop,
            Integer f_Age4564PopDia,
            BigDecimal f_Age4564Pre,
            Integer f_Age65Pop,
            Integer f_Age65PopDia,
            BigDecimal f_Age65Pre,
            Integer m_Age20Pop,
            Integer m_Age20PopDia,
            BigDecimal m_Age20Pre,
            BigDecimal m_Age20StdPre,
            Integer m_Age2044Pop,
            Integer m_Age2044PopDia,
            BigDecimal m_Age2044Pre,
            Integer m_Age4564Pop,
            Integer m_Age4564PopDia,
            BigDecimal m_Age4564Pre,
            Integer m_Age65Pop,
            Integer m_Age65PopDia,
            BigDecimal m_Age65Pre) {
        this.b_Age2044Pop = b_Age2044Pop;
        this.b_Age2044PopDia = b_Age2044PopDia;
        this.b_Age2044Pre = b_Age2044Pre;
        this.b_Age20Pop = b_Age20Pop;
        this.b_Age20PopDia = b_Age20PopDia;
        this.b_Age20Pre = b_Age20Pre;
        this.b_Age20StdPre = b_Age20StdPre;
        this.b_Age4564Pop = b_Age4564Pop;
        this.b_Age4564PopDia = b_Age4564PopDia;
        this.b_Age4564Pre = b_Age4564Pre;
        this.b_Age65Pop = b_Age65Pop;
        this.b_Age65PopDia = b_Age65PopDia;
        this.b_Age65Pre = b_Age65Pre;
        this.f_Age2044Pop = f_Age2044Pop;
        this.f_Age2044PopDia = f_Age2044PopDia;
        this.f_Age2044Pre = f_Age2044Pre;
        this.f_Age20Pop = f_Age20Pop;
        this.f_Age20PopDia = f_Age20PopDia;
        this.f_Age20Pre = f_Age20Pre;
        this.f_Age20StdPre = f_Age20StdPre;
        this.f_Age4564Pop = f_Age4564Pop;
        this.f_Age4564PopDia = f_Age4564PopDia;
        this.f_Age4564Pre = f_Age4564Pre;
        this.f_Age65Pop = f_Age65Pop;
        this.f_Age65PopDia = f_Age65PopDia;
        this.f_Age65Pre = f_Age65Pre;
        this.m_Age2044Pop = m_Age2044Pop;
        this.m_Age2044PopDia = m_Age2044PopDia;
        this.m_Age2044Pre = m_Age2044Pre;
        this.m_Age20Pop = m_Age20Pop;
        this.m_Age20PopDia = m_Age20PopDia;
        this.m_Age20Pre = m_Age20Pre;
        this.m_Age20StdPre = m_Age20StdPre;
        this.m_Age4564Pop = m_Age4564Pop;
        this.m_Age4564PopDia = m_Age4564PopDia;
        this.m_Age4564Pre = m_Age4564Pre;
        this.m_Age65Pop = m_Age65Pop;
        this.m_Age65PopDia = m_Age65PopDia;
        this.m_Age65Pre = m_Age65Pre;
        this.ndName = ndName;
    }

    public Integer getB_Age2044Pop() {
        return b_Age2044Pop;
    }

    public void setB_Age2044Pop(Integer b_Age2044Pop) {
        this.b_Age2044Pop = b_Age2044Pop;
    }

    public Integer getB_Age2044PopDia() {
        return b_Age2044PopDia;
    }

    public void setB_Age2044PopDia(Integer b_Age2044PopDia) {
        this.b_Age2044PopDia = b_Age2044PopDia;
    }

    public BigDecimal getB_Age2044Pre() {
        return b_Age2044Pre;
    }

    public void setB_Age2044Pre(BigDecimal b_Age2044Pre) {
        this.b_Age2044Pre = b_Age2044Pre;
    }

    public Integer getB_Age20Pop() {
        return b_Age20Pop;
    }

    public void setB_Age20Pop(Integer b_Age20Pop) {
        this.b_Age20Pop = b_Age20Pop;
    }

    public Short getB_Age20PopDia() {
        return b_Age20PopDia;
    }

    public void setB_Age20PopDia(Short b_Age20PopDia) {
        this.b_Age20PopDia = b_Age20PopDia;
    }

    public BigDecimal getB_Age20Pre() {
        return b_Age20Pre;
    }

    public void setB_Age20Pre(BigDecimal b_Age20Pre) {
        this.b_Age20Pre = b_Age20Pre;
    }

    public BigDecimal getB_Age20StdPre() {
        return b_Age20StdPre;
    }

    public void setB_Age20StdPre(BigDecimal b_Age20StdPre) {
        this.b_Age20StdPre = b_Age20StdPre;
    }

    public Integer getB_Age4564Pop() {
        return b_Age4564Pop;
    }

    public void setB_Age4564Pop(Integer b_Age4564Pop) {
        this.b_Age4564Pop = b_Age4564Pop;
    }

    public Integer getB_Age4564PopDia() {
        return b_Age4564PopDia;
    }

    public void setB_Age4564PopDia(Integer b_Age4564PopDia) {
        this.b_Age4564PopDia = b_Age4564PopDia;
    }

    public BigDecimal getB_Age4564Pre() {
        return b_Age4564Pre;
    }

    public void setB_Age4564Pre(BigDecimal b_Age4564Pre) {
        this.b_Age4564Pre = b_Age4564Pre;
    }

    public Integer getB_Age6584Pop() {
        return b_Age6584Pop;
    }

    public void setB_Age6584Pop(Integer b_Age6584Pop) {
        this.b_Age6584Pop = b_Age6584Pop;
    }

    public Integer getB_Age6584PopDia() {
        return b_Age6584PopDia;
    }

    public void setB_Age6584PopDia(Integer b_Age6584PopDia) {
        this.b_Age6584PopDia = b_Age6584PopDia;
    }

    public BigDecimal getB_Age6584Pre() {
        return b_Age6584Pre;
    }

    public void setB_Age6584Pre(BigDecimal b_Age6584Pre) {
        this.b_Age6584Pre = b_Age6584Pre;
    }

    public Integer getB_Age65Pop() {
        return b_Age65Pop;
    }

    public void setB_Age65Pop(Integer b_Age65Pop) {
        this.b_Age65Pop = b_Age65Pop;
    }

    public Integer getB_Age65PopDia() {
        return b_Age65PopDia;
    }

    public void setB_Age65PopDia(Integer b_Age65PopDia) {
        this.b_Age65PopDia = b_Age65PopDia;
    }

    public BigDecimal getB_Age65Pre() {
        return b_Age65Pre;
    }

    public void setB_Age65Pre(BigDecimal b_Age65Pre) {
        this.b_Age65Pre = b_Age65Pre;
    }

    public Integer getB_Age85Pop() {
        return b_Age85Pop;
    }

    public void setB_Age85Pop(Integer b_Age85Pop) {
        this.b_Age85Pop = b_Age85Pop;
    }

    public Integer getB_Age85PopDia() {
        return b_Age85PopDia;
    }

    public void setB_Age85PopDia(Integer b_Age85PopDia) {
        this.b_Age85PopDia = b_Age85PopDia;
    }

    public BigDecimal getB_Age85Pre() {
        return b_Age85Pre;
    }

    public void setB_Age85Pre(BigDecimal b_Age85Pre) {
        this.b_Age85Pre = b_Age85Pre;
    }

    public short getCtDiaYear() {
        return ctDiaYear;
    }

    public void setCtDiaYear(short ctDiaYear) {
        this.ctDiaYear = ctDiaYear;
    }

    public Integer getF_Age2044Pop() {
        return f_Age2044Pop;
    }

    public void setF_Age2044Pop(Integer f_Age2044Pop) {
        this.f_Age2044Pop = f_Age2044Pop;
    }

    public Integer getF_Age2044PopDia() {
        return f_Age2044PopDia;
    }

    public void setF_Age2044PopDia(Integer f_Age2044PopDia) {
        this.f_Age2044PopDia = f_Age2044PopDia;
    }

    public BigDecimal getF_Age2044Pre() {
        return f_Age2044Pre;
    }

    public void setF_Age2044Pre(BigDecimal f_Age2044Pre) {
        this.f_Age2044Pre = f_Age2044Pre;
    }

    public Short getF_Age20Pop() {
        return f_Age20Pop;
    }

    public void setF_Age20Pop(Short f_Age20Pop) {
        this.f_Age20Pop = f_Age20Pop;
    }

    public Short getF_Age20PopDia() {
        return f_Age20PopDia;
    }

    public void setF_Age20PopDia(Short f_Age20PopDia) {
        this.f_Age20PopDia = f_Age20PopDia;
    }

    public BigDecimal getF_Age20Pre() {
        return f_Age20Pre;
    }

    public void setF_Age20Pre(BigDecimal f_Age20Pre) {
        this.f_Age20Pre = f_Age20Pre;
    }

    public BigDecimal getF_Age20StdPre() {
        return f_Age20StdPre;
    }

    public void setF_Age20StdPre(BigDecimal f_Age20StdPre) {
        this.f_Age20StdPre = f_Age20StdPre;
    }

    public Integer getF_Age4564Pop() {
        return f_Age4564Pop;
    }

    public void setF_Age4564Pop(Integer f_Age4564Pop) {
        this.f_Age4564Pop = f_Age4564Pop;
    }

    public Integer getF_Age4564PopDia() {
        return f_Age4564PopDia;
    }

    public void setF_Age4564PopDia(Integer f_Age4564PopDia) {
        this.f_Age4564PopDia = f_Age4564PopDia;
    }

    public BigDecimal getF_Age4564Pre() {
        return f_Age4564Pre;
    }

    public void setF_Age4564Pre(BigDecimal f_Age4564Pre) {
        this.f_Age4564Pre = f_Age4564Pre;
    }

    public Integer getF_Age6584Pop() {
        return f_Age6584Pop;
    }

    public void setF_Age6584Pop(Integer f_Age6584Pop) {
        this.f_Age6584Pop = f_Age6584Pop;
    }

    public Integer getF_Age6584PopDia() {
        return f_Age6584PopDia;
    }

    public void setF_Age6584PopDia(Integer f_Age6584PopDia) {
        this.f_Age6584PopDia = f_Age6584PopDia;
    }

    public BigDecimal getF_Age6584Pre() {
        return f_Age6584Pre;
    }

    public void setF_Age6584Pre(BigDecimal f_Age6584Pre) {
        this.f_Age6584Pre = f_Age6584Pre;
    }

    public Integer getF_Age65Pop() {
        return f_Age65Pop;
    }

    public void setF_Age65Pop(Integer f_Age65Pop) {
        this.f_Age65Pop = f_Age65Pop;
    }

    public Integer getF_Age65PopDia() {
        return f_Age65PopDia;
    }

    public void setF_Age65PopDia(Integer f_Age65PopDia) {
        this.f_Age65PopDia = f_Age65PopDia;
    }

    public BigDecimal getF_Age65Pre() {
        return f_Age65Pre;
    }

    public void setF_Age65Pre(BigDecimal f_Age65Pre) {
        this.f_Age65Pre = f_Age65Pre;
    }

    public Integer getF_Age85Pop() {
        return f_Age85Pop;
    }

    public void setF_Age85Pop(Integer f_Age85Pop) {
        this.f_Age85Pop = f_Age85Pop;
    }

    public Integer getF_Age85PopDia() {
        return f_Age85PopDia;
    }

    public void setF_Age85PopDia(Integer f_Age85PopDia) {
        this.f_Age85PopDia = f_Age85PopDia;
    }

    public BigDecimal getF_Age85Pre() {
        return f_Age85Pre;
    }

    public void setF_Age85Pre(BigDecimal f_Age85Pre) {
        this.f_Age85Pre = f_Age85Pre;
    }

    public Integer getM_Age2044Pop() {
        return m_Age2044Pop;
    }

    public void setM_Age2044Pop(Integer m_Age2044Pop) {
        this.m_Age2044Pop = m_Age2044Pop;
    }

    public Integer getM_Age2044PopDia() {
        return m_Age2044PopDia;
    }

    public void setM_Age2044PopDia(Integer m_Age2044PopDia) {
        this.m_Age2044PopDia = m_Age2044PopDia;
    }

    public BigDecimal getM_Age2044Pre() {
        return m_Age2044Pre;
    }

    public void setM_Age2044Pre(BigDecimal m_Age2044Pre) {
        this.m_Age2044Pre = m_Age2044Pre;
    }

    public Integer getM_Age20Pop() {
        return m_Age20Pop;
    }

    public void setM_Age20Pop(Integer m_Age20Pop) {
        this.m_Age20Pop = m_Age20Pop;
    }

    public Integer getM_Age20PopDia() {
        return m_Age20PopDia;
    }

    public void setM_Age20PopDia(Integer m_Age20PopDia) {
        this.m_Age20PopDia = m_Age20PopDia;
    }

    public BigDecimal getM_Age20Pre() {
        return m_Age20Pre;
    }

    public void setM_Age20Pre(BigDecimal m_Age20Pre) {
        this.m_Age20Pre = m_Age20Pre;
    }

    public BigDecimal getM_Age20StdPre() {
        return m_Age20StdPre;
    }

    public void setM_Age20StdPre(BigDecimal m_Age20StdPre) {
        this.m_Age20StdPre = m_Age20StdPre;
    }

    public Integer getM_Age4564Pop() {
        return m_Age4564Pop;
    }

    public void setM_Age4564Pop(Integer m_Age4564Pop) {
        this.m_Age4564Pop = m_Age4564Pop;
    }

    public Integer getM_Age4564PopDia() {
        return m_Age4564PopDia;
    }

    public void setM_Age4564PopDia(Integer m_Age4564PopDia) {
        this.m_Age4564PopDia = m_Age4564PopDia;
    }

    public BigDecimal getM_Age4564Pre() {
        return m_Age4564Pre;
    }

    public void setM_Age4564Pre(BigDecimal m_Age4564Pre) {
        this.m_Age4564Pre = m_Age4564Pre;
    }

    public Integer getM_Age6584Pop() {
        return m_Age6584Pop;
    }

    public void setM_Age6584Pop(Integer m_Age6584Pop) {
        this.m_Age6584Pop = m_Age6584Pop;
    }

    public Integer getM_Age6584PopDia() {
        return m_Age6584PopDia;
    }

    public void setM_Age6584PopDia(Integer m_Age6584PopDia) {
        this.m_Age6584PopDia = m_Age6584PopDia;
    }

    public BigDecimal getM_Age6584Pre() {
        return m_Age6584Pre;
    }

    public void setM_Age6584Pre(BigDecimal m_Age6584Pre) {
        this.m_Age6584Pre = m_Age6584Pre;
    }

    public Integer getM_Age65Pop() {
        return m_Age65Pop;
    }

    public void setM_Age65Pop(Integer m_Age65Pop) {
        this.m_Age65Pop = m_Age65Pop;
    }

    public Integer getM_Age65PopDia() {
        return m_Age65PopDia;
    }

    public void setM_Age65PopDia(Integer m_Age65PopDia) {
        this.m_Age65PopDia = m_Age65PopDia;
    }

    public BigDecimal getM_Age65Pre() {
        return m_Age65Pre;
    }

    public void setM_Age65Pre(BigDecimal m_Age65Pre) {
        this.m_Age65Pre = m_Age65Pre;
    }

    public Integer getM_Age85Pop() {
        return m_Age85Pop;
    }

    public void setM_Age85Pop(Integer m_Age85Pop) {
        this.m_Age85Pop = m_Age85Pop;
    }

    public Integer getM_Age85PopDia() {
        return m_Age85PopDia;
    }

    public void setM_Age85PopDia(Integer m_Age85PopDia) {
        this.m_Age85PopDia = m_Age85PopDia;
    }

    public BigDecimal getM_Age85Pre() {
        return m_Age85Pre;
    }

    public void setM_Age85Pre(BigDecimal m_Age85Pre) {
        this.m_Age85Pre = m_Age85Pre;
    }

    public BigDecimal getNdArea() {
        return ndArea;
    }

    public void setNdArea(BigDecimal ndArea) {
        this.ndArea = ndArea;
    }

    public BigDecimal getNdCenterX() {
        return ndCenterX;
    }

    public void setNdCenterX(BigDecimal ndCenterX) {
        this.ndCenterX = ndCenterX;
    }

    public BigDecimal getNdCenterY() {
        return ndCenterY;
    }

    public void setNdCenterY(BigDecimal ndCenterY) {
        this.ndCenterY = ndCenterY;
    }

    public short getNdId() {
        return ndId;
    }

    public void setNdId(short ndId) {
        this.ndId = ndId;
    }

    public short getNdId_Neighborhood() {
        return ndId_Neighborhood;
    }

    public void setNdId_Neighborhood(short ndId_Neighborhood) {
        this.ndId_Neighborhood = ndId_Neighborhood;
    }

    public String getNdName() {
        return ndName;
    }

    public void setNdName(String ndName) {
        this.ndName = ndName;
    }
}
