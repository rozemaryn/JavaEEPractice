package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class Cart extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        logic.Cart cart = (logic.Cart) session.getAttribute("cart");

        String name = req.getParameter("name");
        int quantity = Integer.parseInt(req.getParameter("quantity"));

        if (cart == null) {
            cart = new logic.Cart();

            cart.setName(name);
            cart.setQuantity(quantity);
        }

        session.setAttribute("cart", cart);

        getServletContext().getRequestDispatcher("/showCart.jsp").forward(req, resp);

    }
}
