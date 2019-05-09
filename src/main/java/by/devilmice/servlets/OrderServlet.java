package by.devilmice.servlets;

import by.devilmice.dao.NotebookDAO;
import by.devilmice.dao.OrderDAO;
import by.devilmice.dao.UserDAO;
import by.devilmice.model.NotebookEntity;
import by.devilmice.model.OrdersEntity;
import by.devilmice.model.UsersEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@WebServlet(name = "OrderServlet")
public class OrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(request.getParameter("id"));
        String fio = request.getParameter("fio");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String comment = request.getParameter("comment");
        OrdersEntity ordersEntity = new OrdersEntity();
        ordersEntity.setFio(fio);
        ordersEntity.setAddress(address);
        ordersEntity.setPhone(phone);
        ordersEntity.setComment(comment);
        ordersEntity.setStatus("Обработка");
        HttpSession ses = request.getSession();
        int user_id = (int) ses.getAttribute("user_id");
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        ordersEntity.setDate(dateFormat.format(date));
        NotebookEntity notebook = new NotebookEntity();
        NotebookDAO nd = new NotebookDAO();
        notebook =  nd.getById(id);
        ordersEntity.setNotebookEntity(notebook);

        UsersEntity usersEntity = new UsersEntity();
        UserDAO ud = new UserDAO();
        usersEntity =  ud.getById((Integer) ses.getAttribute("user_id"));
        ordersEntity.setUsersEntity(usersEntity);

        OrderDAO od = new OrderDAO();
        od.add(ordersEntity);

        ses.setAttribute("alert", 1);
        ses.setAttribute("alert_type", "alert-success");
        ses.setAttribute("alert_mess", "Заказ отправлен на обработку!");
        response.sendRedirect("/order");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        OrderDAO od = new OrderDAO();
        HttpSession ses = request.getSession();

        if(request.getParameter("id")==null) {
            ArrayList<OrdersEntity> orderList;
            orderList = od.getAllByUserId((Integer) ses.getAttribute("user_id"));
            request.setAttribute("orderList", orderList);

            request.setAttribute("content_value", "order_page");
            request.getRequestDispatcher("1.jsp").forward(request, response);


        } else {
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("content_value", "order_add");
            NotebookDAO nd = new NotebookDAO();
            NotebookEntity notebook = nd.getById(id);

            request.setAttribute("n", notebook);
            request.getRequestDispatcher("1.jsp").forward(request, response);
        }

    }
}
