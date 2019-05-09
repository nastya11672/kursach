package by.devilmice.servlets;

import by.devilmice.dao.SettingsDAO;
import by.devilmice.model.SettingsEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "AdminSettingServlet")
public class AdminSettingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        HttpSession ses = request.getSession();

        System.out.println("LOL");
        String title = request.getParameter("title");
        String keywords = request.getParameter("keywords");
        String description = request.getParameter("description");
        int offline = Integer.parseInt(request.getParameter("offline"));

        SettingsEntity se = new SettingsEntity();
        se.setTitle(title);
        se.setKeywords(keywords);
        se.setDescription(description);
        se.setOffline(offline);
        SettingsDAO sd = new SettingsDAO();
        sd.setSettings(se);
        ses.setAttribute("alert", 1);
        ses.setAttribute("alert_type", "alert-success");
        ses.setAttribute("alert_mess", "Настройки успешно изменены!");

        response.sendRedirect("/admin");



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        SettingsDAO sd = new SettingsDAO();
        SettingsEntity s = sd.getSettings();
        request.setAttribute("s", s);
        request.setAttribute("content_value", "setting");
        request.getRequestDispatcher("2.jsp").forward(request, response);

    }
}
