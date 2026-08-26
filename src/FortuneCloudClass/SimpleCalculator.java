package FortuneCloudClass;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1st Number : ");
        double num1=sc.nextDouble();

        System.out.println("Enter Operator (+, -, *, /): ");
        char operator=sc.next().charAt(0);

        System.out.println("Enter 2nd Number : ");
        double num2=sc.nextDouble();

        double result;
        if(operator == '+'){
            result=num1+num2;
            System.out.println("Addition is: "+result);
        } else if (operator == '-') {
            result=num1-num2;
            System.out.println("Substraction is :"+result);
        }else if (operator == '*') {
            result=num1*num2;
            System.out.println("Multiplication is :" +result);
        }
        else if (operator == '/') {
            result=num1/num2;
            System.out.println("Division is :" +result);
        }


    }
}
