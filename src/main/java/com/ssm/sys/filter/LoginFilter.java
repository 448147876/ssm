package com.ssm.sys.filter;


import com.ssm.pojo.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


/**
 * 登陆拦截器--使用web.xml配置
 * @Author ASUS
 */
public class LoginFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("user");
        if(user!=null){
            filterChain.doFilter(request, response);
        }else{
            request.getRequestDispatcher("/ssm").forward(request, response);
        }
    }

    @Override
    public void destroy() {

    }
}
