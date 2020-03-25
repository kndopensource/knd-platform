package com.kernel.search.client.feign.fallback;

import com.alibaba.fastjson.JSONObject;
import com.kernel.common.model.PageResult;
import com.kernel.search.client.feign.SearchService;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * searchService降级工场
 *
 * @author knd
 */
@Slf4j
@Component
public class SearchServiceFallbackFactory implements FallbackFactory<SearchService> {
    @Override
    public SearchService create(Throwable throwable) {
        return (indexName, searchDto) -> {
            log.error("通过索引{}搜索异常:{}", indexName, throwable);
            return PageResult.<JSONObject>builder().build();
        };
    }
}
