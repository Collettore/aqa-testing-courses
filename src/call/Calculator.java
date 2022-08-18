package call;


import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner firstnum = new Scanner(System.in);
        //Scanner secondnum = new Scanner(System.in);
        System.out.println("Primitive calculator. v.0.0.4");
        System.out.print("Enter your first number → ");
        float num1 = firstnum.nextFloat();

        System.out.print("Enter your second number → ");
        float num2 = firstnum.nextFloat();

        float result1 = num1 + num2;
        float result2 = num1 - num2;
        float result3 = num1 * num2;
        float result4 = num1 / num2;

        System.out.println("Calculation result ↓" + "\n");
        System.out.println(num1 + " + " + num2 + " = " + result1);
        System.out.println(num1 + " - " + num2 + " = " + result2);
        System.out.println(num1 + " * " + num2 + " = " + result3);
        System.out.println(num1 + " / " + num2 + " = " + result4);
        System.out.println("\n" + "Thank you for using our program");








    }
}
