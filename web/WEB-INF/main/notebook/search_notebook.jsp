<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="card my-4">
    <h5 class="card-header">Подбор ноутбука</h5>
    <div class="card-body">
        <form action="" method="GET">
            <div> <b>Производитель</b></div><hr>



            <c:set var="vendors">Asus,Acer,Xiaomi,Apple,Lenovo,HP</c:set>


            <c:if test="${paramValues.vendor!=null}">

                <c:forEach var="v" items="${vendors}">
                    <c:set var="flag">0</c:set>
                    <c:forEach var="vendor_get" items="${paramValues.vendor}">
                            <c:if test="${vendor_get == v}">
                                <input type="checkbox"  name="vendor" value="${v}" checked>${v}<br>
                                <c:set var="flag">1</c:set>

                            </c:if>

                    </c:forEach>
                    <c:if test="${flag==0}">
                        <input type="checkbox"  name="vendor" value="${v}">${v}<br>
                    </c:if>
                </c:forEach>

            </c:if>

            <c:if test="${paramValues.vendor==null}">

                <input type="checkbox" name="vendor" value="Acer">Acer<br>
                <input type="checkbox" name="vendor" value="Asus">Asus<br>
                <input type="checkbox" name="vendor" value="Apple">Apple<br>
                <input type="checkbox" name="vendor" value="HP">HP<br>
                <input type="checkbox" name="vendor" value="Lenovo">Lenovo<br>
                <input type="checkbox" name="vendor" value="Xiaomi">Xiaomi<br><br>
            </c:if>



            <c:set var="processors">не выбран,Intel Core i3,Intel Core i5,Intel Core i7,Intel Pentium,Intel Celeron</c:set>

            <div> <b>Процессор</b></div><hr>
            <select class="form-control" name="processor">
                <c:if test="${param.processor!=null}">

                    <c:forEach var="proc" items="${processors}">
                        <c:if test="${proc==param.processor}">
                            <option value="${proc}" selected>${proc}</option>
                        </c:if>
                        <c:if test="${proc!=param.processor}">

                            <option value="${proc}">${proc}</option>
                        </c:if>
                    </c:forEach>
                </c:if>

                <c:if test="${param.processor==null}">

                    <option value="не выбран">не выбран</option>
                    <option value="Intel Core i3">Intel Core i3</option>
                    <option value="Intel Core i5">Intel Core i5</option>
                    <option value="Intel Core i7">Intel Core i7</option>
                    <option value="Intel Pentium">Intel Pentium</option>
                    <option value="Intel Celeron">Intel Celeron</option>
                </c:if>
            </select><br>


            <c:set var="years">2017,2018,2019</c:set>


            <div> <b>Год выпуска</b></div><hr>
            <c:if test="${paramValues.year!=null}">

                <c:forEach var="y" items="${years}">
                    <c:set var="flag">0</c:set>
                    <c:forEach var="year_get" items="${paramValues.year}">
                        <c:if test="${year_get == y}">
                            <input type="checkbox"  name="year" value="${y}" checked>${y}<br>
                            <c:set var="flag">1</c:set>

                        </c:if>

                    </c:forEach>
                    <c:if test="${flag==0}">
                        <input type="checkbox"  name="year" value="${y}">${y}<br>
                    </c:if>
                </c:forEach>


            </c:if>

            <c:if test="${paramValues.year==null}">
                <input type="checkbox" name="year" value="2017">2017<br>
                <input type="checkbox" name="year" value="2018">2018<br>
                <input type="checkbox" name="year" value="2019">2019<br>
            </c:if>

            <br>

            <div> <b>Оперативная память</b></div><hr>

            <c:set var="ram_capacity">1,2,3,4,6,8,12,16,32</c:set>

            От:<select class="form-control" name="ram_from">


            <c:if test="${param.ram_from!=null}">

                <c:forEach var="ram" items="${ram_capacity}">
                    <c:if test="${ram==param.ram_from}">
                        <option value="${ram}" selected>${ram} ГБ</option>
                    </c:if>
                    <c:if test="${ram!=param.ram_from}">

                        <option value="${ram}">${ram} ГБ</option>
                    </c:if>
                </c:forEach>
            </c:if>

            <c:if test="${param.ram_from==null}">

                <option value="1">1 ГБ</option>
                <option value="2">2 ГБ</option>
                <option value="2">3 ГБ</option>
                <option value="4">4 ГБ</option>
                <option value="6">6 ГБ</option>
                <option value="8">8 ГБ</option>
                <option value="12">12 ГБ</option>
                <option value="16">16 ГБ</option>
                <option value="32">32 ГБ</option>
            </c:if>


        </select>
            До:<select class="form-control" name="ram_to">

            <c:if test="${param.ram_to!=null}">

                <c:forEach var="ram" items="${ram_capacity}">
                    <c:if test="${ram==param.ram_to}">
                        <option value="${ram}" selected>${ram} ГБ</option>
                    </c:if>
                    <c:if test="${ram!=param.ram_to}">

                        <option value="${ram}">${ram} ГБ</option>
                    </c:if>
                </c:forEach>
            </c:if>

            <c:if test="${param.ram_to==null}">

                <option value="1">1 ГБ</option>
                <option value="2">2 ГБ</option>
                <option value="2">3 ГБ</option>
                <option value="4">4 ГБ</option>
                <option value="6">6 ГБ</option>
                <option value="8">8 ГБ</option>
                <option value="12">12 ГБ</option>
                <option value="16">16 ГБ</option>
                <option value="32" selected>32 ГБ</option>
            </c:if>


        </select>

            <br>
            <div> <b>Цена</b></div><hr>





                От:<input class="form-control" value="${param.price_from}" name="price_from" type="number" min="1"/>




                    До:<input class="form-control" value="${param.price_to}" name="price_to" type="number" min="1"/><br>


            <center> <button class="btn btn-secondary" type="submit">Подобрать</button></center>
        </form>
    </div>

</div>
