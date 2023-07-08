package com.zstu.myssm.filters;

import com.zstu.myssm.util.StringUtil;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * ClassName: CharacterEncodingFilter
 * Package: com.zstu.myssm.filters
 * Description:
 *
 * @Author: ZSTU_JY
 * @Create: 2023/7/8 - 10:47
 * @Version: v1.0
 */

@WebFilter(urlPatterns = {"*.do"}, initParams = {@WebInitParam(name= "encoding", value="UTF-8")})
public class CharacterEncodingFilter implements Filter {

    private String encoding = "UTF-8";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String encodingStr = filterConfig.getInitParameter("encoding");
        if(StringUtil.isNotEmpty(encodingStr)) {
            encoding = encodingStr;
        }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        ((HttpServletRequest)servletRequest).setCharacterEncoding(encoding);

        filterChain.doFilter(servletRequest, servletResponse);

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
