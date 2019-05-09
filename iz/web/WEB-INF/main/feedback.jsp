<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h1 class="my-4"  >
    <small>Обращение к администрации</small>
</h1>

<div class="card mb-4">
    <div class="card-body">
        <form action="/feedback" method="post">


            <div class="form-group">
                <label><b>Имя</b></label>
                <input type="text" class="form-control" placeholder="Как к вам обращаться?" name="name" required>
            </div>
            <div class="form-group">
                <label><b>Email</b></label>
                <input type="email" class="form-control" placeholder="Введите Email" name="email" required>
            </div>

            <div class="form-group">
                <label><b>Текст обращения</b></label>
                <textarea class="form-control" name="description"  placeholder="Опишите вашу проблему"  required></textarea>
            </div>


            <div class="text-center">
                <button type="submit" class="btn btn-primary" >Отправить обращение</button>
            </div>
        </form>
    </div>

</div>




