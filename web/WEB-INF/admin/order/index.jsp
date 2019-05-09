
<%@ page contentType="text/html;charset=utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1 class="mt-4">Управление заказами</h1>

<form method="POST" action="/admin/order">
    <input type="hidden" name="action" value="delete">
    <table class="table table-bordered">
        <thead>
        <tr>

            <th>ФИО</th>
            <th>Телефон</th>
            <th>Дата</th>

            <th>Управление</th>

        </tr>
        </thead>
        <tbody>

        <c:forEach var="order" items="${orderList}">

            <tr>
                <td>${order.fio}</td>
                <td>${order.phone}</td>
                <td>${order.date}</td>

                <td>
                    <a href="?action=edit&id=${order.id}">Просмотр</a> <br>

                    Удалить <input type="checkbox" name="del" value="${order.id}"/>
                </td>

            </tr>

        </c:forEach>



        </tbody>
    </table>


    <button  type="submit" class="btn btn-warning cont">Удалить выбранные</button>
</form>