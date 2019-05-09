<%@ page contentType="text/html;charset=utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

    <div class="card mt-4">

    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">

        </ol>
        <div class="carousel-inner" role="listbox">
            <c:set var="flag"  value="0" />
            <c:forEach var="img" items="${n.notebookImagesList}" >

                <c:if test="${flag != 0}">
                    <div class="carousel-item">
                        <img class="d-block img-fluid" src="${img.src}" width="900" height="350" alt="${n.title}">
                    </div>
                    <c:set var="flag"  value="1" />

                </c:if>

                <c:if test="${flag == 0}">
                    <div class="carousel-item active">
                        <img class="d-block img-fluid" src="${img.src}" alt="${n.title}">
                    </div>
                    <c:set var="flag"  value="1" />

                </c:if>


            </c:forEach>




        </div>
        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>


        <div class="card-body">
            <h3 class="card-title"><c:out value="${n.title}"/></h3>
            <h4 class="text-center">Цена: <c:out value="${n.price}"/> BYN</h4>
        </div>




        <table class="table">
            <thead class="thead-light">
            <tr>
                <th colspan="2">Общая информация</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td width="50%">Дата выхода на рынок</td>
                <td><c:out value="${n.releaseDate}"/></td>

            </tr>

            <tr>
                <td width="50%">Тип</td>
                <td><c:out value="${n.type}"/></td>
            </tr>

            <tr>
                <td width="50%">Назначение</td>
                <td><c:out value="${n.assigned}"/></td>
            </tr>

            <thead class="thead-light">
            <tr>
                <th colspan="2">Процессор</th>
            </tr>
            </thead>

            <tr>
                <td width="50%">Платформа (кодовое название)</td>
                <td><c:out value="${n.platform}"/></td>
            </tr>

            <tr>
                <td width="50%">Модель процессора</td>
                <td><c:out value="${n.processorModel}"/></td>
            </tr>

            <tr>
                <td width="50%">Количество ядер</td>
                <td><c:out value="${n.countCores}"/></td>
            </tr>

            <tr>
                <td width="50%">Тактовая частота</td>
                <td><c:out value="${n.clockFrequency}"/> МГц</td>
            </tr>


            <tr>
                <td width="50%">Turbo-частота</td>
                <td><c:out value="${n.turboFrequency}"/> МГц</td>
            </tr>

            <tr>
                <td width="50%">Энергопотребление процессора (TDP)</td>
                <td><c:out value="${n.tdp}"/> Вт</td>
            </tr>


            <tr>
                <td width="50%">Встроенная в процессор графика</td>
                <td><c:out value="${n.bgp}"/></td>
            </tr>

            <thead class="thead-light">
            <tr>
                <th colspan="2">Конструкция</th>
            </tr>
            </thead>
            <tr>
                <td width="50%">Материал корпуса</td>
                <td><c:out value="${n.bodyMaterial}"/></td>
            </tr>

            <tr>
                <td width="50%">Цвет корпуса</td>
                <td><c:out value="${n.bodyColor}"/></td>
            </tr>

            <tr>
                <td width="50%">Материал крышки</td>
                <td><c:out value="${n.coverMaterial}"/></td>
            </tr>

            <tr>
                <td width="50%">Цвет крышки</td>
                <td><c:out value="${n.coverColor}"/></td>
            </tr>

            <tr>
                <td width="50%">Пыле-, влаго-, ударопрочность</td>
                <td><c:out value="${n.resistance}"/></td>
            </tr>

            <thead class="thead-light">
            <tr>
                <th colspan="2">Размер и вес</th>
            </tr>
            </thead>
            <tr>
                <td width="50%">Ширина</td>
                <td><c:out value="${n.width}"/> мм</td>
            </tr>

            <tr>
                <td width="50%">Глубина</td>
                <td><c:out value="${n.depth}"/> мм</td>
            </tr>

            <tr>
                <td width="50%">Толщина</td>
                <td><c:out value="${n.thickness}"/> мм</td>
            </tr>

            <tr>
                <td width="50%">Вес</td>
                <td><c:out value="${n.weight}"/> гр</td>
            </tr>

            <thead class="thead-light">
            <tr>
                <th colspan="2">Экран</th>
            </tr>
            </thead>

            <tr>
                <td width="50%">Диагональ экрана</td>
                <td><c:out value="${n.screenDiagonal}"/></td>
            </tr>

            <tr>
                <td width="50%">Разрешение экрана</td>
                <td><c:out value="${n.screenResolution}"/></td>
            </tr>

            <tr>
                <td width="50%">Частота матрицы</td>
                <td><c:out value="${n.screenFrequency}"/> Гц</td>
            </tr>

            <tr>
                <td width="50%">Технология экрана</td>
                <td><c:out value="${n.screenTechnology}"/></td>
            </tr>

            <tr>
                <td width="50%">Поверхность экрана</td>
                <td><c:out value="${n.screenSurface}"/></td>
            </tr>

            <tr>
                <td width="50%">Сенсорный экран</td>
                <td><c:out value="${n.touchScreen}"/></td>
            </tr>

            <thead class="thead-light">
            <tr>
                <th colspan="2">Оперативная память</th>
            </tr>
            </thead>

            <tr>
                <td width="50%">Тип оперативной памяти</td>
                <td><c:out value="${n.ramType}"/></td>
            </tr>

            <tr>
                <td width="50%">Частота оперативной памяти</td>
                <td><c:out value="${n.ramFrequency}"/> МГц</td>
            </tr>

            <tr>
                <td width="50%">Объем оперативной памяти</td>
                <td><c:out value="${n.capacityRam}"/> ГБ</td>
            </tr>

            <tr>
                <td width="50%">Максимальный объём памяти</td>
                <td><c:out value="${n.maxCapacityRam}"/> ГБ</td>
            </tr>

            <tr>
                <td width="50%">Количество слотов памяти</td>
                <td><c:out value="${n.countSlotRam}"/></td>
            </tr>

            <thead class="thead-light">
            <tr>
                <th colspan="2">Хранение данных</th>
            </tr>
            </thead>

            <tr>
                <td width="50%">Тип накопителя</td>
                <td><c:out value="${n.typeDrive}"/></td>
            </tr>

            <c:if test="${((n.typeDrive==\"HDD\") || (n.typeDrive==\"SSD+HDD\")) }">

                <tr>
                    <td width="50%">Ёмкость HDD</td>
                    <td><c:out value="${n.capacitydrivehdd}"/> ГБ</td>
                </tr>

            </c:if>


            <c:if test="${((n.typeDrive==\"SSD\") || (n.typeDrive==\"SSD+HDD\")) }">

                <tr>
                    <td width="50%">Ёмкость SSD</td>
                    <td><c:out value="${n.capacitydrivessd}"/> ГБ</td>
                </tr>

            </c:if>
            <tr>
                <td width="50%">Оптический привод (ODD)</td>
                <td><c:out value="${n.odd}"/></td>
            </tr>

            <tr>
                <td width="50%">Карты памяти</td>
                <td><c:out value="${n.cardSlot}"/></td>
            </tr>

            <thead class="thead-light">
            <tr>
                <th colspan="2">Графика</th>
            </tr>
            </thead>

            <tr>
                <td width="50%">Дискретная графика</td>
                <td><c:out value="${n.discreteGraphics}"/></td>
            </tr>

            <c:if test="${n.discreteGraphics==\"да\"}">
                <tr>
                    <td width="50%">Графический адаптер</td>
                    <td><c:out value="${n.nameGraphics}"/></td>
                </tr>

                <tr>
                    <td width="50%">Локальная видеопамять</td>
                    <td><c:out value="${n.capacityVideoMemory}"/> ГБ</td>
                </tr>
            </c:if>


            <thead class="thead-light">
            <tr>
                <th colspan="2">Камера и звук</th>
            </tr>
            </thead>

            <tr>
                <td width="50%">Встроенная камера</td>
                <td><c:out value="${n.builtCamera}"/></td>
            </tr>

            <tr>
                <td width="50%">Количество пикселей камеры</td>
                <td><c:out value="${n.cameraPixels}"/> Мп</td>
            </tr>

            <tr>
                <td width="50%">Встроенный микрофон</td>
                <td><c:out value="${n.builtMic}"/></td>
            </tr>

            <tr>
                <td width="50%">Встроенные динамики</td>
                <td><c:out value="${n.builtSound}"/></td>
            </tr>

            <thead class="thead-light">
            <tr>
                <th colspan="2">Клавиатура и тачпад</th>
            </tr>
            </thead>

            <tr>
                <td width="50%">Цифровое поле (Numpad)</td>
                <td><c:out value="${n.numpad}"/></td>
            </tr>

            <tr>
                <td width="50%">Подсветка клавиатуры</td>
                <td><c:out value="${n.keypboardIllum}"/></td>
            </tr>

            <tr>
                <td width="50%">Заводская «кириллица» на клавишах</td>
                <td><c:out value="${n.cyrillicKeys}"/></td>
            </tr>

            <tr>
                <td width="50%">Управление курсором</td>
                <td><c:out value="${n.cursorControl}"/></td>
            </tr>

            <thead class="thead-light">
            <tr>
                <th colspan="2">Функции</th>
            </tr>
            </thead>

            <tr>
                <td width="50%">Сканер отпечатков пальцев</td>
                <td><c:out value="${n.fingerScanner}"/></td>
            </tr>

            <tr>
                <td width="50%">Поддержка SIM-карт</td>
                <td><c:out value="${n.simCard}"/></td>
            </tr>

            <thead class="thead-light">
            <tr>
                <th colspan="2">Интерфейсы</th>
            </tr>
            </thead>

            <tr>
                <td width="50%">NFC</td>
                <td><c:out value="${n.nfc}"/></td>
            </tr>

            <tr>
                <td width="50%">Bluetooth</td>
                <td><c:out value="${n.bt}"/></td>
            </tr>

            <tr>
                <td width="50%">LAN</td>
                <td><c:out value="${n.lan}"/></td>
            </tr>

            <tr>
                <td width="50%">WiFi</td>
                <td><c:out value="${n.wifi}"/></td>
            </tr>

            <tr>
                <td width="50%">Всего USB-портов</td>
                <td><c:out value="${n.countUsb}"/> штук</td>
            </tr>

            <tr>
                <td width="50%">USB 2.0</td>
                <td><c:out value="${n.usb20}"/> штук</td>
            </tr>

            <tr>
                <td width="50%">USB 3.0</td>
                <td><c:out value="${n.usb30}"/> штук</td>
            </tr>

            <tr>
                <td width="50%">USB 3.1 Type-A</td>
                <td><c:out value="${n.usb31Typea}"/> штук</td>
            </tr>


            <tr>
                <td width="50%">USB 3.1 Type-C</td>
                <td><c:out value="${n.usb31Typec}"/> штук</td>
            </tr>

            <tr>
                <td width="50%">VGA (RGB)</td>
                <td><c:out value="${n.vga}"/></td>
            </tr>

            <tr>
                <td width="50%">HDMI</td>
                <td><c:out value="${n.hdmi}"/></td>
            </tr>

            <tr>
                <td width="50%">DisplayPort</td>
                <td><c:out value="${n.displayport}"/></td>
            </tr>

            <tr>
                <td width="50%">Thunderbolt</td>
                <td><c:out value="${n.thunderbolt}"/></td>
            </tr>

            <tr>
                <td width="50%">Аудио выходы (3.5 мм jack)</td>
                <td><c:out value="${n.audioIn}"/></td>
            </tr>

            <thead class="thead-light">
            <tr>
                <th colspan="2">Аккумулятор</th>
            </tr>
            </thead>

            <tr>
                <td width="50%">Количество ячеек аккумулятора</td>
                <td><c:out value="${n.countCell}"/> штук</td>
            </tr>

            <tr>
                <td width="50%">Запас энергии</td>
                <td><c:out value="${n.energyReserv}"/> Вт</td>
            </tr>

            <thead class="thead-light">
            <tr>
                <th colspan="2">Комплектация</th>
            </tr>
            </thead>

            <tr>
                <td width="50%">Операционная система</td>
                <td><c:out value="${n.os}"/></td>
            </tr>

            <tr>
                <td width="50%">Комплект поставки</td>
                <td><c:out value="${n.deliverySet}"/></td>
            </tr>

            </tbody>
        </table>
    </div>


    <!-- /.card -->
