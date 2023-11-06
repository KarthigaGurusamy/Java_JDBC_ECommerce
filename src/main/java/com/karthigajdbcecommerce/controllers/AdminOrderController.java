package com.karthigajdbcecommerce.controllers;

import com.karthigajdbcecommerce.dao.OrderDao;
import com.karthigajdbcecommerce.models.Order;
import com.karthigajdbcecommerce.utils.AppException;
import com.karthigajdbcecommerce.utils.StringUtil;
import com.karthigajdbcecommerce.views.AdminOrderPage;

import java.util.ArrayList;

import static com.karthigajdbcecommerce.utils.AppInput.enterInteger;
import static com.karthigajdbcecommerce.utils.AppOutput.println;

public class AdminOrderController {

    private final OrderDao orderDao;
    private final AdminOrderPage adminOrderPage;
    private final AdminController adminController;
    public AdminOrderController(AdminController adminController) {
        this.orderDao = new OrderDao();
        this.adminOrderPage = new AdminOrderPage();
        this.adminController= adminController;

    }

    private static ArrayList<Order> orders = new ArrayList<>();
    public void viewOrders() {
        orders=orderDao.getAllOrders();

        if(!orders.isEmpty())
        {
            adminOrderPage.viewOrders(orders);
            println(StringUtil.BACK);
            int choice;
            try {
                choice = enterInteger(StringUtil.CHOICE);
                if (choice == 100) {
                    adminController.printMenu();
                } else {
                    invalidException(new AppException(StringUtil.INVALID_CHOICE));
                }
            } catch (AppException e) {
                invalidException(e);
            }
        }
        else
        {
            println(StringUtil.ORDER_EMPTY_ADMIN);
            adminController.printMenu();
        }


    }
    private void invalidException(AppException e) {
        println(e.getMessage());
        viewOrders();
    }
}
