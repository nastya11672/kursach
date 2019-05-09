package by.devilmice.servlets;

import by.devilmice.dao.UserDAO;
import by.devilmice.model.UsersEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "AuthServlet")
public class AuthServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        HttpSession ses = request.getSession();

        UserDAO ud = new UserDAO();
        int flagAuth = ud.auth(login,password);
        if(flagAuth == 1) {
            UsersEntity user = ud.getByLoginPassword(login,password);
            ses.setAttribute("auth", 1);
            ses.setAttribute("user_role", user.getRole());
            ses.setAttribute("user_name", user.getLogin());
            ses.setAttribute("user_email", user.getEmail());
            ses.setAttribute("user_id", user.getId());
            response.sendRedirect("/");

        } else {
            ses.setAttribute("alert", 1);
            ses.setAttribute("alert_type", "alert-warning");
            ses.setAttribute("alert_mess", "Неверный логин или пароль!!!");
            response.sendRedirect("/");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession ses = request.getSession();

        ses.setAttribute("auth", 0);

        response.sendRedirect("/");

    }
}
