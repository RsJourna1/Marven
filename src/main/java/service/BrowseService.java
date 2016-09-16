package service;

import com.entity.Indicator;
import com.entity.PagerModel;
import com.entity.QueryParam;
import net.sf.json.JSONArray;

import java.util.List;

/**
 * Created by 郑晓辉 on 2016/8/29.
 */
public interface BrowseService {
    JSONArray findByPage(QueryParam queryParam, List<Indicator> indicatorList, PagerModel pagerModel);

    long findTotalRecords(QueryParam queryParam, List<Indicator> indicatorList);
}
