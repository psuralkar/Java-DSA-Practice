package FortuneCloudClass;

import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Three Number : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("Maximum no is : "+num1);
        } else if (num2 > num3) {
            System.out.println("Maximum No is : "+num2);
        }else{
            System.out.println("Maximum no is : "+num3);
        }
    }
}
