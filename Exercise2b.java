// Write a JAVA program to sort for an element in a given list of elements using bubblesort 

import java.util.Scanner;
public class Exercise2b {
    public static void main(String [] args){
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the size of the array ");
            int n=in.nextInt();
            int [] a= new int[n];
            System.out.println("Enter the elements into the array :");
            for(int i=0;i<a.length;i++){
                a[i]=in.nextInt();
            }
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a.length-1;j++){
                    if(a[j]>a[j+1]){
                        int temp = a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }
            System.out.println("The sorted array is :");
            for(int i=0;i<a.length;i++){
                System.out.print(a[i] + " ");
            }
        }
    }
}
