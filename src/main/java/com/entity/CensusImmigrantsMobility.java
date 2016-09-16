package com.entity;

/**
 * Created by 郑晓辉 on 2016/8/27.
 */
public class CensusImmigrantsMobility {
    private double ctId;
    private short ctYear;
    private Long tlPop5YMobi;
    private Long non5YmoversPop;
    private Long movers5YPop;
    private Integer nonMigrants5YPop;
    private Integer migrants5YPop;
    private Integer interMigrants5YPop;
    private Integer intraMigrants5YPop;
    private Integer interproMigrants5YPop;
    private Integer exterMigrants5YPop;
    private Long tlPop1YMobi;
    private Long non1YmoversPop;
    private Long movers1YPop;
    private Integer nonMigrants1YPop;
    private Integer migrants1YPop;
    private Integer interMigrants1YPop;
    private Integer intraMigrants1YPop;
    private Integer interproMigrants1YPop;
    private Integer exterMigrants1YPop;

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

    public Long getTlPop5YMobi() {
        return tlPop5YMobi;
    }

    public void setTlPop5YMobi(Long tlPop5YMobi) {
        this.tlPop5YMobi = tlPop5YMobi;
    }

    public Long getNon5YmoversPop() {
        return non5YmoversPop;
    }

    public void setNon5YmoversPop(Long non5YmoversPop) {
        this.non5YmoversPop = non5YmoversPop;
    }

    public Long getMovers5YPop() {
        return movers5YPop;
    }

    public void setMovers5YPop(Long movers5YPop) {
        this.movers5YPop = movers5YPop;
    }

    public Integer getNonMigrants5YPop() {
        return nonMigrants5YPop;
    }

    public void setNonMigrants5YPop(Integer nonMigrants5YPop) {
        this.nonMigrants5YPop = nonMigrants5YPop;
    }

    public Integer getMigrants5YPop() {
        return migrants5YPop;
    }

    public void setMigrants5YPop(Integer migrants5YPop) {
        this.migrants5YPop = migrants5YPop;
    }

    public Integer getInterMigrants5YPop() {
        return interMigrants5YPop;
    }

    public void setInterMigrants5YPop(Integer interMigrants5YPop) {
        this.interMigrants5YPop = interMigrants5YPop;
    }

    public Integer getIntraMigrants5YPop() {
        return intraMigrants5YPop;
    }

    public void setIntraMigrants5YPop(Integer intraMigrants5YPop) {
        this.intraMigrants5YPop = intraMigrants5YPop;
    }

    public Integer getInterproMigrants5YPop() {
        return interproMigrants5YPop;
    }

    public void setInterproMigrants5YPop(Integer interproMigrants5YPop) {
        this.interproMigrants5YPop = interproMigrants5YPop;
    }

    public Integer getExterMigrants5YPop() {
        return exterMigrants5YPop;
    }

    public void setExterMigrants5YPop(Integer exterMigrants5YPop) {
        this.exterMigrants5YPop = exterMigrants5YPop;
    }

    public Long getTlPop1YMobi() {
        return tlPop1YMobi;
    }

    public void setTlPop1YMobi(Long tlPop1YMobi) {
        this.tlPop1YMobi = tlPop1YMobi;
    }

    public Long getNon1YmoversPop() {
        return non1YmoversPop;
    }

    public void setNon1YmoversPop(Long non1YmoversPop) {
        this.non1YmoversPop = non1YmoversPop;
    }

    public Long getMovers1YPop() {
        return movers1YPop;
    }

    public void setMovers1YPop(Long movers1YPop) {
        this.movers1YPop = movers1YPop;
    }

    public Integer getNonMigrants1YPop() {
        return nonMigrants1YPop;
    }

    public void setNonMigrants1YPop(Integer nonMigrants1YPop) {
        this.nonMigrants1YPop = nonMigrants1YPop;
    }

    public Integer getMigrants1YPop() {
        return migrants1YPop;
    }

    public void setMigrants1YPop(Integer migrants1YPop) {
        this.migrants1YPop = migrants1YPop;
    }

    public Integer getInterMigrants1YPop() {
        return interMigrants1YPop;
    }

    public void setInterMigrants1YPop(Integer interMigrants1YPop) {
        this.interMigrants1YPop = interMigrants1YPop;
    }

    public Integer getIntraMigrants1YPop() {
        return intraMigrants1YPop;
    }

    public void setIntraMigrants1YPop(Integer intraMigrants1YPop) {
        this.intraMigrants1YPop = intraMigrants1YPop;
    }

    public Integer getInterproMigrants1YPop() {
        return interproMigrants1YPop;
    }

    public void setInterproMigrants1YPop(Integer interproMigrants1YPop) {
        this.interproMigrants1YPop = interproMigrants1YPop;
    }

    public Integer getExterMigrants1YPop() {
        return exterMigrants1YPop;
    }

