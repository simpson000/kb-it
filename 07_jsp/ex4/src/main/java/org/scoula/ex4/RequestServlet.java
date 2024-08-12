package org.scoula.ex4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/request")
public class RequestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("username", "홍길동");
        request.setAttribute("useraddress","서울");

        RequestDispatcher rd = request.getRequestDispatcher("/response.jsp");
        rd.forward(request, response);
    }

}
