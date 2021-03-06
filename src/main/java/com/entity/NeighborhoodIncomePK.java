package com.entity;

import java.io.Serializable;

/**
 * Created by 郑晓辉 on 2016/8/27.
 */
public class NeighborhoodIncomePK implements Serializable {
    private short ctYear;
    private short ndId;

    public short getCtYear() {
        return ctYear;
    }

    public void setCtYear(short ctYear) {
        this.ctYear = ctYear;
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

        NeighborhoodIncomePK that = (NeighborhoodIncomePK) o;

        if (ctYear != that.ctYear) return false;
        if (ndId != that.ndId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) ctYear;
        result = 31 * result + (int) ndId;
        return result;
    }
}
