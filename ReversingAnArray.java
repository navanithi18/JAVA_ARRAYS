import java.util.*;
public class ReversingAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements : ");

        int n=sc.nextInt();
        int arr[]=new int[n];
        int temp[]=new int[n];
        System.out.println("Enter the elements to be added :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            temp[i]=arr[n-1-i];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
        System.out.println("Reversed array is :");
        for (int i = 0; i < n; i++) {
            System.out.print( arr[i] + " ");
        }

    }
    }


