package com.cydeo.controller;

import com.cydeo.model.Cart;
import com.cydeo.model.CartItem;
import com.cydeo.model.Product;
import com.cydeo.service.impl.CartServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

@AllArgsConstructor
@Controller
public class CartController {

    private CartServiceImpl cartService;
    @RequestMapping("cart-list")
    public String getCartList(Model model){
        var cart_List = cartService.retrieveCartList();
        model.addAttribute("cartList",cart_List);

        return "cart/cart-list";
    }
    @RequestMapping("cart-list/{cart_id}")
    public String getCartList(@PathVariable String cart_id, Model model){
        var cartItemList = cartService.retrieveCartDetail(UUID.fromString(cart_id));

        model.addAttribute("cartItemList",cartItemList);

        return "cart/cart-detail";
    }

}
