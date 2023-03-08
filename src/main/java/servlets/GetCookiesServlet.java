package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class GetCookiesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();

        PrintWriter pw = resp.getWriter();
        pw.println("<html>");
        for (Cookie cookie: cookies)
        {
         pw.println("<h1>" + cookie.getName()+ " : "+ cookie.getValue() + "</h1>" );
        }
        pw.println("</html>");


    }
}

