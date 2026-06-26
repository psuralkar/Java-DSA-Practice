package Array;

import java.util.Scanner;

public class ReverseArray {
    static void reversarray(int[] marks){
        int left=0, right=marks.length-1;

        while(left<right){

            int temp=marks[left];
            marks[left]=marks[right];
            marks[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);

        int [] marks=new int[5];

        for(int i=0; i<marks.length;i++){
            marks[i]=sc.nextInt();
        }

        reversarray(marks);

        for(int i=0; i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }

    }
}
