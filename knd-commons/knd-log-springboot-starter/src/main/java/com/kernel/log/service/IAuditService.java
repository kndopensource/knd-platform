package com.kernel.log.service;

import com.kernel.log.model.Audit;

/**
 * 审计日志接口
 *
 * @author kndopensource
 * @date 2020/20/3
 *
 */
public interface IAuditService {
    void save(Audit audit);
}
