package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        storeProd.add("Bison Sweater");
        prodPrices.add(55.99);
        storeProd.add("Bison Tee");
        prodPrices.add(14.99);
        storeProd.add("Bison Hoodie");
        prodPrices.add(23.99);
        storeProd.add("Bison Bumpersticker");
        prodPrices.add(4.99);
        
        String answer = "";
        String item;
        
        ArrayList<String> purchases = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();
  
        do {
            System.out.println("What do you want to do?");
            System.out.println("1) Add purchase 2) Change purchase 3) Show purchases 4) Finish transaction");
            answer = input.nextLine();

            if (answer.equals("1")) {
                System.out.println("What do you want to buy?");
                item = input.nextLine();
                }
                
                for (int i = 0; i < storeProd.size(); i++) {
                    if (storeProd().equals(item))
                    }
                    purchases.add(item.get(prices));
                
                for (int i = 0; i < storeProd.size(); i++) {
                    System.out.println("You have added" + storeProd.get(i) + " at the price of $ " + prodPrices.get(i) + "to your cart");
                }

            } else if (answer.equals("2")) {
                System.out.println("You currently have the following items in your cart:");
                
                for (int i = 0; i < purchases.size(); i++) {
                    System.out.println(purchases.get(i) + " at the price(s) of $ " + prices.get(i));
                }
                
                System.out.println("What item would you  like to change? ");
                item = input.nextLine()
                for (int i = 0; i < purchases.size(); i++) {
                    if (purchases.get(i) += item) {
                         purchases.remove(item);
                         prices.remove(item);
                    }
                    
            } else if (answer.equals("3")) {
                System.out.println("You currently have the following items in your cart:");   
                for (int i = 0; i < purchases.size(); i++) {
                    System.out.println(purchases.get(i) + " at the price(s) of $ " + prices.get(i));
                }
            }

        } while (! answer.equals("4"));
        double totalcost = 0.0;
        for (int i = 0; i < purchases.size(); i++) {
            totalcost += purchases.get(i);
        }
        
        System.out.println("Your order total is: $ " + totalcost);
    }
}
