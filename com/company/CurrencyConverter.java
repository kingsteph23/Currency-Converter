/*
Name:Steph
Note: Currency converter
 */




package com.company;
// Imports all java modules
import java.time.format.DateTimeFormatter;
import java.util.*;
import  java.text.DecimalFormat;
// allows display of time zone,date,time
import java.time.*;

public class CurrencyConverter {

    public static void main(String[] args) {
// Currencies From North America, Europe, Asia, and Oceania
		// BTW, the /uD83C stuff next to the currencies in the currencies array represent emojis(countries/territories)
		String[] currencies = {"US dollar(USD)\uD83C\uDDFA\uD83C\uDDF8",
				"\nCanadian Dollar(CAD)\uD83C\uDDE8\uD83C\uDDE6",
				"\nEuros(EUR)\uD83C\uDDEA\uD83C\uDDFA",
				"\nPounds(GBP)\uD83C\uDDEC\uD83C\uDDE7",
				"\nSwiss franc(CHF)\uD83C\uDDE8\uD83C\uDDED",
				"\nJapanese Yen(JPY)\uD83C\uDDEF\uD83C\uDDF5",
				"\nChinese Yuan(CNY)\uD83C\uDDE8\uD83C\uDDF3",
				"\nHong Kong Dollar(HKD)\uD83C\uDDED\uD83C\uDDF0",
				"\nSouth Korean won(KRW)\uD83C\uDDF0\uD83C\uDDF7",
				"\nIndian rupee(INR)\uD83C\uDDEE\uD83C\uDDF3",
				"\nAustralian Dollar(AUD)\uD83C\uDDE6\uD83C\uDDFA",
				"\nNew Zealand Dollar(NZD)\uD83C\uDDF3\uD83C\uDDFF"};

		// Allows me to display current time/date based on user system prefrences

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd" +
				"\nHH:mm:ss");
		LocalDateTime now = LocalDateTime.now();


		DecimalFormat conversion = new DecimalFormat("##.###");
// allows users to input and write statements
		Scanner scan = new Scanner(System.in);
		System.out.println("---------------------");
		System.out.println("Currency Converter");
		System.out.println(     dtf.format(now));
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
		System.out.println("Good," + TOD + "," + nom + "!");
		System.out.println();
		System.out.println("Select a currency to convert from:" +
				"\nNote you can use either the full currency name or the currency's code(whatever is in the ()." +
				"\nBut make sure you use type them EXACTLY as you see it." +
				"\n" + Arrays.toString(currencies) +
				"\n:");

		String currencyconvert1 = scan.nextLine();

		switch (currencyconvert1) {
			case "US dollar", "USD" -> System.out.println("How much, " + currencyconvert1 + ", do you wish to convert:$");

// Asking to know how much euros you wish to convert
			case "Euros", "EUR" -> System.out.println("How much, " + currencyconvert1 + ", do you wish to convert: €");

// Asking to know how much pounds you wish to convert
			case "Pounds", "GBP" -> System.out.println("How much, " + currencyconvert1 + ",do you wish to convert: £");

// Asking to know how much canadian dollar you wish to convert
			case "Canadian Dollar", "CAD" -> System.out.println("How much, " + currencyconvert1 + ", do you wish to convert:$");

// Asking to know how much swiss franc's you wish to convert
			case "Swiss franc", "CHF" -> System.out.println("How much, " + currencyconvert1 + ",Do you wish to convert?:CHF");

// Asking to know how much Japanese Yen you wish to convert
			case "Japanese Yen", "JPY" -> System.out.println("How much ," + currencyconvert1 + ",do you wish to convert?:¥");

// Asking to know how much Chinese Yuan you wish to convert
			case "Chinese Yuan", "CNY" -> System.out.println("How much, " + currencyconvert1 + " do you wish to convert?:¥");

// Asking to know how much Hong Kong Dollar's you wish to convert
			case "Hong Kong Dollar", "HKD" -> System.out.println("How much " + currencyconvert1 + " do you wish to convert?:$");

// Asking to know how much South Korean Won you wish to convert
			case "South Korean won", "KRW" -> System.out.println("How much ," + currencyconvert1 + "do you wish to convert?:₩");

// Asking to know how much Indian rupee's you wish to convert
			case "Indian rupee", "INR" -> System.out.println("How much, " + currencyconvert1 + "do you wish to convert?:₹");

// Asking to know how much Australian dollars you wish to convert
			case "Australian Dollar", "AUD" -> System.out.println("How much, " + currencyconvert1 + ", do you wish to convert?:$");

// New zealand dollars
			case "New Zealand Dollar", "NZD" -> System.out.println("How much, " + currencyconvert1 + ", do wish to convert?:$");
		}

//
		System.out.println();
		int amount = scan.nextInt();

