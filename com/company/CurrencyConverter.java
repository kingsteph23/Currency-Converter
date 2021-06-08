package com.company;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import  java.text.DecimalFormat;
import java.time.*;

public class CurrencyConverter {

    public static void main(String[] args) {
// Currencies From North America, Europe, Asia, and Oceania
		String[] currencies ={"US dollar(USD)\uD83C\uDDFA\uD83C\uDDF8",
				"\nCanadian Dollar(CAD)\uD83C\uDDE8\uD83C\uDDE6",
				"\nMexican Pesos(MXN)\uD83C\uDDF2\uD83C\uDDFD",
				"\nHaitian Gourde(HTG)\uD83C\uDDED\uD83C\uDDF9",
				"\nEuros(EUR)\uD83C\uDDEA\uD83C\uDDFA",
				"\nPounds(GBP)\uD83C\uDDEC\uD83C\uDDE7",
				"\nRussian ruble(RUB)\uD83C\uDDF7\uD83C\uDDFA" +
				"\nSwiss franc(CHF)\uD83C\uDDE8\uD83C\uDDED",
				"\nturkish  lira🇹🇷(TRY)",
				"\nJapanese Yen(JPY)\uD83C\uDDEF\uD83C\uDDF5",
				"\nChinese Yuan(Yuan)\uD83C\uDDE8\uD83C\uDDF3",
				"\nHong Kong Dollar(HKD)\uD83C\uDDED\uD83C\uDDF0",
				"\nSouth Korean won(KRW)\uD83C\uDDF0\uD83C\uDDF7",
				"\nIndian rupee(INR)\uD83C\uDDEE\uD83C\uDDF3",
				"\nAustralian dollar(AUD)\uD83C\uDDE6\uD83C\uDDFA",
				"\nNew Zealand Dollar(NZD)\uD83C\uDDF3\uD83C\uDDFF"};


		Scanner scan = new Scanner(System.in);
		System.out.println("---------------------");
		System.out.println("  Currency Converter  ");
		System.out.println("---------------------");


		System.out.println("What is the time of day at your current location?" +
				"\nMorning" +
				"\nAfternoon" +
				"\nEvening" +
				"\n:");

	System.out.println();
		String TOD = scan.nextLine();
		System.out.println("Welcome to the currency converter!" +
				"\nWhat is your name?:");

		String nom = scan.nextLine();
		System.out.println();
// Allows users from the avaliable currencies(currency 1)
		System.out.println("Good,"+TOD+","+nom+"!");
		System.out.println();
		System.out.println("Select a currency to convert from:" +
				"\nNote you can use either the full currency name or the currency's code(whatever is in the ()." +
				"\nBut make sure you use type them EXACTLY as you see it." +
				"\n"+Arrays.toString(currencies)+
				"\n:");

    String  currencyconvert1 = scan.nextLine();

// Allows users to convert to another currency based on currency 1
	System.out.println();
    System.out.println("Depending on your choice from above." +
			"\nNow which currency do you wish to convert to?" +
			"\n"+Arrays.toString(currencies)+
			"\n:");

    String currencyconvert2 = scan.nextLine();


    }

}