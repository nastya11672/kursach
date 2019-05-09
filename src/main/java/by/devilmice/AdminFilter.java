package by.devilmice;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "AdminFilter")
public class AdminFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        HttpSession session = req.getSession();
        session.setAttribute("error_mess","Вы пытаеться получить доступ к недоступному для вас ресурсу!");

        if((session.getAttribute("auth")!=null) &&((Integer)session.getAttribute("auth")==1)) {
            if ((Integer) session.getAttribute("user_role") != 1) {
                res.sendRedirect("/404");

            } else {
                chain.doFilter(request, response);

            }
        }else {
            res.sendRedirect("/404");

        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
