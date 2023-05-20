//Write a JAVA program to implement constructor overloading.

public class Exercise4a {
    public static void main(String args[]) {
        Ex4_1A a1 = new Ex4_1A();
        int r1 = a1.area();
        System.out.println("The area is:" + r1);
        Ex4_1A a2 = new Ex4_1A(30, 40);
        int r2 = a2.area();
        System.out.println("The area is: " + r2);
    }
}

class Ex4_1A {
    int l, b;

    Ex4_1A() {
        l = 10;
        b = 20;
    }

    Ex4_1A(int length, int breth) {
        l = length;
        b = breth;
    }

    int area() {
        return l * b;
    }

}