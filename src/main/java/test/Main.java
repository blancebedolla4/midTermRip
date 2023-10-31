package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.Random;

//COMMENT OUT YOUR FULL NAME HERE !!!
// Blanca Bedolla Lopez

class Main {

    public static void main(String[] args) {

        Product product1 = new Product("Bike", 4200.00, 2);
        addToCart(product1);
        //Add product1 to the cart

        Product product2 = new Product("Coke", 4.00, 10);
        //Add product2 to the cart
        addtoCart(product2);

        Product product3 = new Product("Laptop", 1000.0, 4);
        //Add product3 to the cart
        addtoCart(product3);

        Product product4 = new Product("Candy");
        //Add product4 to the cart
        addtoCart(product4);

        LinkedList<Product> cart1 = new LinkedList<Product>();

        addToCart(cart1,product1);
        cartRecords.put("Cart1", cart1);


        //add a product to the cart1 list
        //add cart1 to the cartRecords (Map)

        LinkedList<Product> cart2 = new LinkedList<Product>();
        addToCart(cart2,product2);
        cartRecords.put("Cart2",cart2);
        //add a product to the cart2 list
        //add the cart2 to the cartRecords (Map)


        //***METHODS WITH TEST CASES ARE BELOW
        //TO DO: INVOKE/CALL THE METHODS***

        // 5 points
        System.out.println("Print result of getCartSize : ");
        System.out.println();

        // 5 points
        System.out.println("Print a product's info with printProductInfo: ");
        System.out.println();

        // 5 points - You can test with product2 cos its on sale
        System.out.println("Print result of getProductQtyIfOnSale : ");
        System.out.println();

        // 5 points
        int currentQty = product.getQty();
        System.out.println("Current Quantity" + currentQty);
        int newQty= decreasedQty(currentQty);
        System.out.println("Print result after calling decreaseQty :  " + newQty);
        System.out.println();

        // 5 points
        System.out.println("Print result of displayProductNameNTimes : ");
        System.out.println();

        // 5 points
        System.out.println("Print result of findProductInCartByName : ");
        System.out.println();

        // 5 points
        System.out.println("Print result of displayKeysOfCartRecords : ");
        System.out.println();



        //*Randomly generated numbers you can use for manually testing if you like or not*
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int randomNumber = arr[new Random().nextInt(arr.length)];
        System.out.println();


        //***METHODS WITHOUT TEST CASES ARE BELOW - TO DO: INVOKE/CALL THE METHODS***

        //5 points
        System.out.println("Print result of getMapSize :  ");
        System.out.println();

        //5 points
        double cartTotal = calculateCartTotal();// calls the calculateCaRtTotal method
        //after calcilating the total cart value and storing it in'cart total' print out
        System.out.println("Print result of calculateCartTotal : $ " + cartTotal);
        System.out.println();

        //5 points
        System.out.println("Remove product4 with removeFromCart : ");
        //after calling the remove(). Check by getting the carts new size
        System.out.println();


        //10 points
        System.out.println("Print result of displayPriceAfterTax : ");
        System.out.println();



        //10 points
        String productNameToCheck ="Coke"; //This line declares a String variable named productNameToCheck and assigns it the value "Coke". This variable is used to store the name of the product you want to check the price for.
        double productPrice =priceCheck(productNameToCheck);
        //This line calls the priceCheck method, passing productNameToCheck as an argument. The priceCheck method likely takes a product name as input and returns the price of the product if it is found in the shopping cart. The returned price is stored in the productPrice variable, which is of type double
        if(productPrice > 0){
            //if the productPrice is greater than 0. If it is, it means that the product with the specified name was found in the shopping cart, and its price is greater than 0.

            System.out.println("Print result of priceCheck :  " + productNameToCheck + ": $" + productPrice);
        }else{ // if not found print this
            System.out.println("Product not found or price is 0");
        }
        System.out.println();

        //10 points
        System.out.println("Print result of findExpensiveProductsInCart : ");
        System.out.println();

        //10 points
        System.out.println("Print result of displayAllCartRecords :  ");
        System.out.println();

        //10 points
        System.out.println("Print result of findMostExpensiveProduct :");
        System.out.println();






    } // MAIN METHOD ENDS HERE

} // MAIN CLASS ENDS HERE
