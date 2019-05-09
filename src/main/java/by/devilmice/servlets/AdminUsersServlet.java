package by.devilmice.servlets;

import by.devilmice.dao.NewsDAO;
import by.devilmice.dao.UserDAO;
import by.devilmice.model.NewsEntity;
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

@WebServlet(name = "AdminUsersServlet")
public class AdminUsersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDAO ud = new UserDAO();
        HttpSession ses = request.getSession();

        if(request.getParameter("action").equals("delete")==true) {
            System.out.println("DELETE");
            String[] listDel = request.getParameterValues("del");
            Session session = HibernateSessionFactory.getSessionFactory().openSession();

            for(String itemDel: listDel) {
                ud.delete(Integer.parseInt(itemDel));
            }
            ses.setAttribute("alert", 1);
            ses.setAttribute("alert_type", "alert-success");
            ses.setAttribute("alert_mess", "Выбранные пользователи удалены!");

            response.sendRedirect("/admin/user");

        }



        if(request.getParameter("action").equals("add")==true) {

            String login = request.getParameter("login");
            String password = request.getParameter("password");
            String email = request.getParameter("email");
            int role = Integer.parseInt(request.getParameter("role"));

            UsersEntity userEntity = new UsersEntity();
            userEntity.setLogin(login);
            userEntity.setPassword(password);
            userEntity.setEmail(email);
            userEntity.setRole(role);
            if(ud.checkLogin(login)==0) {
                ud.add(userEntity);
                ses.setAttribute("alert", 1);
                ses.setAttribute("alert_type", "alert-success");
                ses.setAttribute("alert_mess", "Пользователь успешно добавлен!");

                response.sendRedirect("/admin/user");
            } else {
                ses.setAttribute("alert", 1);
                ses.setAttribute("alert_type", "alert-warning");
                ses.setAttribute("alert_mess", "Пользователь с таким логином уже существует!");

                response.sendRedirect("/admin/user?action=add");
            }

        }

        if(request.getParameter("action").equals("edit")==true) {

            String login = request.getParameter("login");
            String password = request.getParameter("password");
            String email = request.getParameter("email");
            int id = Integer.parseInt(request.getParameter("id"));
            int role = Integer.parseInt(request.getParameter("role"));

            UsersEntity userEntity = new UsersEntity();
            userEntity.setLogin(login);
            userEntity.setPassword(password);
            userEntity.setEmail(email);
            userEntity.setId(id);
            userEntity.setRole(role);

            if(ud.checkLogin(login)==0) {
                ud.edit(userEntity);
                ses.setAttribute("alert", 1);
                ses.setAttribute("alert_type", "alert-success");
                ses.setAttribute("alert_mess", "Данные успешно изменены!");

                response.sendRedirect("/admin/user?action=edit&id=" + userEntity.getId());
            } else {

                ses.setAttribute("alert", 1);
                ses.setAttribute("alert_type", "alert-warning");
                ses.setAttribute("alert_mess", "Пользователь с таким логином уже существует!");
                response.sendRedirect("/admin/user?action=edit&id=" + userEntity.getId());

            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        UserDAO ud = new UserDAO();

        if(action==null){
            request.setAttribute("content_value", "user_index");

            ArrayList<UsersEntity> usersList = new ArrayList<UsersEntity>();
            usersList = ud.getAll();

            request.setAttribute("usersList", usersList);

            request.getRequestDispatcher("/2.jsp").forward(request, response);

        } else {

            if (action.equals("add") == true) {
                request.setAttribute("content_value", "user_add");
                request.getRequestDispatcher("/2.jsp").forward(request, response);

            }


            if (action.equals("edit") == true) {
                int id = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("content_value", "user_edit");
                UsersEntity user;
                user = ud.getById(id);
                request.setAttribute("user", user);

                request.getRequestDispatcher("/2.jsp").forward(request, response);

            }
        }
    }
}
