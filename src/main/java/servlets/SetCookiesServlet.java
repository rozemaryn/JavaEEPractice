package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;

public class SetCookiesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie1 = new Cookie("id", "123");
        Cookie cookie2 = new Cookie("name", "Tom");
        cookie1.setMaxAge(24 * 60 * 60 );
        cookie2.setMaxAge(24 * 60 * 60 );

        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
    }
}
