//**********************************************
//
//  @author Max Hubenthal
//
//  Problem Ten -- projecteuler.net
//    The sum of the primes below 10 is:
//      2 + 3 + 5 + 7 = 17.
//    Find the sum of all the primes 
//    below two million.
//
//**********************************************

import java.math.*;
import java.util.*;

public class Euler10{
  public static void main (String[] args){
    double number = 3;  // Only test odd numbers
    double primeSum = 2;
    while (number<15){
      boolean next = false;
      int test = (int)(Math.sqrt(number));  // Test below the square root of a number
      int divide = ((int)number)%test;
      while (divide>=1){
        test = test-1;
        divide = ((int)number)%test;
      }
      if (test == 1){
        primeSum = primeSum + number;
        number+=2;
      }
      else if (divide == 0){
        number+=2;
      }
      else{
      }
    }
    System.out.println("The sum of the primes below 2,000,000 is " + primeSum);
  }
}