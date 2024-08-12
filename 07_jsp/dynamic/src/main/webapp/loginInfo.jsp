<%@ page import="sun.security.util.Password" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024-07-29
  Time: 오전 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>
  <h1로그인 입력 파마미터 출력></h1로그인>
<% String userid = request.getParameter("userid");
String username = request.getParameter("Password");
%>
아이디 값: <%= userid %> <br>
비밀번호: <%= Password %> <br>
</body>
</html>
