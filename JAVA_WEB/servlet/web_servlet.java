package test;

import jakarta.servlet.*;

import java.io.IOException;

public class web_servlet  implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("config");
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service");
    }

    @Override
    public String getServletInfo() {
        System.out.println("get");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy");

    }


}

