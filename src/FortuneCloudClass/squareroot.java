package FortuneCloudClass;

import java.util.Scanner;

public class squareroot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number : ");

        double n= sc.nextDouble();

        double result=Math.sqrt(n);

        System.out.println("Square root is : "+ result);
    }
}
