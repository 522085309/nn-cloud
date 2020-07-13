package com.atxx.auth.config;

import com.atxx.auth.user.LoginUser;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.DefaultAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 往JWT中添加自定义信息的话，比如说登录用户的ID，可以自己实现TokenEnhancer接口
 * @author:XJ
 */
@Component
public class JwtTokenEnhancer implements TokenEnhancer {
    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken oAuth2AccessToken, OAuth2Authentication oAuth2Authentication) {
        LoginUser loginUser = (LoginUser) oAuth2Authentication.getPrincipal();
        //  吧用户id假如jwt中
        Map<String,Object> map = new HashMap<>();
        map.put("id",loginUser.getUserId());
        map.put("userName",loginUser.getUsername());
        ((DefaultOAuth2AccessToken)oAuth2AccessToken).setAdditionalInformation(map);
        return oAuth2AccessToken;
    }
}
