//**********************************************
//
//  @author Max Hubenthal
//
//  Problem Thirteen -- projecteuler.net
//    Work out the first ten digits of the sum of 
//    the following one-hundred 50-digit numbers.
//
//  This solution is a simple brute force algorithm. 
//
//**********************************************

import java.math.*;
import java.util.Scanner;
import java.io.*;

public class Euler13{
  public static void main (String[] args)throws IOException{
    double total = 0;
    double newTotal = 0;
    String newNumber = "";
    
    Scanner in = new Scanner (new FileReader ("Euler13.txt"));
    newNumber = in.nextLine();
    total = Double.parseDouble(newNumber);
    
    while (in.hasNextLine()){
      newNumber = in.nextLine();
      newTotal = Double.parseDouble(newNumber);
      total = total + newTotal;
    }

    System.out.println("The sum of the following one-hundred 50-digit numbers is " + total);
  }
}