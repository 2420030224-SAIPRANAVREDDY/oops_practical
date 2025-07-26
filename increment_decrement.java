package cse;
import java.util.Scanner;
public class increment_decrement extends oops_practical {
	public static void main(String[] args) {
   int a, b ;
    int result1, result2;
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter a number for a:");
    a = myObj.nextInt(); 
    System.out.println("Enter a number for b:");
    b = myObj.nextInt();

    System.out.println("Original value of a: " + a);
    result1 = ++a; 
    System.out.println("After increment (++a): " + result1);

    System.out.println("Original value of b: " + b);
    result2 = --b;
    System.out.println("After decrement (--b): " + result2);
  }
}