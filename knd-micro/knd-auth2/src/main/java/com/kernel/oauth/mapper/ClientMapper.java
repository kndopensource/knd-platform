package com.kernel.oauth.mapper;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kernel.db.mapper.SuperMapper;
import org.apache.ibatis.annotations.Param;

import com.kernel.oauth.model.Client;

/**
 * @author knd
 */
public interface ClientMapper extends SuperMapper<Client> {
    List<Client> findList(Page<Client> page, @Param("params") Map<String, Object> params );
}
