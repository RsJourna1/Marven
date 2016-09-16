package action;

import com.entity.Indicator;
import com.entity.PagerModel;
import com.entity.QueryParam;
import net.sf.json.JSONArray;
import org.apache.struts2.json.annotations.JSON;
import service.IndicatorDescService;
import service.BrowseService;


import java.util.List;


/**
 * Created by 郑晓辉 on 2016/8/29.
 */

public class BrowseAction extends BaseAction {
    //参数
    private String selectedOption;
    private PagerModel pagerModel;
    private String dataYear;

    //Services
    private BrowseService browseService;
    private IndicatorDescService indicatorDescService;
    //show data --JSONArray
    private JSONArray indicatorJSONArray;


    public String browse() {
        System.out.println("selectedOption :" + selectedOption + "\ndataYear :" + dataYear);
        System.out.println("pagerModel.pageNo : "+pagerModel.getPageNo()+"\npagerModel.pageSize : "+pagerModel.getPageSize());

        QueryParam queryParam = analyze(selectedOption, dataYear);
        //indicatorJSONArrayData for show (FieldName、Description)
        indicatorJSONArray = indicatorDescService.getIndicatorSer(queryParam);

        //indicatorListData
        List<Indicator> indicatorList = indicatorDescService.getIndicatorListSer(queryParam);
        pagerModel.setResultData(browseService.findByPage(queryParam, indicatorList, pagerModel));
        pagerModel.setTotalRecords(browseService.findTotalRecords(queryParam, indicatorList));
        System.out.println("pagerModel-JSON : " + pagerModel.getResultData());
        if (pagerModel.getResultData().isEmpty()) {
            return NONE;
        }
        return SUCCESS;
    }

    /**
     * 根据option和year来解析参数
     *
     * @param option
     * @param year
     * @return
     */
    public QueryParam analyze(String option, String year) {
        QueryParam queryParam = new QueryParam();
        if (option.equals("1")) {
            queryParam.setDataSource("Toronto Community Health Profiles Partnership");
            queryParam.setMainClass("Chronic Disease");
            queryParam.setSubClass("Diabetes");
        }
        if (option.equals("2.1.1.1") || option.equals("2.1.1.2")) {
            if (option.equals("2.1.1.1")) {
                queryParam.setDataSource("Canada Census");
            }
            if (option.equals("2.1.1.2")) {
                queryParam.setDataSource("Wellbeing Toronto");
            }
            queryParam.setMainClass("Demographic profiles");
            queryParam.setSubClass("Population");
        }
        if (option.equals("2.1.2.1") || option.equals("2.1.2.2")) {
            if (option.equals("2.1.2.1")) {
                queryParam.setDataSource("Canada Census");
            }
            if (option.equals("2.1.2.2")) {
                queryParam.setDataSource("Wellbeing Toronto");
            }
            queryParam.setMainClass("Demographic profiles");
            queryParam.setSubClass("Age");
        }
        if (option.equals("2.1.3.1") || option.equals("2.1.3.2")) {
            if (option.equals("2.1.3.1")) {
                queryParam.setDataSource("Canada Census");
            }
            if (option.equals("2.1.3.2")) {
                queryParam.setDataSource("Wellbeing Toronto");
            }
            queryParam.setMainClass("Demographic profiles");
            queryParam.setSubClass("Sex");
        }
        if (option.equals("2.1.4.1") || option.equals("2.1.4.2")) {
            if (option.equals("2.1.4.1")) {
                queryParam.setDataSource("Canada Census");
            }
            if (option.equals("2.1.4.2")) {
                queryParam.setDataSource("Wellbeing Toronto");
            }
            queryParam.setMainClass("Demographic profiles");
            queryParam.setSubClass("Ethnicity");
        }
        if (option.equals("2.2.1.1") || option.equals("2.2.2.1")) {
            queryParam.setDataSource("Canada's National Household Survey");
            queryParam.setMainClass("socio-economic status");
            if (option.equals("2.2.1.1")) {
                queryParam.setSubClass("Immigrant status");
            }
            if (option.equals("2.2.2.1")) {
                queryParam.setSubClass("Education attainment");
            }
        }
        if (option.equals("2.2.3.1") || option.equals("2.2.3.2")) {
            if (option.equals("2.2.3.1")) {
                queryParam.setDataSource("Canada's National Household Survey");
            }
            if (option.equals("2.2.3.2")) {
                queryParam.setDataSource("Wellbeing Toronto");
            }
            queryParam.setMainClass("socio-economic status");
            queryParam.setSubClass("Income");
        }
        if (option.equals("2.2.4")) {
            queryParam.setMainClass("socio-economic status");
            queryParam.setSubClass("Occupation");
        }
        if (option.equals("2.2.5")) {

        }
        if (!year.isEmpty())
            queryParam.setYear(year);
        return queryParam;
    }

    // getter 、 setter方法


    public JSONArray getIndicatorJSONArray() {
        return indicatorJSONArray;
    }

    public void setIndicatorJSONArray(JSONArray indicatorJSONArray) {
        this.indicatorJSONArray = indicatorJSONArray;
    }

    public String getDataYear() {
        return dataYear;
    }

    public void setDataYear(String dataYear) {
        this.dataYear = dataYear;
    }


    public PagerModel getPagerModel() {
        return pagerModel;
    }

    public void setPagerModel(PagerModel pagerModel) {
        this.pagerModel = pagerModel;
    }

    public String getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
    }
    @JSON(serialize=false)
    public BrowseService getBrowseService() {
        return browseService;
    }

    public void setBrowseService(BrowseService browseService) {
        this.browseService = browseService;
    }
    @JSON(serialize=false)
    public IndicatorDescService getIndicatorDescService() {
        return indicatorDescService;
    }

    public void setIndicatorDescService(IndicatorDescService indicatorDescService) {
        this.indicatorDescService = indicatorDescService;
    }

}
