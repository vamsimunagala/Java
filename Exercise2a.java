// Write a JAVA program to search for an element in a given list of elements using binary search mechanism. 
import java.lang.System;
import java.util.Scanner;
public class Exercise2a {
    public static void main(String [] args){
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the size of the array ");
            int n=in.nextInt();
            int [] a= new int[n];
            System.out.println("Enter the elements into the array :");
            for(int i=0;i<a.length;i++){
                a[i]=in.nextInt();
            }
            System.out.println("Enter the Searching element :");
            int key = in.nextInt();
            int low=0;
            int high=n-1;
            int p=0;
            boolean flag=false;
            int mid=(low+high)/2;
            while(low<=mid){
                if(a[mid]>key)
                 high=mid-1;
                else if(a[mid]>key)
                 low=mid+1;
                 else if(a[mid]==key)
                 {
                    flag=true;
                    p=mid;
                    break;
                 }
            }
            if(flag)
                System.out.print("element is found at position no:"+p);
            else 
                System.out.println("element is not found");
        }
    }
}
