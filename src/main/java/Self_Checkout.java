/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
import java.util.Scanner;

public class Self_Checkout {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of item 1:");
        double itemOnePrice = input.nextDouble();
        System.out.println("Enter the amount of item 1:");
        int itemOneAmt = input.nextInt();
        System.out.println("Enter the price of item 2:");
        double itemTwoPrice = input.nextDouble();
        System.out.println("Enter the amount of item 2:");
        int itemTwoAmt = input.nextInt();
        System.out.println("Enter the price of item 3:");
        double itemThreePrice = input.nextDouble();
        System.out.println("Enter the amount of item 3:");
        int itemThreeAmt = input.nextInt();
        double itemOneTot = itemOneAmt*itemOnePrice;
        double itemTwoTot = itemTwoAmt*itemTwoPrice;
        double itemThreeTot = itemThreeAmt*itemThreePrice;
        final double tax = .055;
        double subtotal = itemOneTot + itemTwoTot + itemThreeTot;
        double taxable = tax*subtotal;
        double total = taxable + subtotal;
        String output = String.format("""
                                        Subtotal: $%.2f
                                        Tax: $%.2f
                                        Total: $%.2f""",
                                            subtotal, taxable, total);
        System.out.println(output);


    }
}
