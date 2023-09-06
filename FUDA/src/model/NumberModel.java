package model;
import java.util.Random;

public class NumberModel {
    private int[] array;

    public NumberModel(int size) {
        array = generateRandomArray(size);
    }

    public int[] getArray() {
        return array;
    }

    private int[] generateRandomArray(int size) {
        int[] newArray = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            newArray[i] = rand.nextInt(100); // Change the range as needed
        }
        return newArray;
    }

    public void quickSort() {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            sort(arr, low, pivotIndex - 1);
            sort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
