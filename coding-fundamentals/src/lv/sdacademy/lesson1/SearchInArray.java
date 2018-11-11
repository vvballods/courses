package lv.sdacademy.lesson1;


import java.util.Scanner;

public class SearchInArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 3, 5};

        Scanner in = new Scanner(System.in);

        int numberThatYouSearch = in.nextInt();

        boolean isNumberFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberThatYouSearch) {
                isNumberFound = true;
                System.out.println("I found the number as a " + (i + 1) + "th element");
            }
        }

        if (!isNumberFound) {
            System.out.println("Number was not found in this array");
        }
    }
}
