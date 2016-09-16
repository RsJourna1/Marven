package com.entity;

/**
 * Created by 郑晓辉 on 2016/8/27.
 */
public class NeighborhoodIncome {
    private short ctYear;
    private short ndId;
    private Integer lowIncomeFamilyNdPop;
    private Integer lowIncomeSingleNdPop;
    private Integer lowIncomeChildNdPop;
    private Integer tlFamiiliesIncomeAfterTax;
    private Integer avgFamiliesIncomeAfterTax;
    private Integer tlPrivateHouseholdIncome;
    private Integer preTaxHouseholdIncome;
    private Integer afterTaxHouseholdIncome;

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

    public Integer getLowIncomeFamilyNdPop() {
        return lowIncomeFamilyNdPop;
    }

    public void setLowIncomeFamilyNdPop(Integer lowIncomeFamilyNdPop) {
        this.lowIncomeFamilyNdPop = lowIncomeFamilyNdPop;
    }

    public Integer getLowIncomeSingleNdPop() {
        return lowIncomeSingleNdPop;
    }

    public void setLowIncomeSingleNdPop(Integer lowIncomeSingleNdPop) {
        this.lowIncomeSingleNdPop = lowIncomeSingleNdPop;
    }

    public Integer getLowIncomeChildNdPop() {
        return lowIncomeChildNdPop;
    }

    public void setLowIncomeChildNdPop(Integer lowIncomeChildNdPop) {
        this.lowIncomeChildNdPop = lowIncomeChildNdPop;
    }

    public Integer getTlFamiiliesIncomeAfterTax() {
        return tlFamiiliesIncomeAfterTax;
    }

    public void setTlFamiiliesIncomeAfterTax(Integer tlFamiiliesIncomeAfterTax) {
        this.tlFamiiliesIncomeAfterTax = tlFamiiliesIncomeAfterTax;
    }

    public Integer getAvgFamiliesIncomeAfterTax() {
        return avgFamiliesIncomeAfterTax;
    }

    public void setAvgFamiliesIncomeAfterTax(Integer avgFamiliesIncomeAfterTax) {
        this.avgFamiliesIncomeAfterTax = avgFamiliesIncomeAfterTax;
    }

    public Integer getTlPrivateHouseholdIncome() {
        return tlPrivateHouseholdIncome;
    }

    public void setTlPrivateHouseholdIncome(Integer tlPrivateHouseholdIncome) {
        this.tlPrivateHouseholdIncome = tlPrivateHouseholdIncome;
    }

    public Integer getPreTaxHouseholdIncome() {
        return preTaxHouseholdIncome;
    }

    public void setPreTaxHouseholdIncome(Integer preTaxHouseholdIncome) {
        this.preTaxHouseholdIncome = preTaxHouseholdIncome;
    }

    public Integer getAfterTaxHouseholdIncome() {
        return afterTaxHouseholdIncome;
    }

    public void setAfterTaxHouseholdIncome(Integer afterTaxHouseholdIncome) {
        this.afterTaxHouseholdIncome = afterTaxHouseholdIncome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NeighborhoodIncome that = (NeighborhoodIncome) o;

        if (ctYear != that.ctYear) return false;
        if (ndId != that.ndId) return false;
        if (lowIncomeFamilyNdPop != null ? !lowIncomeFamilyNdPop.equals(that.lowIncomeFamilyNdPop) : that.lowIncomeFamilyNdPop != null)
            return false;
        if (lowIncomeSingleNdPop != null ? !lowIncomeSingleNdPop.equals(that.lowIncomeSingleNdPop) : that.lowIncomeSingleNdPop != null)
            return false;
        if (lowIncomeChildNdPop != null ? !lowIncomeChildNdPop.equals(that.lowIncomeChildNdPop) : that.lowIncomeChildNdPop != null)
            return false;
        if (tlFamiiliesIncomeAfterTax != null ? !tlFamiiliesIncomeAfterTax.equals(that.tlFamiiliesIncomeAfterTax) : that.tlFamiiliesIncomeAfterTax != null)
            return false;
        if (avgFamiliesIncomeAfterTax != null ? !avgFamiliesIncomeAfterTax.equals(that.avgFamiliesIncomeAfterTax) : that.avgFamiliesIncomeAfterTax != null)
            return false;
        if (tlPrivateHouseholdIncome != null ? !tlPrivateHouseholdIncome.equals(that.tlPrivateHouseholdIncome) : that.tlPrivateHouseholdIncome != null)
            return false;
        if (preTaxHouseholdIncome != null ? !preTaxHouseholdIncome.equals(that.preTaxHouseholdIncome) : that.preTaxHouseholdIncome != null)
            return false;
        if (afterTaxHouseholdIncome != null ? !afterTaxHouseholdIncome.equals(that.afterTaxHouseholdIncome) : that.afterTaxHouseholdIncome != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) ctYear;
        result = 31 * result + (int) ndId;
        result = 31 * result + (lowIncomeFamilyNdPop != null ? lowIncomeFamilyNdPop.hashCode() : 0);
        result = 31 * result + (lowIncomeSingleNdPop != null ? lowIncomeSingleNdPop.hashCode() : 0);
        result = 31 * result + (lowIncomeChildNdPop != null ? lowIncomeChildNdPop.hashCode() : 0);
        result = 31 * result + (tlFamiiliesIncomeAfterTax != null ? tlFamiiliesIncomeAfterTax.hashCode() : 0);
        result = 31 * result + (avgFamiliesIncomeAfterTax != null ? avgFamiliesIncomeAfterTax.hashCode() : 0);
        result = 31 * result + (tlPrivateHouseholdIncome != null ? tlPrivateHouseholdIncome.hashCode() : 0);
        result = 31 * result + (preTaxHouseholdIncome != null ? preTaxHouseholdIncome.hashCode() : 0);
        result = 31 * result + (afterTaxHouseholdIncome != null ? afterTaxHouseholdIncome.hashCode() : 0);
        return result;
    }
}
