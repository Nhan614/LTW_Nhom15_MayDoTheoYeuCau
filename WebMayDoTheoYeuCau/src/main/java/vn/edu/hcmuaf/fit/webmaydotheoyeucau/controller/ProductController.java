package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controller;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.ProductService;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Product;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductController", value = "/products")
public class ProductController extends HttpServlet {
    private ProductService productService;

    @Override
    public void init() {
        productService = new ProductService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type"); // Lấy loại sản phẩm từ tham số URL
        List<Product> products = productService.getAllProducts();
        request.setAttribute("products", products);

        switch (type) {
            case "vestCongSo":
                request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                break;
            case "vestThuongNgay":
                request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                break;
            case "vestXanh":
                request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                break;
            case "vestNau":
                request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                break;
            case "vestXam":
                request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                break;
            case "aoSoMi":
                request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                break;
            case "aoPolo":
                request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                break;
            case "aoKhoacNgoai":
                request.getRequestDispatcher("/aoKhoacNgoai.jsp").forward(request, response);
                break;
            case "blazers":
                request.getRequestDispatcher("/blazers.jsp").forward(request, response);
                break;
            case "quanAu":
                request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                break;
            case "quanChino":
                request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                break;
            case "quanNi":
                request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                break;
            case "caVat":
                request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                break;
            case "khanChoang":
                request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                break;
            case "thatLung":
                request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                break;
            default:
                response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // Lấy dữ liệu từ form
            String productName = request.getParameter("productName");
            String priceString = request.getParameter("price");
            String image = request.getParameter("image");
            String description = request.getParameter("description");
            String stateString = request.getParameter("state");
            String checkCollectionString = request.getParameter("checkCollection");
            String categoryIDString = request.getParameter("categoryID");
            String maker = request.getParameter("maker"); // Thêm maker

            // Kiểm tra dữ liệu null hoặc trống
            if (productName == null || productName.trim().isEmpty() ||
                    priceString == null || priceString.trim().isEmpty() ||
                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
                    maker == null || maker.trim().isEmpty()) {
                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
                return;
            }

            // Chuyển đổi dữ liệu
            double price = Double.parseDouble(priceString);
            boolean state = Boolean.parseBoolean(stateString);
            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
            int categoryID = Integer.parseInt(categoryIDString);

            // Tạo đối tượng sản phẩm mới
            Product newProduct = new Product(0, productName, price, image, state, description, checkCollection, categoryID, maker);

            // Gọi service để thêm sản phẩm
            boolean success = productService.addProduct(newProduct);

            // Xử lý kết quả
            if (success) {
                response.sendRedirect("products");
            } else {
                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
            }
        } catch (NumberFormatException e) {
            // Xử lý lỗi định dạng số
            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
        } catch (Exception e) {
            // Xử lý các lỗi khác
            e.printStackTrace();
            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
        }
    }

}
