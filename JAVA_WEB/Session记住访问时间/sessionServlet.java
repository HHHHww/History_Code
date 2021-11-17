package test;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/visitFirst")
public class sessionServlet extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("===");
        // TODO Auto-generated method stub
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession session=request.getSession();
        String log= (String) session.getAttribute("log");
        if (log==null){
            session.setAttribute("a","1");
            request.getRequestDispatcher("/servletVisit.jsp").forward(request,response);
        }
        else{
            session.setAttribute("a","2");
            request.getRequestDispatcher("/servletVisit.jsp").forward(request,response);
        }


    }


}
