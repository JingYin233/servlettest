package com.zstu.myssm.filters;

import com.zstu.myssm.trans.TransactionManager;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.sql.SQLException;

/**
 * ClassName: OpenSessionInViewFilter
 * Package: com.zstu.myssm.filters
 * Description:
 *
 * @Author: ZSTU_JY
 * @Create: 2023/7/8 - 11:32
 * @Version: v1.0
 */

@WebFilter("*.do")
public class OpenSessionInViewFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        try{

            TransactionManager.beginTrans();
            System.out.println("开启事务......");
            filterChain.doFilter(servletRequest, servletResponse);
            TransactionManager.commit();
            System.out.println("提交事务......");
        }catch (Exception e) {
            e.printStackTrace();
            try {
                TransactionManager.rollback();
                System.out.println("回滚事务......");
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
