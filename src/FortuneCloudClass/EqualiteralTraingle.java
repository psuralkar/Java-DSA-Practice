package FortuneCloudClass;

import java.util.Scanner;

public class EqualiteralTraingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Side : ");
        double side=sc.nextDouble();

        double area=(Math.sqrt(3)/4)*side*side;

        System.out.println("Area of Equaliteral Traingle : "+area);

    }
}
