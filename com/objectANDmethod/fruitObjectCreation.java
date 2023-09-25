package com.objectANDmethod;

public class fruitObjectCreation {
	//class based because object is created
    int size;//attributes is created
    String colour;//function is also created here
    String taste;


    public static void main(String[] args) {
    	fruitObjectCreation obj = new fruitObjectCreation();  //object is created
        obj.colour = "red";  //value put to the object
        obj.size  = 2;
        obj.taste = "Sweet";
        System.out.println( obj.colour + " " + obj.taste +" "+ obj.size);
        
        



        
    }

}
