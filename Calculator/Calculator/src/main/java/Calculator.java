import java.util.Scanner;

public class Calculator {
    public static void main (String[] args){

        Calculator cal = new Calculator();
        cal.get_number();
    }

    Integer number;
    Integer beforeNumber = 0;
    String operator = "notSelected";
    Integer results = 0;

    Scanner input = new Scanner(System.in);

    private void get_number() {
        System.out.print("Please enter a number: ");
        number = input.nextInt();
        calculateResults();
        System.out.print("Press any key to get results or, ");
        getOperator();

    }

    private void getOperator() {
        System.out.print("Please enter the next Operator: ");
        operator = input.next();
        if(beforeNumber.equals(0)){
            beforeNumber = number;
        }
        if(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")){
            get_number();
        } else {
            displayResults();
        }


    }

    private void calculateResults(){

        if(operator.equals("notSelected")){
            results = number;
        } else if (operator.equals("+")){
            results = beforeNumber + number;
            beforeNumber = results;
        }else if (operator.equals("-")) {
            results = beforeNumber - number;
            beforeNumber = results;
        }else if(operator.equals("*")){
            results = beforeNumber * number;
            beforeNumber = results;
        } else if (operator.equals("/")) {
            results= beforeNumber / number;
            beforeNumber = results;
        } else {
            System.out.print("cal error");
        }
        displayResults();
    }

    private void displayResults() {
        System.out.println("The results is: " + results);
    }

}
