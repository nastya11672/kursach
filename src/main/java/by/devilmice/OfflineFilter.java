package by.devilmice;

import by.devilmice.dao.SettingsDAO;
import by.devilmice.model.SettingsEntity;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "OfflineFilter")
public class OfflineFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        HttpSession session = req.getSession();

        SettingsDAO sd = new SettingsDAO();
        SettingsEntity settings = new SettingsEntity();
        settings = sd.getSettings();
        if(settings.getOffline()==1) {
            if ((session.getAttribute("auth") != null) && ((Integer) session.getAttribute("auth") == 1)) {

                if ((Integer) session.getAttribute("user_role") != 1) {
                    res.sendRedirect("/offline");

                } else {
                    chain.doFilter(request, response);
                }
            } else {
                res.sendRedirect("/offline");

            }
        } else {
            chain.doFilter(request, response);

        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
