
<%@ page contentType="text/html;charset=utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1 class="mt-4">Управление новостями</h1>

<form method="POST" action="/admin/news">
    <input type="hidden" name="action" value="delete">
<table class="table table-bordered">
    <thead>
    <tr>

        <th>Название</th>
        <th>Управление</th>

    </tr>
    </thead>
    <tbody>

        <c:forEach var="news" items="${newsList}">

        <tr>
            <td>${news.title}</td>
            <td>
                <a href="?action=edit&id=${news.id}">Редактировать</a> <br>

                Удалить <input type="checkbox" name="del" value="${news.id}"/>
            </td>

        </tr>

        </c:forEach>



    </tbody>
</table>
    <a class="btn btn-primary" href="?action=add" role="button">Добавить новость</a>


    <button  type="submit" class="btn btn-warning cont">Удалить выбранные</button>
</form>