package com.karthigajdbcecommerce.views;

import com.karthigajdbcecommerce.models.Category;
import com.karthigajdbcecommerce.models.Product;
import com.karthigajdbcecommerce.utils.StringUtil;

import java.util.ArrayList;

import static com.karthigajdbcecommerce.utils.AppOutput.println;

public class ProductPage {
    public void printCategories(ArrayList<Category> categories) {
        println(StringUtil.CATEGORY_MESSAGE);
        for (Category category : categories){
            println(category.getId()+". " + category.getCategoryName());
        }
        println(StringUtil.BACK);
    }

    public void printCategoryProducts(int choice, ArrayList<Product> products) {
        println(StringUtil.PRODUCT_MESSAGE);
        for (Product product : products) {
            if (product.getCategory().getId() == choice) {
                println(product.getId() + ". " + product.getProductName()  + ", ₹." + product.getPrice());
            }
        }

    }

    public void printAllProducts(ArrayList<Product> products) {
        println(StringUtil.PRODUCT_MESSAGE);
        for (Product product : products) {

            println(product.getId() + ". " + product.getProductName() + ", ₹." + product.getPrice());

        }
    }
}
