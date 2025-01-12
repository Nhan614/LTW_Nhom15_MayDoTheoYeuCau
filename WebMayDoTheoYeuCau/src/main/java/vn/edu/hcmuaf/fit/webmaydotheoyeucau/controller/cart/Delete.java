package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controller.cart;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.ProductCart;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Delete", value = "/deleteCart")
public class Delete extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = -1;
        try {
            id = Integer.parseInt(request.getParameter("id"));
        } catch (NumberFormatException e) {
            response.sendRedirect("showCart");
        }

        HttpSession session = request.getSession(true);
        Map<Integer, ProductCart> cart = (Map<Integer, ProductCart>) session.getAttribute("cart");
        if(cart == null){
            cart = new HashMap<Integer, ProductCart>();
        }

        for(Map.Entry<Integer, ProductCart> entry : cart.entrySet()){
            ProductCart car = entry.getValue();
            if(car.getId() == id){
                cart.remove(entry.getKey());
            }
        }
        session.setAttribute("cart",cart);
        response.sendRedirect("showCart");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
}