package FortuneCloudClass;

import java.util.Scanner;

public class checkVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any Alphabet : ");
         char c=sc.next().charAt(0);

         c = Character.toLowerCase(c);

        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ){
            System.out.println("Alphabet is Vowel");
        }else{
            System.out.println("Alphabet is Consonant");
        }
    }
}
