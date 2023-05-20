//Write a JAVA program to implement constructor

public class Exercise3b {
    public static void main(String args[]) {
        EX3_2A a1 = new EX3_2A();
        int r = a1.area();
        System.out.println("The area is: " + r);
    }
}

class EX3_2A {
    int l, b;

    EX3_2A() {
        l = 10;
        b = 20;
    }

    int area() {
        return l * b;
    }
}