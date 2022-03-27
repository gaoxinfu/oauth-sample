package com.gaoxinfu.oauth.sample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * 授权服务器配置
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends
        AuthorizationServerConfigurerAdapter {

    @Override
    public void configure(ClientDetailsServiceConfigurer clients)
            throws Exception {
        clients.inMemory()
            //客户端id
            .withClient("clientapp")
             //密码
            .secret("112233")
             //一般是发起的寻求获取auth-code的客户端的一个地址，我们在这里自己写在了TokenController中用于显示返回的code
            .redirectUris("http://localhost:9001/token/api/callback")
            // 授权码模式
            .authorizedGrantTypes("authorization_code")
            //权限范围设置
            .scopes("read_userinfo", "read_contacts");
    }

}
