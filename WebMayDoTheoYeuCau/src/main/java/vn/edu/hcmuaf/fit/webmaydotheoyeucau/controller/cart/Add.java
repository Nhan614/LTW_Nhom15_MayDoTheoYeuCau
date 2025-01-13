package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controller.cart;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.CartDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.ProductDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Product;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.ProductCart;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.CartService;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.ProductService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "Add", value = "/addCart")
public class Add extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lay id tu trang detail
        int id = -1;
        String pid = request.getParameter("id");
        if (!pid.isBlank()) {
            id = Integer.parseInt(pid);
        }
        // Lấy dữ liệu từ form
        String fabric = request.getParameter("fabric");
        String collar = request.getParameter("collar");
        String pocket = request.getParameter("pocket");
        String button = request.getParameter("button");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String chest = request.getParameter("chest");
        String shirtLength = request.getParameter("shirtLength");
        String sleeveLength = request.getParameter("sleeveLength");
        String shoulderWidth = request.getParameter("shoulderWidth");

        double price = -1;
        try {
            price = Double.parseDouble(request.getParameter("price"));
        } catch (NumberFormatException e) {
            response.sendRedirect("showCart");
        }

        HttpSession session = request.getSession(true);
        Map<Integer, ProductCart> cart = (Map<Integer, ProductCart>) session.getAttribute("cart");
        if (cart == null) {
            cart = new HashMap<Integer, ProductCart>();
        }

        ProductCart pro;
        ProductDao productDao = new ProductDao();
        CartService cartService = new CartService();
        if (id != -1) {
            boolean added = false;
            for (Map.Entry<Integer, ProductCart> entry : cart.entrySet()) {
                ProductCart value = entry.getValue();
                if (value.getId() == id) {
                    value.setQuantity(value.getQuantity() + 1);
                    value.setPrice(value.getPrice() * value.getQuantity());
                    added = true;
                }
            }
            if(!added) {
                Product p = productDao.getProductById(id);
                pro = cartService.convert(p, 1);
                cart.put(cart.size() + 1, pro);
            }
        } else {
            pro = new ProductCart();
            CartDao cartDao = new CartDao();
            pro.setName("Đồ đặt may");
            pro.setImage("resources/images/vai4.jpg");
            pro.setQuantity(1);
            pro.setPrice(cartDao.getPriceByMaterials(fabric, collar, pocket, button));
            cart.put(cart.size() + 1, pro);
        }

        session.setAttribute("fabric", fabric);
        session.setAttribute("collar", collar);
        session.setAttribute("pocket", pocket);
        session.setAttribute("button", button);
        session.setAttribute("name", name);
        session.setAttribute("email", email);
        session.setAttribute("chest", chest);
        session.setAttribute("shirtLength", shirtLength);
        session.setAttribute("sleeveLength", sleeveLength);
        session.setAttribute("shoulderWidth", shoulderWidth);


        session.setAttribute("cart", cart);

        response.sendRedirect("showCart");
    }
}