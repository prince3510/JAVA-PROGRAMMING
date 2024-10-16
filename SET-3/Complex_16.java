import java.util.*;

public class Complex_16 {

    private double real;
    private double imaginary;

    public Complex_16 () {
    }

    public Complex_16 (double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static Complex_16  getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter real part: ");
        double real = scanner.nextDouble();
        System.out.print("Enter imaginary part: ");
        double imaginary = scanner.nextDouble();
        scanner.close();
        return new Complex_16 (real, imaginary);
    }

    public Complex_16 add(Complex_16 other) {
        return new Complex_16(real + other.real, imaginary + other.imaginary);
    }

    public Complex_16 subtract(Complex_16 other) {
        return new Complex_16(real - other.real, imaginary - other.imaginary);
    }

    public Complex_16 multiply(Complex_16 other) {
        double newReal = (real * other.real) - (imaginary * other.imaginary);
        double newImaginary = (real * other.imaginary) + (imaginary * other.real);
        return new Complex_16(newReal, newImaginary);
    }

    
    public String toString() {
        return String.format("%.2f + %.2fi", real, imaginary);
    }

    public static void main(String[] args) {
        System.out.println("Enter first complex number:");
        Complex_16 number1 = getInput();
        System.out.println("Enter second complex number:");
        Complex_16 number2 = getInput();

        Complex_16 sum = number1.add(number2);
        Complex_16 difference = number1.subtract(number2);
        Complex_16 product = number1.multiply(number2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.print("\nName : PRINCE MALAVIYA_23DCS057 ");

    }
}