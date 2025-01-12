package vn.edu.hcmuaf.fit.webmaydotheoyeucau.services;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Product;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.ProductCart;

import java.util.HashMap;
import java.util.Map;

public class CartService {
    public ProductCart convert(Product p, int quantity){
        ProductCart productCart = new ProductCart();
        productCart.setId(p.getId());
        productCart.setName(p.getProductName());
        productCart.setImage(p.getImage());
        productCart.setQuantity(quantity);
        productCart.setPrice(p.getPrice());
        return productCart;
    }
}
