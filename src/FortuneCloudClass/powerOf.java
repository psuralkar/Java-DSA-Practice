package FortuneCloudClass;

import java.util.*;

public class powerOf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Number : ");
        System.out.println("Enetr the power you want : ");
        double n=sc.nextDouble();
        double p=sc.nextDouble();

        double power =Math.pow(n, p);

        System.out.println("Power is : "+ power);


    }
}
