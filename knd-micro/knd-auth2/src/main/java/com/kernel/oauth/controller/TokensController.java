package com.kernel.oauth.controller;

import com.kernel.common.annotation.LoginClient;
import com.kernel.common.model.PageResult;
import com.kernel.oauth.model.TokenVo;
import com.kernel.oauth.service.ITokensService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * token管理接口
 *
 * @author knd
 */
@Api(tags = "Token管理")
@RestController
@RequestMapping("/tokens")
public class TokensController {
    @Autowired
    private ITokensService tokensService;

    @GetMapping("")
    @ApiOperation(value = "token列表")
    public PageResult<TokenVo> list(@RequestParam Map<String, Object> params, String tenantId) {
        return tokensService.listTokens(params, tenantId);
    }
}
