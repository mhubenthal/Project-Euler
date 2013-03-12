//**********************************************
//
//  @author Max Hubenthal
//
//  Problem Seven -- projecteuler.net
//    By listing the first six prime numbers: 
//      2, 3, 5, 7, 11, and 13
//      we can see that the 6th prime is 13.
//
//    What is the 10001st prime number?
//
//  This solution uses mainly brute force, but 
//  uses squares and odd numbers to help limit 
//  the search for the primes.
//
//**********************************************

import java.math.*;
import java.util.Scanner;
import java.util.*;

public class Euler7{
  public static void main (String[] args){
    double[] primes = new double[10000];
    int primeCounter = 0;
    double number = 3;  // Test only odd numbers
    while (primeCounter<10000){
      boolean next = false;
      int test = (int)(Math.sqrt(number));  // Test only below the square root of the number
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
    System.out.println("The 10001st prime is " + primes[primeCounter-1]);
  }
}