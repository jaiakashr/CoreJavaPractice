package Methods;

import java.util.Random;

public class ParameterAndReturnValues {
    // method without return value
    void greet() {
        System.out.println("Welcome to Calculator!");
    }

    // method with parameters & return value
    int add(int a, int b) {
        return a + b;
    }
    
    // No parameters, but returns an int
    int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);  // returns a number between 0-99
    }
    
    // Method with parameter, no return
    void printSquare(int n) {
        int square = n * n;
        System.out.println("Square of " + n + " = " + square);
    }

    public static void main(String[] args) {
        ParameterAndReturnValues c = new ParameterAndReturnValues();  // create object

        c.greet();  // calling void method

        int sum = c.add(5, 7);  // calling with return value
        System.out.println("Sum = " + sum);
        
        int num = c.getRandomNumber();  // calling method
        System.out.println("Random Number: " + num);
        
        c.printSquare(5);   // calling method with parameter
        c.printSquare(12);  // calling again with another value
    }
}
