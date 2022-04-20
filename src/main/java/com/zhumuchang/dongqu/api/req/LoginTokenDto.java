package com.zhumuchang.dongqu.api.req;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author sx
 * @Description 登录成功返回token信息
 * @Date 2022/3/21 18:51
 */
@Data
public class LoginTokenDto implements Serializable {

    private static final long serialVersionUID = -6164253528031753593L;
    /**
     * token
     */
    private String token;

    /**
     * userId
     */
    private String userId;

    /**
     * 返回异常信息
     */
    private String respMsg;
}
