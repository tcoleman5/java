package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("Input text");
        String input = input.nextLine()
        
        input = (input + " ");
        float wordcon = 0;
        
        float lettercon = 0;
       
        float sentencecon = 0;
        
        String testtext = "";
        
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) lettercount++;
        }
        
        for (int w = 0; w < input.length(); w++) {
            if (input.charAt(w) == ' ') wordcount++;
        }
        
        for (int s = 0; s < input.length(); s++) {
            testtext = "" + input.charAt(s);
            if (testtext.equals(".") || testtext.equals("?") || testtext.equals("!") ) sentencecount++;
        }
        
        float L = (lettercon/wordcon)*100;
        float S = ((sentencecon/wordcon)*100);
        double readingLevel = 0.0588 * L - 0.296 * S - 15.8 ;
        long readingl = Math.round(readingLevel);
        System.out.println("Text: "+input+grade+ " level");
        }
    }
    
