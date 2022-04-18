package com.zhumuchang.dongqu.service.job;

import com.zhumuchang.dongqu.api.req.LoginDto;
import com.zhumuchang.dongqu.service.feign.JobFeignService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author sx
 * @Description feign调用controller
 * @Date 2022/4/17 17:11
 */
@RestController
public class FeignTestController {

    @Resource
    private JobFeignService jobFeignService;

    @PostMapping(name = "测试feign调用", path = "/testFeign")
    public Object testFeign() {
        LoginDto loginDto = jobFeignService.testFeign();
        return loginDto;
    }
}
