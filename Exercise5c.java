// Write a java program for abstract class to find areas of different shapes 

public class Exercise5c{
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        triangle t1 = new triangle();
        square s1 = new square();
        System.out.println("The area of rectangle is: " + r1.area());
        System.out.println("The area of triangle is: " + t1.area());
        System.out.println("The area of square is: " + s1.area());
    }
}

abstract class shape {
    abstract double area();
}

class rectangle extends shape {
    double l = 10, b = 20;

    @Override
    double area() {
        return l * b;
    }
}

class triangle extends shape {
    double b = 20, h = 10;

    @Override
    double area() {
        return 0.5 * b * h;
    }
}

class square extends shape {
    double side = 10;

    @Override
    double area() {
        return side * side;
    }

}