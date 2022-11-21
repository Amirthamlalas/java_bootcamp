import java.util.Scanner;


public class Calculator {



    public static void main(String[] args) {

            int n1,n2,ex;
            do {
                System.out.println("Enter 1 for Add, 2 for Subtraction, 3 for Multiplication, 4 for division and 5 for Exit");
                Scanner ch = new Scanner(System.in);
                int c = ch.nextInt();

                if(c!=5) {
                    System.out.println("Enter the first number");
                    Scanner num1 = new Scanner(System.in);
                     n1 = num1.nextInt();
                    System.out.println("Enter the second number");
                    Scanner num2 = new Scanner(System.in);
                     n2 = num2.nextInt();
                }
                else
                    break;
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
                        System.out.println("Ans of multiplication\t:"+mul);
                        break;
                    case 4:
                        try {
                            int div = n1 / n2;

                            System.out.println("Ans of division\t:" + div);
                        } catch (ArithmeticException e) {
                            System.out.println("error : NUMBER DIVIDED BY ZERO");
                        }
                        finally {
                            break;
                        }

                    case 5:

                        break;
                    default :
                        System.out.println("invalid input");
                }


                System.out.println("want to continue");
                ex=ch.nextInt();


            }while(ex==1);
    }
}
