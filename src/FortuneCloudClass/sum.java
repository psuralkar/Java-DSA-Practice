package FortuneCloudClass;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Sum of two number is=" + (a+b));
        System.out.println("substraction of two number is=" + (a-b));
        System.out.println("Multiplication of two number is=" + (a*b));
        System.out.println("Division of two number is=" + (a/b));

    }
}
