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

class Product  {


    private String name;
    private double price;
    private int qty;
    private final float TAX = .05f;

    public Product(String name) {
        this.name = name;
    }

    //overloaded constructor
    public Product(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    // simply return the corresponding private fields 'price','name' , 'qty'
    public double getPrice() {
        //fix the code
        return price;
    }

    public String getName() {
        //fix the code
        return name;
    }

    public int getQty() {
        //fix the code
        return qty;
    }


    public String printProductInfo() {
        //This method prints the product information in the specified format
        // and also returns the formatted string.

        System.out.println("Product name :" + name);
        System.out.println("Product price :" + price);
        System.out.println("Product Qty :" + qty);

        // Complete the method to print A Product Info in the EXACT format below:
        // Note that each info is on a newline in a certain exact format.
        // Pay attention to details. Ask clarifying questions if unsure !

        /*
         * Product Name :bread
         * Product Price :10.0
         * Product Qty :2
         */
        return null;
    }


    public int decreaseQty() {
       // This method decreases the quantity of the product by 1
        // if the quantity is greater than 0. It returns the updated quantity after the decrease.
        if (qty > 0){
            qty --;
        }
        // Complete the method so we can decrease qty by 1 when invoked
        return qty;


    }


    public static Integer getProductQtyIfOnSale(Product product) {
        if(product.getPrice() <=5.0){ //This line checks if the price of the product passed to the method is less than or equal to 5.0.

            return product.getQty(); //If the price is 5.0 or less, it returns the quantity (qty) of the product. This means if the product is on sale (price is $5 or less), the method returns the quantity of that product.

        }else{
            return null;
        }
    }
    //checks if a product is on sale (price is $5 or less) and returns its quantity if it is on sale, otherwise, it returns null.
    //  Complete the code for the method isonSale()
    // (*** NOTE: A product is onsale ONLY if it cost $5 or less ***)



    public String displayPriceAfterTax() {
        // Ensure that the result is formatted to 2 decimal places.
       // calculates the price after adding a 5% tax, formatting the result to two decimal places.

        double priceAfterTax = price + (price * TAX);
        return String.format("%.2f", priceAfterTax);
    }




    public static String displayProductNameNTimes(int amt, Product product) {
        // Complete the method displayProductNameNTimes to display product names a
        // number of times.
        return null;
    }



    //HELPER METHOD - (nothing to do here)
    @Override
    public String toString(){
        return "\n" + printProductInfo();
    }




} // END OF PRODUCT CLASS
