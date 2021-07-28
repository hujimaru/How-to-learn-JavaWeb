package net.filter;

import javax.servlet.*;
import java.io.IOException;

public class FirstFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //初始化
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 该方法重点学习
        System.out.println("filter运行了");
        // 因为在web.xml中配置了"/*"所以所有的Web资源被访问的时候都会被拦截

        //对请求放行，看其中的filterChain类，下述的doFilter方法用来进行发行
        filterChain.doFilter(servletRequest,servletResponse);

    }

    @Override
    public void destroy() {
        //销毁
    }
}
