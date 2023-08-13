package com.cydeo.controller;

import com.cydeo.service.impl.ProductServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static com.cydeo.service.impl.ProductServiceImpl.PRODUCT_LIST;


@Controller
@AllArgsConstructor
public class ProductController {
    private final ProductServiceImpl productService;

    @RequestMapping("/search-product/{name}")
    public String searchProduct(@PathVariable String name, Model model) {
        var resultList = productService.searchProduct(name);
        model.addAttribute("productList", resultList);
        return "product/product-list";
    }

}
