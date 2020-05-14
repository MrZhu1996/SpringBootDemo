package com.example.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "url")
@Data
public class MicroServiceUrl {

    //订单服务地址
    private String orderUrl;
    //用户服务地址
    private String userUrl;
    //购物车服务地址
    private String shoppingUrl;
}
