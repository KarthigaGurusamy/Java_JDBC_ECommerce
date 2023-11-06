package com.karthigajdbcecommerce.utils;

import com.karthigajdbcecommerce.models.User;

public class UserUtil {


    private static User userData;
    public static void setLoggedInUser(User user) {
        userData = user;
    }
    public static void removeLoggedInUser()
    {
        userData = null;
    }

    public static User getLoggedInUser()
    {
        return userData;
    }
}
