
// Write a JAVA program for creation of Illustrating throw

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class Exercise9a{
    public static void main(String[] args) {
        try {
            int age = -5;
            if (age < 0) {
                throw new AgeException("Invalid age: " + age);
            }
        } catch (AgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}