package FortuneCloudClass;

import java.util.Scanner;

public class AngleOfTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter first Angle of Triangle : ");
        float angle1= sc.nextFloat();

        System.out.println("Enter Second Angle of Triangle : ");
        float angle2= sc.nextFloat();

        float angle3=180 - (angle1+angle2);

        System.out.println("Third Angle is : "+ angle3);

    }
}
