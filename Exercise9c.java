//Write a JAVA program for creation of Java Built-inExceptions

public class Exercise9c {
    public static void main(String[] args) {
        try {
            // ArithmeticException
            int x = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            // NullPointerException
            String s = null;
            int length = s.length();
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            // ArrayIndexOutOfBoundsException
            int[] arr = { 1, 2, 3 };
            int val = arr[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            // IllegalArgumentException
            int age = -5;
            if (age < 0) {
                throw new IllegalArgumentException("Invalid age: " + age);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}