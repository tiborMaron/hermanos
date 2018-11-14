package com.codecool.hermanos.api;

import com.codecool.hermanos.repository.DaoProduct;
import com.codecool.hermanos.model.Product;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@RestController
@CrossOrigin
public class ProductPageControllerREST {

    private DaoProduct daoProduct;

    public ProductPageControllerREST(DaoProduct daoProduct) {
        this.daoProduct = daoProduct;
    }

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public Optional<Product> getProduct(HttpServletRequest request) {
        String ID = request.getParameter("id");
        return daoProduct.findById(Long.parseLong(ID));
    }
}