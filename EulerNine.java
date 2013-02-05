//**********************************************
//
//  @author Max Hubenthal
//
//  Problem Nine -- projecteuler.net
//    A Pythagorean triplet is a set of three natural 
//    numbers, a  b  c, for which:
//        a^2 + b^2 = c^2
//    For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
//    There exists exactly one Pythagorean triplet
//    for which a + b + c = 1000.
//    Find the product abc.
//
//  This solution uses brute force to find the 
//  largest Pythagorean triplet.
//
//**********************************************

import java.math.*;
import java.util.*;

public class EulerNine{
  public static void main (String[] args){
    int a = 1;
    int b = 1;
    int c = 1;
    int total = 0;
    int left = 0;
    int right = 0;
    boolean done = false;
    
    while (!done){
      for(int d = 1; d<1000; d++){
        for(int e = 1; e<1000; e++){
          for(int f = 1; f<1000; f++){
            total = d+e+f;
            left = (d*d)+(e*e);
            right = f*f;
            if((total==1000)&&(left==right)){
              done = true;
              a = d;
              b = e;
              c = f;
            }
          }
        }
      } 
    }
    System.out.println("a: " + a);
    System.out.println("b: " + b);
    System.out.println("c: " + c);
    System.out.println("a*b*c: " + (a*b*c));
  }
}