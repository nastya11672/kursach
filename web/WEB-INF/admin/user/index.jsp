<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1 class="mt-4">Управление пользователями</h1>

<form method="POST" action="/admin/user/">
    <input type="hidden" name="action" value="delete">
    <table class="table table-bordered">
        <thead>
        <tr>

            <th>Имя пользователя</th>
            <th>Email</th>
            <th>Группа</th>
            <th>Управление</th>


        </tr>
        </thead>
        <tbody>

        <c:forEach var="user" items="${usersList}">

            <tr>
                <td>${user.login}</td>
                <td>${user.email}</td>
                <td>
                    <c:if test="${user.role==0}">
                        <span style="color: blue;"><b>Пользователь</b></span>
                    </c:if>
                    <c:if test="${user.role==1}">
                        <span style="color: red;"><b>Администратор</b></span>
                    </c:if>
                </td>
                <td>
                    <a href="?action=edit&id=${user.id}">Редактировать</a> <br>

                    Удалить <input type="checkbox" name="del" value="${user.id}"/>
                </td>

            </tr>

        </c:forEach>



        </tbody>
    </table>
    <a class="btn btn-primary" href="?action=add" role="button">Добавить пользователя</a>


    <button  type="submit" class="btn btn-warning cont">Удалить выбранные</button>
</form>