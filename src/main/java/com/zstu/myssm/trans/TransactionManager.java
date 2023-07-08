package com.zstu.myssm.trans;

import com.zstu.myssm.basedao.ConnUtil;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * ClassName: TransactionManager
 * Package: com.zstu.myssm.trans
 * Description:
 *
 * @Author: ZSTU_JY
 * @Create: 2023/7/8 - 11:34
 * @Version: v1.0
 */
public class TransactionManager {
    //开启事务
    public static void beginTrans() throws SQLException {
        ConnUtil.getConn().setAutoCommit(false);
    }

    //提交事务
    public static void commit() throws SQLException {
        Connection conn = ConnUtil.getConn();
        conn.commit();
        ConnUtil.closeConn();
    }

    //回滚事务
    public static void rollback() throws SQLException {
        Connection conn = ConnUtil.getConn();
        conn.rollback();
        ConnUtil.closeConn();
    }
}
