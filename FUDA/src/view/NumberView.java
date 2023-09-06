package view;

import java.util.Scanner;

public class NumberView {
    public void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int numElements = scanner.nextInt();
        scanner.close();
        return numElements;
    }
}
