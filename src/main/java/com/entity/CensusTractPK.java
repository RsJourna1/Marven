package com.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by 郑晓辉 on 2016/8/25.
 */
public class CensusTractPK implements Serializable {
    private BigDecimal ctId;
    private short ctYear;

    public BigDecimal getCtId() {
        return ctId;
    }

    public void setCtId(BigDecimal ctId) {
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

        CensusTractPK that = (CensusTractPK) o;

        if (ctYear != that.ctYear) return false;
        if (ctId != null ? !ctId.equals(that.ctId) : that.ctId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ctId != null ? ctId.hashCode() : 0;
        result = 31 * result + (int) ctYear;
        return result;
    }
}
