// Write a JAVA program to sort for an element in a given list of elements using mergesort.

import java.util.Scanner;
public class Exercise2c {
    public static void main(String [] args){
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the size of the array ");
            int n=in.nextInt();
            int [] a= new int[n];
            System.out.println("Enter the elements into the array :");
            for(int i=0;i<a.length;i++){
                a[i]=in.nextInt();
            }
            mergeSort(a,0,a.length-1);
            System.out.println("The sorted array is :");
            for(int i=0;i<a.length;i++){
                System.out.print(a[i] + " ");
            }
        }
    }
    public static void mergeSort(int [] a,int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            mergeSort(a,low,mid);
            mergeSort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }
    public static void merge(int [] a,int low,int mid,int high){
        int [] b = new int[high+1];
        int i=low;
        int j=mid+1;
        int k=low;
        while(i<=mid && j<=high){
            if(a[i]<a[j]){
                b[k]=a[i];
                i++;
            }
            else{
                b[k]=a[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=high){
                b[k]=a[j];
                j++;
                k++;
            }
        }
        else{
            while(i<=mid){
                b[k]=a[i];
                i++;
                k++;
            }
        }
        for(int p=low;p<=high;p++){
            a[p]=b[p];
        }
    }
}