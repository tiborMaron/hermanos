package com.codecool.hermanos.service;

import com.codecool.hermanos.repository.DaoProduct;
import com.codecool.hermanos.model.Product;
import com.codecool.hermanos.model.ProductCategory;
import org.springframework.stereotype.Component;

@Component
public class InitializerBean {
    private DaoProduct daoProduct;

    public InitializerBean(DaoProduct daoProduct) {

        this.daoProduct = daoProduct;

        // -------------------
        // Initialize Products
        // -------------------

        // BEFORE
        addNewProduct("Tortilla plate", "50 g tortilla with hot cheese souce or hot jalapeno mango souce", 5.50, "product1.jpg", ProductCategory.BEFORE);
        addNewProduct("Corn Soup", "A soup made from corn, with tortillas and cheese.", 4.99, "product2.jpg", ProductCategory.BEFORE);
        addNewProduct("Cheese Soup", "Made from the three best mexican cheese with some Jalapenos.", 4.99, "product3.jpg", ProductCategory.BEFORE);

        // BURGER
        addNewProduct("Pollos dream", "Roasted chicken breast, with salad, tomato plus an awesome cheese souce", 6.99, "product4.jpg", ProductCategory.BURGER);
        addNewProduct("Mexican God", "2 slice fried chicken breast, hot cheese, jalapenos with a secret souce. Try it, and you never ever want to eat anything else. You will want to marry with this burger FCK.", 9.99, "product5.jpg", ProductCategory.BURGER);
        addNewProduct("What a Vegan Mexican", "Fried cheese, salads, mayonnaise", 5.55, "product6.jpg", ProductCategory.BURGER);

        // CHICKEN_CART
        addNewProduct("Big Daddy", "20 fried chicken breast, 5 fried potatoes, 5 choosen souce", 20.00, "product7.jpg", ProductCategory.CHICKEN_CART);
        addNewProduct("2 times HOT", "15 VERY hot chicken drumsticks, 3 curly fried potatoes, 4 hot souce. IF(!!!) you can eat it in 15 minutes, the pay will on us, AAAND, you can get some surprise from Heisinberg kitchen.", 16.50, "product8.jpg", ProductCategory.CHICKEN_CART);
        addNewProduct("The Team", "10 fried chicken breast with 10 VERY hot chicken drumsticks, 3 rice, 3 fried potatoes, 5 choosen souce. We select the hotest chicks all around the world, just for YOU! What else?", 25.00, "product9.jpg", ProductCategory.CHICKEN_CART);

        // DRINK
        addNewProduct("Mexican limonade", "Home made limonade with a bit of hot sauce. First, we collect the best lemons. After we ripe it for 3 days. In the last we make an awesome hot sauce with a pinch of lime with a little decoration.", 2.99, "product10.jpg", ProductCategory.DRINK);
        addNewProduct("Water", "The best water in the desert", 1.99, "product11.jpg", ProductCategory.DRINK);
        addNewProduct("Tequila Asskick", "Mexican limonade with a 5* tequila", 3.99, "product12.jpg", ProductCategory.DRINK);

        // SIDE DISH
        addNewProduct("Fried potato", "Best potatoes from Columbia", 1.99, "product13.jpg", ProductCategory.SIDE_DISH);
        addNewProduct("Curly fried potato", "Curly like a pig tail", 2.50, "product14.jpg", ProductCategory.SIDE_DISH);
        addNewProduct("Rice", "Mexican rice", 1.50, "product15.jpg", ProductCategory.SIDE_DISH);

        // DESSERT
        addNewProduct("Chimichanga", "The famous mexican dessert", 2.00, "product16.jpg", ProductCategory.DESSERT);
        addNewProduct("Mexican pancake", "With a heart of a mexican mommy", 2.00, "product17.jpg", ProductCategory.DESSERT);

        // DRUG
        addNewProduct("Crystal", "From Heisinberg kitchen", 10.00, "product18.jpg", ProductCategory.DRUG);
    }

    private void addNewProduct(String name, String description, double price, String imageName, ProductCategory productCategory) {
        daoProduct.save(new Product(name, description, price, imageName, productCategory));
    }
}
