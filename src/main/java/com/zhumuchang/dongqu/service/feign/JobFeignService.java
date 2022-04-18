package com.zhumuchang.dongqu.service.feign;

import com.zhumuchang.dongqu.api.req.LoginDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author sx
 * @Description 定时任务远程调用接口
 * @Date 2022/4/15 14:26
 */
@FeignClient(name = "springcloudShaobing")
public interface JobFeignService {
    @ResponseBody
    @PostMapping(value = "/shaobing/user/system/refreshToken")
    public String refreshToken(@RequestBody LoginDto param);

    /**
     * 测试feign调用
     * @return
     */
    @ResponseBody
    @PostMapping(value = "/shaobing/user/system/test")
    public LoginDto testFeign();
}
