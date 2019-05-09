package by.devilmice.servlets;

import by.devilmice.dao.NewsDAO;
import by.devilmice.model.NewsEntity;
import by.devilmice.utils.HibernateSessionFactory;
import org.hibernate.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@WebServlet(name = "AdminNewsServlet")
@MultipartConfig
public class AdminNewsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        HttpSession ses = request.getSession();

        if(request.getParameter("action").equals("delete")==true) {
            System.out.println("DELETE");
            String[] listDel = request.getParameterValues("del");
            Session session = HibernateSessionFactory.getSessionFactory().openSession();
            NewsDAO nd = new NewsDAO();
            for(String itemDel: listDel) {
                nd.delete(Integer.parseInt(itemDel));
            }
            ses.setAttribute("alert", 1);
            ses.setAttribute("alert_type", "alert-success");
            ses.setAttribute("alert_mess", "Выбранные новости удалены!");
            response.sendRedirect("/admin/news");

        }

        if(request.getParameter("action").equals("add")==true) {
            Part part = request.getPart("img");

            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String extension = getFileExtension(part.getSubmittedFileName());

            String timeFile = timestamp.getTime() + "." + extension;
            String fileName  = this.getServletContext().getRealPath("/uploads/")+timeFile;
            part.write(fileName);
            String title = request.getParameter("title");
            String story = request.getParameter("story");

            NewsEntity newsEntity = new NewsEntity();
            newsEntity.setTitle(title);
            newsEntity.setStory(story);
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            newsEntity.setDate(dateFormat.format(date));

            if(part!=null){
                newsEntity.setImg("/uploads/"+timeFile);
            }

            NewsDAO nd = new NewsDAO();
            nd.add(newsEntity);
            ses.setAttribute("alert", 1);
            ses.setAttribute("alert_type", "alert-success");
            ses.setAttribute("alert_mess", "Новость успешно добавлена!");

            response.sendRedirect("/admin/news");

        }


        if(request.getParameter("action").equals("edit")==true) {
            Part part = request.getPart("img");

            String title = request.getParameter("title");
            String story = request.getParameter("story");
            String imgOld = request.getParameter("img_old");
            int id = Integer.parseInt(request.getParameter("id"));
            NewsEntity newsEntity = new NewsEntity();
            newsEntity.setTitle(title);
            newsEntity.setStory(story);
            newsEntity.setId(id);
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            newsEntity.setDate(dateFormat.format(date));

            if(part.getSize()!=0) {
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                String extension = getFileExtension(part.getSubmittedFileName());

                String timeFile = timestamp.getTime() + "." + extension;
                String fileName = this.getServletContext().getRealPath("/uploads/") + timeFile;
                part.write(fileName);

                newsEntity.setImg("/uploads/"+timeFile);
                File file = new File(this.getServletContext().getRealPath(imgOld));
                file.delete();
            } else {
                newsEntity.setImg(imgOld);

            }



            NewsDAO nd = new NewsDAO();
            nd.edit(newsEntity);
            ses.setAttribute("alert", 1);
            ses.setAttribute("alert_type", "alert-success");
            ses.setAttribute("alert_mess", "Данные успешно изменены!");
            response.sendRedirect("/admin/news?action=edit&id="+newsEntity.getId());

        }





    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        NewsDAO nd = new NewsDAO();

        if(action==null){
            request.setAttribute("content_value", "news_index");

            ArrayList<NewsEntity> newsList = new ArrayList<NewsEntity>();
            newsList = nd.getAll();

            request.setAttribute("newsList", newsList);

            request.getRequestDispatcher("/2.jsp").forward(request, response);

        } else {

            if (action.equals("add") == true) {
                request.setAttribute("content_value", "news_add");
                request.getRequestDispatcher("/2.jsp").forward(request, response);
                response.sendRedirect("/admin/news");
            }


            if (action.equals("edit") == true) {
                int id = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("content_value", "news_edit");
                NewsEntity news;
                news = nd.getById(id);
                request.setAttribute("news", news);

                request.getRequestDispatcher("/2.jsp").forward(request, response);
            }
        }

    }



    private static String getFileExtension(String fileName) {

        // если в имени файла есть точка и она не является первым символом в названии файла
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            // то вырезаем все знаки после последней точки в названии файла, то есть ХХХХХ.txt -> txt
            return fileName.substring(fileName.lastIndexOf(".")+1);
            // в противном случае возвращаем заглушку, то есть расширение не найдено
        else return "";
    }

}
