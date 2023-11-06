package com.karthigajdbcecommerce.views;

import com.karthigajdbcecommerce.models.Cart;
import com.karthigajdbcecommerce.utils.StringUtil;

import java.util.ArrayList;

import static com.karthigajdbcecommerce.utils.AppOutput.println;
import static com.karthigajdbcecommerce.utils.UserUtil.getLoggedInUser;

public class CartPage {
    public void printCart(ArrayList<Cart> carts) {
        println(StringUtil.CART_MESSAGE);
        for(Cart cart: carts)
        {
            if(cart.getUser().getId()==getLoggedInUser().getId())
            {
                println(cart.getId()+"." +cart.getProduct().getProductName() +", ₹."+ cart.getProduct().getPrice()*cart.getCount() +", Quantity: "+cart.getCount());

            }
        }
    }
}
