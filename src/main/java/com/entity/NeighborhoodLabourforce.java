package com.entity;

/**
 * Created by 郑晓辉 on 2016/8/27.
 */
public class NeighborhoodLabourforce {
    private short ctYear;
    private short ndId;
    private Integer tlLabourforceNdPop;
    private Integer inLabourforceNdPop;
    private Integer unemployedNdPop;
    private Integer notInLabourforceNdPop;
    private Integer lessThanGrade9NdPop;

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

    public Integer getTlLabourforceNdPop() {
        return tlLabourforceNdPop;
    }

    public void setTlLabourforceNdPop(Integer tlLabourforceNdPop) {
        this.tlLabourforceNdPop = tlLabourforceNdPop;
    }

    public Integer getInLabourforceNdPop() {
        return inLabourforceNdPop;
    }

    public void setInLabourforceNdPop(Integer inLabourforceNdPop) {
        this.inLabourforceNdPop = inLabourforceNdPop;
    }

    public Integer getUnemployedNdPop() {
        return unemployedNdPop;
    }

    public void setUnemployedNdPop(Integer unemployedNdPop) {
        this.unemployedNdPop = unemployedNdPop;
    }

    public Integer getNotInLabourforceNdPop() {
        return notInLabourforceNdPop;
    }

    public void setNotInLabourforceNdPop(Integer notInLabourforceNdPop) {
        this.notInLabourforceNdPop = notInLabourforceNdPop;
    }

    public Integer getLessThanGrade9NdPop() {
        return lessThanGrade9NdPop;
    }

    public void setLessThanGrade9NdPop(Integer lessThanGrade9NdPop) {
        this.lessThanGrade9NdPop = lessThanGrade9NdPop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NeighborhoodLabourforce that = (NeighborhoodLabourforce) o;

        if (ctYear != that.ctYear) return false;
        if (ndId != that.ndId) return false;
        if (tlLabourforceNdPop != null ? !tlLabourforceNdPop.equals(that.tlLabourforceNdPop) : that.tlLabourforceNdPop != null)
            return false;
        if (inLabourforceNdPop != null ? !inLabourforceNdPop.equals(that.inLabourforceNdPop) : that.inLabourforceNdPop != null)
            return false;
        if (unemployedNdPop != null ? !unemployedNdPop.equals(that.unemployedNdPop) : that.unemployedNdPop != null)
            return false;
        if (notInLabourforceNdPop != null ? !notInLabourforceNdPop.equals(that.notInLabourforceNdPop) : that.notInLabourforceNdPop != null)
            return false;
        if (lessThanGrade9NdPop != null ? !lessThanGrade9NdPop.equals(that.lessThanGrade9NdPop) : that.lessThanGrade9NdPop != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) ctYear;
        result = 31 * result + (int) ndId;
        result = 31 * result + (tlLabourforceNdPop != null ? tlLabourforceNdPop.hashCode() : 0);
        result = 31 * result + (inLabourforceNdPop != null ? inLabourforceNdPop.hashCode() : 0);
        result = 31 * result + (unemployedNdPop != null ? unemployedNdPop.hashCode() : 0);
        result = 31 * result + (notInLabourforceNdPop != null ? notInLabourforceNdPop.hashCode() : 0);
        result = 31 * result + (lessThanGrade9NdPop != null ? lessThanGrade9NdPop.hashCode() : 0);
        return result;
    }
}
