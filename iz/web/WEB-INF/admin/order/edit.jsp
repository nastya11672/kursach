<%@ page contentType="text/html;charset=utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1 class="my-4"  >
    <small>Просмотр заказа</small>
</h1>

<div class="card mb-4">
    <div class="card-body">
        <form action="/admin/order" method="post">
            <input type="hidden" name="action" value="edit"/>
            <input type="hidden" name="id" value="${order.id}"/>

            <div class="form-group">
                <label>ФИО</label>
                <input type="text" class="form-control" name="fio" value="${order.fio}">
            </div>
            <div class="form-group">
                <label>Телефон</label>
                <input type="text" class="form-control" name="phone" value="${order.phone}">
            </div>
            <div class="form-group">
                <label>Телефон</label>
                <input type="text" class="form-control" name="address" value="${order.address}">
            </div>
            <label>Комменатрий к заказу</label>
            <textarea class="form-control" rows="5" name="story" id="comment">${order.comment}</textarea>
            <br>
            <c:set var="statusList">Обработка,Передан курьеру,Ожидает покупателя,Отмена,Выполнено</c:set>

            <div class="form-group">
                <select name="status" class="form-control">

                    <c:forEach var="s" items="${statusList}">
                        <c:if test="${s==order.status}">
                            <option value="${s}" selected>${s}</option>
                        </c:if>
                        <c:if test="${s!=order.status}">

                            <option value="${s}">${s}</option>
                        </c:if>
                    </c:forEach>



                </select>
            </div>

            <div class="form-group">
                <button class="btn btn-primary" id="submit" type="submit">Изминить заказ</button>
            </div>


        </form>
    </div>
</div>
