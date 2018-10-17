package com.codecool.hermanos.config;

import com.codecool.hermanos.dao.DaoProduct;
import com.codecool.hermanos.model.Product;
import com.codecool.hermanos.model.ProductCategory;

public class Initializer {
    private DaoProduct pd;

    public Initializer(DaoProduct pd) {
        this.pd = pd;
    }

    public void initializeProducts() {
        //Before:

        Product product1 = new Product("Tortilla plate", "50 g tortilla with hot cheese souce or hot jalapeno mango souce", 5.50, ProductCategory.BEFORE);
        pd.addNewProduct(product1);

        Product product2 = new Product("Corn Soup", "A soup made from corn, with tortillas and cheese.", 4.99, ProductCategory.BEFORE);
        pd.addNewProduct(product2);

        Product product3 = new Product("Cheese Soup", "Made from the three best mexican cheese with some Jalapenos.", 4.99, ProductCategory.BEFORE);
        pd.addNewProduct(product3);

        //Burgers:

        Product product4 = new Product("Pollos dream", "Roasted chicken breast, with salad, tomato plus an awesome cheese souce", 6.99, ProductCategory.BURGER);
        pd.addNewProduct(product4);

        Product product5 = new Product("Mexican God", "2 slice fried chicken breast, hot cheese, jalapenos with a secret souce", 9.99, ProductCategory.BURGER);
        pd.addNewProduct(product5);

        Product product6 = new Product("What a Vegan Mexican", "Fried cheese, salads, mayonnaise", 5.55, ProductCategory.BURGER);
        pd.addNewProduct(product6);

        //Chicken Carts:

        Product product7 = new Product("Big Daddy", "20 fried chicken breast, 5 fried potatoes, 5 choosen souce", 20.00, ProductCategory.CHICKEN_CART);
        pd.addNewProduct(product7);

        Product product8 = new Product("2 times HOT", "15 VERY hot chicken drumsticks, 3 curly fried potatoes, 4 hot souce", 16.50, ProductCategory.CHICKEN_CART);
        pd.addNewProduct(product8);

        Product product9 = new Product("The Team", "10 fried chicken breast with 10 VERY hot chicken drumsticks, 3 rice, 3 fried potatoes, 5 choosen souce", 25.00, ProductCategory.CHICKEN_CART);
        pd.addNewProduct(product9);

        //Drink:

        Product product10 = new Product("Mexican limonade", "Home made limonade with a bit of hot sauce", 2.99, ProductCategory.DRINK);
        pd.addNewProduct(product10);

        Product product11 = new Product("Water", "The best water in the desert", 1.99, ProductCategory.DRINK);
        pd.addNewProduct(product11);

        Product product12 = new Product("Tequila Asskick", "Mexican limonade with a 5* tequila", 3.99, ProductCategory.DRINK);
        pd.addNewProduct(product12);

        //Side Dish:

        Product product13 = new Product("Fried potato", "Best potatoes from Columbia", 1.99, ProductCategory.SIDE_DISH);
        pd.addNewProduct(product13);

        Product product14 = new Product("Curly fried potato", "Curly like a pig tail", 2.50, ProductCategory.SIDE_DISH);
        pd.addNewProduct(product14);

        Product product15 = new Product("Rice", "Mexican rice", 1.50, ProductCategory.SIDE_DISH);
        pd.addNewProduct(product15);

        //Dessert:

        Product product16 = new Product("Chimichanga", "The famous mexican dessert", 2.00, ProductCategory.DESSERT);
        pd.addNewProduct(product16);

        Product product17 = new Product("Mexican pancake", "With a heart of a mexican mommy", 2.00, ProductCategory.DESSERT);
        pd.addNewProduct(product17);

        //Drug:

        Product product18 = new Product("Crystal", "From Heisinberg kitchen", 10.00, ProductCategory.DRUG);
        pd.addNewProduct(product18);
    }
}
