package by.devilmice.servlets;

import by.devilmice.dao.NotebookDAO;
import by.devilmice.model.NotebookEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "NotebookServlet")
public class NotebookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("content_value", "notebook_show");
        NotebookDAO nd = new NotebookDAO();
        NotebookEntity notebook = nd.getById(id);

        request.setAttribute("n", notebook);
        request.getRequestDispatcher("1.jsp").forward(request, response);
    }
}
