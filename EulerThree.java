//**********************************************
//
//	@author Max Hubenthal
//
//  Problem Three -- projecteuler.net
//    The prime factors of 13195 are 5, 7, 13
//    and 29. What is the largest prime factor
//    of the number 600851475143 ?
//
//  This solution mainly uses brute force. It saves 
//  some time in the method it uses to compute prime 
//  numbers, and also by storing these primes in array
//  to use for comparison later.
//
//**********************************************

import java.math.*;
import java.util.Scanner;

public class EulerThree{
  public static void main (String[] args){
    // Create array of first 10000 prime numbers, to use as test factors
    double[] primes = new double[10000];
    int primeCounter = 0;
    double number = 3;  // Only test odd numbers
    while (primeCounter<10000){
      boolean next = false;
      int test = (int)(Math.sqrt(number));  // Use square root of number to reduce time
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
      }
    }     
        
    double num = 0;
    boolean done = false;
    int primeArray = 9999;
    Scanner in = new Scanner (System.in);
    System.out.println("Enter a number to compute prime factorization with:");
    num = in.nextDouble();
    
    // Check number against first 10000 prime numbers
    while((!done)&&(primeArray >= 0)){
      if((num%(primes[primeArray]))==0){
        done = true;
      }
      else{
        primeArray--;
      }
    }
    System.out.println("The largest prime factor of " + num + " is: " + primes[primeArray]);
  }
}