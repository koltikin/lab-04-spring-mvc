package com.cydeo;

import com.cydeo.service.CartService;
import com.cydeo.service.impl.CartServiceImpl;
import com.cydeo.service.impl.ProductServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CydeoApploication {

    public static void main(String[] args) {
        ApplicationContext container = SpringApplication.run(CydeoApploication.class, args);
        ProductServiceImpl productService = container.getBean(ProductServiceImpl.class);
        productService.initialiseProductList();

        CartService cartService = container.getBean(CartServiceImpl.class);
        cartService.initialiseCartList();
    }

}
