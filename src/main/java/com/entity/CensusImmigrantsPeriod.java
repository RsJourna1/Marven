package com.entity;

/**
 * Created by 郑晓辉 on 2016/8/27.
 */
public class CensusImmigrantsPeriod {
    private double ctId;
    private short ctYear;
    private Integer tlPopPeriodImmi;
    private Integer nonImmigrantsPopPeriod;
    private Integer immigrantsPopPeriod;
    private Integer before1961Pop;
    private Integer imi1961_1970Pop;
    private Integer before1971Pop;
    private Integer imi1971_1980Pop;
    private Integer imi1981_1990Pop;
    private Integer imi1991_1995Pop;
    private Integer imi1996_2000Pop;
    private Integer imi1991_2000Pop;
    private Integer imi2001_2006Pop;
    private Integer imi2001_2011Pop;
    private Integer imi2001_2005Pop;
    private Integer imi20062011Pop;
    private Integer nonPermanentRePopPeriod;

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

    public Integer getTlPopPeriodImmi() {
        return tlPopPeriodImmi;
    }

    public void setTlPopPeriodImmi(Integer tlPopPeriodImmi) {
        this.tlPopPeriodImmi = tlPopPeriodImmi;
    }

    public Integer getNonImmigrantsPopPeriod() {
        return nonImmigrantsPopPeriod;
    }

    public void setNonImmigrantsPopPeriod(Integer nonImmigrantsPopPeriod) {
        this.nonImmigrantsPopPeriod = nonImmigrantsPopPeriod;
    }

    public Integer getImmigrantsPopPeriod() {
        return immigrantsPopPeriod;
    }

    public void setImmigrantsPopPeriod(Integer immigrantsPopPeriod) {
        this.immigrantsPopPeriod = immigrantsPopPeriod;
    }

    public Integer getBefore1961Pop() {
        return before1961Pop;
    }

    public void setBefore1961Pop(Integer before1961Pop) {
        this.before1961Pop = before1961Pop;
    }

    public Integer getImi1961_1970Pop() {
        return imi1961_1970Pop;
    }

    public void setImi1961_1970Pop(Integer imi1961_1970Pop) {
        this.imi1961_1970Pop = imi1961_1970Pop;
    }

    public Integer getBefore1971Pop() {
        return before1971Pop;
    }

    public void setBefore1971Pop(Integer before1971Pop) {
        this.before1971Pop = before1971Pop;
    }

    public Integer getImi1971_1980Pop() {
        return imi1971_1980Pop;
    }

    public void setImi1971_1980Pop(Integer imi1971_1980Pop) {
        this.imi1971_1980Pop = imi1971_1980Pop;
    }

    public Integer getImi1981_1990Pop() {
        return imi1981_1990Pop;
    }

    public void setImi1981_1990Pop(Integer imi1981_1990Pop) {
        this.imi1981_1990Pop = imi1981_1990Pop;
    }

    public Integer getImi1991_1995Pop() {
        return imi1991_1995Pop;
    }

    public void setImi1991_1995Pop(Integer imi1991_1995Pop) {
        this.imi1991_1995Pop = imi1991_1995Pop;
    }

    public Integer getImi1996_2000Pop() {
        return imi1996_2000Pop;
    }

    public void setImi1996_2000Pop(Integer imi1996_2000Pop) {
        this.imi1996_2000Pop = imi1996_2000Pop;
    }

    public Integer getImi1991_2000Pop() {
        return imi1991_2000Pop;
    }

    public void setImi1991_2000Pop(Integer imi1991_2000Pop) {
        this.imi1991_2000Pop = imi1991_2000Pop;
    }

    public Integer getImi2001_2006Pop() {
        return imi2001_2006Pop;
    }

    public void setImi2001_2006Pop(Integer imi2001_2006Pop) {
        this.imi2001_2006Pop = imi2001_2006Pop;
    }

    public Integer getImi2001_2011Pop() {
        return imi2001_2011Pop;
    }

    public void setImi2001_2011Pop(Integer imi2001_2011Pop) {
        this.imi2001_2011Pop = imi2001_2011Pop;
    }

    public Integer getImi2001_2005Pop() {
        return imi2001_2005Pop;
    }

    public void setImi2001_2005Pop(Integer imi2001_2005Pop) {
        this.imi2001_2005Pop = imi2001_2005Pop;
    }

    public Integer getImi20062011Pop() {
        return imi20062011Pop;
    }

    public void setImi20062011Pop(Integer imi20062011Pop) {
        this.imi20062011Pop = imi20062011Pop;
    }

    public Integer getNonPermanentRePopPeriod() {
        return nonPermanentRePopPeriod;
    }

