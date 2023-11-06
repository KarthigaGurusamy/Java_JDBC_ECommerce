# Java_JDBC_ECommerce
---------------------

This java console application for E-Commerce has the following sections:
------------------------------------------------------------------------
    👤 Login - Existing User and Admin
    👥 Register - New User
    🏠 Home - User
        👀 View Categories 
            🛍️ View products based on category.
            ⏬ Add products to cart.
        👀 View Products 
            ⏬ Add products to cart.
        🛒 View Cart 
            ✔️ Check out products from cart.
        ➡️ View Order 
            📦 Check for placed orders.
        📤 Logout
    🏠 Home - Admin 
        👀 View Categories 
            ➕ Add Category 
            ➖ Remove Category 
        👀 View Products 
            ➕ Add Product 
            🔄 Edit Product 
            ➖ Delete Product 
        👀 View Orders 
        📤 Logout

-> '💻-Java' for coding 
-> '🗃️-Database' for storing and retrieving data.

Tables used for each sections:
-----------------------------
    1. "🗃️-User table with Admin and User"  for storing user data.
    2. "🗃️-Category table" for storing categories.
    3. "🗃️-Product table" for storing Products.
    4. "🗃️-Cart table" for storing user cart details.
    5. "🗃️-Order table" for storing user order details.


Steps used and challenges faced to build this application:-
-----------------------------------------------------------

    Steps:
    ------
    👉 Used MVC (Model, View, Controller) architecture for developing the console application.
    👉 Added the required Models, Views and Controller along with Interface implementation to achieve abstraction.
    👉 Added user-defined exceptions to catch anf handle the exceptions.
    👉 Used encapsulation to hide data and used getter and setter for getting and setting the data for the models.
    👉 Used "ArrayList" to store and manipulate data according to the user preferrences.
    👉 Used "JDBC" and "Connection Path" to connect and access the database for storing and retriving the data.
    👉 Used Data Access Object (dao) for accessing Database using queries.
    👉 Stored the Connection path, Scanner class other sensitive information in a separate Utility folder.
    👉 Used Singleton pattern to avoid creating objects.
    👉 Used "Date" class for handling date for orders.
    👉 Handled exceptions for invalid choices.

    Challenges:
    -----------
    🔴 Faced "concurrentmodificationexception" - Caught this exception while working with Java collections.
        -> Solved it by not making any changes while the iterator is working on a ArrayList.
    🔴 Faced "StackOverFlow" - Caught this while creating parallel objects through constructor.
        -> Solved it by passing the instance "this" to other constructor.
    🔴 Had a problem for user object is null while trying to access the orders through admin page.
        -> Solved it by constructing the user Object.



Credentials 
-----------
  ▶️ For "User" Login use the following credentials
      📧Email = "a" | 🔐Password = "a"
  ▶️ For "Admin" Login use the following credentials
      📧Email = "karthiga@admin.com" | 🔐Password = "karthiga"


Screenshots
-----------

👥 Register:
------------

![image](https://github.com/KarthigaGurusamy/Java_JDBC_ECommerce/assets/145537707/4f32e14a-2655-43f7-a6bf-9dd8bec0e657)


👤 Login:
---------

User Login:
----------
![image](https://github.com/KarthigaGurusamy/Java_JDBC_ECommerce/assets/145537707/552aa76e-531d-47e6-9012-86686fae7040)

Admin Login:
------------
![image](https://github.com/KarthigaGurusamy/Java_JDBC_ECommerce/assets/145537707/df27ecca-68cf-4c66-8466-f347295937e3)


 👀 Categories:
 --------------
![image](https://github.com/KarthigaGurusamy/Java_JDBC_ECommerce/assets/145537707/06a448ae-3b1e-4262-aec8-966968dbd62d)



 👀 Products:
 ------------

![image](https://github.com/KarthigaGurusamy/Java_JDBC_ECommerce/assets/145537707/7488565f-56de-4f62-bd23-1375de2de9df)



🛒 Cart:
---------

![image](https://github.com/KarthigaGurusamy/Java_JDBC_ECommerce/assets/145537707/94dc4df7-79bc-4778-b0aa-aed16d5fb1e8)



📦 Orders:
----------

![image](https://github.com/KarthigaGurusamy/Java_JDBC_ECommerce/assets/145537707/e795feeb-6a88-430d-aee6-c2423b2c722f)

👀 Admin view Categories:
-------------------------
![image](https://github.com/KarthigaGurusamy/Java_JDBC_ECommerce/assets/145537707/353721c0-a3d2-49ab-8bad-2161420f5fe3)

👀 Admin view Products:
-------------------------
![image](https://github.com/KarthigaGurusamy/Java_JDBC_ECommerce/assets/145537707/f293f6df-ca00-431b-99cf-4237010466fe)

📦 Admin Orders:
----------------

![image](https://github.com/KarthigaGurusamy/Java_JDBC_ECommerce/assets/145537707/4a150e65-68f5-4b98-9cf5-3a7df9bb47f6)




🔴 Handling Exceptions:
-----------------------

![image](https://github.com/KarthigaGurusamy/Java_ECommerce/assets/145537707/986de6f0-407d-45cf-9fad-7f12a641cb63)



