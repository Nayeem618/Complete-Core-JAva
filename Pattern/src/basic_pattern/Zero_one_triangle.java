package basic_pattern;
import java.util.Scanner;
public class Zero_one_triangle {
    public static void main(String[] args) {
        int rows,col,row,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        rows=sc.nextInt();
        for(row=1;row<=rows;row++){
            for (col=1;col<=row;col++) {
                sum=row+col;
                if(sum%2==0){
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
        System.out.println("\n"+"it's a Zero one triangle");
    }
}
