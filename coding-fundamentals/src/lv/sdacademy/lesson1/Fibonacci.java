package lv.sdacademy.lesson1;


import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Which Fibonacci series number you want to find?");
        int n = in.nextInt();

        int second = getIterativeWay(n);

        System.out.println(second);
        System.out.println(fib(n));
    }

    private static int getIterativeWay(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        int first = 1;
        int second = 1;

        for (int i = 3; i <= n; ++i) {
            int sum = first + second;
            first = second;
            second = sum;
        }

        return second;
    }

    private static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }


}
