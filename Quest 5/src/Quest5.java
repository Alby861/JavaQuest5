// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Quest5 {
    // Odd numbers method:
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
    // Even numbers method:
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    // square number method:

    public static int square(int number) {
        return number * number;
    }

    // cube method:

    public static int cube(int number) {
        return number * number * number;
    }

    public static void main(String[] args) {
    int num1 = 5;
    int num2= 10;


    // Odd numbers method
    if (isOdd(num1)) {
        System.out.println(num1+ " is odd.");
    } else {
        System.out.println(num1 + " is not odd.");
    }

    if (isOdd(num2)) {
        System.out.println(num2 + " is odd.");
    } else {
        System.out.println(num2 + " is not odd");
    }


    // even number method
    if (isEven(num1)) {
        System.out.println(num1 + " is even.");
    } else {
        System.out.println(num1 + " is not even.");
    }

    if (isEven(num2)) {
        System.out.println(num2 + " is even.");
        } else {
        System.out.println(num2 + " is not even.");
    }

    // square methods

        int squared = square(num1);
        int squared2= square(num2);
        System.out.println("the square of " + num1 + " is " + squared);
        System.out.println("the square of " + num2 + " is " + squared2);


    // cube methods

        int cubed = cube(num1);
        int cubed2 = cube(num2);
        System.out.println("the cube of " + num1 + " is " + cubed);
        System.out.println("the cube of " + num2 + " is " + cubed2);

    }
}