    public void setNonPermanentRePopPeriod(Integer nonPermanentRePopPeriod) {
        this.nonPermanentRePopPeriod = nonPermanentRePopPeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CensusImmigrantsPeriod that = (CensusImmigrantsPeriod) o;

        if (Double.compare(that.ctId, ctId) != 0) return false;
        if (ctYear != that.ctYear) return false;
        if (tlPopPeriodImmi != null ? !tlPopPeriodImmi.equals(that.tlPopPeriodImmi) : that.tlPopPeriodImmi != null)
            return false;
        if (nonImmigrantsPopPeriod != null ? !nonImmigrantsPopPeriod.equals(that.nonImmigrantsPopPeriod) : that.nonImmigrantsPopPeriod != null)
            return false;
        if (immigrantsPopPeriod != null ? !immigrantsPopPeriod.equals(that.immigrantsPopPeriod) : that.immigrantsPopPeriod != null)
            return false;
        if (before1961Pop != null ? !before1961Pop.equals(that.before1961Pop) : that.before1961Pop != null)
            return false;
        if (imi1961_1970Pop != null ? !imi1961_1970Pop.equals(that.imi1961_1970Pop) : that.imi1961_1970Pop != null)
            return false;
        if (before1971Pop != null ? !before1971Pop.equals(that.before1971Pop) : that.before1971Pop != null)
            return false;
        if (imi1971_1980Pop != null ? !imi1971_1980Pop.equals(that.imi1971_1980Pop) : that.imi1971_1980Pop != null)
            return false;
        if (imi1981_1990Pop != null ? !imi1981_1990Pop.equals(that.imi1981_1990Pop) : that.imi1981_1990Pop != null)
            return false;
        if (imi1991_1995Pop != null ? !imi1991_1995Pop.equals(that.imi1991_1995Pop) : that.imi1991_1995Pop != null)
            return false;
        if (imi1996_2000Pop != null ? !imi1996_2000Pop.equals(that.imi1996_2000Pop) : that.imi1996_2000Pop != null)
            return false;
        if (imi1991_2000Pop != null ? !imi1991_2000Pop.equals(that.imi1991_2000Pop) : that.imi1991_2000Pop != null)
            return false;
        if (imi2001_2006Pop != null ? !imi2001_2006Pop.equals(that.imi2001_2006Pop) : that.imi2001_2006Pop != null)
            return false;
        if (imi2001_2011Pop != null ? !imi2001_2011Pop.equals(that.imi2001_2011Pop) : that.imi2001_2011Pop != null)
            return false;
        if (imi2001_2005Pop != null ? !imi2001_2005Pop.equals(that.imi2001_2005Pop) : that.imi2001_2005Pop != null)
            return false;
        if (imi20062011Pop != null ? !imi20062011Pop.equals(that.imi20062011Pop) : that.imi20062011Pop != null)
            return false;
        if (nonPermanentRePopPeriod != null ? !nonPermanentRePopPeriod.equals(that.nonPermanentRePopPeriod) : that.nonPermanentRePopPeriod != null)
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
        result = 31 * result + (tlPopPeriodImmi != null ? tlPopPeriodImmi.hashCode() : 0);
        result = 31 * result + (nonImmigrantsPopPeriod != null ? nonImmigrantsPopPeriod.hashCode() : 0);
        result = 31 * result + (immigrantsPopPeriod != null ? immigrantsPopPeriod.hashCode() : 0);
        result = 31 * result + (before1961Pop != null ? before1961Pop.hashCode() : 0);
        result = 31 * result + (imi1961_1970Pop != null ? imi1961_1970Pop.hashCode() : 0);
        result = 31 * result + (before1971Pop != null ? before1971Pop.hashCode() : 0);
        result = 31 * result + (imi1971_1980Pop != null ? imi1971_1980Pop.hashCode() : 0);
        result = 31 * result + (imi1981_1990Pop != null ? imi1981_1990Pop.hashCode() : 0);
        result = 31 * result + (imi1991_1995Pop != null ? imi1991_1995Pop.hashCode() : 0);
        result = 31 * result + (imi1996_2000Pop != null ? imi1996_2000Pop.hashCode() : 0);
        result = 31 * result + (imi1991_2000Pop != null ? imi1991_2000Pop.hashCode() : 0);
        result = 31 * result + (imi2001_2006Pop != null ? imi2001_2006Pop.hashCode() : 0);
        result = 31 * result + (imi2001_2011Pop != null ? imi2001_2011Pop.hashCode() : 0);
        result = 31 * result + (imi2001_2005Pop != null ? imi2001_2005Pop.hashCode() : 0);
        result = 31 * result + (imi20062011Pop != null ? imi20062011Pop.hashCode() : 0);
        result = 31 * result + (nonPermanentRePopPeriod != null ? nonPermanentRePopPeriod.hashCode() : 0);
        return result;
    }
}
