package com.kernel.admin.service;

import com.kernel.admin.model.IndexDto;
import com.kernel.admin.model.IndexVo;
import com.kernel.common.model.PageResult;

import java.util.Map;

/**
 * 索引
 *
 * @author knd
 * @date 2019/4/23
 */
public interface IIndexService {
    /**
     * 创建索引
     */
    void create(IndexDto indexDto);

    /**
     * 删除索引
     * @param indexName 索引名
     */
    void delete(String indexName);

    /**
     * 索引列表
     * @param queryStr 搜索字符串
     * @param indices 默认显示的索引名
     */
    PageResult<IndexVo> list(String queryStr, String... indices);

    /**
     * 显示索引明细
     * @param indexName 索引名
     */
    Map<String, Object> show(String indexName);
}
