// Write a JAVA program for creation of User DefinedException

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class User {
    private final String name;
    private final int age;

    public User(String name, int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Exercise9d {
    public static void main(String[] args) {
        try {
            User user = new User("John", 200);
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}