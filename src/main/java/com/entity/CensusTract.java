package com.entity;

import java.math.BigDecimal;

/**
 * Created by 郑晓辉 on 2016/8/25.
 */
public class CensusTract {
    private double ctId;
    private short ndId;
    private short ctYear;
    private BigDecimal ctUid;

    public double getCtId() {
        return ctId;
    }

    public void setCtId(double ctId) {
        this.ctId = ctId;
    }

    public short getNdId() {
        return ndId;
    }

    public void setNdId(short ndId) {
        this.ndId = ndId;
    }

    public short getCtYear() {
        return ctYear;
    }

    public void setCtYear(short ctYear) {
        this.ctYear = ctYear;
    }

    public BigDecimal getCtUid() {
        return ctUid;
    }

    public void setCtUid(BigDecimal ctUid) {
        this.ctUid = ctUid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CensusTract that = (CensusTract) o;

        if (Double.compare(that.ctId, ctId) != 0) return false;
        if (ndId != that.ndId) return false;
        if (ctYear != that.ctYear) return false;
        return ctUid != null ? ctUid.equals(that.ctUid) : that.ctUid == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(ctId);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) ndId;
        result = 31 * result + (int) ctYear;
        result = 31 * result + (ctUid != null ? ctUid.hashCode() : 0);
        return result;
    }
}
