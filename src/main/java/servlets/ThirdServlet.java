package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ThirdServlet extends HttpServlet {
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  {
        // resp.sendRedirect("/redirect");

        RequestDispatcher dispatcher = req.getRequestDispatcher("/redirect");
        dispatcher.forward(req, resp);
    }
}
