package com.zstu.myssm.io;

/**
 * ClassName: Beanfactory
 * Package: com.zstu.myssm.io
 * Description:
 *
 * @Author: ZSTU_JY
 * @Create: 2023/7/8 - 9:50
 * @Version: v1.0
 */

public interface BeanFactory {
    Object getBean(String id);
}
