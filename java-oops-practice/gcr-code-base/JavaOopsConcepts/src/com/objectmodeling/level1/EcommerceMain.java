package com.objectmodeling.level1;
//Created an e-commerse class that establish relationship between order, customers and product
public class EcommerceMain {
    public static void main(String[] args) {
    	
    	//Create object of customer and order class
        Customers customer = new Customers();
        Order order = new Order();
        
        //Calling method to add product
        order.addProduct(new Product("Mobile"));
        order.addProduct(new Product("Laptop"));
        
        //Calling method to place order
        customer.placeOrder(order);
    }
}
