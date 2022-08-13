package basic_pattern;

import java.util.Scanner;
public class Floyd_triangle {
    public static void main(String[] args) {
        int rows,col,row,number=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        rows=sc.nextInt();
        for(row=1;row<=rows;row++){
            for (col=1;col<=row;col++) {
                System.out.print(" "+number);
                number++;
            }
            System.out.println("");
        }
        System.out.println("\n"+"it's a Floyd triangle");
    }
}
