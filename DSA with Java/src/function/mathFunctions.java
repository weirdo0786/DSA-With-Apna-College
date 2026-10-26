package function;

public class mathFunctions {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        double n = 25;
        double x = -15.5;

        // a. Math.min()
        System.out.println("Minimum value: " + Math.min(a, b));

        // b. Math.max()
        System.out.println("Maximum value: " + Math.max(a, b));

        // c. Math.sqrt()
        System.out.println("Square root: " + Math.sqrt(n));

        // d. Math.pow()
        System.out.println("Power: " + Math.pow(2, 3));

        // e. Math.avg() - Java does not have a Math.avg() method
        double avg = (a + b) / 2.0;
        System.out.println("Average: " + avg);

        // f. Math.abs()
        System.out.println("Absolute value: " + Math.abs(x));
    }
}