    public void setExterMigrants1YPop(Integer exterMigrants1YPop) {
        this.exterMigrants1YPop = exterMigrants1YPop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CensusImmigrantsMobility that = (CensusImmigrantsMobility) o;

        if (Double.compare(that.ctId, ctId) != 0) return false;
        if (ctYear != that.ctYear) return false;
        if (tlPop5YMobi != null ? !tlPop5YMobi.equals(that.tlPop5YMobi) : that.tlPop5YMobi != null) return false;
        if (non5YmoversPop != null ? !non5YmoversPop.equals(that.non5YmoversPop) : that.non5YmoversPop != null)
            return false;
        if (movers5YPop != null ? !movers5YPop.equals(that.movers5YPop) : that.movers5YPop != null) return false;
        if (nonMigrants5YPop != null ? !nonMigrants5YPop.equals(that.nonMigrants5YPop) : that.nonMigrants5YPop != null)
            return false;
        if (migrants5YPop != null ? !migrants5YPop.equals(that.migrants5YPop) : that.migrants5YPop != null)
            return false;
        if (interMigrants5YPop != null ? !interMigrants5YPop.equals(that.interMigrants5YPop) : that.interMigrants5YPop != null)
            return false;
        if (intraMigrants5YPop != null ? !intraMigrants5YPop.equals(that.intraMigrants5YPop) : that.intraMigrants5YPop != null)
            return false;
        if (interproMigrants5YPop != null ? !interproMigrants5YPop.equals(that.interproMigrants5YPop) : that.interproMigrants5YPop != null)
            return false;
        if (exterMigrants5YPop != null ? !exterMigrants5YPop.equals(that.exterMigrants5YPop) : that.exterMigrants5YPop != null)
            return false;
        if (tlPop1YMobi != null ? !tlPop1YMobi.equals(that.tlPop1YMobi) : that.tlPop1YMobi != null) return false;
        if (non1YmoversPop != null ? !non1YmoversPop.equals(that.non1YmoversPop) : that.non1YmoversPop != null)
            return false;
        if (movers1YPop != null ? !movers1YPop.equals(that.movers1YPop) : that.movers1YPop != null) return false;
        if (nonMigrants1YPop != null ? !nonMigrants1YPop.equals(that.nonMigrants1YPop) : that.nonMigrants1YPop != null)
            return false;
        if (migrants1YPop != null ? !migrants1YPop.equals(that.migrants1YPop) : that.migrants1YPop != null)
            return false;
        if (interMigrants1YPop != null ? !interMigrants1YPop.equals(that.interMigrants1YPop) : that.interMigrants1YPop != null)
            return false;
        if (intraMigrants1YPop != null ? !intraMigrants1YPop.equals(that.intraMigrants1YPop) : that.intraMigrants1YPop != null)
            return false;
        if (interproMigrants1YPop != null ? !interproMigrants1YPop.equals(that.interproMigrants1YPop) : that.interproMigrants1YPop != null)
            return false;
        if (exterMigrants1YPop != null ? !exterMigrants1YPop.equals(that.exterMigrants1YPop) : that.exterMigrants1YPop != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(ctId);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) ctYear;
        result = 31 * result + (tlPop5YMobi != null ? tlPop5YMobi.hashCode() : 0);
        result = 31 * result + (non5YmoversPop != null ? non5YmoversPop.hashCode() : 0);
        result = 31 * result + (movers5YPop != null ? movers5YPop.hashCode() : 0);
        result = 31 * result + (nonMigrants5YPop != null ? nonMigrants5YPop.hashCode() : 0);
        result = 31 * result + (migrants5YPop != null ? migrants5YPop.hashCode() : 0);
        result = 31 * result + (interMigrants5YPop != null ? interMigrants5YPop.hashCode() : 0);
        result = 31 * result + (intraMigrants5YPop != null ? intraMigrants5YPop.hashCode() : 0);
        result = 31 * result + (interproMigrants5YPop != null ? interproMigrants5YPop.hashCode() : 0);
        result = 31 * result + (exterMigrants5YPop != null ? exterMigrants5YPop.hashCode() : 0);
        result = 31 * result + (tlPop1YMobi != null ? tlPop1YMobi.hashCode() : 0);
        result = 31 * result + (non1YmoversPop != null ? non1YmoversPop.hashCode() : 0);
        result = 31 * result + (movers1YPop != null ? movers1YPop.hashCode() : 0);
        result = 31 * result + (nonMigrants1YPop != null ? nonMigrants1YPop.hashCode() : 0);
        result = 31 * result + (migrants1YPop != null ? migrants1YPop.hashCode() : 0);
        result = 31 * result + (interMigrants1YPop != null ? interMigrants1YPop.hashCode() : 0);
        result = 31 * result + (intraMigrants1YPop != null ? intraMigrants1YPop.hashCode() : 0);
        result = 31 * result + (interproMigrants1YPop != null ? interproMigrants1YPop.hashCode() : 0);
        result = 31 * result + (exterMigrants1YPop != null ? exterMigrants1YPop.hashCode() : 0);
        return result;
    }
}
