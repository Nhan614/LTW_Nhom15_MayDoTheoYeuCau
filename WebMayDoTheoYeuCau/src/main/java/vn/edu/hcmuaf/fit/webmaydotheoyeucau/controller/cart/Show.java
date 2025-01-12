package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controller.cart;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.ProductCart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@WebServlet(name="ShowCart", value="/showCart")
public class Show extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        Map<Integer, ProductCart> cart = (Map<Integer, ProductCart>) session.getAttribute("cart");
        if (cart == null) {
            cart = new HashMap<Integer, ProductCart>();
        }
        List<ProductCart> cartList = new ArrayList<ProductCart>();
        cart.forEach((key, value) -> {
            cartList.add(value);
        });
        request.setAttribute("cart", cartList);
        request.getRequestDispatcher("cart.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
