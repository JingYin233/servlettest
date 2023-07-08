package com.zstu.myssm.myspringmvc;

/**
 * ClassName: DispatherServletException
 * Package: com.zstu.myssm.myspringmvc
 * Description:
 *
 * @Author: ZSTU_JY
 * @Create: 2023/7/8 - 12:53
 * @Version: v1.0
 */
public class DispatcherServletException extends RuntimeException {
    public DispatcherServletException(String msg) {
        super(msg);
    }
}
