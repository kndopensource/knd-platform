package com.kernel.gateway.auth;

import com.kernel.common.utils.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.server.authorization.ServerAccessDeniedHandler;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 403拒绝访问异常处理，转换为JSON
 *
 * @author knd
 * @date 2020/3/22
 */
@Slf4j
public class JsonAccessDeniedHandler implements ServerAccessDeniedHandler {
    @Override
    public Mono<Void> handle(ServerWebExchange exchange, AccessDeniedException e) {
        return ResponseUtil.responseWriter(exchange, HttpStatus.FORBIDDEN.value(), e.getMessage());
    }
}
