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
            display.setText(display.getText() + "1");
        } else if (event.getSource() == two) {
            display.setText(display.getText() + "2");
        } else if (event.getSource() == three) {
            display.setText(display.getText() + "3");
        } else if (event.getSource() == four) {
            display.setText(display.getText() + "4");
        } else if (event.getSource() == five) {
            display.setText(display.getText() + "5");
        } else if (event.getSource() == six) {
            display.setText(display.getText() + "6");
        } else if (event.getSource() == seven) {
            display.setText(display.getText() + "7");
        } else if (event.getSource() == eight) {
            display.setText(display.getText() + "8");
        } else if (event.getSource() == nine) {
            display.setText(display.getText() + "9");
        } else if (event.getSource() == zero) {
            display.setText(display.getText() + "0");
        } else if (event.getSource() == clear) {
            display.setText("");
        } else if (event.getSource() == plus) {
            display.setText(display.getText() + "+");
        } else if (event.getSource() == minus) {
            display.setText(display.getText() + "-");
        } else if (event.getSource() == mult) {
            display.setText(display.getText() + "*");
        } else if (event.getSource() == div) {
            display.setText(display.getText() + "/");
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
            if (Character.isDigit(ch)) {
                StringBuilder numStr = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
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
