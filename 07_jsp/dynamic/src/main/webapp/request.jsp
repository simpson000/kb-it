<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024-07-29
  Time: 오전 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
    <h1>
        로그인 화면
    </h1>
    <form action="loginInfo.jsp" method="get">
        <fieldset>
            <legend> 로그인 폼</legend>
            <ul>
                <li>
                    <%--@declare id="userid"--%><label for="userid"> 아이디</label>
                    <input type = "text" name="userid">
                </li>
                <li>
                    <%--@declare id="password"--%><label for="Password"> 비밀번호</label>
                    <input type="password" name="Password">
                </li>
                <li><input type="submit" value="전송"></li>
            </ul>
        </fieldset>
    </form>

</body>
</html>
