package com.karthigajdbcecommerce.views;

import com.karthigajdbcecommerce.models.Order;
import com.karthigajdbcecommerce.models.User;
import com.karthigajdbcecommerce.utils.StringUtil;

import java.util.ArrayList;

import static com.karthigajdbcecommerce.utils.AppOutput.println;
import static com.karthigajdbcecommerce.utils.UserUtil.getLoggedInUser;

public class AdminOrderPage {
    public void viewOrders(ArrayList<Order> orders) {
        println(StringUtil.ORDER_MESSAGE);

        for (Order order : orders) {

            println(order.getId() + ". " + order.getProduct().getProductName() + ", "+"Ordered By: "+order.getUser().getEmail()+ ", " + order.getDate() + ", ₹." + order.getProduct().getPrice());

        }
    }
}
