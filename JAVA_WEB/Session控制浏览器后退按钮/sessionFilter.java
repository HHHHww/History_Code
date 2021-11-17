package test;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class sessionFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("===");
        HttpServletRequest httprequest=(HttpServletRequest)servletRequest;
        HttpServletResponse httprespose=(HttpServletResponse)servletResponse;
        HttpSession session=httprequest.getSession();
        String uri=httprequest.getRequestURI();

        if(uri.contains("/loginSession2.jsp"))
        {   String user=httprequest.getParameter("user");
            session.setAttribute("user",user);
            if(session.getAttribute("user")==null||session.getAttribute("user")=="")
            {
                servletRequest.getRequestDispatcher("/loginSession1.jsp").forward(servletRequest,servletResponse);
            }
            else{

                filterChain.doFilter(servletRequest, servletResponse);
            }
        }
        else if (uri.contains("/loginSession1.jsp")){
            session.setAttribute("user",null);

            filterChain.doFilter(servletRequest, servletResponse);
        }
        else{
            filterChain.doFilter(servletRequest, servletResponse);}
    }

    @Override
    public void destroy() {

    }
}
