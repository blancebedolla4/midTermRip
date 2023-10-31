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

class Cart {

    public static LinkedList<Product> cart = new LinkedList<Product>();
    public static Map<Integer, List<Product>> cartRecords = new HashMap<Integer, List<Product>>();


    public static void addToCart(Product product) {
        // Complete the code for the method addToCart()
        // - To add a single product to the cart
        cart.add(product);
        //This line of code adds the provided Product object to the cart LinkedList.
    }

    public static void removeFromCart(Product product) {
        cart.remove(product);
        // Complete the code for the method addToCart()
        // - To add a single product to the cart
        //This line of code removes the specified Product object from the cart LinkedList.
    }


    public static void addCartToMap(Integer key, List<Product> value) {

    }

    public static Double calculateCartTotal() {
        //Calculate the tota cost of products in the cart
        //initialize the total cost to 0.0
        double totalCost =0.0;
        // Iterate through all carts in cartRecords map
        for(LinkedList<Product> cart : cartRecords.values()){
            // Iterate through products in the current cart
            for(Product product : cart) {
                // Add the price of the current product to the total cost
                totalCost+= product.getPrice();
            }
        }

        // Return the total cost of products in the cart
        return totalCost;
    }




    public static Product findProductInCartByName(String name) {
        //find a product in the cart by its name
        // Iterate through all carts in cartRecords map
        for(LinkedList<Product> cart : cartRecords.values()){
            // Iterate through products in the current cart
            for(Product product : cart) {
                // Check if the product's name matches the provided name (case-insensitive)
                if(product.getName().equalsIgnoreCase(name)){
                    // If a matching product is found, return it
                    return product;
                }
            }
        }
        // If no matching product is found, return null
        return null;
    }




    public static double priceCheck(String name){

        // return the price of a product a product based on its name
        // Iterate through all carts in cartRecords map
        for(LinkedList<Product> cart : cartRecords.values()){
            // Iterate through products in the current cart
            for(Product product : cart) {
                // Check if the product's name matches the provided name (case-insensitive)
                if(product.getName().equalsIgnoreCase(name)){
                    // If a matching product is found, return its price
                    return product.getPrice();
                }
            }
        }
        // If no matching product is found, return 0.0
        return 0.0;
    }




    public static LinkedList<Double> findExpensiveProductsInCart() {

        //Find all expensive products in the cart
        //A product is expensive if it cost $500 or more
        return null;
    }



    public static Double findMostExpensiveProduct() {
        double maxPrice = 0.0;
        // Iterate through all carts in cartRecords map

        for(LinkedList<Product> cart: cartRecords.values()){
            // Iterate through products in the current cart
            for(Product product : cart) {
                // Check if the product's price is greater than or equal to 5.00
                // and if it's greater than the current maxPrice
                if(product.getPrice()>=5.00 && product.getPrice()> maxPrice){
                    maxPrice= pruduct.getPrice();

                }

            }
        }
        // If no expensive product is found, return 0.0
        if(maxPrice == 0.00){
            return 0.00;

        }
        // Return the maximum price found among expensive products
        return maxPrice;
    }

    //Find the most expensive product in the cart
    //A product is expensive if it cost $500 or more



    public static int getCartSize() {
        // Number of products in cart
        return cart.size;
    }



    public static int getMapSize() {
        // Number of carts in cartRecord
        return cartRecords.size;
    }


    public static List<Integer> displayKeysOfCartRecords() {
        //display the list of keys for the  cart records added to the  cartRecords Map
        return null;
    }



    public static List<Map.Entry<Integer, List<Product>>> displayAllCartRecords() {
        //display the list of the  cart records added to the  cartRecords Map
        return cartList;
    }






} //END OF CART CLASS

