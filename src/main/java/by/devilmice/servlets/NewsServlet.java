package by.devilmice.servlets;

import by.devilmice.dao.NewsDAO;
import by.devilmice.model.NewsEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "NewsServlet")
public class NewsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<NewsEntity> newsList;
        NewsDAO nd = new NewsDAO();
        newsList = nd.getAll();
        request.setAttribute("newsList", newsList);
        request.setAttribute("content_value", "news_page");
        request.getRequestDispatcher("1.jsp").forward(request, response);
    }
}
