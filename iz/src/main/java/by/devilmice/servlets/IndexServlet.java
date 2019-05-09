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

@WebServlet(name = "IndexServlet")
public class IndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        //Категории на страницу



        String[] vendors = request.getParameterValues("vendor");
        String processor = request.getParameter("processor");
        String[] year = request.getParameterValues("year");
        String ram_from = request.getParameter("ram_from");
        String ram_to = request.getParameter("ram_to");
        String price_from = request.getParameter("price_from");
        String price_to = request.getParameter("price_to");
        NotebookDAO nd = new NotebookDAO();
        ArrayList<NotebookEntity> notebookList = null;

        if((vendors==null) && (processor==null) && (year==null) && (ram_from==null) && (ram_to==null) && (price_from==null) && (price_to==null)){
           notebookList = nd.getAll();
        } else{
           notebookList = nd.find(vendors,processor,year,ram_from,ram_to,price_from,price_to);

        }


        request.setAttribute("notebookList", notebookList);


        request.setAttribute("content_value", "index_page");


        request.getRequestDispatcher("/1.jsp").forward(request, response);

    }
}
