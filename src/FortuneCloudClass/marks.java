package FortuneCloudClass;
import java.util.*;

public class marks {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter marks of subject 1: ");
            float m1 = sc.nextFloat();

            System.out.print("Enter marks of subject 2: ");
            float m2 = sc.nextFloat();

            System.out.print("Enter marks of subject 3: ");
            float m3 = sc.nextFloat();

            System.out.print("Enter marks of subject 4: ");
            float m4 = sc.nextFloat();

            System.out.print("Enter marks of subject 5: ");
            float m5 = sc.nextFloat();

            float total = m1 + m2 + m3 + m4 + m5;
            float average = total / 5;
            float percentage = (total / 500) * 100;

            System.out.println("Total = " + total);
            System.out.println("Average = " + average);
            System.out.println("Percentage = " + percentage + "%");

    }
}
