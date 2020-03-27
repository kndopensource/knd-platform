package com.kernel.oauth.service;

import com.kernel.common.model.PageResult;
import com.kernel.oauth.model.TokenVo;

import java.util.Map;

/**
 * @author knd
 */
public interface ITokensService {
    /**
     * 查询token列表
     * @param params 请求参数
     * @param clientId 应用id
     */
    PageResult<TokenVo> listTokens(Map<String, Object> params, String clientId);
}
