//Write a JAVA program to implement Single Inheritance

public class Exercise5a {
    public static void main(String args[]) {
        Ex5_1B object = new Ex5_1B();
    }

}

class Ex5_1A {
    Ex5_1A() {
        System.out.println("Inside Class A");
    }
}

class Ex5_1B extends Ex5_1A {
    Ex5_1B() {
        System.out.println("Inside Class B");
    }
}