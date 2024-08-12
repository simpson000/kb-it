<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024-07-29
  Time: 오후 4:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>getParameter Values 실습</title>
</head>
<body>
    <form action="sports" method="post">
        <fieldset>
            <legend> 좋아하는 운동 및 성별</legend>
            <ul>
                <li>
                    <label for="baseball">야구</label>
                    <input type="checkbox" id="baseball" name="sports" value="야구">
                    <label for="soccer">축구</label>
                    <input type="checkbox" id="soccer" name="sports" value="축구">
                    <label for="basketball">농구</label>
                    <input type="checkbox" id="basketball" name="sports" value="농구">

                </li>
                <li>
                    <label for="male">남</label>
                    <input type="radio" id="male" value="남" name="sex">
                    <label for="women">여</label>
                    <input type="radio" id="women" value="여" name="sex">
                </li>
                <li>
                    <input type="submit" value="전송">
                </li>
            </ul>
        </fieldset>
    </form>
</body>
</html>
