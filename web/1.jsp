<%@ page import="by.devilmice.model.SettingsEntity" %>
<%@ page import="by.devilmice.dao.SettingsDAO" %>
<%@ page contentType="text/html;charset=utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% HttpSession ses = request.getSession();
    if(ses.getAttribute("auth")==null) {
        ses.setAttribute("auth",0);
    }

    SettingsDAO sd = new SettingsDAO();
    SettingsEntity settings = sd.getSettings();
    request.setAttribute("s", settings);
%>

    <!DOCTYPE html>
        <html lang="ru">

        <head>

            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
            <meta name="description" content="${s.description}">
            <meta name="keywords" content="${s.keywords}">

            <c:if test="${s.offline==0}">
                <title>${s.title}</title>

            </c:if>

            <c:if test="${s.offline==1}">
                <title>OFFLINE - ${s.title}</title>

            </c:if>

            <!-- Bootstrap core CSS -->
            <link href="/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

            <!-- Custom styles for this template -->
            <link href="/vendor/css/shop-homepage.css" rel="stylesheet">

        </head>

        <body>

        <!-- Navigation -->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
            <div class="container">
                <a class="navbar-brand" href="/">Маганиз ноутбуков</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto">
                        <c:if test="${content_value == \"index_page\"}">
                            <li class="nav-item active">
                                <a class="nav-link" href="/">Главная</a>
                            </li>
                        </c:if>

                            <c:if test="${content_value != \"index_page\"}">
                                <li class="nav-item">
                                    <a class="nav-link" href="/">Главная</a>
                                </li>
                            </c:if>



                        <c:if test="${content_value == \"news_page\"}">
                            <li class="nav-item active">
                                <a class="nav-link" href="/news">Новости</a>
                            </li>
                        </c:if>

                        <c:if test="${content_value != \"news_page\"}">
                            <li class="nav-item">
                                <a class="nav-link" href="/news">Новости
                                </a>
                            </li>
                        </c:if>


                        <c:if test="${content_value == \"feedback_page\"}">
                            <li class="nav-item active">
                                <a class="nav-link" href="/feedback">Обратная связь</a>
                            </li>
                        </c:if>

                        <c:if test="${content_value != \"feedback_page\"}">
                            <li class="nav-item">
                                <a class="nav-link" href="/feedback">Обратная связь</a>
                                </a>
                            </li>
                        </c:if>

                    </ul>
                </div>
            </div>
        </nav>

        <!-- Page Content -->
        <div class="container">


            <div class="row">


                <div class="col-md-8">
                    <br>
                    <c:if test="${sessionScope['alert']==1}">
                        <div class="alert ${sessionScope['alert_type']} alert-dismissible fade show" role="alert">
                            <strong>${sessionScope['alert_mess']}</strong>
                            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <c:set var="alert" value="0" scope="session" />

                    </c:if>


                    <c:if test="${content_value == \"index_page\"}">
                        <jsp:include page="WEB-INF/main/notebook/index.jsp"/>
                    </c:if>

                    <c:if test="${content_value == \"notebook_show\"}">
                            <jsp:include page="WEB-INF/main/notebook/show.jsp"/>
                    </c:if>

                    <c:if test="${content_value == \"news_page\"}">
                        <jsp:include page="WEB-INF/main/news/index.jsp"/>
                    </c:if>

                    <c:if test="${content_value == \"reg\"}">
                        <jsp:include page="WEB-INF/main/registration.jsp"/>
                    </c:if>


                    <c:if test="${content_value == \"profile_page\"}">
                        <jsp:include page="WEB-INF/main/profile.jsp"/>
                    </c:if>

                    <c:if test="${content_value == \"feedback_page\"}">
                        <jsp:include page="WEB-INF/main/feedback.jsp"/>
                    </c:if>

                    <c:if test="${content_value == \"order_page\"}">
                        <jsp:include page="WEB-INF/main/order/index.jsp"/>
                    </c:if>
                    <c:if test="${content_value == \"order_add\"}">
                        <jsp:include page="WEB-INF/main/order/add.jsp"/>
                    </c:if>
                </div>



                <!-- Sidebar Widgets Column -->
                <div class="col-md-4">




                    <c:if test="${content_value == \"index_page\"}">
                        <jsp:include page="WEB-INF/main/notebook/search_notebook.jsp"/>
                    </c:if>



                    <!-- Авторизация -->
                    <div class="card my-4">
                        <h5 class="card-header">Авторизация</h5>
                        <div class="card-body">

                        <c:if test="${sessionScope['auth']==1}">
                            <div class="text-center">Добрый день, <b><c:out value="${sessionScope['user_name']}"/></b><br>
                            <%--    <c:if test="${sessionScope['user_role']==0}">
                                    Группа:  <b><span style="color:blue">Пользователь</span></b>
                                </c:if>--%>
                                <c:if test="${sessionScope['user_role']==1}">
<%--
                                    Группа:  <b><span style="color:red">Администатор</span></b><br>
--%>
                                    <a class="btn btn-danger btn-lg btn-block" href="/admin" role="button">Панель администратора</a>



                                </c:if>
                                <a class="btn btn-secondary btn-lg btn-block" href="/order" role="button">Заказы</a>

                                <a class="btn btn-warning btn-lg btn-block" href="/profile?id=${sessionScope['user_id']}" role="button">Настройки профиля</a>

                                <a class="btn btn-success btn-lg btn-block" href="/auth" role="button">Выход</a>
                            </div>


                        </c:if>
                            <c:if test="${sessionScope['auth']!=1}">
                                <form class="form-signin" method="post" action="/auth">
                                    <div class="form-group">
                                        <input type="text" name="login" class="form-control" placeholder="Логин" required >
                                    </div>
                                    <div class="form-group">
                                        <input type="password" name="password" class="form-control" placeholder="Пароль" required>
                                    </div>
                                    <button class="btn btn-lg btn-primary btn-block" type="submit">Войти</button>


                                    <a class="btn btn-warning btn-lg btn-block" href="/reg" role="button">Регистрация</a>

                                </form>
                            </c:if>

                        </div>
                    </div>



                          <!-- Categories Widget -->



                </div>


            </div>




            <!-- /.row -->

        </div>
        <!-- /.container -->

        <!-- Footer -->

            <footer class="py-5 bg-dark" style=" margin-top: 287px;">
                <div class="container">
                    <p class="m-0 text-center text-white">Copyright &copy; Магазин ноутбуков 2019</p>
                </div>
                <!-- /.container -->
            </footer>

        <!-- Bootstrap core JavaScript -->
        <script src="/vendor/jquery/jquery.min.js"></script>
        <script src="/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        </body>

        </html>
