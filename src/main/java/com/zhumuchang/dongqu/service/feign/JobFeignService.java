package com.zhumuchang.dongqu.service.feign;

import com.zhumuchang.dongqu.api.req.LoginDto;
import com.zhumuchang.dongqu.api.req.LoginTokenDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author sx
 * @Description 定时任务远程调用接口
 * @Date 2022/4/15 14:26
 */
@FeignClient(name = "shaobing")
public interface JobFeignService {
    //@FeignClient name对应被调用方（即服务提供方）的 spring.application.name

    /**
     * 刷新token
     * @param param 需要刷新的用户账号和密码
     * @return 返回值
     */
    @ResponseBody
    @PostMapping(value = "/shaobing/user/system/refreshToken")
    LoginTokenDto refreshToken(@RequestBody LoginDto param);

    /**
     * 测试feign调用接口
     */
    @ResponseBody
    @PostMapping(value = "/shaobing/user/system/testFeign")
    LoginDto testFeign();
}
