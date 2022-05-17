package edu.fjnu501.interceptor;

import org.springframework.http.HttpStatus;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyCorsFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        response.setHeader("Access-control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Headers", request.getHeader("Access-Control-Request-Headers"));
        response.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
        if ("OPTIONS".equals(request.getMethod())) {
            response.setStatus(HttpStatus.NO_CONTENT.value());
            return;
        } else {
            filterChain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {

    }
}
