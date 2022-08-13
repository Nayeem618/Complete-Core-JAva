package basic_pattern;
import java.util.Scanner;
public class Inverted2_half_pyramid {
    public static void main(String[] args) {
        int rows,col,row,space;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        rows=sc.nextInt();
        for(row=1;row<=rows;row++){
            for(space=1;space<=rows-row;space++)
                System.out.print("  ");//double space is given
            for (col=1;col<=row;col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println("\n"+"it's a Inverted Half Pyramid rotated by 180 degree");
    }
}
