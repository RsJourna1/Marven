package com.entity;

import java.io.Serializable;

/**
 * Created by 郑晓辉 on 2016/8/27.
 */
public class CensusIncomePK implements Serializable {
    private double ctId;
    private short ctYear;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CensusIncomePK that = (CensusIncomePK) o;

        if (Double.compare(that.ctId, ctId) != 0) return false;
        if (ctYear != that.ctYear) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(ctId);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) ctYear;
        return result;
    }
}
