// 2.2.5 Write a program to calculate sum, difference, product, and quotient of 2
//  double numbers which are entered by users.

import javax.swing.JOptionPane;

public class CalcTwoNumbers {

    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "Calculated result\n";
        strNum1 = JOptionPane.showInputDialog(null,
        "Please input the first number: ", "Input the first number",
        JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        // strNotification += strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
                double num2 = Double.parseDouble(strNum2);
        strNotification += "Sum: " + (num1 + num2) + "\n";
        strNotification += "Difference: " + (num1 - num2) + "\n";
        strNotification += "Product: " + (num1 * num2) + "\n";
        strNotification += "Quotient: " + (num1 / num2) + "\n";
        JOptionPane.showMessageDialog(null, strNotification,
                "Nguyen Ngan Ha - 20225713 - Calc two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
