package controller;

import model.NumberModel;
import view.NumberView;

public class Main {
	    public static void main(String[] args) {
	        NumberModel model = new NumberModel(10); // Initial size, change as needed
	        NumberView view = new NumberView();
	        NumberController controller = new NumberController(model, view);
	        controller.run();
	    }
	}

