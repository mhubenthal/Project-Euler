//**********************************************
//
//	@author Max Hubenthal
//
//	Problem Four -- projecteuler.net
//  	A palindromic number reads the same both ways.
//    	The largest palindrome made from the product of
//    	two 2-digit numbers is 9009 = 91  99.
//    
//    	Find the largest palindrome made from the product
//    	of two 3-digit numbers.
//
//  This solution uses brute force and an educated guess of 
//  where to start testing, to increase speed.
//
//**********************************************

import java.math.*;
import java.util.Scanner;

public class Euler4{
	public static void main (String[] args){
  	int product = 0;
  	String answer = "";
  	String test = "";
  	String first = "";
  	String last = "";
  	boolean over = false;
  	boolean found = false;
  	int numberA = 0;
  	int numberB = 0;
  
  	while(!over){
  		for (int numA = 999; numA>800; numA--){
    		for (int numB = 999; numB>800; numB--){
    			product = numA * numB;
    			if (found){ // Quit if product becomes too small, based on estimate
      			over = true;
    			}
    			else if(!found){
      			test = Integer.toString(product); // Convert int to String to test for symmetry
      			int length = test.length();
      			int halfLength = length/2; // Get length of String to test
      			int startFront = 0; 
      			int endFront = 1;
      			int startEnd = length-1;
      			int endEnd = length;
      			while(endFront<=halfLength){
							if((test.substring(startFront,endFront)).equals(test.substring(startEnd,endEnd))){
								found = true;
								answer = test;
								numberA = numA;
								numberB = numB;
								startFront++;
								endFront++;
								startEnd--;
								endEnd--;
							}
							else{
								found = false;
								answer = "";
								endFront = halfLength +1;
							}
						} // End while loop to test for symmetry
      		} // End !found else test
      		else{
      			;
      		}
    		} // End inner for loop
    	} // End outer for loop
  	} // End while loop
    System.out.println("The largest palindrome resulting from the product of " + numberA + " and " + numberB + " is: " + answer);
  }
}