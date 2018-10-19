package com.codecool.hermanos.config;

import com.codecool.hermanos.dao.DaoProduct;
import com.codecool.hermanos.dao.implementation.DaoProductJPA;
import com.codecool.hermanos.model.Product;
import com.codecool.hermanos.model.ProductCategory;

public class DBInitializer {
    private DaoProduct daoProduct;

    private DBInitializer(DaoProduct daoProduct) {
        this.daoProduct = daoProduct;
    }

    public static void main(String[] args) {
        DaoProduct daoProduct = new DaoProductJPA();
        DBInitializer init = new DBInitializer(daoProduct);
        init.initializeProducts();
    }

    private void initializeProducts() {

        // BEFORE

        Product product1 = new Product("Tortilla plate", "50 g tortilla with hot cheese souce or hot jalapeno mango souce", 5.50, "product1.jpg", ProductCategory.BEFORE);
        daoProduct.addNewProduct(product1);

        Product product2 = new Product("Corn Soup", "A soup made from corn, with tortillas and cheese.", 4.99, "product2.jpg", ProductCategory.BEFORE);
        daoProduct.addNewProduct(product2);

        Product product3 = new Product("Cheese Soup", "Made from the three best mexican cheese with some Jalapenos.", 4.99, "product3.jpg", ProductCategory.BEFORE);
        daoProduct.addNewProduct(product3);

        // BURGER

        Product product4 = new Product("Pollos dream", "Roasted chicken breast, with salad, tomato plus an awesome cheese souce", 6.99, "product4.jpg", ProductCategory.BURGER);
        daoProduct.addNewProduct(product4);

        Product product5 = new Product("Mexican God", "2 slice fried chicken breast, hot cheese, jalapenos with a secret souce. Try it, and you never ever want to eat anything else. You will want to marry with this burger FCK.", 9.99, "product5.jpg", ProductCategory.BURGER);
        daoProduct.addNewProduct(product5);

        Product product6 = new Product("What a Vegan Mexican", "Fried cheese, salads, mayonnaise", 5.55, "product6.jpg", ProductCategory.BURGER);
        daoProduct.addNewProduct(product6);

        // CHICKEN_CART

        Product product7 = new Product("Big Daddy", "20 fried chicken breast, 5 fried potatoes, 5 choosen souce", 20.00, "product7.jpg", ProductCategory.CHICKEN_CART);
        daoProduct.addNewProduct(product7);

        Product product8 = new Product("2 times HOT", "15 VERY hot chicken drumsticks, 3 curly fried potatoes, 4 hot souce. IF(!!!) you can eat it in 15 minutes, the pay will on us, AAAND, you can get some surprise from Heisinberg kitchen.", 16.50, "product8.jpg", ProductCategory.CHICKEN_CART);
        daoProduct.addNewProduct(product8);

        Product product9 = new Product("The Team", "10 fried chicken breast with 10 VERY hot chicken drumsticks, 3 rice, 3 fried potatoes, 5 choosen souce. We select the hotest chicks all around the world, just for YOU! What else?", 25.00, "product9.jpg", ProductCategory.CHICKEN_CART);
        daoProduct.addNewProduct(product9);

        // DRINK

        Product product10 = new Product("Mexican limonade", "Home made limonade with a bit of hot sauce. First, we collect the best lemons. After we ripe it for 3 days. In the last we make an awesome hot sauce with a pinch of lime with a little decoration.", 2.99, "product10.jpg", ProductCategory.DRINK);
        daoProduct.addNewProduct(product10);

        Product product11 = new Product("Water", "The best water in the desert", 1.99, "product11.jpg", ProductCategory.DRINK);
        daoProduct.addNewProduct(product11);

        Product product12 = new Product("Tequila Asskick", "Mexican limonade with a 5* tequila", 3.99, "product12.jpg", ProductCategory.DRINK);
        daoProduct.addNewProduct(product12);

        // SIDE DISH

        Product product13 = new Product("Fried potato", "Best potatoes from Columbia", 1.99, "product13.jpg", ProductCategory.SIDE_DISH);
        daoProduct.addNewProduct(product13);

        Product product14 = new Product("Curly fried potato", "Curly like a pig tail", 2.50, "product14.jpg", ProductCategory.SIDE_DISH);
        daoProduct.addNewProduct(product14);

        Product product15 = new Product("Rice", "Mexican rice", 1.50, "product15.jpg", ProductCategory.SIDE_DISH);
        daoProduct.addNewProduct(product15);

        // DESSERT

        Product product16 = new Product("Chimichanga", "The famous mexican dessert", 2.00, "product16.jpg", ProductCategory.DESSERT);
        daoProduct.addNewProduct(product16);

        Product product17 = new Product("Mexican pancake", "With a heart of a mexican mommy", 2.00, "product17.jpg", ProductCategory.DESSERT);
        daoProduct.addNewProduct(product17);

        // DRUG

        Product product18 = new Product("Crystal", "From Heisinberg kitchen", 10.00, "product18.jpg", ProductCategory.DRUG);
        daoProduct.addNewProduct(product18);
    }
}
