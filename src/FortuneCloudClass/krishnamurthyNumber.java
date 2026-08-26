package FortuneCloudClass;

import java.util.Scanner;

public class krishnamurthyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter The Number :");
        int num=sc.nextInt();

        int original=num;
        int sum=0;

        while(num>0){

            int rem= num % 10;
            int fact=1;
            for(int i=1; i<=rem; i++){
                fact=fact*i;
            }
            sum=sum+fact;

            num=num/10;
        }
        if(original == sum){
            System.out.println("Number is Krishnamurthy ");
        }else {
            System.out.println("Number is not Krishnamurthy ");
        }
    }


}
