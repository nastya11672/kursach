<%@ page contentType="text/html;charset=utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="${notebookList.size()!=0}">
    <div class="row my-4">

        <c:forEach var="notebook" items="${notebookList}" >
        <div class="col-md-6 my-4">
            <div class="block">
                <div class="card h-100">
                    <a href="/notebook?id=${notebook.id}"><img class="card-img-top" src="<c:out value="${notebook.notebookImagesList.get(0).src}" />" alt="${notebook.title}"></a>
                    <div class="card-body">
                        <h6 class="card-title">
                            <a href="/notebook?id=${notebook.id}">${notebook.title}</a>
                        </h6>
                        <p class="card-text"><b>Процессор:</b> ${notebook.processorModel}<br>
                            <b>RAM:</b> ${notebook.capacityRam} ГБ ${notebook.ramType}<br>
                            <b>Технология экрана : ${notebook.screenTechnology}</b>

                        </p>
                        <h5 class="text-center">Цена: ${notebook.price} BYN</h5>
                        <c:if test="${sessionScope['auth']==1}">
                            <a class="btn btn-success btn-lg btn-block" href="/order?id=${notebook.id}" role="button">Заказать</a>

                        </c:if>

                    </div>

                </div>
            </div>
        </div>
        </c:forEach>


    </div>
</c:if>
<c:if test="${notebookList.size()==0}">
    <h4>По заданным критериям ноутбуков не найдено!</h4>
</c:if>
