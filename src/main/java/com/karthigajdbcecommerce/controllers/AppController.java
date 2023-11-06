package com.karthigajdbcecommerce.controllers;

import com.karthigajdbcecommerce.controllers.Implementation.IAppController;
import com.karthigajdbcecommerce.views.WelcomePage;

public class AppController implements IAppController {

    private final WelcomePage welcomePage;
    private final AuthController authController;

    public AppController() {
        this.welcomePage = new WelcomePage();
        this.authController = new AuthController();
    }

    @Override
    public void initiate() {
        welcomePage.welcomeMessage();
        authController.authMenu();
    }
}
