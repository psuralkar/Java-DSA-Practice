//Kth Smallest
//        Given an integer array arr[] and an integer k, find and return the kth smallest element in the given array.

package Array;

import java.util.Scanner;
import java.util.Arrays;

public class KthSmallestlement {
    public static int KthSmallest(int[] arr, int k){
        Arrays.sort(arr);

        return arr[k-1];
    }
    public static void main(String[] args) {
//        int[] arr={10,5,4,3,48,6,2,33,53,10};
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the k value");
        int k=sc.nextInt();

        int ans=KthSmallest(arr,k);
        System.out.println(ans);


    }
}
