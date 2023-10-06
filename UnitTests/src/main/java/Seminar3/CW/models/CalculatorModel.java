package Seminar3.CW.models;

public class CalculatorModel {
    private int firstNumber;
    private int secondNumber;

    public int getFirstNumber() {
        return this.firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return this.secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int add() {

        return firstNumber + secondNumber;
    }

    public int subtract() {

        return firstNumber - secondNumber;
    }

    public int multiply() {

        return firstNumber * secondNumber;
    }

    public int divide() {
        if (secondNumber == 0) {
            throw new IllegalArgumentException("Деление на ноль недопустимо");
        }
        return firstNumber / secondNumber;
    }


}
