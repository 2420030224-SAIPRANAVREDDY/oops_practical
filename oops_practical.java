package cse;
import java.util.Scanner;
public class oops_practical { 
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter first integer: ");
    int a = input.nextInt();
    
    System.out.print("Enter second integer: ");
    int b = input.nextInt();
    
    System.out.println(); 
    
    System.out.println(" * Results * ");
    System.out.println(a + " + " + b + " = " + (a + b));
    System.out.println(a + " - " + b + " = " + (a - b));
    System.out.println(a + " * " + b + " = " + (a * b));
    System.out.println(a + " / " + b + " = " + (a / b));
    System.out.println(a + " % " + b + " = " + (a % b));
    
    input.close();
}
}

