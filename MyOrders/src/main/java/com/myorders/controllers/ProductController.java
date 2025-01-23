package com.myorders.controllers;

import com.myorders.entities.Product;
import com.myorders.entities.ProductDetails;
import com.myorders.services.ProductService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public String showProductsList(Model model) {
        List<Product> products = productService.getProductsList();
        model.addAttribute("productsList", products);
        return "productsList";
    }
    @RequestMapping("/products/{id}")
    public String showProductDetails(@PathVariable("id") int productId, Model model) {
        model.addAttribute("productDetails", productService.getProductDetails(productId));
        return "productDetails";
    }
    @RequestMapping("/addProduct")
    public String showAddProductPage() {
        return "addProduct";
    }
    @RequestMapping(value = "/processAddProduct", method = RequestMethod.POST)
    public String processAddProduct(@ModelAttribute("productDetailsModel") ProductDetails productDetails) {
        productService.addProduct(productDetails);
        return "redirect:/products";
    }
    @RequestMapping("products/update/{id}")
    public String showUpdateProductPage(@PathVariable("id") int productId, Model model) {
        model.addAttribute("productDetails", productService.getProductDetails(productId));
        return "updateProduct";
    }
    @RequestMapping(value = "products/update/processUpdateProduct", method = RequestMethod.POST)
    public String processUpdateProduct(@ModelAttribute("productDetailsModel") ProductDetails productDetails) {
        productService.updateProduct(productDetails);
        return "redirect:/products";
    }
    @RequestMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable("id") int id) {
        productService.deleteProduct(id);
        return "redirect:/products";
    }
}
