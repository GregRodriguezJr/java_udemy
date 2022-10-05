public class SimpleCalculator {
    // Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
    public double firstNumber;
    public double secondNumber;

    // Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
    public double getFirstNumber() {
        return this.firstNumber;
    }

    // Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
    public double getSecondNumber() {
        return this.secondNumber;
    }

    // Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    // Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumberfield.
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
    public double getAdditionResult() {
        return this.firstNumber + this.secondNumber;
    }

    // Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
    public double getSubtractionResult() {
        return this.firstNumber - this.secondNumber;
    }

    // Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
    public double getMultiplicationResult() {
        return this.firstNumber * this.secondNumber;
    }

    // Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.
    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        }
        return this.firstNumber / this.secondNumber;
    }
    public static void main(String[] args) {
        SimpleCalculator myCalc = new SimpleCalculator();
        // Test setters
        myCalc.setFirstNumber(5);
        myCalc.setSecondNumber(4);

        // Test getters
        System.out.println(myCalc.getFirstNumber());
        System.out.println(myCalc.getSecondNumber());

        // Test arithmetic
        System.out.println("Addition = " + myCalc.getAdditionResult());
        System.out.println("Subtraction = " + myCalc.getSubtractionResult());

        myCalc.setFirstNumber(5.25);
        myCalc.setSecondNumber(0);

        System.out.println("Muliply = " + myCalc.getMultiplicationResult());
        System.out.println("Divide = " + myCalc.getDivisionResult());
    }
}

