<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>Title</title>
</head>
<body>
username 값: <%= request.getAttribute("username") %><br>
useraddress 값: <%= request.getAttribute("useraddress") %><br>
</body>
</html>
