//**********************************************
//
//	@author Max Hubenthal
//
//  Problem Fourteen -- projecteuler.net
//    The following iterative sequence is defined 
//    for the set of positive integers:
//      n --> n/2 (n is even)
//      n --> 3n + 1 (n is odd)
//
//    Using the rule above and starting with 13, 
//    we generate the following sequence:
//      13  40  20  10  5  16  8  4  2  1
//    It can be seen that this sequence 
//    (starting at 13 and finishing at 1) contains 
//    10 terms. Although it has not been proved yet 
//    (Collatz Problem), it is thought that all 
//    starting numbers finish at 1.
//
//    Which starting number, under one million, 
//    produces the longest chain?
//
//    NOTE: Once the chain starts the terms are allowed to go above one million.
//
//	This solution is reached using a combination of brute force and also
//	mapping the length of previously sequenced numbers to an array, with the
//	number being the key. If a current number has already been sequenced,
//	its sequence length is looked up and added to the examined number, which
//	shortens the brute force process.
//
//**********************************************

import java.math.*;
import java.util.Scanner;
import java.io.*;

public class Euler14{
  	public static void main (String[] args){
    	long num = 3;
    	long newNum = 0;
	long maxLength = 0;
      	long maxNumber = 0;
      	long currentLength = 0;
      	long currentNum = 0;
	long nums[] = new long[1000000];
	nums[1] = 1;
	nums[2] = 2;
	boolean done = false;

      	// Search for the longest sequence below 1,000,000
    	while(num<1000000){
		currentLength = 0;
        	currentNum = num;
    		newNum = num;
    		while((newNum!=1)&&(!done)){
			// Current number is even
      			if (((newNum/2)*2)==newNum){
				// A previously generated sequence is found
				if(newNum < currentNum){
					// Add the length of the current sequence to the already
					// generated sequence
					nums[(int)currentNum] = currentLength + nums[(int)newNum];
					currentLength = nums[(int)currentNum];
					done = true;
				}
				// Keep searching otherwise
				else{
					newNum = newNum/2;
        				currentLength++;
      				}
			}
          		// Current number is odd
      			else{	
				// A previously generated sequence is found
				if(newNum < currentNum){
					// Add the length of the current sequence to the already
					// generated sequence
					nums[(int)currentNum] = currentLength + nums[(int)newNum];
					currentLength = nums[(int)currentNum];
					done = true;
				}
				// Keep searching otherwise
				else{
        				newNum = (3*newNum) + 1;
        				currentLength++;
      				}
      			}
    		}
		// The while loop executed completely
		if(!done){
			// Assign length to number
			nums[(int)currentNum] = currentLength;
        	}
		else{
			;
		}
		// A new longest sequence is found
    		if (currentLength>maxLength){
      			maxLength = currentLength;
          		maxNumber = currentNum;
    		}
        	// Existing sequence is still longest
    		else{
      			;
    		}
		done = false;
    		num++; // Move to the next term in the sequence
    	}
    	System.out.println("The number producing the longest chain below one million is: " + maxNumber);
    	System.out.println("The chain is " + maxLength + " numbers long.");
  	}
}
