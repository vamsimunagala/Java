//Write a JAVA program to implement Multi-level Inheritance

class A {
    public int x;

    void display() {
        System.out.print("x=" + x);
    }
}

class B extends A {
    public int y;

    void displayB() {
        System.out.print("y=" + y);
    }
}

class C extends B {
    public int z;

    void displayC() {
        System.out.println("z=" + z);
        System.out.println("y=" + y);
        System.out.println("x=" + x);
    }
}

class Exercise5b {
    public static void main(String[] args) {
        C obj = new C();
        obj.x = 10;
        obj.y = 20;
        obj.z = 30;
        obj.displayC();
    }
}