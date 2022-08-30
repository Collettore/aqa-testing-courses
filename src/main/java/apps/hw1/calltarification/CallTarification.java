package apps.hw1.calltarification;

import java.util.Scanner;

public class CallTarification {

    public static void main(String[] args){

        Scanner enternumber = new Scanner(System.in);
        System.out.println("Welcome to the program for calculating costs for calls abroad. version 0.0.3");
        System.out.println("Tariff for calls per minute of conversation:" + "\n" + "-Italy: ₴ 16.40" + "\n" + "-England: ₴ 21.30" + "\n" + "-USA: ₴ 33.15");
        System.out.print("\n" + "For a correct calculation, you need to enter the approximate time of the calls one by one");
        float italy = (float) 16.40;
        float england = (float) 21.30;
        float usa = (float) 33.15;



        System.out.print("\n" + "Enter the approximate time of calls to Italy → ");
        float callitaly = enternumber.nextFloat();

        System.out.print("Enter the approximate time of calls to England → ");
        float callengland = enternumber.nextFloat();

        System.out.print("Enter the approximate time of calls to USA → ");
        float callusa = enternumber.nextFloat();

        float resultitaly = callitaly * italy;
        float resultengland = callengland * england;
        float resultusa = callusa * usa;

        System.out.println("\n" + "According to the preliminary calculation, you spent:");
        System.out.println("Calls to Italy:" + "\n" + "\t" + "₴ " + italy + " * " + callitaly + " Totally: " + "₴ " + resultitaly);
        System.out.println("Calls to England:" + "\n" + "\t" + "₴ " + england + " * " + callengland + " Totally: " + "₴ " + resultengland);
        System.out.println("Calls to USA:" + "\n" + "\t" + "₴ " + usa + " * " + callusa + " Totally: " + "₴ " + resultusa);

        float resultotall = resultengland + resultitaly + resultusa;

        System.out.println("\n" + "The total costs were:" + " ₴ " + resultotall);










    }

}
