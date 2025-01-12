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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
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

        if (type == null || type.isEmpty()) {
            // Xử lý cho collection.jsp
            List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
            List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
            List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
            List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

            // Truyền danh sách sản phẩm vào request
            request.setAttribute("vests", vests);
            request.setAttribute("aoSoMi", aoSoMi);
            request.setAttribute("blazers", blazers);
            request.setAttribute("quanAu", quanAu);

            // Điều hướng đến collection.jsp
            request.getRequestDispatcher("/collection.jsp").forward(request, response);
        } else {
            // Xử lý cho các trang sản phẩm cụ thể
            switch (type) {
                case "vestCongSo":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestCongSo.jsp").forward(request, response);
                    break;

                case "vestThuongNgay":
                    request.setAttribute("products", productService.getProductsByCategoryId(2));
                    request.getRequestDispatcher("/vestThuongNgay.jsp").forward(request, response);
                    break;

                case "vestXanh":
                    request.setAttribute("products", productService.getProductsByCategoryId(3));
                    request.getRequestDispatcher("/vestXanh.jsp").forward(request, response);
                    break;

                case "vestNau":
                    request.setAttribute("products", productService.getProductsByCategoryId(4));
                    request.getRequestDispatcher("/vestNau.jsp").forward(request, response);
                    break;

                case "vestXam":
                    request.setAttribute("products", productService.getProductsByCategoryId(5));
                    request.getRequestDispatcher("/vestXam.jsp").forward(request, response);
                    break;

                case "aoSoMi":
                    request.setAttribute("products", productService.getProductsByCategoryId(6));
                    request.getRequestDispatcher("/aoSoMi.jsp").forward(request, response);
                    break;

                case "aoPolo":
                    request.setAttribute("products", productService.getProductsByCategoryId(7));
                    request.getRequestDispatcher("/aoPolo.jsp").forward(request, response);
                    break;

                case "overshirt":
                    request.setAttribute("products", productService.getProductsByCategoryId(8));
                    request.getRequestDispatcher("/overshirt.jsp").forward(request, response);
                    break;

                case "blazer":
                    request.setAttribute("products", productService.getProductsByCategoryId(9));
                    request.getRequestDispatcher("/blazer.jsp").forward(request, response);
                    break;

                case "quanAu":
                    request.setAttribute("products", productService.getProductsByCategoryId(10));
                    request.getRequestDispatcher("/quanAu.jsp").forward(request, response);
                    break;

                case "quanChino":
                    request.setAttribute("products", productService.getProductsByCategoryId(11));
                    request.getRequestDispatcher("/quanChino.jsp").forward(request, response);
                    break;

                case "quanNi":
                    request.setAttribute("products", productService.getProductsByCategoryId(12));
                    request.getRequestDispatcher("/quanNi.jsp").forward(request, response);
                    break;

                case "caVat":
                    request.setAttribute("products", productService.getProductsByCategoryId(13));
                    request.getRequestDispatcher("/caVat.jsp").forward(request, response);
                    break;

                case "khanChoang":
                    request.setAttribute("products", productService.getProductsByCategoryId(14));
                    request.getRequestDispatcher("/khanChoang.jsp").forward(request, response);
                    break;

                case "thatLung":
                    request.setAttribute("products", productService.getProductsByCategoryId(15));
                    request.getRequestDispatcher("/thatLung.jsp").forward(request, response);
                    break;

                default:
                    response.sendRedirect("products"); // Trang mặc định nếu type không hợp lệ
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            // Lấy dữ liệu từ form
//            String productName = request.getParameter("productName");
//            String priceString = request.getParameter("price");
//            String image = request.getParameter("image");
//            String description = request.getParameter("description");
//            String stateString = request.getParameter("state");
//            String checkCollectionString = request.getParameter("checkCollection");
//            String categoryIDString = request.getParameter("categoryID");
//            String maker = request.getParameter("maker");
//            String season = request.getParameter("season");
//
//            // Kiểm tra dữ liệu null hoặc trống
//            if (productName == null || productName.trim().isEmpty() ||
//                    priceString == null || priceString.trim().isEmpty() ||
//                    categoryIDString == null || categoryIDString.trim().isEmpty() ||
//                    maker == null || maker.trim().isEmpty()) {
//                request.setAttribute("error", "Vui lòng điền đầy đủ thông tin.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//                return;
//            }
//
//            // Chuyển đổi dữ liệu
//            double price = Double.parseDouble(priceString);
//            boolean state = Boolean.parseBoolean(stateString);
//            boolean checkCollection = Boolean.parseBoolean(checkCollectionString);
//            int categoryID = Integer.parseInt(categoryIDString);
//
//            // Tạo đối tượng sản phẩm mới
//            Product newProduct = new Product(0, productName, price, image, state, description,
//                    checkCollection, categoryID, maker, season);
//
//            // Gọi service để thêm sản phẩm
//            boolean success = productService.addProduct(newProduct);
//
//            // Xử lý kết quả
//            if (success) {
//                response.sendRedirect("products");
//            } else {
//                request.setAttribute("error", "Thêm sản phẩm thất bại. Vui lòng thử lại.");
//                request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//            }
//        } catch (NumberFormatException e) {
//            // Xử lý lỗi định dạng số
//            request.setAttribute("error", "Dữ liệu không hợp lệ. Vui lòng kiểm tra lại các trường nhập.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        } catch (Exception e) {
//            // Xử lý các lỗi khác
//            e.printStackTrace();
//            request.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại sau.");
//            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
//        }
    }

}
