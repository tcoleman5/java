package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        int rotation;
        String ciphertext;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text. ");
        ciphertext = input.nextLine()
        
        do {
            System.out.print("Enter rotation amount. ");
            rotation = input.nextInt();
            if (rotation < 1) {
                System.out.println("Too low");
            } else if (rotation > 25){
                System.out.println("Too high");
            }
        } while (rotation > 1 || rotation < 25);
        System.out.println("Success");
        System.out.print("The encoded text is: " + encode(ciphertext, rotation));

    }
    
    static String encode(ciphertext, int rotation) {
        String message = "";
        int code = 0;
        int newcode = 0;
        for (int i = 0; i < ciphertext.length(); i++) {
            code = 0 + ciphertext.charAt(i); 
            if (code >=97 && code <=122) { 
            newcode = code + rotation;} else newcode = code;;
            if (newcode > 122)
            {newcode = (newcode - 97) % 26 + 97;}
            char letter = (char) newcode;
            message += letter;

        }
        System.out.println(message);
    }
}
