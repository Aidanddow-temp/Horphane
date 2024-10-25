package Taxes;

/*
 * change amnount to call rate rather than cases
 * scanner
 * is tax as written or as in real world
 * unit testing
 */

public class TaxChallenge {

    public static void taxMain() {

        int income = 37000;

        System.out.println("Your tax rate is " + rate(income) +"%");
        System.out.println("Your tax amount is £" + amount(income));
    }

    public static int rate(int income) {

        int rate;

        if (income <= 14999) {

            rate = 0;

        }

        else if (income >= 15000 && income <= 19999) {

            rate = 10;

        }

        else if (income >= 20000 && income <= 29999) {

            rate = 15;

        }

        else if (income >= 30000 && income <= 44999) {

            rate = 20;

        }

        else {

            rate = 25;

        }

        return rate;

    }

    public static double amount(int income) {

        double taxAmount;

        if (income <= 14999) {

            taxAmount = 0;

        }

        else if (income >= 15000 && income <= 19999) {

            taxAmount = 0.10*income;

        }

        else if (income >= 20000 && income <= 29999) {

            taxAmount = 0.15*income;

        }

        else if (income >= 30000 && income <= 44999) {

            taxAmount = 0.20*income;

        }

        else {

            taxAmount = 0.25*income;

        }

        return taxAmount;

    }



}