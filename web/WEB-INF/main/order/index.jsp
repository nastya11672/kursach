<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1 class="my-4"  >
    <small>Ваши заказы</small>
</h1>

<div class="card mb-4">
    <div class="card-body">

        <table class="table table-responsive-lg">
            <tr>
                <th>Адрес</th>
                <th>Статус</th>
                <th>Модель</th>
            </tr>
            <c:if test="${orderList.size()==0}">
                <tr>
                    <td colspan="3" class="text-center">Нет заказов</td>
                </tr>
            </c:if>
            <c:if test="${orderList.size()>0}">

                <c:forEach var="order" items="${orderList}">
                <tr>
                    <td>
                        ${order.address}
                    </td>

                    <td>
                    <c:if test="${order.status==\"Обработка\"}">
                        <span style="color: blue;font-weight:bold">${order.status}</span>
                    </c:if>
                        <c:if test="${order.status==\"Ожидает покупателя\"}">
                            <span style="color: orange;font-weight:bold">${order.status}</span>
                        </c:if>

                        <c:if test="${order.status==\"Передан курьеру\"}">
                            <span style="color: blueviolet;font-weight:bold">${order.status}</span>
                        </c:if>
                        <c:if test="${order.status==\"Отмена\"}">
                            <span style="color: red;font-weight:bold">${order.status}</span>
                        </c:if>

                        <c:if test="${order.status==\"Выполнено\"}">
                            <span style="color: green;font-weight:bold">${order.status}</span>
                        </c:if>
                    </td>
                    <td>

                        <a href="/notebook?id=${order.notebookEntity.id}">Перейти</a>

                    </td>
                </tr>
            </c:forEach>
        </c:if>
        </table>
    </div>
    <br><br><br><br><br><br><br><br><br><br><br>
</div>


