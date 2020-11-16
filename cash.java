package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
	  Scanner input = new Scanner(System.in);
    float changemin = 0.0f;
    
	  do {
		System.out.print("How much change is owed? ");
		changemin = input.nextFloat();
	  } while (changemin < 0.0);
       
	      int cents = Math.round(changemin * 100);
        
      if (cents / 25 >= 1) {  
	      int coins = (changemin / 25);
	      int rem = changemin % 25; }
        
      else if (cents /10 >= 1) {  
              int coins = (changemin / 10);
	      int rem = changemin % 10; }
        
      else if (cents / 5 >= 1) {
	      int coins = (changemin / 5);
	      int rem = changemin % 5; }
      
      else {
	      int coins = (changemin / 1);
              int rem = changemin % 1; }
      
	  System.out.println("The minimum number of coins needed is: " + coins);

    }
}
