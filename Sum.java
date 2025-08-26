import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type a number:");
        int x = input.nextInt();

        System.out.println("Type another number:");
        int y = input.nextInt();

        int sum = x + y;
        System.out.println("Sum is: " + sum);
    }
}
