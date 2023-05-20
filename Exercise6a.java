// Write a JAVA program give example for “super”keyword. 

// Path: Exercise6a.java

public class Exercise6a {
    public static void main(String args[]) {
        Ex6_1B b1 = new Ex6_1B();
        int r = b1.volume();
        System.out.println("The vol. is:" + r);
    }

}

class Ex6_1A {
    int l, b;

    Ex6_1A() {
        l = 10;
        b = 20;
    }
}

class Ex6_1B extends Ex6_1A {
    int h;

    Ex6_1B() {
        super();
        h = 30;
    }

    int volume() {
        return l * b * h;
    }
}