		// actual conversions

// Conversions for US dollars
		if (currencyconvert1.equals("US dollar") || (currencyconvert1.equals("USD"))) {
			String[] muricanselectors = {"EUR", "CAD", "GBP", "CHF", "JPY", "CNY", "HKD", "KRW", "INR", "AUD", "NZD"};
			System.out.println("Please select a currency to convert to of your choice:" +
					"\n" + Arrays.toString(muricanselectors));
			scan.nextLine();
			String usconverter = scan.nextLine();


// USD -> EUROS
			if(usconverter.equals("EUR")) {
				double euro = amount * 0.83;
				System.out.println("" + amount + " USD =" + conversion.format(euro) + " Euros");
// USD -> CAD(Canadian dollars)
			} else if (usconverter.equals("CAD")) {
				double canadiandollar = amount * 1.21;
				System.out.println("" + amount + " USD = " + conversion.format(canadiandollar) + " CAD");
// USD -> GBP(British pounds
			} else if (usconverter.equals("GBP")) {
				double britishpound = amount * 0.70;
				System.out.println("" + amount + " USD =" + conversion.format(britishpound) + " GBP");
// USD -> CHF(Swiss francs)
			} else if (usconverter.equals("CHF")) {
				double swissfranc = amount * 0.896;
				System.out.println("" + amount + " USD =" + conversion.format(swissfranc) + " CHF");
			} else if (usconverter.equals("JPY")) {
// USD -> JPY(Japanese yen)
				double japaneseyen = amount * 110.67;
				System.out.println("" + amount + " USD =" + conversion.format(japaneseyen) + " JPY");
//USD -> CNY(Chinese Yuan)
			} else if (usconverter.equals("CNY")) {
				double chineseyuan = amount * 6.4;
				System.out.println("" + amount + " USD =" + conversion.format(chineseyuan) + " CNY");
// USD -> HKD(Hong kong Dollars)
			} else if (usconverter.equals("HKD")) {
				double hongkongdollar = amount * 7.759;
				System.out.println("" + amount + " USD =" + conversion.format(hongkongdollar) + "HKD");
// USD -> KRW(South Korean dollars)
			} else if (usconverter.equals("KRW")) {
				double southkoreanwon = amount * 1116.5;
				System.out.println("" + amount + " USD =" + conversion.format(southkoreanwon) + " KRW");
// USD -> INR(Indian rupees)
			} else if (usconverter.equals("INR")) {
				double indianrupee = amount * 72.969;
				System.out.println("" + amount + " USD =" + conversion.format(indianrupee) + " INR");
// USD -> AUD(Australian Dollars)
			} else if (usconverter.equals("AUD")){
				double australiandollar = amount * 1.313;
			System.out.println("" + amount + " USD =" + conversion.format(australiandollar) + " AUD");
// USD -> NZD(New Zealand Dollars)
		}else if(usconverter.equals("NZD")) {
				double newzealanddollar = amount * 1.389;
				System.out.println("" + amount + " USD =" + conversion.format(newzealanddollar) + " NZD");
			}
			// conversions for Canadian dollar
		}
		if (currencyconvert1.equals("Canadian Dollar") || currencyconvert1.equals("CAD")) {
// CAD -> USD
			double usdollar = amount * 0.82;
			System.out.println("" + amount + " CAD =" + conversion.format(usdollar) + " USD");
// CAD -> EUR
			double euro = amount * 0.68;
			System.out.println("" + amount + " CAD =" + conversion.format(euro) + " EUR");
// CAD -> GBP
			double britishpound = amount * 0.58;
			System.out.println("" + amount + " CAD=" + conversion.format(britishpound) + " GBP");
// CAD -> CHF
			double swissfrancs = amount * 0.74;
			System.out.println("" + amount + " CAD=" + conversion.format(swissfrancs) + " CHF");
// CAD -> JPY
			double japaneseyen = amount * 90.2;
			System.out.println("" + amount + " CAD=" + conversion.format(japaneseyen) + " JPY");
// CAD -> CNY
			double chineseyuan = amount * 5.26;
			System.out.println("" + amount + " CAD=" + conversion.format(chineseyuan) + " CNY");
// CAD -> HKD
			double hkdollar = amount * 6.38;
			System.out.println("" + amount + " CAD=" + conversion.format(hkdollar) + " HKD");
// CAD -> KRW
			double skwon = amount * 918.3;
			System.out.println("" + amount + " CAD=" + conversion.format(skwon) + " KRW");
// CAD -> INR
			double indianrupee = amount * 60.22;
			System.out.println("" + amount + " CAD=" + conversion.format(indianrupee) + " INR");
// CAD -> AUD
			double aussiedollar = amount * 1.07;
			System.out.println("" + amount + " CAD=" + conversion.format(aussiedollar) + " AUD");
// CAD->NZD
			double zealanddollar = amount * 1.15;
			System.out.println("" + amount + " CAD=" + conversion.format(zealanddollar) + " NZD");

			// British currency conversion
		}
		if (currencyconvert1.equals("Pounds") || currencyconvert1.equals("GBP")) {
// GBP-USD
			double muricadollar = amount * 1.41;
			System.out.println("" + amount + " GBP=" + conversion.format(muricadollar) + " USD");
// GBP-> CAD
			double canadiandolla = amount * 1.72;
			System.out.println("" + amount + " GBP=" + conversion.format(canadiandolla) + " CAD");
//  GBP -> EURO
			double euro = amount * 1.17;
			System.out.println("" + amount + " GBP=" + conversion.format(euro) + " EUR");
// GBP -> CHF
			double swiss = amount * 1.27;
			System.out.println("" + amount + " GBP=" + conversion.format(swiss) + " CHF");
// GBP -> JPY
			double jpyen = amount * 154.7;
			System.out.println("" + amount + " GBP=" + conversion.format(jpyen) + " JPY");
// GBP -> CNY
			double chineseyuan = amount * 9.03;
			System.out.println("" + amount + " GBP=" + conversion.format(chineseyuan) + " CNY");
// GBP -> HKD
			double hkdollar = amount * 10.95;
			System.out.println("" + amount + " GBP=" + conversion.format(hkdollar) + " HKD");
// GBP -> KRW
			double koreanwon = amount * 1575.30;
			System.out.println("" + amount + " GBP=" + conversion.format(koreanwon) + " KRW");
// GBP -> INR
			double indianrupee = amount * 103.13;
			System.out.println("" + amount + " GBP=" + conversion.format(indianrupee) + " INR");
// GBP -> AUD
			double australiandollar = amount * 1.83;
			System.out.println("" + amount + " GBP=" + conversion.format(australiandollar) + " AUD");
// GBP -> NZD
			double nzddollar = amount * 1.98;
			System.out.println("" + amount + " GBP=" + conversion.format(nzddollar) + " NZD");

		}
		if (currencyconvert1.equals("EUR") || currencyconvert1.equals("Euros")) {
// EUR -> USD
			double usd = amount * 1.21;
			System.out.println("" + amount + " EUR=" + conversion.format(usd) + " USD");
// EUR -> CAD
			double cad = amount * 1.47;
			System.out.println("" + amount + " EUR=" + conversion.format(cad) + " CAD");
// EUR -> GBP
			double britpounds = amount * 0.86;
			System.out.println("" + amount + " EUR=" + conversion.format(britpounds) + " GBP");
// EUR -> CHF
			double swissyfranc = amount * 1.09;
			System.out.println("" + amount + " EUR=" + conversion.format(swissyfranc) + " CHF");
// EUR -> JPY
			double jpy = amount * 132.8;
			System.out.println("" + amount + " EUR=" + conversion.format(jpy) + " JPY");
// EUR -> CNY
			double cny = amount * 7.75;
			System.out.println("" + amount + " Eur=" + conversion.format(cny) + " CNY");
// EUR-> HKD
			double hkd = amount * 9.39;
			System.out.println("" + amount + " Eur=" + conversion.format(hkd) + "  HKD");
// EUR -> KRW
			double skwon = amount * 1352.63;
			System.out.println("" + amount + " EUR=" + conversion.format(skwon) + " KRW");
// EUR -> INR
			double INR = amount * 88.70;
			System.out.println("" + amount + " EUR=" + conversion.format(INR) + " INR");
// EUR -> AUD
			double AUD = amount * 1.57;
			System.out.println("" + amount + " EUR=" + conversion.format(AUD) + " AUD");
// EUR -> NZD
			double NZD = amount * 1.69;
			System.out.println("" + amount + " EUR=" + conversion.format(NZD) + " NZD");

// Conversions for  Swiss francs
		}
		if (currencyconvert1.equals("Swiss franc") || currencyconvert1.equals("CHF")) {

			String[] swissconversion = {"USD", "EUR", "GBP", "CAD", "HKD", "CNY", "KRW", "INR", "AUD", "NZD"};
			System.out.println("Please select a currency of your choice:"+
					          "\n"+ Arrays.toString(swissconversion));
			scan.nextLine();
			String swissselector = scan.nextLine();
			//CHF->USD
			if (swissselector.equals("USD")) {
				double usd = amount * 1.11;
				System.out.println("" + amount + " CHF=" + conversion.format(usd) + " USD");
				// CHF -> CAD
			} else if (swissselector.equals("CAD")) {
				double cad = amount * 1.35;
				System.out.println("" + amount + " CHF=" + conversion.format(cad) + " CAD");
				// GBP -> EUR
			} else if (swissselector.equals("EUR")) {
				double euro = amount * 0.91;
				System.out.println("" + amount + " CHF" + conversion.format(euro) + " EUR");
				// CHF->GBP
			} else if (swissselector.equals("GBP")) {
				double britishpound = amount * 0.79;
				System.out.println("" + amount + " CHF=" + conversion.format(britishpound) + " GBP");
// CHF ->JPY
			} else if (swissselector.equals("JPY")) {
				double japaneseyen = amount * 122.57;
				System.out.println("" + amount + " CHF=" + conversion.format(japaneseyen) + " JPY");
// CHF -> CNY
			}else if(swissselector.equals("CNY")) {
				double chinayuan = amount * 7.13;
				System.out.println("" + amount + " CHF=" + conversion.format(chinayuan) + " CNY");
// CHF -> HKD
			}else  if(swissselector.equals("HKD")) {
				double hongkongdollas = amount * 8.63;
				System.out.println("" + amount + " CHF=" + conversion.format(hongkongdollas) + " HKD");
// CHF -> KRW
			}else if(swissselector.equals("KRW")){
				double skoreanwon = amount * 1244.36;
				System.out.println("" + amount + " CHF=" + conversion.format(skoreanwon) + " WON");
				// CHF -> INR
			}else if(swissselector.equals("INR")){
				double indianrupee = amount * 81.64;
				System.out.println("" + amount + " CHF=" + conversion.format(indianrupee) + " INR");
				// CHF-> Australian dollars
			}else if(swissselector.equals("AUD")) {
				double aussiedoller = amount * 1.44;
				System.out.println("" + amount + " CHF=" + conversion.format(aussiedoller) + " AUD");
				// CHF->NZD
			}else if(swissselector.equals("NZD")){
				double nzdoller = amount * 1.56;
				System.out.println("" + amount + " CHF=" + conversion.format(nzdoller) + " NZD");
			}


			//if player choses yen
		}
		if (currencyconvert1.equals("Japanese Yen") || currencyconvert1.equals("JPY")) {
			/* japanese yen potential conversions(in a array to store them rather
			how i did it prior(The whole double system.Prints out all currencies rather than specific one)
			 */
			String[] jpycurrencies = {"USD", "EUR", "GBP", "HKD", "CNY", "KRW", "INR", "AUD", "NZD"};
			System.out.println("Please select a currency of your choice:" + Arrays.toString(jpycurrencies));
			scan.nextLine();
			String jpyselector = scan.nextLine();
// jpy -> usd
			if (jpyselector.equals("USD")) {
				double murica = amount * 0.009;
				System.out.println("" + amount + " JPY=" + conversion.format(murica) + " usd");
// jpy-> euro
			} else if (jpyselector.equals("EUR")) {
				double euro = amount * 0.00750;
				System.out.println(""+amount+"JPY="+conversion.format(euro)+" EUR");
// JPY -> GBP
			} else if(jpyselector.equals("GBP")){
				double britishpounds = amount* 0.00644;
				System.out.println(""+amount+" JPY="+conversion.format(britishpounds)+" GBP");
				// JPY-> HKD
			}else if(jpyselector.equals("HKD")){
				double hkdollar = amount *  0.7066;
				System.out.println(""+amount+" JPY="+conversion.format(hkdollar)+" HKD");
				// JPY-> CNY
			}else if(jpyselector.equals("CNY")){
				double chineseyuan = 0.058;
				System.out.println(""+amount+" JPY="+conversion.format(chineseyuan)+" CNY");
				// JPY->KRW
			}else if(jpyselector.equals("KRW")){
				double skwon = 10.182;
				System.out.println(""+amount+" JPY="+conversion.format(skwon)+" KRW");
				// JPY->INR
			}else if(jpyselector.equals("INR")){
				double indianrupee = 0.66;
				System.out.println(""+amount+" JPY="+conversion.format(indianrupee)+" INR");
				// JPY -> AUD
			}else if(jpyselector.equals("AUD")){
				double aussiebucks = 0.0118;
				System.out.println(""+amount+" JPY="+conversion.format(aussiebucks)+" AUD");
				// JPY -> NZD
			}else if(jpyselector.equals("NZD")){
				double nzdollar = 0.0127;
				System.out.println(""+amount+" JPY="+conversion.format(nzdollar)+" NZD");
			}
		}
	}}