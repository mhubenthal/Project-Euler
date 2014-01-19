//**********************************************
//
//  @author Max Hubenthal
//
//  n! means n*(n-1)*...*3*2*1
//  For example, 10! = 10*9*...*3*2*1 = 3628800,
//  and the sum of the digits in the number 10! 
//  is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
//
//  Find the sum of the digits in the number 100!
//
//**********************************************

import java.math.*;
import java.util.*;

public class Euler20
{
  public static void main (String[] args)
  {
  int a = 100;
  double answer = 0;
  double finalAnswer = 0;
  double newNum = 0;
  String textAnswer = "";
  boolean done = false;
  
  answer = a * (a-1);
  a = a-2;
  
  while (a>0)
  {
    answer = answer*a;
    a--;
  } 
  System.out.println(answer);
  
  textAnswer = Double.toString(answer);
  int start = 0;
  int end = 1; 
  newNum = Double.parseDouble(textAnswer.substring(start,end));
  System.out.println(newNum);
  finalAnswer = finalAnswer + newNum;
  start+=2;
  end+=2;
  while(end<textAnswer.length()){
    newNum = Double.parseDouble(textAnswer.substring(start,end));
    System.out.println(newNum);
    finalAnswer = finalAnswer + newNum;
    start+=1;
    end+=1;
  }
  
  System.out.println(textAnswer);
  }
}
