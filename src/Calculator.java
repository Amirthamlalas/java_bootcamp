import java.util.Scanner;
class choice{


    public choice(int n1,int n2, int c) {

        switch (c){

            case 1:
                int ans = n1+n2;
                System.out.println("Ans of Addition\t:"+ans);
                break;
            case 2:
                int sub = n1-n2;
                System.out.println("Ans of Subtraction\t:"+sub);
                break;
            case 3:
                int mul = n1*n2;
                System.out.println("Ans of Subtraction\t:"+mul);
                break;
            default:
                System.out.println("invalid input");
        }
    }
}

public class Calculator {



    public static void main(String[] args) {

        System.out.println("Enter the first number");
        Scanner num1 = new Scanner(System.in);
        int n1 = num1.nextInt();
        System.out.println("Enter the second number");
        Scanner num2 = new Scanner(System.in);
        int n2 = num2.nextInt();

        System.out.println("Enter 1 for Add, 2 for Subtraction, 3 for Multiplication or 4 for division");

        Scanner ch = new Scanner(System.in);
        int c = ch.nextInt();

        choice cho = new choice(n1,n2,c);
    }
}
