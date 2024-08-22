import java.util.Scanner;
import java.lang.Math;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String yn = "n";
        while (!(yn.equalsIgnoreCase("y"))) {
            Scanner sc = new Scanner(System.in);
            System.out.println(calculator());
            System.out.println("Would you like to exit? Y/N");
            yn = sc.next();
        }
    }

    public static double calculator() {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double x = 0;
        double y = 0;
        int operator;
        System.out.println("Please input your x value:");
        x = sc.nextDouble();
        System.out.println("What type of problem would you like to work?" +
                "\nAddition (x+y) : 1" +
                ", Multiplication (x*y) : 2" +
                ", Subtraction (x-y) : 3" +
                ", Division (x/y) : 4" +
                "\nSquare Root (sqrt(x)) : 5" +
                ", Power Of (x^y) : 6" +
                "\nSin (sin(x)) : 7, Cos (cos(x)) : 8, Tan (tan(x)) : 9" +
                "\nNatural Log (ln(x)) : 10, Exponential E (e^x) : 11");
        operator = sc.nextInt();
        if(x<=0&&(operator==5||operator==10)){
            System.out.println("Cannot use this function with a negative number.");
            return 0;
        }
        if(operator<7&&operator!=5){
            System.out.println("Please input your y value:");
            y = sc.nextDouble();
        }
        if(operator>11){
            System.out.println("Invalid operator. Please try again.");
            return 0;
        }
        switch(operator){
            case(1):
                return x+y;
            case(2):
                return x*y;
            case(3):
                return x-y;
            case(4):
                if(y==0){
                    System.out.println("Cannot divide by 0. Please try again.");
                    return 0;
                }
                return x/y;
            case(5):
                return Math.sqrt(x);
            case(6):
                double sqrsum=x;
                for(double i=y;i>1;i--){
                    sqrsum=sqrsum*x;
                }
                return sqrsum;
            case(7):
                return Math.sin(x);
            case(8):
                return Math.cos(x);
            case(9):
                return Math.tan(x);
            case(10):
                return Math.log(x);
            case(11):
                return Math.exp(x);
        }
        return 0;
    }
}