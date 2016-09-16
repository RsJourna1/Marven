package service;

import com.entity.BrowseChronic;
import com.entity.NeighborhoodDiabetesPrevalence;
import com.entity.PagerModel;
import net.sf.json.JSONArray;

import java.util.List;

/**
 * Created by 郑晓辉 on 2016/8/22.
 */
public interface BrowseChrDiePreService {
    JSONArray findDataByYear(String year, PagerModel pagerModel);

    long findTotalRecords(String year);
}
