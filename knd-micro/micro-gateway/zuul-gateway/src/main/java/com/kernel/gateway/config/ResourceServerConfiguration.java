package com.kernel.gateway.config;

import com.kernel.common.config.DefaultPasswordConfig;
import com.kernel.oauth2.common.config.DefaultResourceServerConf;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author kndopensource
 */
@Configuration
@EnableResourceServer
@Import({DefaultPasswordConfig.class})
public class ResourceServerConfiguration extends DefaultResourceServerConf {
    @Override
    public HttpSecurity setAuthenticate(ExpressionUrlAuthorizationConfigurer<HttpSecurity>.AuthorizedUrl authorizedUrl) {
        return authorizedUrl.access("@permissionService.hasPermission(request, authentication)").and();
    }
}