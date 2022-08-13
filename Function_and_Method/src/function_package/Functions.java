package function_package;
import java.util.Scanner;
public class Functions {
    public static int add(int a,int b){
        int sum=a+b;
        System.out.println("sum of two number is "+sum);
        return sum;
    }
    public static int product(int a,int b){
        int prod=a*b;
        System.out.println("product of two number is "+prod);
        return prod;
    }
    public static int factorial(int a){
        int fact=1;
        while (a>0){
          fact=fact*a;
            a--;
        }
        System.out.println("factorial is "+fact);
        return fact; //have to check return keyword
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first value");
        int num1=sc.nextInt();
        System.out.println("Enter the second value");
        int num2 =sc.nextInt();
        add(num1,num2);//function call
        product(num1,num2);
        factorial(num1);
    }
    
}
