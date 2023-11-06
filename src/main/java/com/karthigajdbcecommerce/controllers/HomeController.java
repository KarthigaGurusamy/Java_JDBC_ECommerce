package com.karthigajdbcecommerce.controllers;

import com.karthigajdbcecommerce.utils.AppException;
import com.karthigajdbcecommerce.utils.StringUtil;
import com.karthigajdbcecommerce.utils.UserUtil;
import com.karthigajdbcecommerce.views.HomePage;

import static com.karthigajdbcecommerce.utils.AppInput.enterInteger;
import static com.karthigajdbcecommerce.utils.AppOutput.println;
import static com.karthigajdbcecommerce.utils.UserUtil.removeLoggedInUser;

public class HomeController {


    private final HomePage homepage;
    private final ProductController productController;

    private final CartController cartController;

    private final OrderController orderController;
    public HomeController() {
        this.homepage = new HomePage();
        this.orderController = new OrderController(this);
        this.cartController = new CartController(this,orderController);
        this.productController = new ProductController(this,cartController);
    }

    public void printMenu() {
        println(StringUtil.USER_WELCOME);
        homepage.printChoice();
        int choice;
        try {
            choice = enterInteger(StringUtil.CHOICE);
            if (choice == 1) {
                productController.printCategories();
            } else if (choice == 2) {
                productController.printProducts();
            } else if (choice == 3) {
                cartController.printCartItems();
            } else if (choice == 4) {
                orderController.OrderedItemsList();
            } else if (choice == 5) {
                removeLoggedInUser();
                println(StringUtil.THANK_YOU_MESSAGE);
            } else {
                invalidException(new AppException(StringUtil.INVALID_CHOICE));
            }
        } catch (AppException e) {
            invalidException(e);
        }

    }
    private void invalidException(AppException e) {
        println(e.getMessage());
        printMenu();
    }
}
