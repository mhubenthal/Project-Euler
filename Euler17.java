//**********************************************
//
//	@author Max Hubenthal
//
//  Problem Seventeen -- projecteuler.net
//    If all the numbers from 1 to 1000 (one thousand) 
//    inclusive were written out in words, how many 
//    letters would be used?
//
//    NOTE: Do not count spaces or hyphens. 
//    For example, 342 (three hundred and forty-two) 
//    contains 23 letters and 115 (one hundred and fifteen) 
//    contains 20 letters. The use of "and" when writing 
//    out numbers is in compliance with British usage.
//
//  This solution could have been easily implemented 
//  with pen and paper. This program merely takes away
//  some repetition with a simple loop and a few multiplications.    
//
//**********************************************

import java.util.Scanner;
import java.io.*;

public class Euler17{
  	public static void main (String[] args){
      // Store number words as groups of numbers to be used in a simple loop
      String singleDigit = "onetwothreefourfivesixseveneightnine";
      String teen = "teneleventwelvethirteenfourteenfifteensixteenseventeeneighteennineteen";
      String tensPlace = "twentythirtyfortyfiftysixtyseventyeightyninety";
      String hundred = "hundred";
      String hundredAnd = "hundredand";
      String thousand = "onethousand";

      // Get integer values to avoid making excessive .length() calls 
      int singleDigitCount = singleDigit.length();
      int teenCount = teen.length();
      int tensPlaceCount = tensPlace.length();
      int hundredCount = hundred.length();
      int hundredAndCount = hundredAnd.length()*99; // This value will always be repeated 99 times
      int thousandCount = thousand.length();

      // Initialize total (1-99)
      int grandTotal = (singleDigitCount*9) + teenCount + (tensPlaceCount * 10);

      // Add up value of all first words in "hundred" numbers
      grandTotal = grandTotal + (singleDigitCount * 100) + (hundredCount * 9) + (hundredAndCount * 9); 
      
      // Outer for loop, represents adding up words from 100 to 999 in one and tens places
      for(int i = 1; i<10; i++){
        grandTotal = grandTotal + ((singleDigitCount*9) + teenCount + (tensPlaceCount * 10));  
      }

      // Wrap it up
      grandTotal = grandTotal + thousandCount;

      // Display the result
      System.out.println();
      System.out.println("The number of letters used to write all the numbers from 1-1000 is: " + grandTotal);
      System.out.println();
  	} // End main method
} // End Euler17 class