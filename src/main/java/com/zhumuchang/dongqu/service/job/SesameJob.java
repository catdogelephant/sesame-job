package com.zhumuchang.dongqu.service.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author sx
 * @Description 定时任务类
 * @Date 2022/4/13 18:39
 */
@Slf4j
@Component
public class SesameJob {

//    @Resource
//    private JobFeignService jobFeignService;

    /**
     * 刷新token任务
     *
     * @return 操作结果
     */
    @XxlJob("refreshTokenHandler")
    public ReturnT<Object> refreshTokenJob() {
        String jobParam = XxlJobHelper.getJobParam();
        XxlJobHelper.log("xxl-job refreshTokenHelper请求成功 - param={}", jobParam);
        String[] split = jobParam.split(",");
//        LoginDto dto = new LoginDto();
//        dto.setAccount(split[0]);
//        dto.setPassword(split[1]);
//        String resp = jobFeignService.refreshToken(dto);
//        log.info("定时任务类 - 刷新token - 返回结果={}", resp);
        ReturnT<Object> returnT = new ReturnT<>(null);
        return returnT;
    }
}
