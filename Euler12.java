//**********************************************
//
//	@author Max Hubenthal
//
//  Problem Twelve -- projecteuler.net
//    The sequence of triangle numbers is generated 
//    by adding the natural numbers. So the 7th triangle 
//    number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. 
//    The first ten terms would be:
//      1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
//    Let us list the factors of the first seven triangle numbers:
//      1: 1
//      3: 1,3
//      6: 1,2,3,6
//      10: 1,2,5,10
//      15: 1,3,5,15
//      21: 1,3,7,21
//      28: 1,2,4,7,14,28
//    We can see that 28 is the first triangle number 
//    to have over five divisors.
//
//    What is the value of the first triangle number 
//    to have over five hundred divisors?
//
//  This solution is primarily brute force, but uses
//  square roots to find primes, summation rules to 
//  find triangular numbers and prime factorization to 
//  help count the number of divisors of a number.
//
//**********************************************

import java.math.*;
import java.util.*;

public class Euler12{
  	public static void main (String[] args){
  		// Create array of first 10000 prime numbers, to use as test factors
    	double[] primes = new double[10000];
    	int primeCounter = 0;
    	double number = 3;   // Only test odd numbers
    	while (primeCounter<10000){
      		boolean next = false;
      		int test = (int)(Math.sqrt(number));  // Save time by computing only numbers less than square of test
      		int divide = ((int)number)%test;
      		while (divide>=1){
        		test = test-1;
        		divide = ((int)number)%test;
      		}
      		if (test == 1){
        		primes[primeCounter] = number;
        		primeCounter++;
        		number+=2;
      		}
      		else if (divide == 0){
        		number+=2;
      		}
      		else{
      			;
      		}
    	}
    	
    	// Variables to calculate triangular numbers
    	int triNum = 1;
    	int num = 0;
    	int dividend = 0;
    	int counterA = 0;
    	int divisor = 2;  // Start at first prime 
    	int primeIndex = 0;
    	int divCounter = 1; // Already set at one to account for number "one" and "triNum" value, both automatic divisors
    
    	while(divCounter<500){  //Test all divisors using brute force, prime factorization
    		num ++;
    		divCounter = 1;
      		triNum = (num * (num + 1))/2;   // Calculate triangular number, using summation rules
      		while(divisor<=triNum){
      			while(dividend==0){
        			dividend = triNum%divisor;
        			if (dividend == 0){
        				counterA++;
          				triNum = triNum/divisor;
        			}
        			else{
          				;
        			}
        		} // End test for individual prime divisor
        		if(counterA!=0){
        			divCounter = divCounter * (counterA+1); // calculate combinations of existing factors
        		}
        		else{
        			;
        		}
        		counterA = 0;
        		dividend = 0;
        		divisor=(int)primes[primeIndex];
        		primeIndex++;
      		} // End divisor test while loop
      		primeIndex = 0;
      		counterA = 0;
      		divisor = 2;
      		dividend = 0;
    	} // End main while loop
    triNum = (num * (num + 1))/2;
    System.out.println("The first triangle number to have over five hundred divisors is " + triNum);
  	}
}