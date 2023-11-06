package com.karthigajdbcecommerce.views;

import com.karthigajdbcecommerce.utils.StringUtil;

import static com.karthigajdbcecommerce.utils.AppOutput.println;

public class AdminPage {
    public void welcomeMsg() {
        println(StringUtil.ADMIN_WELCOME);
    }

    public void adminMenu() {
        println(StringUtil.ADMIN_CHOICE);
    }
}
