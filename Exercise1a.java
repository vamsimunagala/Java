// Write a JAVA program to display default value of all primitive data type ofJAVA 

public class Exercise1a {
    byte a;
    short b;
    int c;                              
    long d;
    float e;
    double f;
    char g;
    boolean h;
    public static void main(String [] args){
        Exercise1a obj = new Exercise1a();
        System.out.println("Default value of byte is " + obj.a);
        System.out.println("Default value of short is " + obj.b);
        System.out.println("Default value of int is " + obj.c);
        System.out.println("Default value of long is " + obj.d);
        System.out.println("Default value of float is " + obj.e);
        System.out.println("Default value of double is " + obj.f);
        System.out.println("Default value of char is " + obj.g);
        System.out.println("Default value of boolean is " + obj.h);
        
    }

}
