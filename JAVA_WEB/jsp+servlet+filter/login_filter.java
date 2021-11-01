package test;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class login_filter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httprequest=(HttpServletRequest)servletRequest;
        HttpServletResponse httprespose=(HttpServletResponse)servletResponse;
        HttpSession session=httprequest.getSession();
        String uri=httprequest.getRequestURI();
        if(!(uri.contains("/login.jsp")||uri.contains("login11.do")))
        {

            if(session.getAttribute("user")==null)
            {

                servletRequest.getRequestDispatcher("/login.jsp").forward(servletRequest,servletResponse);
            }
            else{

                filterChain.doFilter(servletRequest, servletResponse);
            }
        }
        else{
        filterChain.doFilter(servletRequest, servletResponse);}
    }

    @Override
    public void destroy() {

    }
}
