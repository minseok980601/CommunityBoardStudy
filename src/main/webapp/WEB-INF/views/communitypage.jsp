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
     <p>${loginMember.name}님 반갑습니다.</p>
     <table class="community_table" style="width: 500px;">
                <thead>
                    <tr>
                        <th>번호</th>
                        <th>제목</th>
                        <th>작성자</th>
                        <th>조회수</th>
                        <th>추천</th>
                        <th>반대</th>
                        <th>작성일</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach var="board" items="${communityList}" begin="0" end="9">
                    <tr>
                        <td>${board.post_num }</td>
                        <td><a href="${contextPath}/readboard?post_num=${board.post_num}">${board.post_title}</a></td>
                        <td>${board.post_id }</td>
                        <td>${board.post_hits }</td>
                        <td>${board.post_good }</td>
                        <td>${board.post_bad }</td>
                        <td>${board.post_date }</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <input type="button" value="글 작성" onclick="location.href='${contextPath}/uploadboard?post_id=${loginMember.id}'">
            <input type="button" value="파일 업로드 글 작성" onclick="location.href='${contextPath}/fileuploadboard?post_id=${loginMember.id}'">
    </div>
</body>
</html>