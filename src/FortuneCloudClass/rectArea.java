package FortuneCloudClass;

import java.util.Scanner;

public class rectArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter length and breadth");

        float length=sc.nextFloat();
        float breadth=sc.nextFloat();

        float area= length * breadth;

        System.out.println(area);
    }
}
