package org.example.leet;

import java.util.Scanner;

public class CalculatorCurrency {
    //CODE: Here's a basic Java code for a currency calculator:

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double exchangeRate;

            System.out.println("Enter the exchange rate from USD to your currency:");
            exchangeRate = input.nextDouble();

            System.out.println("Enter the amount in USD:");
            double usdAmount = input.nextDouble();

            double convertedAmount = usdAmount * exchangeRate;

            System.out.println("Amount in your currency: " + convertedAmount);
        }
    }


