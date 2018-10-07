package basket;

import java.util.List;

public interface Basket {

    void addProduct(String productName, int productQuantity);

    void removeProduct(String productName);

    void updateProductQuantity(String productName, int productQuantity);

    void clear();

    List<String> getProducts();

    int getProductQuantity(String productName);

}
