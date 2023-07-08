package com.zstu.myssm.basedao;

/**
 * ClassName: DAOException
 * Package: com.zstu.myssm.basedao
 * Description:
 *
 * @Author: ZSTU_JY
 * @Create: 2023/7/8 - 12:36
 * @Version: v1.0
 */
public class DAOException extends RuntimeException {
    public DAOException(String msg) {
        super(msg);
    }
}
