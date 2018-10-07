import basket.BasketImpl;

public class Main {

    public static void main(String[] args) {

        BasketImpl basket = new BasketImpl();


        //Добавляем в ArrayList
        System.out.println("Наполнили корзину");
        basket.addProduct("Мороженое", 3);
        basket.addProduct("Чипсы", 2);
        basket.addProduct("Пепси", 1);
        basket.addProduct("Фанта", 1);
        //Проверяем что добавилось
        basket.getProducts();
        System.out.println();

        //Удаляем продукты. Если в корзине продукт с указанным наименованием представлен
        //в виде одной единице он удаляется из корзины, если их несколько уменьшается на единицу.
        System.out.println("Удаляем неоторый товар");
        basket.removeProduct("Фанта");
        basket.removeProduct("Мороженое");
        //Проверяем что добавилось
        basket.getProducts();
        System.out.println();


        //Длбавим в корзину продукт с наименованием в некотором количестве количестве
        System.out.println("Добавим еще один товар");
        basket.updateProductQuantity("Пепси",4 );
        //Проверяем что добавилось
        basket.getProducts();
        System.out.println();

        //Запрашиваем количество указанного товара в корзине
        String prod = "Чипсы";
        System.out.println("Количество товара \"" + prod +  "\" в корзине");
        basket.getProductQuantity(prod);
        System.out.println(basket.getProductQuantity(prod));
        System.out.println();

        //Очищаем всю корзину
        System.out.println("Очищаем всю корзину");
        basket.clear();
        basket.getProducts();
    }

}
