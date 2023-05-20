//Write a JAVA program implement method overloading.

public class Exercise4b {

    public static void main(String args[]) {
        Ex4_2A a1 = new Ex4_2A();
        int r1 = a1.area();
        System.out.println("The area is: " + r1);
        int r2 = a1.area(5, 20);
        System.out.println("The area is: " + r2);
    }

}

class Ex4_2A {
    int l = 10, b = 20;

    int area() {
        return l * b;
    }

    int area(int l, int b) {
        return l * b;
    }

}