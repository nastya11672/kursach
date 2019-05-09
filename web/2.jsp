<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ru">

<head>

    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Панель администратора</title>

    <!-- Bootstrap core CSS -->
    <link href="/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/vendor/css/simple-sidebar.css" rel="stylesheet">

</head>

<body>

<div class="d-flex" id="wrapper">

    <!-- Sidebar -->
    <div class="bg-light border-right" id="sidebar-wrapper">
        <div class="sidebar-heading text-center"><b>Панель администратора</b></div>
        <div class="list-group list-group-flush">
            <a href="/admin" class="list-group-item list-group-item-action bg-light">Настройки</a>
            <a href="/admin/news" class="list-group-item list-group-item-action bg-light">Управление новостями</a>
            <a href="/admin/notebook" class="list-group-item list-group-item-action bg-light">Управление ноутбуками</a>
            <a href="/admin/user" class="list-group-item list-group-item-action bg-light">Управление пользователями</a>
            <a href="/admin/order" class="list-group-item list-group-item-action bg-light">Управление заказами</a>

        </div>
    </div>
    <!-- /#sidebar-wrapper -->

    <!-- Page Content -->
    <div id="page-content-wrapper">

        <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
            <button class="btn btn-primary" id="menu-toggle">Свернуть меню</button>

            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto mt-2 mt-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" href="/">На сайт </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/auth">Выход</a>
                    </li>

                </ul>
            </div>
        </nav>

        <div class="container-fluid">
            <c:if test="${sessionScope['alert']==1}">
                <br>
                <div class="alert ${sessionScope['alert_type']} alert-dismissible fade show" role="alert">
                    <strong>${sessionScope['alert_mess']}</strong>
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <c:set var="alert" value="0" scope="session" />

            </c:if>
            <c:if test="${content_value == \"news_index\"}">
            <jsp:include page="WEB-INF/admin/news/index.jsp"/>
        </c:if>

            <c:if test="${content_value == \"news_add\"}">
                <jsp:include page="WEB-INF/admin/news/add.jsp"/>
            </c:if>

            <c:if test="${content_value== \"news_edit\"}">
                <jsp:include page="WEB-INF/admin/news/edit.jsp"/>
            </c:if>




            <c:if test="${content_value == \"notebook_index\"}">
                <jsp:include page="/WEB-INF/admin/notebook/index.jsp"/>
            </c:if>

            <c:if test="${content_value == \"notebook_add\"}">
                <jsp:include page="/WEB-INF/admin/notebook/add.jsp"/>
            </c:if>

            <c:if test="${content_value== \"notebook_edit\"}">
                <jsp:include page="/WEB-INF/admin/notebook/edit.jsp"/>

            </c:if>


            <c:if test="${content_value== \"setting\"}">
                <jsp:include page="/WEB-INF/admin/setting.jsp"/>
            </c:if>


            <c:if test="${content_value == \"user_index\"}">
                <jsp:include page="/WEB-INF/admin/user/index.jsp"/>
            </c:if>
            <c:if test="${content_value == \"user_add\"}">
                <jsp:include page="/WEB-INF/admin/user/add.jsp"/>
            </c:if>
            <c:if test="${content_value == \"user_edit\"}">
                <jsp:include page="/WEB-INF/admin/user/edit.jsp"/>
            </c:if>

            <c:if test="${content_value == \"order_index\"}">
                <jsp:include page="/WEB-INF/admin/order/index.jsp"/>
            </c:if>

            <c:if test="${content_value == \"order_edit\"}">
                <jsp:include page="/WEB-INF/admin/order/edit.jsp"/>
            </c:if>
        </div>
    </div>
    <!-- /#page-content-wrapper -->

</div>
<!-- /#wrapper -->
<script type="text/javascript" src="/vendor/ckeditor.js"/>
<script type="text/javascript">
    CKEDITOR.replace( "editor1");
</script>
<!-- Bootstrap core JavaScript -->
<script src="/vendor/jquery/jquery.min.js"></script>
<script src="/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Menu Toggle Script -->
<script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");

    });
</script>



</body>

</html>
