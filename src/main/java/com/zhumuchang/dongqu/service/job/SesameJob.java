package com.zhumuchang.dongqu.service.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.zhumuchang.dongqu.api.req.LoginDto;
import com.zhumuchang.dongqu.api.req.LoginTokenDto;
import com.zhumuchang.dongqu.service.feign.JobFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author sx
 * @Description 定时任务类
 * @Date 2022/4/13 18:39
 */
@Slf4j
@Component
public class SesameJob {

    @Resource
    private JobFeignService jobFeignService;

    /**
     * 刷新token任务
     *
     * @return 操作结果
     */
    @XxlJob("refreshTokenHandler")
    public ReturnT<Object> refreshTokenJob() {
        String jobParam = XxlJobHelper.getJobParam();
        log.info("定时任务类 - 刷新token - 请求开始={}", jobParam);
        XxlJobHelper.log("xxl-job refreshTokenHelper请求成功 - param={}", jobParam);
        String[] split = jobParam.split(",");
        LoginDto dto = new LoginDto();
        dto.setAccount(split[0]);
        dto.setPassword(split[1]);
        LoginTokenDto resp = jobFeignService.refreshToken(dto);
//        LoginDto resp = jobFeignService.testFeign();
        log.info("定时任务类 - 刷新token - 返回结果={}", resp);
        ReturnT<Object> returnT = new ReturnT<>(null);
        return returnT;
    }
}
