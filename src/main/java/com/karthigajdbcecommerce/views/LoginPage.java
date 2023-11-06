package com.karthigajdbcecommerce.views;

import com.karthigajdbcecommerce.utils.StringUtil;

import static com.karthigajdbcecommerce.utils.AppOutput.println;

public class LoginPage {
    public void printInvalidCredentials() {
        println(StringUtil.INVALID_CREDENTIALS);
    }

    public void loginSuccess() {
        println(StringUtil.LOGIN_SUCCESS);
    }
}
