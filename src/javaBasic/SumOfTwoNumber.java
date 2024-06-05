package javaBasic;
import java.util.Scanner;
//import java.util.*;
//import java.util.Scanner;
public class SumOfTwoNumber {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter any three integers :");
      int a = scan.nextInt();
      int b = scan.nextInt();
      int c = scan.nextInt();

      if(a>b && a>c) {
          System.out.println("The greatest number is " + a);
      }

      else if (b>a && b>c){
          System.out.println("The greatest number is " + b);
      }

      else{
          System.out.print("The greatest number is " + c);
      }
    }
}
