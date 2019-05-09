<%@ page contentType="text/html;charset=utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1 class="my-4"  >
    <small>Редактирование ноутбука</small>
</h1>

<div class="card mb-4">
    <div class="card-body">
        <form action="/admin/notebook/" method="post" enctype="multipart/form-data">

            <h4>Общая информация</h4><hr>
            <input type="hidden" name="action" value="edit"/>
            <input type="hidden" name="id" value="${n.id}"/>
            <input type="hidden" name="count_image" value="${n.notebookImagesList.size()}"/>

            <div class="form-group">
                <label>Название модели ноутбука</label>
                <input type="text" class="form-control" name="title" value="${n.title}" maxlength="255" required>
            </div>

            <c:set var="optionList">2017,2018,2019</c:set>

            <div class="form-group">
                <label>Дата выхода на рынок </label>
                <select class="form-control" name="release_date"  required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.releaseDate}">

                            <option value="${op}" selected>${op}</option>

                        </c:if>

                        <c:if test="${op!=n.releaseDate}">

                            <option value="${op}">${op}</option>

                        </c:if>
                    </c:forEach>
                </select>
            </div>

            <c:set var="optionList">Acer,Asus,Apple,HP,Lenovo,Xiaomi</c:set>

            <div class="form-group">
                <label>Производтель</label>
                <select class="form-control" name="vendor" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.vendor}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.vendor}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>


            <c:set var="optionList">Классический,Игровой,Ультрабук,Рабочие станции,Нетбуки</c:set>

            <div class="form-group">
                <label>Тип</label>
                <select class="form-control" name="type">
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.type}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.type}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>

            <c:set var="optionList">для дома, для работы</c:set>

            <div class="form-group">
                <label>Тип</label>
                <select class="form-control" name="assigned" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.assigned}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.assigned}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>
            <h4>Процессор</h4><hr>
            <div class="form-group">
                <label>Платформа</label>
                <input type="text" class="form-control" name="platform" value="${n.platform}" required maxlength="50">
            </div>

            <c:set var="optionList">Intel Core i3,Intel Core i5,Intel Core i7,Intel Pentium,Intel Celeron</c:set>

            <div class="form-group">
                <label>Процессор</label>
                <select class="form-control" name="processor" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.processor}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.processor}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>

            <div class="form-group">
                <label>Модель процессора</label>
                <input type="text" class="form-control" name="processor_model" value="${n.processorModel}" required maxlength="255">
            </div>

            <div class="form-group">
                <label>Количество ядер</label>
                <input type="number" class="form-control" name="count_cores" value="${n.countCores}" value="2" min="1" max="100" required>
            </div>

            <div class="form-group">
                <label>Тактовая частота</label>
                <input type="number" class="form-control" name="clock_frequency" value="${n.clockFrequency}"  min="1" max="10000" required>
            </div>


            <div class="form-group">
                <label>Турбо частота</label>
                <input type="number" class="form-control" name="turbo_frequency"  value="${n.turboFrequency}" min="1" max="10000" required>
            </div>

            <div class="form-group">
                <label>Энергопотребление процессора (TDP) </label>
                <input type="number" class="form-control" name="tdp" value="${n.tdp}" min="1" max="500" required>
            </div>

            <div class="form-group">
                <label>Встроенная в процессор графика</label>
                <input type="text" class="form-control" name="bgp" value="${n.bgp}" required>
            </div>
            <h4>Конструкция</h4><hr>
            <div class="form-group">

                <c:set var="optionList">пластик,метал,керамика</c:set>

                <label>Материал корпуса</label>
                <select class="form-control" name="body_material"  required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.bodyMaterial}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.bodyMaterial}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>

            <div class="form-group">
                <label>Цвет корпуса</label>
                <input type="text" class="form-control" name="body_color" value="${n.bodyColor}" required maxlength="255">
            </div>

            <div class="form-group">
                <c:set var="optionList">пластик,метал,кожа</c:set>
                <label>Материал крышки</label>
                <select class="form-control" name="cover_material" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.coverMaterial}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.coverMaterial}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>

            <div class="form-group">
                <label>Цвет крышки</label>
                <input type="text" class="form-control" name="cover_color" value="${n.coverColor}" required maxlength="255">
            </div>

            <c:set var="optionList">нет,да</c:set>

            <div class="form-group">
                <label>Пыле-, влаго-, ударопрочность</label>
                <select class="form-control" name="resistance" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.resistance}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.resistance}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>

            <h4>Размеры и вес</h4><hr>
            <div class="form-group">
                <label>Ширина</label>
                <input type="number" class="form-control" name="width" min="1" max="10000" value="${n.width}" step="0.1" required>
            </div>

            <div class="form-group">
                <label>Глубина</label>
                <input type="number" class="form-control" name="depth" min="1" max="10000" value="${n.depth}" step="0.1" required>
            </div>

            <div class="form-group">
                <label>Толщина</label>
                <input type="number" class="form-control" name="thickness" min="1" max="10000" value="${n.thickness}"  step="0.1"required>
            </div>

            <div class="form-group">
                <label>Вес</label>
                <input type="number" class="form-control" name="weight" min="1" max="10000" value="${n.weight}"  step="0.1"required>
            </div>


            <h4>Экран</h4><hr>
            <div class="form-group">
                <label>Диагональ экрана</label>
                <input type="number" class="form-control" name="screen_diagonal"  min="6" max="50"  value="${n.screenDiagonal}" step="0.1" required>
            </div>


            <div class="form-group">
                <c:set var="optionList">1024x600,1280x800,1366x768,1440x900,1600x900,1920x1080,1920x1200,2160x1440,2650x1440,2256x1504,2304x1440,2560x1600,2880x1800,3000x2000,3200x1800,3840x2160</c:set>

                <label>Разрешние экрана</label>
                <select class="form-control" name="screen_resolution" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.screenResolution}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.screenResolution}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>

            <c:set var="optionList">60,120,144</c:set>

            <div class="form-group">
                <label>Частота экрана</label>
                <select class="form-control" name="screen_frequency" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.screenFrequency}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.screenFrequency}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>

            <c:set var="optionList">TN+Film,IPS</c:set>

            <div class="form-group">
                <label>Технология экрана</label>
                <select class="form-control" name="screen_technology" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.screenTechnology}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.screenTechnology}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>

            <c:set var="optionList">глянцевая,матовая</c:set>

            <div class="form-group">
                <label>Поверхность экрана</label>
                <select class="form-control" name="screen_surface" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.screenSurface}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.screenSurface}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>


            <div class="form-group">
                <c:set var="optionList">нет,да</c:set>

                <label>Сенсорный экран</label>
                <select class="form-control" name="touch_screen" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.touchScreen}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.touchScreen}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>

            <h4>Оперативная память</h4><hr>
            <c:set var="optionList">DDR3,DDR4</c:set>

            <div class="form-group">
                <label>Оперативная память</label>
                <select class="form-control" name="ram_type" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.ramType}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.ramType}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>

            <div class="form-group">
                <label>Частота памяти</label>
                <input type="number" class="form-control" name="ram_frequency" min="1000" max="10000" value="${n.ramFrequency}" required>
            </div>

            <div class="form-group">
                <label>Объем памяти</label>
                <input type="number" class="form-control" name="capacity_ram" min="1" max="256"  value="${n.capacityRam}" required>
            </div>
            <div class="form-group">
                <label>Максимальный объем памяти</label>
                <input type="number" class="form-control" name="max_capacity_ram" min="1" max="256" value="${n.maxCapacityRam}" required>
            </div>

            <div class="form-group">
                <label>Количество слотов памяти</label>
                <input type="number" class="form-control" name="count_slot_ram" min="1" max="16" value="${n.countSlotRam}" required>
            </div>
            <h4>Хранение данных</h4><hr>
            <div class="form-group">

                <c:set var="optionList">HDD,SSD,SSD+HDD</c:set>

                <label>Конфигурация накопителя</label>
                <select class="form-control" name="type_drive" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.typeDrive}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.typeDrive}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>

            <div class="form-group">
                <label>Ёмкость накопителя HDD</label>
                <input type="number" class="form-control" name="capacitydrivehdd" min="10" max="20000" value="${n.capacitydrivehdd}" required >
            </div>

            <div class="form-group">
                <label>Ёмкость накопителя SSD</label>
                <input type="number" class="form-control" name="capacitydrivessd" min="10" max="20000" value="${n.capacitydrivessd}" required>
            </div>

            <c:set var="optionList">нет,да</c:set>

            <div class="form-group">
                <label>Оптический привод (ODD)</label>
                <select class="form-control" name="odd" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.odd}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.odd}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>

            <div class="form-group">
                <label>Карты памяти</label>
                <input type="text" class="form-control" name="card_slot" required maxlength="255" value="${n.cardSlot}"  required>
            </div>

            <c:set var="optionList">нет,да</c:set>

            <h4>Графика</h4><hr>
            <div class="form-group">
                <label>Дискретная графика</label>
                <select class="form-control" name="discrete_graphics" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.discreteGraphics}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.discreteGraphics}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>

            <div class="form-group">
                <label>Графический адаптер</label>
                <input type="text" class="form-control" name="name_graphics" value="${n.nameGraphics}" maxlength="255">
            </div>

            <div class="form-group">
                <label>Локальная видеопамять</label>
                <input type="number" class="form-control" name="capacity_video_memory" value="${n.capacityVideoMemory}" min="1" max="24">
            </div>

            <c:set var="optionList">нет,да</c:set>

            <h4>Камера и звук</h4><hr>
            <div class="form-group">
                <label>Встроенная камера</label>
                <select class="form-control" name="built_camera" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.builtCamera}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.builtCamera}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>
            <div class="form-group">
                <label>Количество пикселей камеры</label>
                <input type="number" class="form-control" name="camera_pixels" value="${n.cameraPixels}"  min="0" max="100">
            </div>
            <div class="form-group">

                <c:set var="optionList">нет,да</c:set>

                <label>Встроенный микрофон</label>
                <select class="form-control" name="built_mic" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.builtMic}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.builtMic}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>
            <div class="form-group">
                <label>Встроенные динамики</label>
                <input type="text" class="form-control" name="built_sound" value="${n.builtSound}" required maxlength="255">
            </div>

            <h4>Клавиатура и тачпад</h4><hr>
            <c:set var="optionList">нет,да</c:set>

            <div class="form-group">
                <label>Цифровое поле (Numpad)</label>
                <select class="form-control" name="numpad" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.numpad}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.numpad}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>

            <div class="form-group">

                <c:set var="optionList">нет,да</c:set>

                <label>Подсветка клавиатуры</label>
                <select class="form-control" name="keypboard_illum" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.keypboardIllum}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.keypboardIllum}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>

            <div class="form-group">
                <c:set var="optionList">нет,да</c:set>

                <label>Заводская «кириллица» на клавишах</label>
                <select class="form-control" name="cyrillic_keys" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.cyrillicKeys}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.cyrillicKeys}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>

            <div class="form-group">
                <label>Управление курсором</label>
                <input type="text" class="form-control" name="cursor_control" value="${n.cursorControl}" maxlength="255" required>
            </div>

            <c:set var="optionList">нет,да</c:set>

            <h4>Функции</h4><hr>
            <div class="form-group">
                <label>Сканер отпечатков пальцев</label>
                <select class="form-control" name="finger_scanner" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.fingerScanner}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.fingerScanner}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>


            <c:set var="optionList">нет,да</c:set>

            <div class="form-group">
                <label>Поддержка SIM-карт</label>
                <select class="form-control" name="sim_card" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.simCard}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.simCard}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>

            <h4>Интерфейсы</h4><hr>
            <c:set var="optionList">нет,да</c:set>

            <div class="form-group">
                <label>NFC</label>
                <select class="form-control" name="nfc" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.nfc}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.nfc}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>

            <div class="form-group">
                <label>Bluetooth</label>
                <input type="text" class="form-control" name="bt" maxlength="255" value="${n.bt}" required>
            </div>

            <div class="form-group">
                <c:set var="optionList">нет,10 Мбит,100 Мбит,1 Гбит</c:set>

                <label>LAN</label>
                <select class="form-control" name="lan" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.lan}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.lan}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>

            <div class="form-group">
                <label>WiFi</label>
                <input type="text" class="form-control" name="wifi" maxlength="255" value="${n.wifi}" required>
            </div>

            <div class="form-group">
                <label>Всего USB-портов</label>
                <input type="number" class="form-control" name="count_usb" min="0" max="24" value="${n.countUsb}" required>
            </div>

            <div class="form-group">
                <label>USB 2.0</label>
                <input type="number" class="form-control" name="usb20" min="0" max="24" value="${n.usb20}" required>
            </div>

            <div class="form-group">
                <label>USB 3.0</label>
                <input type="number" class="form-control" name="usb30" min="0" max="24" value="${n.usb30}" required>
            </div>

            <div class="form-group">
                <label>USB 3.1 Type-A</label>
                <input type="number" class="form-control" name="usb31_typea" min="0" max="24" value="${n.usb31Typea}" required>
            </div>

            <div class="form-group">
                <label>USB 3.1 Type-C</label>
                <input type="number" class="form-control" name="usb31_typec"  value="${n.usb31Typec}" min="0" max="24" required>
            </div>


            <div class="form-group">
                <c:set var="optionList">нет,да</c:set>

                <label>VGA</label>
                <select class="form-control" name="vga" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.vga}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.vga}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>

                </select>
            </div>

            <div class="form-group">
                <label>HDMI</label>
                <c:set var="optionList">нет,да</c:set>

                <select class="form-control" name="hdmi" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.hdmi}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.hdmi}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>


            <div class="form-group">
                <c:set var="optionList">нет,да</c:set>

                <label>DisplayPort </label>
                <select class="form-control" name="displayport" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.displayport}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.displayport}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>

                </select>
            </div>

            <div class="form-group">
                <c:set var="optionList">нет,да</c:set>

                <label>Thunderbolt</label>
                <select class="form-control" name="thunderbolt" required>
                    <c:forEach var="op" items="${optionList}">
                        <c:if test="${op==n.thunderbolt}">
                            <option value="${op}" selected>${op}</option>
                        </c:if>
                        <c:if test="${op!=n.thunderbolt}">
                            <option value="${op}">${op}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </div>

            <div class="form-group">
                <label>Аудио выходы (3.5 мм jack)</label>
                <input type="text" class="form-control" name="audio_in" maxlength="255" value="${n.audioIn}" required>
            </div>
            <h4>Аккумулятор и время работы</h4><hr>
            <div class="form-group">
                <label>Количество ячеек аккумулятора</label>
                <input type="number" class="form-control" name="count_cell" min="1" max="24" value="${n.countCell}" required>
            </div>
            <div class="form-group">
                <label>Запас энергии</label>
                <input type="number" class="form-control" name="energy_reserv" min="1" max="500" value="${n.energyReserv}" required>
            </div>
            <h4>Комплектация</h4><hr>
            <div class="form-group">
                <label>Операционная система</label>
                <input type="text" class="form-control" name="os" value="${n.os}" required>
            </div>

            <div class="form-group">
                <label>Комплект поставки</label>
                <input type="text" class="form-control" name="delivery_set" value="${n.deliverySet}" required>
            </div>

            <hr>

            <div class="form-group">
                <h4>Цена</h4>
                <input type="number" class="form-control" name="price" min="1" max="100000" value="${n.price}" required>
            </div>

            <hr>
            <h4>Изображения</h4>
            <table class="table table-bordered text-center" style="width: 50%" >
                <c:forEach var="img" items="${n.notebookImagesList}">
                    <tr>
                    <td>
                        <a href="${img.src}" target="_blank"> <img src="${img.src}"  height="50%"></a>
                    </td>
                        <td class="text-justify">
                            <input type="checkbox" name="del" value="${img.id}">Удалить

                        </td>
                    </tr>
                </c:forEach>
<small>Выбирите изображения для удаления. ВНИМАНИЕ должно остаться минимум 1 изображение!</small>
            </table>

            <input type="file" name="imgs"  multiple/>
            <hr>
            <div class="form-group">
                <button class="btn btn-primary" id="submit" type="submit">Изминить</button>
            </div>
        </form>
    </div>
</div>