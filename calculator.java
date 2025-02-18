import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 
public class calculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    double num1,num2;
    char operation;
    System.out.println("Enter the first number:"); 
    num1 = scanner.nextDouble();
    System.out.println("Enter the second number:");
    num2 = scanner.nextDouble();   
    System.out.println("Enter the operation (+, -, *, /):");
    operation = scanner.next().charAt(0);
    switch (operation) {
        case '+':
        System.out.println("Result: " + (num1 + num2));
        break;
        case '-':
        System.out.println("Result: " + (num1 - num2));
        break;
        case '*':
        System.out.println("Result: " + (num1 * num2));
        break;
        case '/':
        if (num2 != 0) {
            System.out.println("Result: " + (num1 / num2));
            break;
            }
            else {
                System.out.println("Error! Division by zero is not allowed.");
                break;
                }
                }
                }
            }