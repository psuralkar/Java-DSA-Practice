package FortuneCloudClass;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Principle: ");
        float p=sc.nextFloat();

        System.out.println("Enter Rate: ");
        float r=sc.nextFloat();

        System.out.println("Enter time: ");
        float t=sc.nextFloat();

        double amount= p * Math.pow((1+r/100), t);
        double ci=amount-p;

        System.out.println("Compound Interest : "+ ci);
        System.out.println("Total Amount: "+amount);
    }
}
