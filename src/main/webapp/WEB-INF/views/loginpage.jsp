<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!doctype html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
        <div class="col-md-9">
            <form action="${contextPath}/loginMember" method="post">
                <input type="text" value="ID" id="id" name="id">
                <input type="password" value="PWD" id="pwd" name="pwd">
                <input type="submit" value="로그인">
            </form>
        </div>
</body>
</html>