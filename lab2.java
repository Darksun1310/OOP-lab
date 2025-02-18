import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("kitne budhe huye ho: ");
        int age = scanner.nextInt();   
 
        if (age >= 18) {
    System.out.println("bohot zyada");
    } else {
    System.out.println("utne bhi nahi huye ho.");
}}}