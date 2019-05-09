<%@ page contentType="text/html;charset=utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1 class="my-4"  >
    <small>Добавление ноутбука</small>
</h1>

<div class="card mb-4">
    <div class="card-body">
        <form action="/admin/notebook/" method="post" enctype="multipart/form-data">

            <h4>Общая информация</h4><hr>
            <input type="hidden" name="action" value="add"/>
            <div class="form-group">
                <label>Название модели ноутбука</label>
                <input type="text" class="form-control" name="title" required maxlength="255">
            </div>
            <div class="form-group">
                <label>Дата выхода на рынок </label>
                <select class="form-control" name="release_date" required>
                    <option value="2017">2017</option>
                    <option value="2018">2018</option>
                    <option value="2019">2019</option>
                </select>
            </div>

            <div class="form-group">
                <label>Производтель</label>
                <select class="form-control" name="vendor" required>
                    <option value="Acer">Acer</option>
                    <option value="Asus">Asus</option>
                    <option value="Apple">Apple</option>
                    <option value="HP">HP</option>
                    <option value="Lenovo">Lenovo</option>
                    <option value="Xiaomi">Xiaomi</option>
                </select>
            </div>

            <div class="form-group">
                <label>Тип</label>
                <select class="form-control" name="type">
                    <option value="Классический">классический</option>
                    <option value="Игровой">игровой</option>
                    <option value="Ультрабук">ультрабук</option>
                    <option value="Рабочие станции">рабочие станции</option>
                    <option value="Нетбуки">нетбуки</option>
                </select>
            </div>

            <div class="form-group">
                <label>Тип</label>
                <select class="form-control" name="assigned" required>
                    <option value="для дома">для дома</option>
                    <option value="для работы">для работы</option>
                </select>
            </div>
            <h4>Процессор</h4><hr>
            <div class="form-group">
                <label>Платформа</label>
                <input type="text" class="form-control" name="platform" required maxlength="50">
            </div>

            <div class="form-group">
                <label>Процессор</label>
                <select class="form-control" name="processor" required>
                    <option value="Core i3">Intel Core i3</option>
                    <option value="Core i5">Intel Core i5</option>
                    <option value="Core i7">Intel Core i7</option>
                    <option value="Intel Pentium">Intel Pentium</option>
                    <option value="Intel Celeron">Intel Celeron</option>
                </select>
            </div>

            <div class="form-group">
                <label>Модель процессора</label>
                <input type="text" class="form-control" name="processor_model" required maxlength="255">
            </div>

            <div class="form-group">
                <label>Количество ядер</label>
                <input type="number" class="form-control" name="count_cores" value="2" min="1" max="100" required>
            </div>

            <div class="form-group">
                <label>Тактовая частота</label>
                <input type="number" class="form-control" name="clock_frequency"  min="1" max="10000" required>
            </div>


            <div class="form-group">
                <label>Турбо частота</label>
                <input type="number" class="form-control" name="turbo_frequency" min="1" max="10000" required>
            </div>

            <div class="form-group">
                <label>Энергопотребление процессора (TDP) </label>
                <input type="number" class="form-control" name="tdp" min="1" max="500" required>
            </div>

            <div class="form-group">
                <label>Встроенная в процессор графика</label>
                <input type="text" class="form-control" name="bgp" required>
            </div>
            <h4>Конструкция</h4><hr>
            <div class="form-group">
                <label>Материал корпуса</label>
                <select class="form-control" name="body_material" required>
                    <option value="пластик">пластик</option>
                    <option value="метал">метал</option>
                    <option value="керамика">керамика</option>
                </select>
            </div>

            <div class="form-group">
                <label>Цвет корпуса</label>
                <input type="text" class="form-control" name="body_color" required maxlength="255">
            </div>

            <div class="form-group">
                <label>Материал крышки</label>
                <select class="form-control" name="cover_material" required>
                    <option value="пластик">пластик</option>
                    <option value="метал">метал</option>
                    <option value="кожа">кожа</option>
                </select>
            </div>

            <div class="form-group">
                <label>Цвет крышки</label>
                <input type="text" class="form-control" name="cover_color" required maxlength="255">
            </div>


            <div class="form-group">
                <label>Пыле-, влаго-, ударопрочность</label>
                <select class="form-control" name="resistance" required>
                    <option value="нет">нет</option>
                    <option value="да">да</option>
                </select>
            </div>

            <h4>Размеры и вес</h4><hr>
            <div class="form-group">
                <label>Ширина</label>
                <input type="number" class="form-control" name="width" min="1" max="10000" step="0.1" required>
            </div>

            <div class="form-group">
                <label>Глубина</label>
                <input type="number" class="form-control" name="depth" min="1" max="10000" step="0.1" required>
            </div>

            <div class="form-group">
                <label>Толщина</label>
                <input type="number" class="form-control" name="thickness" min="1" max="10000" step="0.1" required>
            </div>

            <div class="form-group">
                <label>Вес</label>
                <input type="number" class="form-control" name="weight" min="1" max="10000" step="0.1" required>
            </div>


            <h4>Экран</h4><hr>
            <div class="form-group">
                <label>Диагональ экрана</label>
                <input type="number" class="form-control" name="screen_diagonal"  min="6" max="50"  step="0.1"required>
            </div>


            <div class="form-group">
                <label>Разрешние экрана</label>
                <select class="form-control" name="screen_resolution" required>
                    <option value="1024x600">1024 x 600</option>
                    <option value="1280x800">1280 x 800</option>
                    <option value="1366x768">1366 x 768</option>
                    <option value="1440x900">1440 x 900</option>
                    <option value="1600x900">1600 x 900</option>
                    <option value="1920x1080">1920 x 1080</option>
                    <option value="1920x1200">1920 x 1200</option>
                    <option value="2160x1440">2160 x 1440</option>
                    <option value="2650x1440">2560 x 1440</option>
                    <option value="2256x1504">2256 x 1504</option>
                    <option value="2304x1440">2304 x 1440</option>
                    <option value="2560x1600">2560 x 1600</option>
                    <option value="2880x1800">2880 x 1800</option>
                    <option value="3000x2000">3000 x 2000</option>
                    <option value="3200x1800">3200 x 1800</option>
                    <option value="3840x2160">3840 x 2160</option>
                </select>
            </div>


            <div class="form-group">
                <label>Частота экрана</label>
                <select class="form-control" name="screen_frequency" required>
                    <option value="60">60</option>
                    <option value="120">120</option>
                    <option value="144">144</option>
                </select>
            </div>


            <div class="form-group">
                <label>Технология экрана</label>
                <select class="form-control" name="screen_technology" required>
                    <option value="TN+Film">TN+Film</option>
                    <option value="IPS">IPS</option>
                </select>
            </div>

            <div class="form-group">
                <label>Поверхность экрана</label>
                <select class="form-control" name="screen_surface" required>
                    <option value="глянцевая">глянцевая</option>
                    <option value="матовая">матовая</option>
                </select>
            </div>


            <div class="form-group">
                <label>Сенсорный экран</label>
                <select class="form-control" name="touch_screen" required>
                    <option value="нет">нет</option>
                    <option value="да">да</option>
                </select>
            </div>

            <h4>Оперативная память</h4><hr>
            <div class="form-group">
                <label>Оперативная память</label>
                <select class="form-control" name="ram_type" required>
                    <option value="DDR3">DDR3</option>
                    <option value="DDR4">DDR4</option>
                </select>
            </div>

            <div class="form-group">
                <label>Частота памяти</label>
                <input type="number" class="form-control" name="ram_frequency" min="1000" max="10000" required>
            </div>

            <div class="form-group">
                <label>Объем памяти</label>
                <input type="number" class="form-control" name="capacity_ram" min="1" max="256" required>
            </div>
            <div class="form-group">
                <label>Максимальный объем памяти</label>
                <input type="number" class="form-control" name="max_capacity_ram" min="1" max="256" required>
            </div>

            <div class="form-group">
                <label>Количество слотов памяти</label>
                <input type="number" class="form-control" name="count_slot_ram" min="1" max="16" required>
            </div>
            <h4>Хранение данных</h4><hr>
            <div class="form-group">
                <label>Конфигурация накопителя</label>
                <select class="form-control" name="type_drive" required>
                    <option value="HDD">HDD</option>
                    <option value="SSD">SSD</option>
                    <option value="SSD+HDD">SSD+HDD</option>
                </select>
            </div>

            <div class="form-group">
                <label>Ёмкость накопителя HDD</label>
                <input type="number" class="form-control" name="capacitydrivehdd" min="0" max="20000" required >
            </div>

            <div class="form-group">
                <label>Ёмкость накопителя SSD</label>
                <input type="number" class="form-control" name="capacitydrivessd" min="0" max="20000" required>
            </div>

            <div class="form-group">
                <label>Оптический привод (ODD)</label>
                <select class="form-control" name="odd" required>
                    <option value="нет">нет</option>
                    <option value="да">да</option>
                </select>
            </div>

            <div class="form-group">
                <label>Карты памяти</label>
                <input type="text" class="form-control" name="card_slot" required maxlength="255" required>
            </div>

            <h4>Графика</h4><hr>
            <div class="form-group">
                <label>Дискретная графика</label>
                <select class="form-control" name="discrete_graphics" required>
                    <option value="нет">нет</option>
                    <option value="да">да</option>
                </select>
            </div>

            <div class="form-group">
                <label>Графический адаптер</label>
                <input type="text" class="form-control" name="name_graphics" maxlength="255">
            </div>

            <div class="form-group">
                <label>Локальная видеопамять</label>
                <input type="number" class="form-control" name="capacity_video_memory" min="1" max="24">
            </div>

            <h4>Камера и звук</h4><hr>
            <div class="form-group">
                <label>Встроенная камера</label>
                <select class="form-control" name="built_camera" required>
                    <option value="нет">нет</option>
                    <option value="да">да</option>
                </select>
            </div>
            <div class="form-group">
                <label>Количество пикселей камеры</label>
                <input type="number" class="form-control" name="camera_pixels"  min="0" max="100">
            </div>
            <div class="form-group">
                <label>Встроенный микрофон</label>
                <select class="form-control" name="built_mic" required>
                    <option value="нет">нет</option>
                    <option value="да">да</option>
                </select>
            </div>
            <div class="form-group">
                <label>Встроенные динамики</label>
                <input type="text" class="form-control" name="built_sound" required maxlength="255">
            </div>

            <h4>Клавиатура и тачпад</h4><hr>

            <div class="form-group">
                <label>Цифровое поле (Numpad)</label>
                <select class="form-control" name="numpad" required>
                    <option value="нет">нет</option>
                    <option value="да">да</option>
                </select>
            </div>

            <div class="form-group">
                <label>Подсветка клавиатуры</label>
                <select class="form-control" name="keypboard_illum" required>
                    <option value="нет">нет</option>
                    <option value="да">да</option>
                </select>
            </div>

            <div class="form-group">
                <label>Заводская «кириллица» на клавишах</label>
                <select class="form-control" name="cyrillic_keys" required>
                    <option value="нет">нет</option>
                    <option value="да">да</option>
                </select>
            </div>

            <div class="form-group">
                <label>Управление курсором</label>
                <input type="text" class="form-control" name="cursor_control" maxlength="255" required>
            </div>


            <h4>Функции</h4><hr>
            <div class="form-group">
                <label>Сканер отпечатков пальцев</label>
                <select class="form-control" name="finger_scanner" required>
                    <option value="нет">нет</option>
                    <option value="нет">да</option>
                </select>
            </div>

            <div class="form-group">
                <label>Поддержка SIM-карт</label>
                <select class="form-control" name="sim_card" required>
                    <option value="нет">нет</option>
                    <option value="да">да</option>
                </select>
            </div>

            <h4>Интерфейсы</h4><hr>

            <div class="form-group">
                <label>NFC</label>
                <select class="form-control" name="nfc" required>
                    <option value="нет">нет</option>
                    <option value="да">да</option>
                </select>
            </div>

            <div class="form-group">
                <label>Bluetooth</label>
                <input type="text" class="form-control" name="bt" maxlength="255" required>
            </div>

            <div class="form-group">
                <label>LAN</label>
                <select class="form-control" name="lan" required>
                    <option value="нет">нет</option>
                    <option value="10 Мбит">10 Мбит</option>
                    <option value="100 Мбит">100 Мбит</option>
                    <option value="1 Гбит">1 Гбит</option>
                </select>
            </div>

            <div class="form-group">
                <label>WiFi</label>
                <input type="text" class="form-control" name="wifi" maxlength="255" required>
            </div>

            <div class="form-group">
                <label>Всего USB-портов</label>
                <input type="number" class="form-control" name="count_usb" min="0" max="24" required>
            </div>

            <div class="form-group">
                <label>USB 2.0</label>
                <input type="number" class="form-control" name="usb20" min="0" max="24" required>
            </div>

            <div class="form-group">
                <label>USB 3.0</label>
                <input type="number" class="form-control" name="usb30" min="0" max="24" required>
            </div>

            <div class="form-group">
                <label>USB 3.1 Type-A</label>
                <input type="number" class="form-control" name="usb31_typea" min="0" max="24" required>
            </div>

            <div class="form-group">
                <label>USB 3.1 Type-C</label>
                <input type="number" class="form-control" name="usb31_typec" min="0" max="24" required>
            </div>


            <div class="form-group">
                <label>VGA</label>
                <select class="form-control" name="vga" required>
                    <option value="нет">нет</option>
                    <option value=да">да</option>

                </select>
            </div>

            <div class="form-group">
                <label>HDMI</label>
                <select class="form-control" name="hdmi" required>
                    <option value="нет">нет</option>
                    <option value=да">да</option>

                </select>
            </div>


            <div class="form-group">
                <label>DisplayPort </label>
                <select class="form-control" name="displayport" required>
                    <option value=нет">нет</option>
                    <option value="да">да</option>

                </select>
            </div>

            <div class="form-group">
                <label>Thunderbolt</label>
                <select class="form-control" name="thunderbolt" required>
                    <option value=нет">нет</option>
                    <option value="да">да</option>
                </select>
            </div>

            <div class="form-group">
                <label>Аудио выходы (3.5 мм jack)</label>
                <input type="text" class="form-control" name="audio_in" maxlength="255" required>
            </div>
            <h4>Аккумулятор и время работы</h4><hr>
            <div class="form-group">
                <label>Количество ячеек аккумулятора</label>
                <input type="number" class="form-control" name="count_cell" min="1" max="24" required>
            </div>
            <div class="form-group">
                <label>Запас энергии</label>
                <input type="number" class="form-control" name="energy_reserv" min="1" max="500" required>
            </div>
            <h4>Комплектация</h4><hr>
            <div class="form-group">
                <label>Операционная система</label>
                <input type="text" class="form-control" name="os" required>
            </div>

            <div class="form-group">
                <label>Комплект поставки</label>
                <input type="text" class="form-control" name="delivery_set" required>
            </div>

            <hr>

            <div class="form-group">
                <h4>Цена</h4>
                <input type="number" class="form-control" name="price" min="1" max="100000" required>
            </div>

            <hr>
            <h4>Изображения</h4>

            <input type="file" name="imgs"  multiple required/>
            <hr>
            <div class="form-group">
                <button class="btn btn-primary" id="submit" type="submit">Добавить</button>
            </div>
        </form>
    </div>
</div>