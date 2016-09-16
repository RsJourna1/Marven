package com.entity;

import java.io.Serializable;

/**
 * Created by 郑晓辉 on 2016/8/20.
 */
public class NeighborhoodDiabetesPrevalencePK implements Serializable {
    private short ctDiaYear;
    private short ndId;

    public short getCtDiaYear() {
        return ctDiaYear;
    }

    public void setCtDiaYear(short ctDiaYear) {
        this.ctDiaYear = ctDiaYear;
    }

    public short getNdId() {
        return ndId;
    }

    public void setNdId(short ndId) {
        this.ndId = ndId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NeighborhoodDiabetesPrevalencePK that = (NeighborhoodDiabetesPrevalencePK) o;

        if (ctDiaYear != that.ctDiaYear) return false;
        if (ndId != that.ndId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) ctDiaYear;
        result = 31 * result + (int) ndId;
        return result;
    }
}
