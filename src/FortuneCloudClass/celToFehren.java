package FortuneCloudClass;

import java.util.Scanner;

public class celToFehren {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter temperature in Fehrenheit : ");
        float Fehrenheit =sc.nextFloat();

        float celsius= (Fehrenheit +32) * 5/9;

        System.out.println("temperature in Celsius : "+ celsius);
    }
}
