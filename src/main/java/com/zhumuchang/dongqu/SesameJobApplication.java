package com.zhumuchang.dongqu;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @EnableDiscoveryClient 服务发现
 * @EnableFeignClients feign客户端，可以使被@FeignClient修饰的接口可以注入使用，不会启动报错 not find xxxservice
 */
@EnableFeignClients
@EnableDiscoveryClient
@Slf4j
@SpringBootApplication
public class SesameJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(SesameJobApplication.class, args);
        log.info("------------------------>>>>SesameJobApplication 启动成功<<<<------------------------");
    }

}
