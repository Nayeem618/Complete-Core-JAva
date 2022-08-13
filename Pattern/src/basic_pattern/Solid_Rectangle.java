package basic_pattern;
import java.util.Scanner;
public class Solid_Rectangle {
    public static void main(String[] args) {
        int rows,col,row;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        rows=sc.nextInt();
        for(row=1;row<=rows;row++){
            for (col=1;col<=rows;col++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        System.out.println("\n"+"it's a solid rectangle");
    }
}
