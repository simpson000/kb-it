package org.scoula.ex05;

import org.scoula.ex05.doman.Member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/scope")
public class ScopeServlet extends HttpServlet {
    ServletContext sc;

    @Override
    public void init(ServletConfig config) throws ServletException {
        sc = config.getServletContext();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        sc.setAttribute("scopeName", "applicationScope 값 ");

        HttpSession session = request.getSession();

        session.setAttribute("scopeName","sessionScope 값");
        request.setAttribute("scopeName","requestScope 값");
        Member member = new Member("홍길동","hong");
        request.setAttribute("member",member);

        request.getRequestDispatcher("scope.jsp").forward(request,response);


    }
}
