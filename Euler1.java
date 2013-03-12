//**********************************************
//
//  @author Max Hubenthal
//
//  Problem One -- projecteuler.net
//    Sum all the natural numbers below 1000
//    divisable by 3 or 5.
//
//  This solution uses brute force to find the sum.
//
//**********************************************

public class Euler1{
  public static void main (String[] args){
    int num = 3;
    int sum = 0;
    
    while (num < 1000){
      if ((num % 3 == 0)||(num % 5 == 0)){
        sum += num;
        num++;
      }
      else{
        num++;
      }
    }
    System.out.println(sum);
  }
}