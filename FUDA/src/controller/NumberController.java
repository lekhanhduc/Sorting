package controller;
import java.util.Scanner;

import model.NumberModel;
import view.NumberView;

public class NumberController {
    private NumberModel model;
	private NumberView view;

    public NumberController(NumberModel model, NumberView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        int numElements = view.getUserInput();
        model = new NumberModel(numElements);

        int[] array = model.getArray();

        view.displayMessage("Unsorted Array:");
        view.displayArray(array);

        model.quickSort();

        view.displayMessage("Sorted Array:");
        view.displayArray(array);
    }   
}
