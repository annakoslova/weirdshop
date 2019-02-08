package Product;

import java.util.HashMap;
import java.util.Map;

public class ProductControllerImpl implements ProductController{

    private Map<Integer, Product> products = new HashMap<>();

    @Override
    public void createProduct(String name, double price, double weight, boolean legal) {
        Product product = new Product(generateId(), name, price, weight, legal);
        products.put(generateId(), product);
    }

    @Override
    public void deleteProduct(int id) {
        products.remove(id);
    }

    @Override
    public void updateProduct(int id, String name, double price, double weight, boolean legal) {
        Product product = new Product(id, name, price, weight, legal);
        products.put(id, product);
    }

    @Override
    public void readProduct(int id) {
        products.get(id);
    }

    @Override
    public Map<Integer, Product> getProductList() {
        Map<Integer, Product> allProducts = products;
        return allProducts;
    }

    private int generateId(){
        int id = 0;
        if(products.isEmpty()) {
            id = 0;
        }
        for(int i = 0; i < products.size(); i++){
            id = products.get(id).getId() + 1;
        }
        return id;
    }
}
