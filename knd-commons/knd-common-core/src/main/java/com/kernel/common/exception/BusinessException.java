package com.kernel.common.exception;

/**
 * 业务异常
 *
 * @author kndopensource
 */
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 6610083281801529147L;

    public BusinessException(String message) {
        super(message);
    }
}
