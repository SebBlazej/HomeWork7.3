package app;

import java.util.Locale;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int treeHeight;

        System.out.println("Jak wysoka ma być choinka?");
        treeHeight = scanner.nextInt();

        for(int step = 0; step < treeHeight; step++){
            printEmptySpace(step, treeHeight);
            printStars(step);
            printEmptySpace(step, treeHeight);
            System.out.print("\n");
        }


    }

    private static void printStars(int step){
            for (int i = 0; i < (step*2)+1; i++) {
                System.out.print("*");
            }
    }

    private static void printEmptySpace(int step, int treeHeight){
        for(int i = 0; i < treeHeight-step; i++ ){
            System.out.print(" ");
        }
    }

}
