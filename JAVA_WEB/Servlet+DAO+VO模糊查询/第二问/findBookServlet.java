package test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

public class findBookServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //向服务器发送请求获取到参数
        String bookName = request.getParameter("bookName");

        ArrayList books=BookDao.queryStu(bookName);
        HttpSession session=request.getSession();
        session.setAttribute("books", books);
        response.sendRedirect("showResult.jsp");


    }
}
