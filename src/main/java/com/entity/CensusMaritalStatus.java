package com.entity;

/**
 * Created by 郑晓辉 on 2016/8/27.
 */
public class CensusMaritalStatus {
    private double ctId;
    private short ctYear;
    private Short tlAgeOver15MaritStatPop;
    private Short marriedOrWithLawO15YPartner;
    private Short marriedNotSeparatedO15Y;
    private Short livingComLawO15Y;
    private Short unmarriedNoLawPartberO15Y;
    private Short singleNomarriedExpO15Y;
    private Short separatedO15Y;
    private Short divorcedO15Y;
    private Short widowedO15Y;

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

    public Short getTlAgeOver15MaritStatPop() {
        return tlAgeOver15MaritStatPop;
    }

    public void setTlAgeOver15MaritStatPop(Short tlAgeOver15MaritStatPop) {
        this.tlAgeOver15MaritStatPop = tlAgeOver15MaritStatPop;
    }

    public Short getMarriedOrWithLawO15YPartner() {
        return marriedOrWithLawO15YPartner;
    }

    public void setMarriedOrWithLawO15YPartner(Short marriedOrWithLawO15YPartner) {
        this.marriedOrWithLawO15YPartner = marriedOrWithLawO15YPartner;
    }

    public Short getMarriedNotSeparatedO15Y() {
        return marriedNotSeparatedO15Y;
    }

    public void setMarriedNotSeparatedO15Y(Short marriedNotSeparatedO15Y) {
        this.marriedNotSeparatedO15Y = marriedNotSeparatedO15Y;
    }

    public Short getLivingComLawO15Y() {
        return livingComLawO15Y;
    }

    public void setLivingComLawO15Y(Short livingComLawO15Y) {
        this.livingComLawO15Y = livingComLawO15Y;
    }

    public Short getUnmarriedNoLawPartberO15Y() {
        return unmarriedNoLawPartberO15Y;
    }

    public void setUnmarriedNoLawPartberO15Y(Short unmarriedNoLawPartberO15Y) {
        this.unmarriedNoLawPartberO15Y = unmarriedNoLawPartberO15Y;
    }

    public Short getSingleNomarriedExpO15Y() {
        return singleNomarriedExpO15Y;
    }

    public void setSingleNomarriedExpO15Y(Short singleNomarriedExpO15Y) {
        this.singleNomarriedExpO15Y = singleNomarriedExpO15Y;
    }

    public Short getSeparatedO15Y() {
        return separatedO15Y;
    }

    public void setSeparatedO15Y(Short separatedO15Y) {
        this.separatedO15Y = separatedO15Y;
    }

    public Short getDivorcedO15Y() {
        return divorcedO15Y;
    }

    public void setDivorcedO15Y(Short divorcedO15Y) {
        this.divorcedO15Y = divorcedO15Y;
    }

    public Short getWidowedO15Y() {
        return widowedO15Y;
    }

    public void setWidowedO15Y(Short widowedO15Y) {
        this.widowedO15Y = widowedO15Y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CensusMaritalStatus that = (CensusMaritalStatus) o;

        if (Double.compare(that.ctId, ctId) != 0) return false;
        if (ctYear != that.ctYear) return false;
        if (tlAgeOver15MaritStatPop != null ? !tlAgeOver15MaritStatPop.equals(that.tlAgeOver15MaritStatPop) : that.tlAgeOver15MaritStatPop != null)
            return false;
        if (marriedOrWithLawO15YPartner != null ? !marriedOrWithLawO15YPartner.equals(that.marriedOrWithLawO15YPartner) : that.marriedOrWithLawO15YPartner != null)
            return false;
        if (marriedNotSeparatedO15Y != null ? !marriedNotSeparatedO15Y.equals(that.marriedNotSeparatedO15Y) : that.marriedNotSeparatedO15Y != null)
            return false;
        if (livingComLawO15Y != null ? !livingComLawO15Y.equals(that.livingComLawO15Y) : that.livingComLawO15Y != null)
            return false;
        if (unmarriedNoLawPartberO15Y != null ? !unmarriedNoLawPartberO15Y.equals(that.unmarriedNoLawPartberO15Y) : that.unmarriedNoLawPartberO15Y != null)
            return false;
        if (singleNomarriedExpO15Y != null ? !singleNomarriedExpO15Y.equals(that.singleNomarriedExpO15Y) : that.singleNomarriedExpO15Y != null)
            return false;
        if (separatedO15Y != null ? !separatedO15Y.equals(that.separatedO15Y) : that.separatedO15Y != null)
            return false;
        if (divorcedO15Y != null ? !divorcedO15Y.equals(that.divorcedO15Y) : that.divorcedO15Y != null) return false;
        if (widowedO15Y != null ? !widowedO15Y.equals(that.widowedO15Y) : that.widowedO15Y != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(ctId);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) ctYear;
        result = 31 * result + (tlAgeOver15MaritStatPop != null ? tlAgeOver15MaritStatPop.hashCode() : 0);
        result = 31 * result + (marriedOrWithLawO15YPartner != null ? marriedOrWithLawO15YPartner.hashCode() : 0);
        result = 31 * result + (marriedNotSeparatedO15Y != null ? marriedNotSeparatedO15Y.hashCode() : 0);
        result = 31 * result + (livingComLawO15Y != null ? livingComLawO15Y.hashCode() : 0);
        result = 31 * result + (unmarriedNoLawPartberO15Y != null ? unmarriedNoLawPartberO15Y.hashCode() : 0);
        result = 31 * result + (singleNomarriedExpO15Y != null ? singleNomarriedExpO15Y.hashCode() : 0);
        result = 31 * result + (separatedO15Y != null ? separatedO15Y.hashCode() : 0);
        result = 31 * result + (divorcedO15Y != null ? divorcedO15Y.hashCode() : 0);
        result = 31 * result + (widowedO15Y != null ? widowedO15Y.hashCode() : 0);
        return result;
    }
}
