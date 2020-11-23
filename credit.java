package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        Scanner card = new Scanner(System.in);
        System.out.print("Input credit card number: ");
        String cardNum = input.nextLine();
        String cardType = "";
        
        ArrayList<Integer> cardList = new ArrayList<Integer>();

        int sum = 0
        int numb = 0
        int prod = 0
        
        for (int i = cardList.size() - 2; i >= 0; i = i - 2) {
            numb = cardList.get(i);
            prod = numb * 2;
               if (prod > 9) {
                sum = prod % 10;
             }
        }
        
        for (int i = 0; i < prod.length(); i++) {
            int n = Integer.parseInt("" + prod.charAt(i));
            sum += n;
        }
        
          if (cardNum.length() == 15 && sum % 10 == 0 && numb.charAt(0) == '3' && (numb.charAt(1) == '4' || numb.charAt(1) == '7') {
            cardType = "AMERICAN EXPRESS";
        } else if (cardNum.length() == 13 && sum % 10 == 0 && numb.charAt(0) == '4') {
            cardType = "VISA";
        } else if (cardNum.length() == 16 && sum % 10 == 0 && (numb.charAt(1) == '3' || numb.charAt(1) == '4' || numb.charAt(1) == '5')) ) {
            cardType = "MASTERCARD";
        } else {
            System.out.println("INVALID")
        }
        
