package genuinecoder.main;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Stack;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController implements Initializable {

    Float data = 0f;
    Float result = 0f;
    int operation = -1;

    @FXML
    private Button minus;

    @FXML
    private Button nine;

    @FXML
    private Button six;

    @FXML
    private Button mult;

    @FXML
    private Button one;

    @FXML
    private TextField display;

    @FXML
    private TextField display2;

    @FXML
    private Button clear;

    @FXML
    private Button seven;

    @FXML
    private Label label;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button eight;

    @FXML
    private Button zero;

    @FXML
    private Button div;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button equals;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if (event.getSource() == one) {
        
            String expression = display.getText() ;

            if(expression.length() >= 0){
            display.setText(display.getText() + "1");
            }
             expression += "1";
            if (expression.length() > 2 && expression.matches(".*[-+*/].*")) {
                try {

                    System.out.println(expression);

                    double result = evaluateExpression(expression);
                    display.setText(String.valueOf(expression));
                    display2.setText(String.valueOf(result));
                } catch (Exception e) {
                    display.setText("Error");
                }
            }

        } else if (event.getSource() == two) {
               String expression = display.getText() ;

            if(expression.length() >= 0){
            display.setText(display.getText() + "2");
            }
             expression += "2";
            if (expression.length() > 2 && expression.matches(".*[-+*/].*")) {
                try {

                    System.out.println(expression);

                    double result = evaluateExpression(expression);
                    display.setText(String.valueOf(expression));
                    display2.setText(String.valueOf(result));
                } catch (Exception e) {
                    display.setText("Error");
                }
            }
        } else if (event.getSource() == three) {
               String expression = display.getText() ;

            if(expression.length() >= 0){
            display.setText(display.getText() + "3");
            }
             expression += "3";
            if (expression.length() > 2 && expression.matches(".*[-+*/].*")) {
                try {

                    System.out.println(expression);

                    double result = evaluateExpression(expression);
                    display.setText(String.valueOf(expression));
                    display2.setText(String.valueOf(result));
                } catch (Exception e) {
                    display.setText("Error");
                }
            }
        } else if (event.getSource() == four) {
               String expression = display.getText() ;

            if(expression.length() >= 0){
            display.setText(display.getText() + "4");
            }
             expression += "4";
            if (expression.length() > 2 && expression.matches(".*[-+*/].*")) {
                try {

                    System.out.println(expression);

                    double result = evaluateExpression(expression);
                    display.setText(String.valueOf(expression));
                    display2.setText(String.valueOf(result));
                } catch (Exception e) {
                    display.setText("Error");
                }
            }
        } else if (event.getSource() == five) {
             String expression = display.getText() ;

            if(expression.length() >= 0){
            display.setText(display.getText() + "5");
            }
             expression += "5";
            if (expression.length() > 2 && expression.matches(".*[-+*/].*")) {
                try {

                    System.out.println(expression);

                    double result = evaluateExpression(expression);
                    display.setText(String.valueOf(expression));
                    display2.setText(String.valueOf(result));
                } catch (Exception e) {
                    display.setText("Error");
                }
            }
        } else if (event.getSource() == six) {
               String expression = display.getText() ;

            if(expression.length() >= 0){
            display.setText(display.getText() + "6");
            }
             expression += "6";
            if (expression.length() > 2 && expression.matches(".*[-+*/].*")) {
                try {

                    System.out.println(expression);

                    double result = evaluateExpression(expression);
                    display.setText(String.valueOf(expression));
                    display2.setText(String.valueOf(result));
                } catch (Exception e) {
                    display.setText("Error");
                }
            }
        } else if (event.getSource() == seven) {
            String expression = display.getText() ;

            if(expression.length() >= 0){
            display.setText(display.getText() + "7");
            }
             expression += "7";
            if (expression.length() > 2 && expression.matches(".*[-+*/].*")) {
                try {

                    System.out.println(expression);

                    double result = evaluateExpression(expression);
                    display.setText(String.valueOf(expression));
                    display2.setText(String.valueOf(result));
                } catch (Exception e) {
                    display.setText("Error");
                }
            }
        } else if (event.getSource() == eight) {
            String expression = display.getText() ;

            if(expression.length() >= 0){
            display.setText(display.getText() + "8");
            }
             expression += "8";
            if (expression.length() > 2 && expression.matches(".*[-+*/].*")) {
                try {

                    System.out.println(expression);

                    double result = evaluateExpression(expression);
                    display.setText(String.valueOf(expression));
                    display2.setText(String.valueOf(result));
                } catch (Exception e) {
                    display.setText("Error");
                }
            }
        } else if (event.getSource() == nine) {
               String expression = display.getText() ;

            if(expression.length() >= 0){
            display.setText(display.getText() + "9");
            }
             expression += "9";
            if (expression.length() > 2 && expression.matches(".*[-+*/].*")) {
                try {

                    System.out.println(expression);

                    double result = evaluateExpression(expression);
                    display.setText(String.valueOf(expression));
                    display2.setText(String.valueOf(result));
                } catch (Exception e) {
                    display.setText("Error");
                }
            }
        } else if (event.getSource() == zero) {
               String expression = display.getText() ;

            if(expression.length() > 0){
            display.setText(display.getText() + "0");
            }
             expression += "0";
            if (expression.length() > 2 && expression.matches(".*[-+*/].*")) {
                try {

                    System.out.println(expression);

                    double result = evaluateExpression(expression);
                    display.setText(String.valueOf(expression));
                    display2.setText(String.valueOf(result));
                } catch (Exception e) {
                    display.setText("Error");
                }
            }
        } else if (event.getSource() == clear) {
            display.setText("");
            display2.setText("");
        } else if (event.getSource() == plus) {
            String data = display.getText();

            int lastIndex = data.length() - 1;
            char lastCharacter = data.charAt(lastIndex);
            if (lastIndex == 0) {
                if (lastCharacter == '-') {

                } else {
                    display.setText(display.getText() + "+");
                }
            } else if (lastIndex >= 0) {

                if (lastCharacter == '/' || lastCharacter == '+' || lastCharacter == '*' || lastCharacter == '-') {
                    StringBuilder stringBuilder = new StringBuilder(data);
                    stringBuilder.setCharAt(data.length() - 1, '+');
                    String modifiedString = stringBuilder.toString();
                    display.setText(modifiedString);
                } else {
                    display.setText(display.getText() + "+");
                }

            }

        } else if (event.getSource() == minus) {
            String data = display.getText();

            int lastIndex = data.length() - 1;

            if (lastIndex >= 0) {
                char lastCharacter = data.charAt(lastIndex);

                if (lastCharacter == '/' || lastCharacter == '+' || lastCharacter == '*' || lastCharacter == '-') {
                    StringBuilder stringBuilder = new StringBuilder(data);
                    stringBuilder.setCharAt(data.length() - 1, '-');
                    String modifiedString = stringBuilder.toString();
                    display.setText(modifiedString);
                } else {
                    display.setText(display.getText() + "-");
                }
            } else {
                display.setText(display.getText() + "-");
            }

        } else if (event.getSource() == mult) {

            String data = display.getText();

            int lastIndex = data.length() - 1;
            char lastCharacter = data.charAt(lastIndex);
            if (lastIndex == 0) {
                if (lastCharacter == '-') {

                } else {
                    display.setText(display.getText() + "*");
                }
            }

            else if (lastIndex >= 0) {

                if (lastCharacter == '/' || lastCharacter == '+' || lastCharacter == '*' || lastCharacter == '-') {
                    StringBuilder stringBuilder = new StringBuilder(data);
                    stringBuilder.setCharAt(data.length() - 1, '*');
                    String modifiedString = stringBuilder.toString();

                    display.setText(modifiedString);
                } else {
                    display.setText(display.getText() + "*");
                }

            }

        } else if (event.getSource() == div) {

            String data = display.getText();

            int lastIndex = data.length() - 1;
            char lastCharacter = data.charAt(lastIndex);
            System.out.println(lastIndex);
            if (lastIndex == 0) {
                if (lastCharacter == '-') {
                    System.out.println(lastIndex);
                } else {
                    display.setText(display.getText() + "/");
                }
            }

            else if (lastIndex >= 0) {

                if (lastCharacter == '/' || lastCharacter == '+' || lastCharacter == '*' || lastCharacter == '-') {
                    StringBuilder stringBuilder = new StringBuilder(data);
                    stringBuilder.setCharAt(data.length() - 1, '/');
                    String modifiedString = stringBuilder.toString();
                    display.setText(modifiedString);
                } else if (lastCharacter != '-') {
                    display.setText(display.getText() + "/");
                }

            }

        } else if (event.getSource() == equals) {
            String expression = display.getText();
            try {
                double result = evaluateExpression(expression);
                display.setText(String.valueOf(result));
                display2.setText(String.valueOf(expression));

            } catch (Exception e) {
                display.setText("Error");
            }
        }
    }

    public static double evaluateExpression(String expression) {
        Stack<Double> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch) || ch == '-' && ch == expression.charAt(0) ) {
                StringBuilder numStr = new StringBuilder();

                if (ch == '-' ) {
                    numStr.append('-'); // Add the negative sign to the number
                    i++; // Move to the next character
                }
                while (i < expression.length()
                        && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    numStr.append(expression.charAt(i));
                    i++;
                }
                i--;

                double num = Double.parseDouble(numStr.toString());
                operands.push(num);
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operators.isEmpty() && hasPrecedence(ch, operators.peek())) {
                    double secondOperand = operands.pop();
                    double firstOperand = operands.pop();
                    char operator = operators.pop();
                    double result = applyOperator(firstOperand, secondOperand, operator);
                    operands.push(result);
                }
                operators.push(ch);
            }
        }

        while (!operators.isEmpty()) {
            double secondOperand = operands.pop();
            double firstOperand = operands.pop();
            char operator = operators.pop();
            double result = applyOperator(firstOperand, secondOperand, operator);
            operands.push(result);
        }

        return operands.pop();
    }

    public static boolean hasPrecedence(char op1, char op2) {
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        return true;
    }

    public static double applyOperator(double a, double b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
