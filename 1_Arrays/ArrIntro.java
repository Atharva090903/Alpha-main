// package Arrays;
import java.util.*;

public class ArrIntro {
    public static void main(String args[]) {
        //creating an array 

        int marks[] = new int[50];

        int numbers[] = {1, 2, 3};

        int moreNumbers[] = {4, 5, 6};

        String fruits[] = {"apple", "mango", "orange"};

        System.out.println(marks[0]);
        System.out.println(numbers[0]);
        System.out.println(moreNumbers[0]);
        System.out.println(fruits[0]);


        int mark[]= new int[30];
        Scanner sc = new Scanner(System.in);

        mark[0]=sc.nextInt();
        mark[1]=sc.nextInt();
        mark[2]=sc.nextInt();
        System.out.println("phy="+mark[0]);
        System.out.println("chem="+mark[1]);
        System.out.println("math="+mark[2]);

    }
}