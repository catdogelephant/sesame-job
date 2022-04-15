package com.zhumuchang.dongqu;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SesameJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(SesameJobApplication.class, args);
        log.info("------------------------>>>>SesameJobApplication 启动成功<<<<------------------------");
    }

}
