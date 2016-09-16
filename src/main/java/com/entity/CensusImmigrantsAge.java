package com.entity;

/**
 * Created by 郑晓辉 on 2016/8/27.
 */
public class CensusImmigrantsAge {
    private double ctId;
    private short ctYear;
    private Integer tlPopTimeImmi;
    private Integer under5YImiPop;
    private Integer imi5_14YPop;
    private Integer imi15_24YPop;
    private Integer imi2544YPop;
    private Integer over45ImiPop;

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

    public Integer getTlPopTimeImmi() {
        return tlPopTimeImmi;
    }

    public void setTlPopTimeImmi(Integer tlPopTimeImmi) {
        this.tlPopTimeImmi = tlPopTimeImmi;
    }

    public Integer getUnder5YImiPop() {
        return under5YImiPop;
    }

    public void setUnder5YImiPop(Integer under5YImiPop) {
        this.under5YImiPop = under5YImiPop;
    }

    public Integer getImi5_14YPop() {
        return imi5_14YPop;
    }

    public void setImi5_14YPop(Integer imi5_14YPop) {
        this.imi5_14YPop = imi5_14YPop;
    }

    public Integer getImi15_24YPop() {
        return imi15_24YPop;
    }

    public void setImi15_24YPop(Integer imi15_24YPop) {
        this.imi15_24YPop = imi15_24YPop;
    }

    public Integer getImi2544YPop() {
        return imi2544YPop;
    }

    public void setImi2544YPop(Integer imi2544YPop) {
        this.imi2544YPop = imi2544YPop;
    }

    public Integer getOver45ImiPop() {
        return over45ImiPop;
    }

    public void setOver45ImiPop(Integer over45ImiPop) {
        this.over45ImiPop = over45ImiPop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CensusImmigrantsAge that = (CensusImmigrantsAge) o;

        if (Double.compare(that.ctId, ctId) != 0) return false;
        if (ctYear != that.ctYear) return false;
        if (tlPopTimeImmi != null ? !tlPopTimeImmi.equals(that.tlPopTimeImmi) : that.tlPopTimeImmi != null)
            return false;
        if (under5YImiPop != null ? !under5YImiPop.equals(that.under5YImiPop) : that.under5YImiPop != null)
            return false;
        if (imi5_14YPop != null ? !imi5_14YPop.equals(that.imi5_14YPop) : that.imi5_14YPop != null) return false;
        if (imi15_24YPop != null ? !imi15_24YPop.equals(that.imi15_24YPop) : that.imi15_24YPop != null) return false;
        if (imi2544YPop != null ? !imi2544YPop.equals(that.imi2544YPop) : that.imi2544YPop != null) return false;
        if (over45ImiPop != null ? !over45ImiPop.equals(that.over45ImiPop) : that.over45ImiPop != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(ctId);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) ctYear;
        result = 31 * result + (tlPopTimeImmi != null ? tlPopTimeImmi.hashCode() : 0);
        result = 31 * result + (under5YImiPop != null ? under5YImiPop.hashCode() : 0);
        result = 31 * result + (imi5_14YPop != null ? imi5_14YPop.hashCode() : 0);
        result = 31 * result + (imi15_24YPop != null ? imi15_24YPop.hashCode() : 0);
        result = 31 * result + (imi2544YPop != null ? imi2544YPop.hashCode() : 0);
        result = 31 * result + (over45ImiPop != null ? over45ImiPop.hashCode() : 0);
        return result;
    }
}
