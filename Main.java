import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("enter age : ");
        int age = scanner.nextInt();   
 
        if (age >= 18) {
    System.out.println("you are adult.");
    } else {
    System.out.println("not an adult.");
}}}