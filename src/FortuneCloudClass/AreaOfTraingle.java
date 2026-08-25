package FortuneCloudClass;

import java.util.Scanner;

public class AreaOfTraingle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Base of Traingle : ");
        float base=sc.nextFloat();

        System.out.println("Enter Height of Traingle : ");
        float height=sc.nextFloat();

        float area= 0.5f * base * height;

        System.out.println("Height of Traingle is : "+area);
    }
}
