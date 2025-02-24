import java.util.Arrays;

public class OOP3 {
    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        System.out.println(Arrays.toString(cars));
        String[][] bikes = {
                { "Honda", "Yamaha", "Suzuki", "Kawasaki" },
                { "Ducati", "Triumph", "Harley-Davidson" } };
        System.out.println(Arrays.deepToString(bikes));
    }
}
