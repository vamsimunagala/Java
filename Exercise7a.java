// Write a JAVA program that describes exception handlingmechanism

public class Exercise7a {
    public static void main(String args[]) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("After the catch statement");
    }

}