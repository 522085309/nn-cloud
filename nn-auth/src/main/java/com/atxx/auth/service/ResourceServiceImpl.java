package com.atxx.auth.service;

import cn.hutool.core.collection.CollUtil;
import com.atxx.utils.constant.RedisConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 创建一个资源服务ResourceServiceImpl，初始化的时候把资源与角色匹配关系缓存到Redis中，方便网关服务进行鉴权的时候获取。
 * @author:XJ
 */
@Service
public class ResourceServiceImpl implements ApplicationRunner{
    private Map<String,List<String>> resourceMap;
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        resourceMap = new TreeMap<>();
        resourceMap.put("/trade/**", CollUtil.toList("admin"));
        resourceMap.put("/device/**",CollUtil.toList("test"));
        resourceMap.put("/system/**",CollUtil.toList("admin"));
        redisTemplate.opsForHash().putAll(RedisConstant.RESOURCE_ROLES_MAP,resourceMap);
    }


}
