package com.zhumuchang.dongqu.service.job;

import com.zhumuchang.dongqu.api.req.LoginDto;
import com.zhumuchang.dongqu.api.req.LoginTokenDto;
import com.zhumuchang.dongqu.service.feign.JobFeignService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author sx
 * @Description 测试feign调用
 * @Date 2022/4/20 14:35
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

    @PostMapping(name = "测试刷新token调用", path = "/refreshToken")
    public Object refreshToken() {
        LoginDto dto = new LoginDto();
        dto.setAccount("13666666666");
        dto.setPassword("123456");
        LoginTokenDto resp = jobFeignService.refreshToken(dto);
        return resp;
    }
}