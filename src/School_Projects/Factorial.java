package School_Projects;

import java.util.Scanner;
public class Factorial {

    //loop
    public static int calculateFactorialLoop(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    //recursion
    public static int calculateFactorialRecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorialRecursion(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int num = input.nextInt();

        int factorialLoop = calculateFactorialLoop(num);
        int factorialRecursion = calculateFactorialRecursion(num);

        System.out.println(num + "! calculated using loop: " + factorialLoop);
        System.out.println(num + "! calculated using recursion: " + factorialRecursion);
    }
}