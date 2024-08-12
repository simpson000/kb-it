package org.scoula.ex06;

import org.scoula.ex06.command.Command;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "frontControllerServlet",value = "/")
public class FrontControllerServlet extends HttpServlet {

    Map <String, Command> getMap;
    Map <String, Command> postMap;

    public void init(){
        getMap = new HashMap<>();
        postMap = new HashMap<>();
    }
    private String getCommandName(HttpServletRequest request){
        String requestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        return requestURI.substring(contextPath.length());

    }
    private Command getCommand(HttpServletRequest request){
        String commandName = getCommandName(request);
        Command command;
        if(request.getMethod().equalsIgnoreCase("GET")){
            command = getMap.get(commandName);
        }
        else {
            command = postMap.get(commandName);
        }
        return command;
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // MIME 타입 설정
        response.setContentType("text/html;charset=UTF-8");

        // 자바 I/O
        PrintWriter out = response.getWriter();

        // html 작성 및 출력
        out.print("<html><body>");
        out.print("");
        out.print("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        doGet(request, response);
    }
}
