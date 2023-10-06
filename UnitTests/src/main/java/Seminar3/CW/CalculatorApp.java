package Seminar3.CW;

import Seminar3.CW.controllers.CalculatorController;
import Seminar3.CW.models.CalculatorModel;
import Seminar3.CW.view.CalculatorView;

public class CalculatorApp {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        controller.run();
    }
}
