package FortuneCloudClass;

import java.util.*;

public class perimeter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        float length=sc.nextFloat();
        float breadth= sc.nextFloat();

        float perim= 2*(length + breadth);

        System.out.println(perim);
    }
}
