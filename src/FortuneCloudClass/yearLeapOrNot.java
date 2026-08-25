package FortuneCloudClass;

import java.util.Scanner;

public class yearLeapOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Year is Leap ");
        int year=sc.nextInt();

        if(year % 400 == 0 || (year%4==0 && year%100!=0)){
            System.out.println("Year is Leap ");
        }else{
            System.out.println("not a leap year");
        }
    }



}
