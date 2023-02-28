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
                <table class="community_table" style="width: 500px;">
                    <thead>
                        <tr>
                            <th>제목 : ${readBoard.post_title }</th>
                        </tr>
                        <tr>
                            <td>작성자 : ${readBoard.post_id}</td>
                        </tr>
                        <tr>
                            <td>내용 : ${readBoard.post_content}</td>
                        </tr>
                    </thead>
                </table>
                <input type="submit" value="글 작성">
        </div>
</body>
</html>