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
        <form action="${contextPath}/successuploadboard?post_id=${loginMember.id}" method="post", enctype="multipart/form-data">
            <table class="community_table" style="width: 500px;">
                <thead>
                    <tr>
                        <th>제목</th>
                    </tr>
                    <tr>
                        <td><input type="text" id="post_title" name="post_title"></td>
                    </tr>
                    <tr>
                        <td><textarea rows="10" cols="50" id="post_content" name="post_content"></textarea></td>
                    </tr>
                </thead>
            </table>
            <input type="file" name="file">
            <input type="submit" value="글 작성">
        </form>
    </div>
</body>
</html>