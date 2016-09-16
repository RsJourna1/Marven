package action;

import com.entity.*;
import net.sf.json.JSONArray;
import service.BrowseChrDiePreService;
import service.BrowseDemographicService;
import service.IndicatorDescService;

/**
 * Created by 郑晓辉 on 2016/8/12.
 */
public class BrowseChrDiePreAction extends BaseAction {
    //分页页码信息
    private PagerModel pagerModel;
    //浏览数据参数信息
    private String selectedOption;
    private String dataYear;
    //Services
    private IndicatorDescService indicatorDescService;
    private BrowseChrDiePreService browseChrDiePreService;
    private BrowseDemographicService browseDemographicService;
    //查询到的Json格式数据
    private JSONArray indicatorJsonArray;
    private JSONArray browseDataJsonArray;

    public String browseData() {
        System.out.println("");
        System.out.println("BrowseChrDiePreAction");
        QueryParam queryParam = analyze(selectedOption, dataYear);
        //查询条件dataSource 、 Main_Class、Sub_Class
        indicatorJsonArray = indicatorDescService.getIndicatorSer(queryParam);

        if (selectedOption.equals("1")) {
            browseDataJsonArray = browseChrDiePreService.findDataByYear(queryParam.getYear(), pagerModel);
            pagerModel.setTotalRecords(browseChrDiePreService.findTotalRecords(queryParam.getYear()));
        }
        if (selectedOption.equals("2.1.1.1")||selectedOption.equals("2.1.1.2")
                ||selectedOption.equals("2.1.2.1")||selectedOption.equals("2.1.2.2")
                ||selectedOption.equals("2.1.3.1")||selectedOption.equals("2.1.3.2")
                ||selectedOption.equals("2.1.4.1")||selectedOption.equals("2.1.4.2")){
            browseDataJsonArray = browseDemographicService.findData(queryParam.getYear(),queryParam.getDataSource(),queryParam.getSubClass(),pagerModel);
            pagerModel.setTotalRecords(browseDemographicService.findTotalRecords(queryParam.getYear(),queryParam.getDataSource(),queryParam.getSubClass()));
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
        if (option.equals("2.1.1.1")||option.equals("2.1.1.2")){
            if (option.equals("2.1.1.1")){
                queryParam.setDataSource("Canada Census");
            }
            if (option.equals("2.1.1.2")){
                queryParam.setDataSource("Wellbeing Toronto");
            }
            queryParam.setMainClass("Demographic profiles");
            queryParam.setSubClass("Population");
        }
        if (option.equals("2.1.2.1")||option.equals("2.1.2.2")){
            if (option.equals("2.1.2.1")){
                queryParam.setDataSource("Canada Census");
            }
            if (option.equals("2.1.2.2")){
                queryParam.setDataSource("Wellbeing Toronto");
            }
            queryParam.setMainClass("Demographic profiles");
            queryParam.setSubClass("Age");
        }
        if (option.equals("2.1.3.1")||option.equals("2.1.3.2")){
            if (option.equals("2.1.3.1")){
                queryParam.setDataSource("Canada Census");
            }
            if (option.equals("2.1.3.2")){
                queryParam.setDataSource("Wellbeing Toronto");
            }
            queryParam.setMainClass("Demographic profiles");
            queryParam.setSubClass("Sex");
        }
        if (option.equals("2.1.4.1")||option.equals("2.1.4.2")){
            if (option.equals("2.1.4.1")){
                queryParam.setDataSource("Canada Census");
            }
            if (option.equals("2.1.4.2")){
                queryParam.setDataSource("Wellbeing Toronto");
            }
            queryParam.setMainClass("Demographic profiles");
            queryParam.setSubClass("Ethnicity");
        }
        if (option.equals("2.2.1.1")){

        }
        queryParam.setYear(year);
        return queryParam;
    }


    //Service getter、setter 方法


    public IndicatorDescService getIndicatorDescService() {
        return indicatorDescService;
    }

    public void setIndicatorDescService(IndicatorDescService indicatorDescService) {
        this.indicatorDescService = indicatorDescService;
    }

    public BrowseChrDiePreService getBrowseChrDiePreService() {
        return browseChrDiePreService;
    }

    public void setBrowseChrDiePreService(BrowseChrDiePreService browseChrDiePreService) {
        this.browseChrDiePreService = browseChrDiePreService;
    }

    public BrowseDemographicService getBrowseDemographicService() {
        return browseDemographicService;
    }

    public void setBrowseDemographicService(BrowseDemographicService browseDemographicService) {
        this.browseDemographicService = browseDemographicService;
    }

    //request params
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

    public String getDataYear() {
        return dataYear;
    }

    public void setDataYear(String dataYear) {
        this.dataYear = dataYear;
    }

    //JsonData

    public JSONArray getBrowseDataJsonArray() {
        return browseDataJsonArray;
    }

    public void setBrowseDataJsonArray(JSONArray browseDataJsonArray) {
        this.browseDataJsonArray = browseDataJsonArray;
    }

    public JSONArray getIndicatorJsonArray() {
        return indicatorJsonArray;
    }

    public void setIndicatorJsonArray(JSONArray indicatorJsonArray) {
        this.indicatorJsonArray = indicatorJsonArray;
    }
}
