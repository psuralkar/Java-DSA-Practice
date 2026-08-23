package FortuneCloudClass;

import java.util.Scanner;

public class centimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Eneter length in cm : ");
        float cm=sc.nextInt();

        float meter=cm / 100;
        float kilometer= cm / 100000;

        System.out.println(meter);
        System.out.println(kilometer);

    }
}
