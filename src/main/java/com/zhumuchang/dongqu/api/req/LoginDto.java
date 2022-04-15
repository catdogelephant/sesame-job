package com.zhumuchang.dongqu.api.req;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author sx
 * @Description 刷新token请求参数
 * @Date 2022/4/14 18:18
 */
@Data
public class LoginDto implements Serializable {

    private static final long serialVersionUID = 7237187727754656561L;
    /**
     * 用户名
     */
    private String account;

    /**
     * 密码
     */
    private String password;
}
