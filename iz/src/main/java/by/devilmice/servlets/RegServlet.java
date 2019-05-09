package by.devilmice.servlets;

import by.devilmice.dao.UserDAO;
import by.devilmice.model.UsersEntity;
import by.devilmice.utils.HibernateSessionFactory;
import org.hibernate.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "by.devilmice.servlets.RegServlet")
public class RegServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        UsersEntity userEntity = new UsersEntity();
        userEntity.setLogin(login);
        userEntity.setPassword(password);
        userEntity.setEmail(email);
        UserDAO ud = new UserDAO();
        HttpSession ses = request.getSession();

        if(ud.checkLogin(login)==0) {
            ud.add(userEntity);
            ses.setAttribute("alert", 1);
            ses.setAttribute("alert_type", "alert-success");
            ses.setAttribute("alert_mess", "Вы успешно зарегистрировались!");
            response.sendRedirect("/");
        }
        else{
            ses.setAttribute("alert", 1);
            ses.setAttribute("alert_type", "alert-warning");
            ses.setAttribute("alert_mess", "Пользователь с таким логином уже существует!");
            response.sendRedirect("/reg");
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Категории на страницу

        request.setAttribute("content_value", "reg");

        request.getRequestDispatcher("1.jsp").forward(request, response);
    }
}
