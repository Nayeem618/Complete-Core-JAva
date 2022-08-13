package basic_pattern;

import java.util.Scanner;

public class Hollow_Rectangle {
    public static void main(String[] args) {
        int rows,col,row;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        rows=sc.nextInt();
        for(row=1;row<=rows;row++){
            for (col=1;col<=rows;col++) {
                if((col==1 || row==1) || (col==4 || row==4)){
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");//double space is given
                }
            }
            System.out.println(" ");
        }
        System.out.println("\n"+"it's a Hollow rectangle");
    }
}
