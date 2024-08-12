package org.scoula.ex4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/request_redirect")
public class RequestRedirectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = (String) request.getAttribute("username");
        String useraddress = (String) request.getAttribute("useraddress");

        request.setAttribute("username", username);
        request.setAttribute("useraddress",useraddress);

        RequestDispatcher rd = request.getRequestDispatcher("/redirect_response.jsp");
        rd.forward(request, response);
    }


}
