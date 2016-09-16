package service;

import com.entity.Indicator;
import com.entity.QueryParam;
import net.sf.json.JSONArray;

import java.util.List;

/**
 * Created by 郑晓辉 on 2016/8/19.
 */
public interface IndicatorDescService {
    JSONArray getIndicatorSer(QueryParam queryParam);

    List<Indicator> getIndicatorListSer(QueryParam queryParam);
}
