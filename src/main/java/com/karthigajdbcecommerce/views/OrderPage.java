package com.karthigajdbcecommerce.views;

import com.karthigajdbcecommerce.models.Order;
import com.karthigajdbcecommerce.models.User;
import com.karthigajdbcecommerce.utils.StringUtil;

import java.util.ArrayList;

import static com.karthigajdbcecommerce.utils.AppOutput.println;
import static com.karthigajdbcecommerce.utils.UserUtil.getLoggedInUser;

public class OrderPage {
    public void printOrders(ArrayList<Order> orders) {
        println(StringUtil.ORDER_MESSAGE);

        User user = getLoggedInUser();
        for(Order order:orders)
        {
            if(order.getUser().getId()==user.getId())
            {
                println(order.getId()+". " + order.getProduct().getProductName() +", "+ order.getDate() +", ₹."+order.getProduct().getPrice());
            }
        }
    }
}
