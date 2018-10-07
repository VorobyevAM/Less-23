package basket;

import product.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasketImpl implements Basket {

    List <Product> products = new ArrayList<>();

    @Override
    public void addProduct(String productName, int productQuantity) {
        products.add(new Product(productName,productQuantity));
    }

    @Override
    public void removeProduct(String productName) {
        Iterator<Product> productIterator = products.iterator();
        while (productIterator.hasNext()) {
            Product nextProduct = productIterator.next();
            if (nextProduct.getName().equals(productName)) {
                if (nextProduct.getQuantity()==1){
                    productIterator.remove();
                }else{
                    nextProduct.setQuantity(nextProduct.getQuantity()-1);
                }
            }
        }
    }

    @Override
    public void updateProductQuantity(String productName, int productQuantity) {
        Iterator<Product> productIterator = products.iterator();
        while (productIterator.hasNext()) {
            Product nextProduct = productIterator.next();
            if (nextProduct.getName().equals(productName)) {
                nextProduct.setQuantity(nextProduct.getQuantity()+productQuantity);
            }
        }
    }

    @Override
    public void clear() {
        products.removeAll(products);
        System.out.println("Корзина пуста");
    }

    @Override
    public List<String> getProducts() {
        List<String> lists = new ArrayList<>();
        Iterator<Product> productIterator = products.iterator();
        System.out.println("Список товаров:");
        while (productIterator.hasNext()) {
            Product nextProduct = productIterator.next();
            lists.add("Товар: \"" + nextProduct.getName() + "\" в кол-ве " + nextProduct.getQuantity());
        }
        System.out.println(lists);
        return lists;
    }

    @Override
    public int getProductQuantity(String productName) {
        int getProductQuantityInt=0;
        Iterator<Product> productIterator = products.iterator();
        while (productIterator.hasNext()) {
            Product nextProduct = productIterator.next();
            if (nextProduct.getName().equals(productName)) {
                //System.out.println("Количестов товара \"" + productName + "\" состовляет " + nextProduct.getQuantity());
                getProductQuantityInt = nextProduct.getQuantity();
            }
        }
        return getProductQuantityInt;
    }
}
