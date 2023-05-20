// Write a java program that display the roots of a quadratic equation ax2+bx+c=0. Calculate the discriminate D and basing on value of D, describe the nature ofroot. 

import java.util.Scanner;
public class Exercise1b {
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of a");
            int a = sc.nextInt();
            System.out.println("Enter the value of b");
            int b = sc.nextInt();
            System.out.println("Enter the value of c");
            int c = sc.nextInt();
            double d = b*b - 4*a*c;
            if(d>0){
                System.out.println("Roots are real and unequal");
                double r1 = (-b + Math.sqrt(d))/(2*a);
                double r2 = (-b - Math.sqrt(d))/(2*a);
                System.out.println("Roots are " + r1 + " and " + r2);
            }
            else if(d==0){
                System.out.println("Roots are real and equal");
                double r1 = (-b + Math.sqrt(d))/(2*a);
                System.out.println("Roots are " + r1 + " and " + r1);
            }
            else{
                System.out.println("Roots are imaginary");
            }
        }
    }
    
}