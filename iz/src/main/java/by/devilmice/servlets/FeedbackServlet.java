package by.devilmice.servlets;

import by.devilmice.utils.Utils;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

@WebServlet(name = "by.devilmice.servlets.FeedbackServlet")
public class FeedbackServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String description = request.getParameter("description");


        String fromEmail = "shopdevil@mail.ru"; //requires valid gmail id
        String password = "An123456"; // correct password for gmail id
        String toEmail = "kadio9365@gmail.com";

        System.out.println("TLSEmail Start");
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.mail.ru"); //SMTP Host
        props.put("mail.smtp.port", "465"); //TLS Port
        props.put("mail.smtp.auth", "true"); //enable authentication
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        //create Authenticator object to pass in Session.getInstance argument
        Authenticator auth = new Authenticator() {
            //override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };
        Session session = Session.getInstance(props, auth);
        Utils u = new Utils();
      u.sendEmail(session, toEmail,"Обращение от " + name,  "Email отправителя: " + email  + " " + description,fromEmail);
        HttpSession ses = request.getSession();

        ses.setAttribute("alert", 1);
        ses.setAttribute("alert_type", "alert-success");
        ses.setAttribute("alert_mess", "Ваше обращение было отправлено администрации проекта и в скором времени получите ответ указанный Email!");
        response.sendRedirect("/feedback");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.setAttribute("content_value", "feedback_page");

        request.getRequestDispatcher("1.jsp").forward(request, response);
    }



}
