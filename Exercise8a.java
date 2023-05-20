// Write a JAVA program that implements Runtimepolymorphism 

public class Exercise8a {

    public static void main(String args[]) {
        Ex8_1A a = new Ex8_1A();
        Ex8_1B b = new Ex8_1B();
        Ex8_1C c = new Ex8_1C();

        Ex8_1A ref;
        ref = a;
        a.display();
        ref = b;
        b.display();
        ref = c;
        ref.display();

    }

}

class Ex8_1A {
    void display() {
        System.out.println("Inside A class");
    }
}

class Ex8_1B extends Ex8_1A {
    void display() {
        System.out.println("Inside B class");
    }
}

class Ex8_1C extends Ex8_1A {
    void display() {
        System.out.println("Inside C class");
    }
}