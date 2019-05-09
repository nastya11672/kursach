package by.devilmice.servlets;

import by.devilmice.dao.UserDAO;
import by.devilmice.model.UsersEntity;
import org.hibernate.Session;
import org.omg.CORBA.UserException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ProfileServlet")
public class ProfileServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        HttpSession ses = request.getSession();
        int id = Integer.parseInt(request.getParameter("id"));
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        if((password.length()>0) && (password.length()<6)){
            ses.setAttribute("alert", 1);
            ses.setAttribute("alert_type", "alert-warning");
            ses.setAttribute("alert_mess", "Внимание! Пароль должен содержать минимум 6 символов!");

            response.sendRedirect("/profile?id=" + id);
        } else {


        ses.setAttribute("alert", 1);
        ses.setAttribute("alert_type", "alert-success");
        ses.setAttribute("alert_mess", "Данные успешно изменены!");

            UserDAO ud = new UserDAO();
        ud.profileChange(email,password, id);
        response.sendRedirect("/profile?id=" + id);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession ses = request.getSession();
        if(ses.getAttribute("auth") == null) {
            response.sendRedirect("404");

        } else {


            if (Integer.parseInt(String.valueOf(ses.getAttribute("auth")))==1 ) {

                int id = Integer.parseInt(request.getParameter("id"));
                UsersEntity user = new UsersEntity();
                UserDAO ud = new UserDAO();
                user = ud.getById(id);


                request.setAttribute("user", user);
                request.setAttribute("content_value", "profile_page");

                request.getRequestDispatcher("1.jsp").forward(request, response);
            } else {
                response.sendRedirect("404");

            }
        }
    }
}
