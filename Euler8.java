//**********************************************
//
//  @author Max Hubenthal
//
//  Problem Eight -- projecteuler.net
//    Find the greatest product of five consecutive digits in the 1000-digit number:
//
//    73167176531330624919225119674426574742355349194934
//    96983520312774506326239578318016984801869478851843
//    85861560789112949495459501737958331952853208805511
//    12540698747158523863050715693290963295227443043557
//    66896648950445244523161731856403098711121722383113
//    62229893423380308135336276614282806444486645238749
//    30358907296290491560440772390713810515859307960866
//    70172427121883998797908792274921901699720888093776
//    65727333001053367881220235421809751254540594752243
//    52584907711670556013604839586446706324415722155397
//    53697817977846174064955149290862569321978468622482
//    83972241375657056057490261407972968652414535100474
//    82166370484403199890008895243450658541227588666881
//    16427171479924442928230863465674813919123162824586
//    17866458359124566529476545682848912883142607690042
//    24219022671055626321111109370544217506941658960408
//    07198403850962455444362981230987879927244284909188
//    84580156166097919133875499200524063689912560717606
//    05886116467109405077541002256983155200055935729725
//    71636269561882670428252483600823257530420752963450
//
//  This solution uses brute force to process this 1000
//  digit number as a series of one line strings.
//
//**********************************************

import java.math.*;
import java.util.Scanner;
import java.io.*;

public class Euler8{
  public static void main (String[] args) throws IOException{
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    int num4 = 0;
    int num5 = 0;
    int answerA = 0;
    int answerB = 0;
    String bigNumber = "";
    int start = 6;
    int end = 7;
    
    Scanner in = new Scanner(new FileReader("Euler8.txt"));
    bigNumber = (in.nextLine());
    
    num1 = Integer.parseInt(bigNumber.substring(0,1));
    num2 = Integer.parseInt(bigNumber.substring(1,2));
    num3 = Integer.parseInt(bigNumber.substring(3,4));
    num4 = Integer.parseInt(bigNumber.substring(4,5));
    num5 = Integer.parseInt(bigNumber.substring(5,6));
    answerA = num1*num2*num3*num4*num5;
    
    while(end<=(bigNumber.length())){ 
      num1=num2;
      num2=num3;
      num3=num4;
      num4=num5;
      num5 = Integer.parseInt(bigNumber.substring(start,end));
      answerB = num1*num2*num3*num4*num5;
      
      start+=1;
      end+=1;
      
      if(answerA>=answerB){
        answerA = answerA;
      }
      else if (answerB>=answerA){
        answerA = answerB;
      }
      else{
      }
    }
  
    System.out.println("The greatest product of five consecutive integers is " + answerA);
    in.close();
  }
}