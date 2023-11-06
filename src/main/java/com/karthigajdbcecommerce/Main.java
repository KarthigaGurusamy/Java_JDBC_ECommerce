package com.karthigajdbcecommerce;


import com.karthigajdbcecommerce.controllers.AppController;
import com.karthigajdbcecommerce.db.DbConnection;

public class Main {
    public static void main(String[] args) {

        AppController appController = new AppController();
        appController.initiate();
    }
}