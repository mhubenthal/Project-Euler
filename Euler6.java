//**********************************************
//
//  @author Max Hubenthal
//
//  Problem Six -- projecteuler.net
//    The sum of the squares of the first ten natural 
//    numbers is:
//      1^2 + 2^2 + ... + 10^2 = 385
//    The square of the sum of the first ten natural 
//    numbers is:
//      (1 + 2 + ... + 10)^2 = 552 = 3025
//    Hence the difference between the sum of the squares 
//    of the first ten natural numbers and the square of 
//    the sum is 3025  385 = 2640.
//
//    Find the difference between the sum of the squares 
//    of the first one hundred natural numbers and the 
//    square of the sum.
//
//	This solution does not use brute force, rather two
//	common rules of summation, for n and n^2.
//
//**********************************************

import java.math.*;
import java.util.Scanner;

public class Euler6{
  public static void main (String[] args){
    int numA = ((100*101)/2)*((100*101)/2); // Summation rules for sum of the first 100 numbers in this case.
    int numB = (100*101*201)/6;	// Summation rules for sum of the squares, of the first 100 squares in this case.
    int answer = Math.abs(numB-numA);
    System.out.println(answer);
  }
}