package FortuneCloudClass;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter temperature in celsius : ");
        float celsius=sc.nextFloat();

        float fehrenheit= (celsius * 9/5) + 32;

        System.out.println("temperature in fehrenheit: "+ fehrenheit);
    }
}
