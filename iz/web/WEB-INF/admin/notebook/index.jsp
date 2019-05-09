<%@ page contentType="text/html;charset=utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1 class="mt-4">Управление ноутбуками</h1>

<form method="POST" action="/admin/notebook/">
    <input type="hidden" name="action" value="delete">
    <table class="table table-bordered">
        <thead>
        <tr>

            <th>Название</th>
            <th>Процессор</th>
            <th>Управление</th>

        </tr>
        </thead>
        <tbody>

        <c:forEach var="notebook" items="${notebookList}">

            <tr>
                <td>${notebook.title}</td>
                <td>${notebook.processor}</td>

                <td>
                    <a href="?action=edit&id=${notebook.id}">Редактировать</a> <br>

                    Удалить <input type="checkbox" name="del" value="${notebook.id}"/>
                </td>

            </tr>

        </c:forEach>



        </tbody>
    </table>
    <a class="btn btn-primary" href="?action=add" role="button">Добавить ноутбук</a>


    <button  type="submit" class="btn btn-warning cont">Удалить выбранные</button>
</form>