<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024-08-01
  Time: 오전 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>todo 보기</h1>
    <div>
        <a href="list">목록보기</a>
        <a href="update">수정하기</a>


    </div>
    <form action="delete" method="post">
        <input type="submit" value="삭제">

    </form>
</body>
</html>
