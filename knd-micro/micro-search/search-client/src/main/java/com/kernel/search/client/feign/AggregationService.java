package com.kernel.search.client.feign;

import com.kernel.common.constant.ServiceNameConstants;
import com.kernel.search.client.feign.fallback.SearchServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

/**
 * @author knd
 */
@FeignClient(name = ServiceNameConstants.SEARCH_SERVICE, fallbackFactory = SearchServiceFallbackFactory.class, decode404 = true)
public interface AggregationService {
    /**
     * 查询文档列表
     * @param indexName 索引名
     * @param routing es的路由
     */
    @GetMapping(value = "/agg/requestStat/{indexName}/{routing}")
    Map<String, Object> requestStatAgg(@PathVariable("indexName") String indexName, @PathVariable("routing") String routing);
}
