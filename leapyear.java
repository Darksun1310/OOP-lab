import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        

        System.out.print("Enteryear: ");
        int year = scanner.nextInt(); 

        if (isLeapYear(year)) {
            System.out.println(year + " =leapyear.");
        } else {
            System.out.println(year + " =noleapyear.");
        }

        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 );
    }
}