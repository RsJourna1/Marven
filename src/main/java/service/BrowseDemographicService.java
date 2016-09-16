package service;

import com.entity.PagerModel;
import net.sf.json.JSONArray;

/**
 * Created by 郑晓辉 on 2016/8/25.
 */
public interface BrowseDemographicService {
    JSONArray findData(String year, String dataSource,String subClass, PagerModel pagerModel);
    long findTotalRecords(String year, String dataSource,String subClass);
}
