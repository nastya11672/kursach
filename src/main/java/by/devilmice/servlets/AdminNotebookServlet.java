package by.devilmice.servlets;

import by.devilmice.dao.NotebookDAO;
import by.devilmice.model.NotebookEntity;
import by.devilmice.model.NotebookImagesEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(name = "AdminNotebookServlet")
@MultipartConfig
public class AdminNotebookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        HttpSession ses = request.getSession();

        if(request.getParameter("action").equals("add")==true) {

            NotebookEntity  notebook = new NotebookEntity();
            String title = request.getParameter("title");
            int release_date = Integer.parseInt(request.getParameter("release_date"));
            String type = request.getParameter("type");
            String assigned = request.getParameter("assigned");
            String platform = request.getParameter("platform");
            String processor = request.getParameter("processor");
            String processor_model = request.getParameter("processor_model");
            int count_cores = Integer.parseInt(request.getParameter("count_cores"));
            int clock_frequency = Integer.parseInt(request.getParameter("clock_frequency"));
            int turbo_frequency = Integer.parseInt(request.getParameter("turbo_frequency"));
            int tdp = Integer.parseInt(request.getParameter("tdp"));
            String bgp = request.getParameter("bgp");
            String body_material = request.getParameter("body_material");
            String body_color = request.getParameter("body_color");
            String cover_material = request.getParameter("cover_material");
            String cover_color = request.getParameter("cover_color");
            String resistance = request.getParameter("resistance");
            Double width = Double.parseDouble(request.getParameter("width"));
            Double depth = Double.parseDouble(request.getParameter("depth"));
            Double thickness = Double.parseDouble(request.getParameter("thickness"));
            Double weight = Double.parseDouble(request.getParameter("weight"));
            Double screen_diagonal = Double.parseDouble(request.getParameter("screen_diagonal"));
            String screen_resolution = request.getParameter("screen_resolution");
            int screen_frequency = Integer.parseInt(request.getParameter("screen_frequency"));
            String screen_technology = request.getParameter("screen_technology");
            String screen_surface = request.getParameter("screen_surface");
            String touch_screen = request.getParameter("touch_screen");
            String ram_type = request.getParameter("ram_type");
            int ram_frequency = Integer.parseInt(request.getParameter("ram_frequency"));
            int capacity_ram = Integer.parseInt(request.getParameter("capacity_ram"));
            int max_capacity_ram = Integer.parseInt(request.getParameter("max_capacity_ram"));
            int count_slot_ram = Integer.parseInt(request.getParameter("count_slot_ram"));
            String type_drive = request.getParameter("type_drive");
            int capacitydrivehdd = Integer.parseInt(request.getParameter("capacitydrivehdd"));
            int capacitydrivesdd = Integer.parseInt(request.getParameter("capacitydrivessd"));
            String odd = request.getParameter("odd");
            String card_slot = request.getParameter("card_slot");
            String discrete_graphics = request.getParameter("discrete_graphics");
            String name_graphics = request.getParameter("name_graphics");
            int capacity_video_memory = Integer.parseInt(request.getParameter("capacity_video_memory"));
            String built_camera = request.getParameter("built_camera");
            Double camera_pixels = Double.parseDouble(request.getParameter("camera_pixels"));
            String built_mic = request.getParameter("built_mic");
            String built_sound = request.getParameter("built_sound");
            String numpad = request.getParameter("numpad");
            String keypboard_illum = request.getParameter("keypboard_illum");
            String cyrillic_keys = request.getParameter("cyrillic_keys");
            String cursor_control = request.getParameter("cursor_control");
            String finger_scanner = request.getParameter("finger_scanner");
            String sim_card = request.getParameter("sim_card");
            String nfc = request.getParameter("nfc");
            String bt = request.getParameter("bt");
            String lan = request.getParameter("lan");
            String wifi = request.getParameter("wifi");
            int count_usb = Integer.parseInt(request.getParameter("count_usb"));
            int usb20 = Integer.parseInt(request.getParameter("usb20"));
            int usb30 = Integer.parseInt(request.getParameter("usb30"));
            int usb31_typea = Integer.parseInt(request.getParameter("usb31_typea"));
            int usb31_typec = Integer.parseInt(request.getParameter("usb31_typec"));
            String vga = request.getParameter("vga");
            String hdmi = request.getParameter("hdmi");
            String displayport = request.getParameter("displayport");
            String thunderbolt = request.getParameter("thunderbolt");
            String audio_in = request.getParameter("audio_in");
            int count_cell = Integer.parseInt(request.getParameter("count_cell"));
            int energy_reserv = Integer.parseInt(request.getParameter("energy_reserv"));
            String os = request.getParameter("os");
            String delivery_set = request.getParameter("delivery_set");
            int price = Integer.parseInt(request.getParameter("price"));
            String vendor = request.getParameter("vendor");

            notebook.setTitle(title);
            notebook.setReleaseDate(release_date);
            notebook.setType(type);
            notebook.setVendor(vendor);
            notebook.setAssigned(assigned);
            notebook.setPlatform(platform);
            notebook.setProcessor(processor);
            notebook.setProcessorModel(processor_model);
            notebook.setCountCores(count_cores);
            notebook.setClockFrequency(clock_frequency);
            notebook.setTurboFrequency(turbo_frequency);
            notebook.setTdp(tdp);
            notebook.setBgp(bgp);
            notebook.setBodyMaterial(body_material);
            notebook.setBodyColor(body_color);
            notebook.setCoverMaterial(cover_material);
            notebook.setCoverColor(cover_color);
            notebook.setResistance(resistance);
            notebook.setWidth(width);
            notebook.setDepth(depth);
            notebook.setThickness(thickness);
            notebook.setWeight(weight);
            notebook.setScreenDiagonal(screen_diagonal);
            notebook.setScreenResolution(screen_resolution);
            notebook.setScreenFrequency(screen_frequency);
            notebook.setScreenTechnology(screen_technology);
            notebook.setScreenSurface(screen_surface);
            notebook.setTouchScreen(touch_screen);
            notebook.setRamType(ram_type);
            notebook.setRamFrequency(ram_frequency);
            notebook.setCapacityRam(capacity_ram);
            notebook.setMaxCapacityRam(max_capacity_ram);
            notebook.setCountSlotRam(count_slot_ram);
            notebook.setTypeDrive(type_drive);
            notebook.setCapacitydrivehdd(capacitydrivehdd);
            notebook.setCapacitydrivessd(capacitydrivesdd);
            notebook.setOdd(odd);
            notebook.setCardSlot(card_slot);
            notebook.setDiscreteGraphics(discrete_graphics);
            notebook.setNameGraphics(name_graphics);
            notebook.setCapacityVideoMemory(capacity_video_memory);
            notebook.setBuiltCamera(built_camera);
            notebook.setCameraPixels(camera_pixels);
            notebook.setBuiltMic(built_mic);
            notebook.setBuiltSound(built_sound);
            notebook.setNumpad(numpad);
            notebook.setKeypboardIllum(keypboard_illum);
            notebook.setCyrillicKeys(cyrillic_keys);
            notebook.setCursorControl(cursor_control);
            notebook.setFingerScanner(finger_scanner);
            notebook.setSimCard(sim_card);
            notebook.setNfc(nfc);
            notebook.setBt(bt);
            notebook.setLan(lan);
            notebook.setWifi(wifi);
            notebook.setCountUsb(count_usb);
            notebook.setUsb20(usb20);
            notebook.setUsb30(usb30);
            notebook.setUsb31Typea(usb31_typea);
            notebook.setUsb31Typec(usb31_typec);
            notebook.setVga(vga);
            notebook.setHdmi(hdmi);
            notebook.setDisplayport(displayport);
            notebook.setThunderbolt(thunderbolt);
            notebook.setAudioIn(audio_in);
            notebook.setCountCell(count_cell);
            notebook.setEnergyReserv(energy_reserv);
            notebook.setOs(os);
            notebook.setDeliverySet(delivery_set);
            notebook.setPrice(price);

            ArrayList<NotebookImagesEntity> notebookImagesEntityArrayList = new ArrayList<NotebookImagesEntity>();


            List<Part> parts = request.getParts().stream().
                    filter(part->"imgs".equals(part.getName())).collect(Collectors.
                    toList());
            for (int i = 0; i<parts.size();i++){
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                String extension = getFileExtension(parts.get(i).getSubmittedFileName());
                String timeFile = timestamp.getTime() + "." + extension;

                String fileName  = this.getServletContext().getRealPath("/uploads/")+timeFile;
                parts.get(i).write(fileName);
                timeFile = "/uploads/"+timeFile;
                NotebookImagesEntity notebookImage = new NotebookImagesEntity();
                notebookImage.setSrc(timeFile);
                notebookImage.setNotebookEntity(notebook);
                notebookImagesEntityArrayList.add(notebookImage);
            }

            if(parts.size()>0){

                notebook.setNotebookImagesList(notebookImagesEntityArrayList);

            }
            NotebookDAO nd = new NotebookDAO();
            nd.add(notebook);
            ses.setAttribute("alert", 1);
            ses.setAttribute("alert_type", "alert-success");
            ses.setAttribute("alert_mess", "Ноутбук успешно добавлен!");
            response.sendRedirect("/admin/notebook");


        }




        if(request.getParameter("action").equals("delete")==true) {
            String[] listDel = request.getParameterValues("del");
            NotebookDAO nd = new NotebookDAO();
            for(String itemDel: listDel) {
                nd.delete(Integer.parseInt(itemDel));
            }
            ses.setAttribute("alert", 1);
            ses.setAttribute("alert_type", "alert-success");
            ses.setAttribute("alert_mess", "Выбранные ноутбуки удалены!");
            response.sendRedirect("/admin/notebook");

        }


        if(request.getParameter("action").equals("edit")==true) {
            NotebookImagesDAO nid = new NotebookImagesDAO();

            NotebookEntity  notebook = new NotebookEntity();
            int id = Integer.parseInt(request.getParameter("id"));
            int count_image = Integer.parseInt(request.getParameter("count_image"));

            String title = request.getParameter("title");
            int release_date = Integer.parseInt(request.getParameter("release_date"));
            String type = request.getParameter("type");
            String assigned = request.getParameter("assigned");
            String platform = request.getParameter("platform");
            String processor = request.getParameter("processor");
            String processor_model = request.getParameter("processor_model");
            int count_cores = Integer.parseInt(request.getParameter("count_cores"));
            int clock_frequency = Integer.parseInt(request.getParameter("clock_frequency"));
            int turbo_frequency = Integer.parseInt(request.getParameter("turbo_frequency"));
            int tdp = Integer.parseInt(request.getParameter("tdp"));
            String bgp = request.getParameter("bgp");
            String body_material = request.getParameter("body_material");
            String body_color = request.getParameter("body_color");
            String cover_material = request.getParameter("cover_material");
            String cover_color = request.getParameter("cover_color");
            String resistance = request.getParameter("resistance");
            Double width = Double.parseDouble(request.getParameter("width"));
            Double depth = Double.parseDouble(request.getParameter("depth"));
            Double thickness = Double.parseDouble(request.getParameter("thickness"));
            Double weight = Double.parseDouble(request.getParameter("weight"));
            Double screen_diagonal = Double.parseDouble(request.getParameter("screen_diagonal"));
            String screen_resolution = request.getParameter("screen_resolution");
            int screen_frequency = Integer.parseInt(request.getParameter("screen_frequency"));
            String screen_technology = request.getParameter("screen_technology");
            String screen_surface = request.getParameter("screen_surface");
            String touch_screen = request.getParameter("touch_screen");
            String ram_type = request.getParameter("ram_type");
            int ram_frequency = Integer.parseInt(request.getParameter("ram_frequency"));
            int capacity_ram = Integer.parseInt(request.getParameter("capacity_ram"));
            int max_capacity_ram = Integer.parseInt(request.getParameter("max_capacity_ram"));
            int count_slot_ram = Integer.parseInt(request.getParameter("count_slot_ram"));
            String type_drive = request.getParameter("type_drive");
            int capacitydrivehdd = Integer.parseInt(request.getParameter("capacitydrivehdd"));
            int capacitydrivesdd = Integer.parseInt(request.getParameter("capacitydrivessd"));
            String odd = request.getParameter("odd");
            String card_slot = request.getParameter("card_slot");
            String discrete_graphics = request.getParameter("discrete_graphics");
            String name_graphics = request.getParameter("name_graphics");
            int capacity_video_memory = Integer.parseInt(request.getParameter("capacity_video_memory"));
            String built_camera = request.getParameter("built_camera");
            Double camera_pixels = Double.parseDouble(request.getParameter("camera_pixels"));
            String built_mic = request.getParameter("built_mic");
            String built_sound = request.getParameter("built_sound");
            String numpad = request.getParameter("numpad");
            String keypboard_illum = request.getParameter("keypboard_illum");
            String cyrillic_keys = request.getParameter("cyrillic_keys");
            String cursor_control = request.getParameter("cursor_control");
            String finger_scanner = request.getParameter("finger_scanner");
            String sim_card = request.getParameter("sim_card");
            String nfc = request.getParameter("nfc");
            String bt = request.getParameter("bt");
            String lan = request.getParameter("lan");
            String wifi = request.getParameter("wifi");
            int count_usb = Integer.parseInt(request.getParameter("count_usb"));
            int usb20 = Integer.parseInt(request.getParameter("usb20"));
            int usb30 = Integer.parseInt(request.getParameter("usb30"));
            int usb31_typea = Integer.parseInt(request.getParameter("usb31_typea"));
            int usb31_typec = Integer.parseInt(request.getParameter("usb31_typec"));
            String vga = request.getParameter("vga");
            String hdmi = request.getParameter("hdmi");
            String displayport = request.getParameter("displayport");
            String thunderbolt = request.getParameter("thunderbolt");
            String audio_in = request.getParameter("audio_in");
            int count_cell = Integer.parseInt(request.getParameter("count_cell"));
            int energy_reserv = Integer.parseInt(request.getParameter("energy_reserv"));
            String os = request.getParameter("os");
            String delivery_set = request.getParameter("delivery_set");
            int price = Integer.parseInt(request.getParameter("price"));
            String vendor = request.getParameter("vendor");


            notebook.setTitle(title);
            notebook.setReleaseDate(release_date);
            notebook.setType(type);
            notebook.setVendor(vendor);
            notebook.setAssigned(assigned);
            notebook.setPlatform(platform);
            notebook.setProcessor(processor);
            notebook.setProcessorModel(processor_model);
            notebook.setCountCores(count_cores);
            notebook.setClockFrequency(clock_frequency);
            notebook.setTurboFrequency(turbo_frequency);
            notebook.setTdp(tdp);
            notebook.setBgp(bgp);
            notebook.setBodyMaterial(body_material);
            notebook.setBodyColor(body_color);
            notebook.setCoverMaterial(cover_material);
            notebook.setCoverColor(cover_color);
            notebook.setResistance(resistance);
            notebook.setWidth(width);
            notebook.setDepth(depth);
            notebook.setThickness(thickness);
            notebook.setWeight(weight);
            notebook.setScreenDiagonal(screen_diagonal);
            notebook.setScreenResolution(screen_resolution);
            notebook.setScreenFrequency(screen_frequency);
            notebook.setScreenTechnology(screen_technology);
            notebook.setScreenSurface(screen_surface);
            notebook.setTouchScreen(touch_screen);
            notebook.setRamType(ram_type);
            notebook.setRamFrequency(ram_frequency);
            notebook.setCapacityRam(capacity_ram);
            notebook.setMaxCapacityRam(max_capacity_ram);
            notebook.setCountSlotRam(count_slot_ram);
            notebook.setTypeDrive(type_drive);
            notebook.setCapacitydrivehdd(capacitydrivehdd);
            notebook.setCapacitydrivessd(capacitydrivesdd);
            notebook.setOdd(odd);
            notebook.setCardSlot(card_slot);
            notebook.setDiscreteGraphics(discrete_graphics);
            notebook.setNameGraphics(name_graphics);
            notebook.setCapacityVideoMemory(capacity_video_memory);
            notebook.setBuiltCamera(built_camera);
            notebook.setCameraPixels(camera_pixels);
            notebook.setBuiltMic(built_mic);
            notebook.setBuiltSound(built_sound);
            notebook.setNumpad(numpad);
            notebook.setKeypboardIllum(keypboard_illum);
            notebook.setCyrillicKeys(cyrillic_keys);
            notebook.setCursorControl(cursor_control);
            notebook.setFingerScanner(finger_scanner);
            notebook.setSimCard(sim_card);
            notebook.setNfc(nfc);
            notebook.setBt(bt);
            notebook.setLan(lan);
            notebook.setWifi(wifi);
            notebook.setCountUsb(count_usb);
            notebook.setUsb20(usb20);
            notebook.setUsb30(usb30);
            notebook.setUsb31Typea(usb31_typea);
            notebook.setUsb31Typec(usb31_typec);
            notebook.setVga(vga);
            notebook.setHdmi(hdmi);
            notebook.setDisplayport(displayport);
            notebook.setThunderbolt(thunderbolt);
            notebook.setAudioIn(audio_in);
            notebook.setCountCell(count_cell);
            notebook.setEnergyReserv(energy_reserv);
            notebook.setOs(os);
            notebook.setDeliverySet(delivery_set);
            notebook.setPrice(price);
            notebook.setId(id);
            ArrayList<NotebookImagesEntity> notebookImagesEntityArrayList = new ArrayList<NotebookImagesEntity>();


            List<Part> parts = request.getParts().stream().
                    filter(part->"imgs".equals(part.getName())).collect(Collectors.
                    toList());
            if(parts.get(0).getSize()>0){
                for (int i = 0; i<parts.size();i++){
                    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                    String extension = getFileExtension(parts.get(i).getSubmittedFileName());
                    String timeFile = timestamp.getTime() + "." + extension;

                    String fileName  = this.getServletContext().getRealPath("/uploads/")+timeFile;
                    parts.get(i).write(fileName);

                    NotebookImagesEntity notebookImage = new NotebookImagesEntity();
                    notebookImage.setSrc("/uploads/"+timeFile);
                    notebookImage.setNotebookEntity(notebook);
                    nid.add(notebookImage);

                }





            }


            String[] listDel = new String[0];

            if(request.getParameterValues("del")!=null) {
                listDel = request.getParameterValues("del");
            }

            if((parts.get(0).getSize()==0) && (listDel.length==count_image)){
                ses.setAttribute("alert", 1);
                ses.setAttribute("alert_type", "alert-warning");
                ses.setAttribute("alert_mess", "Должно остаться хотя бы одно изображение!");
                response.sendRedirect("/admin/notebook?action=edit&id="+notebook.getId());
            } else {
                        for (String itemDel : listDel) {
                            NotebookImagesEntity notebookImage = new NotebookImagesEntity();
                            notebookImage = nid.getById(Integer.parseInt(itemDel));
                            File file = new File(this.getServletContext().getRealPath(notebookImage.getSrc()));
                            file.delete();
                            nid.delete(Integer.parseInt(itemDel));
                        }






            NotebookDAO nd = new NotebookDAO();
            nd.edit(notebook);
            ses.setAttribute("alert", 1);
            ses.setAttribute("alert_type", "alert-success");
            ses.setAttribute("alert_mess", "Данные успешно изменены!");
            response.sendRedirect("/admin/notebook?action=edit&id="+notebook.getId());
            }

        }





    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        NotebookDAO nd = new NotebookDAO();

        if(action==null){
            request.setAttribute("content_value", "notebook_index");

            ArrayList<NotebookEntity> notebookList = new ArrayList<NotebookEntity>();
            notebookList = nd.getAll();

            request.setAttribute("notebookList", notebookList);
            request.getRequestDispatcher("/2.jsp").forward(request, response);

        }
        if(action!=null) {

            if (action.equals("add") == true) {
                request.setAttribute("content_value", "notebook_add");
                request.getRequestDispatcher("/2.jsp").forward(request, response);

            }


            if (action.equals("edit") == true) {
                int id = Integer.parseInt(request.getParameter("id"));
                NotebookEntity ne;
                ne = nd.getById(id);
                request.setAttribute("n", ne);
                request.setAttribute("content_value", "notebook_edit");
                request.getRequestDispatcher("/2.jsp").forward(request, response);

            }
        }
    }




    private static String getFileExtension(String fileName) {

        // если в имени файла есть точка и она не является первым символом в названии файла
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            // то вырезаем все знаки после последней точки в названии файла, то есть ХХХХХ.txt -> txt
            return fileName.substring(fileName.lastIndexOf(".")+1);
            // в противном случае возвращаем заглушку, то есть расширение не найдено
        else return "";
    }

}
