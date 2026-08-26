package FortuneCloudClass;

import java.util.Scanner;

public class checkPtiveNtive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number : ");
        int n=sc.nextInt();

        if(n>0){
            System.out.println("Number is positive");
        } else if (n < 0) {
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is Zero");
        }
    }
}
