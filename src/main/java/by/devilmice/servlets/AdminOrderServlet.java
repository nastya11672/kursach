package by.devilmice.servlets;

import by.devilmice.dao.OrderDAO;
import by.devilmice.model.OrdersEntity;
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

@WebServlet(name = "by.devilmice.servlets.AdminOrderServlet")
public class AdminOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        OrderDAO od = new OrderDAO();
        HttpSession ses = request.getSession();

        if(request.getParameter("action").equals("delete")==true) {
            String[] listDel = request.getParameterValues("del");
            Session session = HibernateSessionFactory.getSessionFactory().openSession();
            for(String itemDel: listDel) {
                od.delete(Integer.parseInt(itemDel));
            }
            ses.setAttribute("alert", 1);
            ses.setAttribute("alert_type", "alert-success");
            ses.setAttribute("alert_mess", "Выбранные заказы удалены!");

            response.sendRedirect("/admin/order");

        }

        if(request.getParameter("action").equals("edit")==true) {
            int id = Integer.parseInt(request.getParameter("id"));
            System.out.println("ID = " + id);
            String fio = request.getParameter("fio");
            String address = request.getParameter("address");
            String phone = request.getParameter("phone");
            String comment = request.getParameter("comment");
            String status = request.getParameter("status");

            OrdersEntity ordersEntity = new OrdersEntity();
            ordersEntity.setFio(fio);
            ordersEntity.setAddress(address);
            ordersEntity.setPhone(phone);
            ordersEntity.setComment(comment);
            ordersEntity.setId(id);

            ordersEntity.setStatus(status);
            od.edit(ordersEntity);


            ses.setAttribute("alert", 1);
            ses.setAttribute("alert_type", "alert-success");
            ses.setAttribute("alert_mess", "Данные успешно изменены!");

            response.sendRedirect("/admin/order?action=edit&id="+id);

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        OrderDAO od = new OrderDAO();

        if(action==null){
            request.setAttribute("content_value", "order_index");

            ArrayList<OrdersEntity> orderList;
            orderList = od.getAll();

            request.setAttribute("orderList", orderList);

            request.getRequestDispatcher("/2.jsp").forward(request, response);

        } else {


            if (action.equals("edit") == true) {
                int id = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("content_value", "order_edit");
                OrdersEntity order;
                order = od.getById(id);
                request.setAttribute("order", order);
                request.getRequestDispatcher("/2.jsp").forward(request, response);
            }
        }
    }
}
