import java.sql.SQLOutput;
import java.util.Scanner;

public class ExtendArray {
    public static void main (String [] args){

        int[] numList;
        int size, total=0;
        Scanner keybd = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter a number of scores: ");
        size = keybd.nextInt();
        numList = new int[size];

        for (int item = 0; item < numList.length; item++){
            System.out.print("Enter a score: ");
            numList[item] = keybd.nextInt();
            total += numList[item];
        }

         System.out.print("The scores entered: ");
         for (int item:numList){
            System.out.printf("%d\t", item);
        }

        System.out.println();
        System.out.printf("The total is: %d", total);

    }
}
