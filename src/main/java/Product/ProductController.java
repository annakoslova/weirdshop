package Product;

import java.util.List;
import java.util.Map;

public interface ProductController {

    void createProduct(String name, double price, double weight, boolean legal);
    void deleteProduct(int id);
    void updateProduct(int id, String name, double price, double weight, boolean legal);
    void readProduct(int id);
    Map<Integer, Product> getProductList();




    // Create, Delete, Update, Read (подтягивание товара - find all products), Amount at store
    // field amount
}