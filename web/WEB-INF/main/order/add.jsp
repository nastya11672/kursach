<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h1 class="my-4"  >
    <small>Заказ товара</small>
</h1>

<div class="card mb-4">
    <div class="card-body">
        <h5 class="text-center">Краткая характеристика выбранного товара товара</h5>
        <table class="table">

            <tr>
                <th>Название</th>
                <td>${n.title}</td>
            </tr>

            <tr>
                <th>Модель процессора</th>
                <td>${n.processorModel}</td>
            </tr>

            <tr>
                <th>Оперативная память</th>
                <td>${n.capacityRam} ГБ ${n.ramType}</td>
            </tr>
            <tr>
                <th>Цена</th>
                <td>${n.price} BYN</td>
            </tr>
        </table>
        <hr>
        <h5 class="text-center">Информация для заказа</h5>

        <form action="/order" method="post">


            <input type="hidden" name="id" value="${n.id}"/>

            <div class="form-group">
                <label><b>ФИО</b></label>
                <input type="text" class="form-control" placeholder="Фамилия Имя Отчество" name="fio" required>
            </div>
            <div class="form-group">
                <label><b>Адрес доставки:</b></label>
                <input type="text" class="form-control" placeholder="г.Минск ул.Денисова д.28 кв.65" name="address" required>
                <small>Оставьте пустым если хотите забрать в точке самовывоза</small>
            </div>

            <div class="form-group">
                <label><b>Телефон</b></label>
                <input type="text" class="form-control" placeholder="+375(xx) xxx-xx-xx"  name="phone" required>
            </div>


            <div class="form-group">
                <label><b>Дополнение к заказу</b></label>
                <textarea class="form-control" name="comment"></textarea>
            </div>



            <div class="text-center">
                <button type="submit" class="btn btn-primary" >Заказать товар</button>
            </div>
        </form>
    </div>

</div>
<br><br><br>


