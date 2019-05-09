
<%@ page contentType="text/html;charset=utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>






    <h1 class="my-4"  >
        <small>Новости сайта</small>
    </h1>
    <% if (request.getAttribute("newsList") != null) { %>
    <c:forEach var="news" items="${newsList}">

    <!-- Blog Post -->
    <div class="card mb-4">
        <img class="card-img-top" src="${news.img}" alt="${news.title}">
        <div class="card-body">
            <h2 class="card-title text-center"><c:out value="${news.title}" /></h2>
            <p class="card-text"><c:out value="${news.story}" /></p>

        </div>
        <div class="card-footer text-muted">
            Дата добавления: ${news.date}
        </div>
    </div>
</c:forEach>




    <% } %>
    <!-- Blog Post -->



