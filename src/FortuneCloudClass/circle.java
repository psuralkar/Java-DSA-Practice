package FortuneCloudClass;
import java.util.*;
public class circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        float radius = sc.nextFloat();
        float pi= 3.14f;
        float cirf= (2*pi*radius);
        float dia=2*radius;
        float area= pi*radius*radius;

        System.out.println(cirf);
        System.out.println(dia);
        System.out.println(area);

    }
}
