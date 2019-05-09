
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>


</style>
<html>
<head>
    <title>Произошла ошибка</title>

    <!-- Bootstrap core CSS -->
    <link href="/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/vendor/css/shop-homepage.css" rel="stylesheet">

</head>
<body >

<div class="container text-center">
    <h1 style="color: red">ОШИБКА!</h1>

    <img class="img-error" src="/uploads/oh.png">
    <c:if test="${sessionScope['error_mess']==null}">
    <h4>Страница не найдена!</h4>

    </c:if>


    <c:if test="${sessionScope['error_mess']==\"null\"}">
        <h4>Страница не найдена!</h4>

    </c:if>

    <c:if test="${((sessionScope['error_mess']!=null) && (sessionScope['error_mess']!=\"null\"))}">
        <h4>${sessionScope['error_mess']}</h4>
        <c:set var="error_mess" value="null" scope="session" />

    </c:if>
    <a href="/" class="btn btn-primary btn-lg">Вернуться на сайт</a>
</div>

</body>
</html>
