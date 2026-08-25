package FortuneCloudClass;

import java.util.Scanner;

public class checkdivisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter No:");
        int num= sc.nextInt();

        if(num % 5 == 0 && num % 11 == 0){
            System.out.println("Number is Divisible");
        }else {
            System.out.println("Number is not Divisible");
        }
    }
}
