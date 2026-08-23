package FortuneCloudClass;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Days : ");

        int dayss=sc.nextInt();

        int year=dayss/365;
        int remainingdays= dayss % 365;


        int weeks= remainingdays/7;
        int remaining =remainingdays % 7;

        System.out.println("Year : "+year);
        System.out.println("Weeks : "+weeks);
        System.out.println("Days : "+remaining);




    }
}
