package com.company;
// Imports all java modules
import java.util.*;
import  java.text.DecimalFormat;
// allows display of time zone,date,time
import java.time.*;

public class CurrencyConverter {

    public static void main(String[] args) {
// Currencies From North America, Europe, Asia, and Oceania
		String[] currencies ={"US dollar(USD)\uD83C\uDDFA\uD83C\uDDF8",
				"\nCanadian Dollar(CAD)\uD83C\uDDE8\uD83C\uDDE6",
				"\nEuros(EUR)\uD83C\uDDEA\uD83C\uDDFA",
				"\nPounds(GBP)\uD83C\uDDEC\uD83C\uDDE7",
				"\nSwiss franc(CHF)\uD83C\uDDE8\uD83C\uDDED",
				"\nJapanese Yen(JPY)\uD83C\uDDEF\uD83C\uDDF5",
				"\nChinese Yuan(CNY)\uD83C\uDDE8\uD83C\uDDF3",
				"\nHong Kong Dollar(HKD)\uD83C\uDDED\uD83C\uDDF0",
				"\nSouth Korean won(KRW)\uD83C\uDDF0\uD83C\uDDF7",
				"\nIndian rupee(INR)\uD83C\uDDEE\uD83C\uDDF3",
				"\nAustralian dollar(AUD)\uD83C\uDDE6\uD83C\uDDFA",
				"\nNew Zealand Dollar(NZD)\uD83C\uDDF3\uD83C\uDDFF"};

		DecimalFormat conversion = new DecimalFormat("##.###");
// allows users to input and write statements
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
// Allows users from the available currencies(currency 1)
		System.out.println("Good,"+TOD+","+nom+"!");
		System.out.println();
		System.out.println("Select a currency to convert from:" +
				"\nNote you can use either the full currency name or the currency's code(whatever is in the ()." +
				"\nBut make sure you use type them EXACTLY as you see it." +
				"\n"+Arrays.toString(currencies)+
				"\n:");

    String  currencyconvert1 = scan.nextLine();

//
    System.out.println();
		System.out.println("How much do you  do want to add:");
		int amount = scan.nextInt();

  	// actual conversions

// Conversions for US dollars
		if(currencyconvert1.equals("US dollar") || (currencyconvert1.equals("USD"))){
// USD -> EUROS
			double euro = amount * 0.821;
			System.out.println(""+amount+" USD ="+conversion.format(euro)+" Euros");
// USD -> CAD(Canadian dollars)
			double canadiandollar = amount * 1.21;
			System.out.println(""+amount+" USD = "+conversion.format(canadiandollar)+" CAD");
// USD -> GBP(British pounds
			double britishpound = amount * 0.70;
			System.out.println(""+amount+" USD ="+conversion.format(britishpound)+" GBP");
// USD -> CHF(Swiss francs)
			double swissfranc = amount * 0.896 ;
			System.out.println(""+amount+" USD ="+conversion.format(swissfranc)+" CHF");
// USD -> JPY(Japanese yen)
			double japaneseyen = amount * 109.48;
			System.out.println(""+amount+" USD ="+conversion.format(japaneseyen)+" JPY");
//USD -> CNY(Chinese Yuan)
			double chineseyuan = amount * 6.4;
			System.out.println(""+amount+ " USD ="+conversion.format(chineseyuan)+" CNY");
// USD -> HKD(Hong kong Dollars)
			double hongkongdollar = amount * 7.759;
			System.out.println(""+amount+ " USD ="+conversion.format(hongkongdollar)+ "HKD");
// USD -> KRW(South Korean dollars)
			double southkoreanwon = amount * 1116.5;
			System.out.println(""+amount+" USD ="+conversion.format(southkoreanwon)+" KRW");
// USD -> INR(Indian rupees)
			double indianrupee = amount * 72.969;
			System.out.println(""+amount+" USD ="+conversion.format(indianrupee)+" INR");
// USD -> AUD(Australian Dollars)
			double australiandollar = amount * 1.291;
			System.out.println(""+amount+" USD ="+conversion.format(australiandollar)+" AUD");
// USD -> NZD(New Zealand Dollars)
			double newzealanddollar = amount * 1.389;
			System.out.println(""+amount+" USD ="+conversion.format(newzealanddollar)+" NZD");

			// conversions for Canadian dollar
		}if(currencyconvert1.equals("Canadian Dollar")||currencyconvert1.equals("CAD")) {
// CAD -> USD
			double usdollar = amount * 0.82;
			System.out.println(""+amount+" CAD ="+conversion.format(usdollar)+ " USD");
// CAD -> EUR
			double euro = amount * 0.68;
			System.out.println(""+amount+" CAD ="+conversion.format(euro)+" EUR");
// CAD -> GBP
			double britishpound = amount * 0.58;
			System.out.println(""+amount+" CAD="+conversion.format(britishpound)+" GBP");
// CAD -> CHF
			double swissfrancs = amount * 0.74;
			System.out.println(""+amount+" CAD="+conversion.format(swissfrancs)+" CHF");
// CAD -> JPY
			double japaneseyen = amount * 90.2;
			System.out.println(""+amount+" CAD="+conversion.format(japaneseyen)+" JPY");
// CAD -> CNY
			double chineseyuan = amount * 5.26;
			System.out.println(""+amount+" CAD="+conversion.format(chineseyuan)+" CNY");
// CAD -> HKD
			double hkdollar = amount * 6.38;
			System.out.println(""+amount+" CAD="+conversion.format(hkdollar)+" HKD");
// CAD -> KRW
			double skwon = amount * 918.3;
			System.out.println(""+amount+" CAD="+conversion.format(skwon)+" KRW");
// CAD -> INR
			double indianrupee = amount * 60.22;
			System.out.println(""+amount+" CAD="+conversion.format(indianrupee)+" INR");
// CAD -> AUD
			double aussiedollar = amount * 1.07;
			System.out.println(""+amount+" CAD="+conversion.format(aussiedollar)+" AUD");
// CAD->NZD
			double zealanddollar = amount * 1.15;
			System.out.println(""+amount+" CAD="+conversion.format(zealanddollar)+" NZD");

			// British currency conversion
		}if(currencyconvert1.equals("Pounds")||currencyconvert1.equals("GBP")){
// GBP-USD
			double muricadollar = amount * 1.41;
			System.out.println(""+amount+" GBP="+conversion.format(muricadollar)+" USD");
// GBP-> CAD
			double canadiandolla = amount * 1.72;
			System.out.println(""+amount+" GBP="+conversion.format(canadiandolla)+" CAD");
//  GBP -> EURO
			double euro = amount * 1.17;
			System.out.println(""+amount+" GBP="+conversion.format(euro)+" EUR");
// GBP -> CHF
			double swiss = amount * 1.27;
			System.out.println(""+amount+" GBP="+conversion.format(swiss)+" CHF");
// GBP -> JPY
			double jpyen = amount * 154.7;
			System.out.println(""+amount+" GBP="+conversion.format(jpyen)+" JPY");
// GBP -> CNY
			double chineseyuan = amount * 9.03;
			System.out.println(""+amount+" GBP="+conversion.format(chineseyuan)+" CNY");
// GBP -> HKD
			double hkdollar = amount * 10.95;
			System.out.println(""+amount+" GBP="+conversion.format(hkdollar)+" HKD");
// GBP -> KRW
			double koreanwon = amount * 1575.30;
			System.out.println(""+amount+" GBP="+conversion.format(koreanwon)+" KRW");
// GBP -> INR
			double indianrupee = amount * 103.13;
			System.out.println(""+amount+" GBP="+conversion.format(indianrupee)+" INR");
// GBP -> AUD
			double australiandollar = amount * 1.83;
			System.out.println(""+amount+" GBP="+conversion.format(australiandollar)+" AUD");
// GBP -> NZD
			double nzddollar = amount * 1.98;
			System.out.println(""+amount+" GBP="+conversion.format(nzddollar)+" NZD");

			}
		}
    }


