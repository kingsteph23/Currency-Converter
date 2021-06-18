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
/* Currencies From North America, Europe, Asia, and Oceania
BTW, the /uD83C stuff next to the currencies in the currencies array represent
emojis(countries/territories)*/
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

		// Allows me to display current time/date based on user system preferences

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd" +
				"\nHH:mm:ss");
		LocalDateTime now = LocalDateTime.now();


		DecimalFormat conversion = new DecimalFormat("##.###");
// allows users to input and write statements
		/*title which is ab;e to display time(based on date time formatter)
		Displays current time/date based on user preferences
		Also title displays currencies such as dollars,euros,pounds,yen,won,lira's, and rupees
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("---------------------");
		System.out.println("Currency Converter");
		System.out.println("$  €  £  ¥  ₩  ₹  ₺ ");
		System.out.println("---------------------");
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

		if ("US dollar".equals(currencyconvert1) || "USD".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + ", do you wish to convert:$");

// Asking to know how much euros you wish to convert
		} else if ("Euros".equals(currencyconvert1) || "EUR".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + ", do you wish to convert: €");

// Asking to know how much pounds you wish to convert
		} else if ("Pounds".equals(currencyconvert1) || "GBP".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + ",do you wish to convert: £");

// Asking to know how much canadian dollar you wish to convert
		} else if ("Canadian Dollar".equals(currencyconvert1) || "CAD".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + ", do you wish to convert:$");

// Asking to know how much swiss franc's you wish to convert
		} else if ("Swiss franc".equals(currencyconvert1) || "CHF".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + ",Do you wish to convert?:CHF");

// Asking to know how much Japanese Yen you wish to convert
		} else if ("Japanese Yen".equals(currencyconvert1) || "JPY".equals(currencyconvert1)) {
			System.out.println("How much ," + currencyconvert1 + ",do you wish to convert?:¥");

// Asking to know how much Chinese Yuan you wish to convert
		} else if ("Chinese Yuan".equals(currencyconvert1) || "CNY".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + " do you wish to convert?:¥");

// Asking to know how much Hong Kong Dollar's you wish to convert
		} else if ("Hong Kong Dollar".equals(currencyconvert1) || "HKD".equals(currencyconvert1)) {
			System.out.println("How much " + currencyconvert1 + " do you wish to convert?:$");

// Asking to know how much South Korean Won you wish to convert
		} else if ("South Korean won".equals(currencyconvert1) || "KRW".equals(currencyconvert1)) {
			System.out.println("How much ," + currencyconvert1 + "do you wish to convert?:₩");

// Asking to know how much Indian rupee's you wish to convert
		} else if ("Indian rupee".equals(currencyconvert1) || "INR".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + "do you wish to convert?:₹");

// Asking to know how much Australian dollars you wish to convert
		} else if ("Australian Dollar".equals(currencyconvert1) || "AUD".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + ", do you wish to convert?:$");

// New zealand dollars
		} else if ("New Zealand Dollar".equals(currencyconvert1) || "NZD".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + ", do wish to convert?:$");
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
				double australiandollar = amount * 1.311;
			System.out.println("" + amount + " USD =" + conversion.format(australiandollar) + " AUD");
// USD -> NZD(New Zealand Dollars)
		}else if(usconverter.equals("NZD")) {
				double newzealanddollar = amount * 1.389;
				System.out.println("" + amount + " USD =" + conversion.format(newzealanddollar) + " NZD");
			}
			// conversions for Canadian dollar
		}
		if (currencyconvert1.equals("Canadian Dollar") || currencyconvert1.equals("CAD")) {
// All canadian potential options
			String[]  candaianselector = {"USD","EUR","GBP","CHF","JPY","CNY","HKD","KRW","INR","AUD","NZD"};
System.out.println("Select a currency you wish to convert to?:"+
		"\n"+Arrays.toString(candaianselector));
			scan.nextLine();
			String  canadiancurrencies = scan.nextLine();
// CAD -> USD
			if(canadiancurrencies.equals("USD")) {
				double usdollar = amount * 0.82;
				System.out.println("" + amount + " CAD =" + conversion.format(usdollar) + " USD");

// CAD -> EUR
           }else if(canadiancurrencies.equals("EUR")) {
				double euro = amount * 0.68;
				System.out.println("" + amount + " CAD =" + conversion.format(euro) + " EUR");
// CAD -> GBP
			}else if(canadiancurrencies.equals("GBP")) {
				double britishpound = amount * 0.58;
				System.out.println("" + amount + " CAD=" + conversion.format(britishpound) + " GBP");
// CAD -> CHF
			}else if(canadiancurrencies.equals("CHF")) {
				double swissfrancs = amount * 0.74;
				System.out.println("" + amount + " CAD=" + conversion.format(swissfrancs) + " CHF");
// CAD -> JPY
			}else if(canadiancurrencies.equals("JPY")) {
				double japaneseyen = amount * 90.2;
				System.out.println("" + amount + " CAD=" + conversion.format(japaneseyen) + " JPY");
// CAD -> CNY
			}else if(canadiancurrencies.equals("CNY")) {
				double chineseyuan = amount * 5.26;
				System.out.println("" + amount + " CAD=" + conversion.format(chineseyuan) + " CNY");
// CAD -> HKD
			}else if(canadiancurrencies.equals("HKD")) {
				double hkdollar = amount * 6.38;
				System.out.println("" + amount + " CAD=" + conversion.format(hkdollar) + " HKD");
// CAD -> KRW
			}else if(canadiancurrencies.equals("KRW")) {
				double skwon = amount * 918.3;
				System.out.println("" + amount + " CAD=" + conversion.format(skwon) + " KRW");
// CAD -> INR
			}else if(canadiancurrencies.equals("INR")) {
				double indianrupee = amount * 60.22;
				System.out.println("" + amount + " CAD=" + conversion.format(indianrupee) + " INR");
// CAD -> AUD
			}else if(canadiancurrencies.equals("AUD")) {
				double aussiedollar = amount * 1.07;
				System.out.println("" + amount + " CAD=" + conversion.format(aussiedollar) + " AUD");
// CAD->NZD
			}else if(canadiancurrencies.equals("NZD")) {
				double zealanddollar = amount * 1.15;
				System.out.println("" + amount + " CAD=" + conversion.format(zealanddollar) + " NZD");
			}
			// British currency conversion
		}
		if (currencyconvert1.equals("Pounds") || currencyconvert1.equals("GBP")) {
			String[] britishpounds = {"USD","CAD","EUR","CHF","JPY","CNY","HKD","KRW","INR","AUD","NZD"};
				System.out.println("Select a currency you wish to convert to?: "+
						"\n"+Arrays.toString(britishpounds));
               scan.nextLine();
				String britishconversionoptions = scan.nextLine();

// GBP-USD
			if(britishconversionoptions.equals("USD")) {
				double muricadollar = amount * 1.41;
				System.out.println("" + amount + " GBP=" + conversion.format(muricadollar) + " USD");
// GBP-> CAD
			}else if(britishconversionoptions.equals("CAD")) {
				double canadiandolla = amount * 1.72;
				System.out.println("" + amount + " GBP=" + conversion.format(canadiandolla) + " CAD");
//  GBP -> EURO
			}else if(britishconversionoptions.equals("EUR")) {
				double euro = amount * 1.17;
				System.out.println("" + amount + " GBP=" + conversion.format(euro) + " EUR");
// GBP -> CHF
			}else if(britishconversionoptions.equals("CHF")) {
				double swiss = amount * 1.27;
				System.out.println("" + amount + " GBP=" + conversion.format(swiss) + " CHF");
// GBP -> JPY
			}else if(britishconversionoptions.equals("JPY")) {
				double jpyen = amount * 154.7;
				System.out.println("" + amount + " GBP=" + conversion.format(jpyen) + " JPY");
// GBP -> CNY
			}else if(britishconversionoptions.equals("CNY")) {
				double chineseyuan = amount * 9.03;
				System.out.println("" + amount + " GBP=" + conversion.format(chineseyuan) + " CNY");
// GBP -> HKD
			}else if(britishconversionoptions.equals("HKD")) {
				double hkdollar = amount * 10.95;
				System.out.println("" + amount + " GBP=" + conversion.format(hkdollar) + " HKD");
// GBP -> KRW
			}else if(britishconversionoptions.equals("KRW")) {
				double koreanwon = amount * 1575.30;
				System.out.println("" + amount + " GBP=" + conversion.format(koreanwon) + " KRW");
// GBP -> INR
			}else if(britishconversionoptions.equals("INR")) {
				double indianrupee = amount * 103.13;
				System.out.println("" + amount + " GBP=" + conversion.format(indianrupee) + " INR");
// GBP -> AUD
			}else if(britishconversionoptions.equals("AUD")) {
				double australiandollar = amount * 1.83;
				System.out.println("" + amount + " GBP=" + conversion.format(australiandollar) + " AUD");
// GBP -> NZD
			}else if(britishconversionoptions.equals("NZD")) {
				double nzddollar = amount * 1.98;
				System.out.println("" + amount + " GBP=" + conversion.format(nzddollar) + " NZD");
			}
		}

		// Euro conversions
		if (currencyconvert1.equals("EUR") || currencyconvert1.equals("Euros")) {
			String[] euroconversionoptions = {"\n", "AUD", "CAD", "CHF", "CNY",
					"\n"+"GBP", "HKD", "INR", "JPY", "KRW", "NZD", "USD"};
			System.out.println("Please select a currency of your choice" +
					"\n" + Arrays.toString(euroconversionoptions));
			scan.nextLine();
			String euroselector = scan.nextLine();

// EUR -> USD
			if (euroselector.equals("USD")) {
				double usd = amount * 1.2;
				System.out.println("" + amount + " EUR=" + conversion.format(usd) + " USD");
// EUR -> CAD
			} else if (euroselector.equals("CAD")) {
				double cad = amount * 1.47;
				System.out.println("" + amount + " EUR=" + conversion.format(cad) + " CAD");
// EUR -> GBP
			} else if (euroselector.equals("GBP")) {
				double britpounds = amount * 0.86;
				System.out.println("" + amount + " EUR=" + conversion.format(britpounds) + " GBP");
// EUR -> CHF
			} else if (euroselector.equals("CHF")) {
				double swissyfranc = amount * 1.09;
				System.out.println("" + amount + " EUR=" + conversion.format(swissyfranc) + " CHF");
// EUR -> JPY
			} else if (euroselector.equals("JPY")){
				double jpy = amount * 132.8;
			System.out.println("" + amount + " EUR=" + conversion.format(jpy) + " JPY");
// EUR -> CNY
		}else if(euroselector.equals("CNY")) {
				double cny = amount * 7.75;
				System.out.println("" + amount + " Eur=" + conversion.format(cny) + " CNY");
// EUR-> HKD
			}else if(euroselector.equals("HKD")) {
				double hkd = amount * 9.39;
				System.out.println("" + amount + " Eur=" + conversion.format(hkd) + "  HKD");
// EUR -> KRW
			}else if(euroselector.equals("KRW")) {
				double skwon = amount * 1352.63;
				System.out.println("" + amount + " EUR=" + conversion.format(skwon) + " KRW");
// EUR -> INR
			}else if(euroselector.equals("INR")) {
				double INR = amount * 88.70;
				System.out.println("" + amount + " EUR=" + conversion.format(INR) + " INR");
// EUR -> AUD
			}else if(euroselector.equals("AUD")) {
				double AUD = amount * 1.57;
				System.out.println("" + amount + " EUR=" + conversion.format(AUD) + " AUD");
// EUR -> NZD
			}else if(euroselector.equals("NZD")) {
				double NZD = amount * 1.69;
				System.out.println("" + amount + " EUR=" + conversion.format(NZD) + " NZD");


			}
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
			String[] jpycurrencies = {"USD", "EUR","CAD","GBP", "HKD", "CNY", "KRW", "INR", "AUD", "NZD"};
			System.out.println("Please select a currency of your choice:" + Arrays.toString(jpycurrencies));
			scan.nextLine();
			String jpyselector = scan.nextLine();
// jpy -> usd
			if (jpyselector.equals("USD")) {
				double murica = amount * 0.009077;
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
				double hkdollar = amount *  0.07011;
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


			}else if(jpyselector.equals("CAD")){
				double canadadollar = amount * 0.0112;
				System.out.println(""+amount+" JPY="+conversion.format(canadadollar)+" CAD");
			}





			// chinese yuan conversions
			}if(currencyconvert1.equals("Chinese Yuan")||currencyconvert1.equals("CNY")) {
			String[] chinayuancovert = {"USD", "GBP", "CAD","EUR", "CHF", "JPY", "HKD", "KRW", "INR", "AUD", "NZD"};
			System.out.println("Please select a currency of your choice" +
					"\n" + Arrays.toString(chinayuancovert));
			scan.nextLine();
			String chinayuanselector = scan.nextLine();
// CNY -> USD
			if(chinayuanselector.equals("USD")) {
				double usdresult = amount * 0.155;
				System.out.println(""+amount+" CNY = "+conversion.format(usdresult)+" USD");
				// CNY -> GBP
			}else if(chinayuanselector.equals("GBP")){
				double britishpoundresults = amount * 0.1113;
				System.out.println(""+amount+" CNY = "+conversion.format(britishpoundresults)+" GBP");
				// CNY ->cad
			}else if(chinayuanselector.equals("CAD")){
				double cadresults = amount * 0.19;
				System.out.println(""+amount+" CNY = "+conversion.format(cadresults)+" CAD");
				// CNY -> EUR
			}else if(chinayuanselector.equals("EUR")){
				double euroresults = amount *  0.13;
				System.out.println(""+amount+" CNY = "+conversion.format(euroresults)+" EUR");
				// CNY-> CHF
			}else if(chinayuanselector.equals("CHF")){
				double swissyfrancs = amount * 0.14;
				System.out.println(""+amount+" CNY ="+conversion.format(swissyfrancs)+" CHF");
				// CNY-> JPY
			}else if(chinayuanselector.equals("JPY")){
				double japanyenresults = amount * 17.09;
				System.out.println(""+amount+" CNY ="+conversion.format(japanyenresults)+" JPY");
				// CNY -> HKD
			}else if(chinayuanselector.equals("HKD")){
				double hongkongmoney = amount * 1.204;
				System.out.println(""+amount+" CNY ="+conversion.format(hongkongmoney)+" HKD");
				// CNY -> KRW
			}else if(chinayuanselector.equals("KRW")){
				double southkoreawon = amount * 175.93;
				System.out.println(""+amount+" CNY = "+conversion.format(southkoreawon)+" KRW");
				//CNY -> INR
			}else if(chinayuanselector.equals("INR")){
				double indiarupeeresults = amount * 11.52;
				System.out.println(""+amount+" CNY = "+conversion.format(indiarupeeresults)+" INR");
			// CNY -> AUD
			}else if(chinayuanselector.equals("AUD")){
				double aussiedollaresults = amount * 0.205;
				System.out.println(""+amount+" CNY = "+conversion.format(aussiedollaresults)+" AUD");
				// CNY -> NZD
			}else if(chinayuanselector.equals("NZD")){
				double nzdresults = amount * 0.221;
				System.out.println(""+amount+" CNY ="+conversion.format(nzdresults)+" NZD");


// if player wishes to convert hong kong dollars
			}

			}if(currencyconvert1.equals("Hong Kong Dollar")||currencyconvert1.equals("HKD")) {
			String[] HKDconversions = {"USD", "CAD", "EUR", "GBP", "CHF",
					"\n" + "JPY", "CNY", "KRW", "INR", "AUD", "NZD"};
			System.out.println("Select a currency to convert to" +
					"\n" + Arrays.toString(HKDconversions));
			scan.nextLine();
			String hkconverter = scan.nextLine();
			// HKD -> US
			if (hkconverter.equals("USD")) {
				double usdresult = amount * 0.13;
				System.out.println("" + amount + " HKD =" + conversion.format(usdresult) + " USD  ");
				// HKD -> CAD
			} else if (hkconverter.equals("CAD")) {
				double cadresult = amount * 0.16;
				System.out.println("" + amount + " HKD = " + conversion.format(cadresult) + " CAD");
				// HKD -> EUR
			} else if (hkconverter.equals("EUR")) {
				double euroconvert = amount * 0.11;
				System.out.println("" + amount + " HKD =" + conversion.format(euroconvert) + " EUR");
				// HKD -> GPD
			} else if (hkconverter.equals("GBP")) {
				double britishresult = amount * 0.092;
				System.out.println("" + amount + " HKD = " + conversion.format(britishresult) + " GBP");
				// HKD -> CHF
			} else if (hkconverter.equals("CHF")) {
				double swissfranc = amount * 0.118;
				System.out.println("" + amount + " HKD = " + conversion.format(swissfranc) + " CHF");
				// HKD -> JPY
			} else if (hkconverter.equals("JPY")) {
				double jpyresult = amount * 14.2;
				System.out.println("" + amount + " HKD =" + conversion.format(jpyresult) + " JPY");
				// HKD -> CNY
			} else if (hkconverter.equals("CNY")) {
				double chinaconvert = amount * 0.83;
				System.out.println(""+amount+" HKD ="+conversion.format(chinaconvert)+" CNY");
				// HKD -> KRW
			}else if (hkconverter.equals("KRW")){
				double koreanwon = amount * 146.1;
				System.out.println(""+amount+" HKD = "+conversion.format(koreanwon)+" KRW");
				// HKD -> INR
			}else if(hkconverter.equals("INR")){
				double rupees = amount * 9.55;
				System.out.println(""+amount+" HKD = "+conversion.format(rupees)+" INR");

				// HKD -> AUD
			}else if(hkconverter.equals("AUD")){
				double aussiebucks = amount * 0.17;
				System.out.println(""+amount+" HKD ="+conversion.format(aussiebucks)+" AUD");
				// HKD -> NZD
			}else if(hkconverter.equals("NZD")){
					double nzdollas = amount * 0.18;
				System.out.println(""+amount+" HKD ="+conversion.format(nzdollas)+" NZD");
			}
			// if player wishes to use south korean won
		}if(currencyconvert1.equals("KRW")||currencyconvert1.equals("South Korean won")){
				String[] potientalwonconversions = {"USD","CAD","GBP","EUR","CHF"
													+"\n"+"JPY","HKD","INR","AUD","NZD"};
				/*Based on potientalwonconversions array. Currency exchange rates of that array
				Order based on the order of currencies. So first is the USD, and goes all the way to NZD
				 */
				double[] currencyresults = {0.000888,0.00109,0.000633,0.00074,0.000809,
											0.0973,0.00685,0.0654,0.00117,0.00126};

				System.out.println("Please select a currency you wish to convert to:"+
						"\n"+Arrays.toString(potientalwonconversions));
				scan.nextLine();
				String woncurrencyresults = scan.nextLine();
// KRW -> USD
				if(woncurrencyresults.equals("USD")){
					double usdresult = amount * currencyresults[0];
					System.out.println(""+amount+" KRW = "+conversion.format(usdresult)+" USD");
					// KRW -> CAD
				}else if(woncurrencyresults.equals("CAD")){
					double cadresult = amount * currencyresults[1];
					System.out.println(""+amount+" KRW ="+conversion.format(cadresult)+" CAD");
					// KRW -> GBP
				}else if(woncurrencyresults.equals("GBP")){
					double poundoutcomes = amount * currencyresults[2];
					System.out.println(""+amount+" KRW ="+conversion.format(poundoutcomes)+" GBP");
					// KRW -> EUR
				}else if(woncurrencyresults.equals("EUR")) {
					double euroresult = amount * currencyresults[3];
					System.out.println("" + amount + " KRW =" + conversion.format(euroresult) + " EUR");
				// KRW -> CHF
				}else if(woncurrencyresults.equals("CHF")){
					double swissyfrancresult = amount * currencyresults[4];
					System.out.println(""+amount+" KRW = "+conversion.format(swissyfrancresult)+" CHF");
					// KRW -> JPY
				}else if(woncurrencyresults.equals("JPY")){
						double jpyoutcome = amount * currencyresults[5];
					System.out.println(""+amount+" KRW ="+conversion.format(jpyoutcome)+" JPY");
						// KRW -> HKD
				}else if(woncurrencyresults.equals("HKD")){
					double hkresult = amount * currencyresults[6];
					System.out.println(""+amount+" KRW ="+conversion.format(hkresult)+" HKD");
					// KRW -> INR
				}else if(woncurrencyresults.equals("INR")){
					double indiamoneyresult = amount * currencyresults[7];
					System.out.println(""+amount+" KRW ="+conversion.format(indiamoneyresult)+" INR");
					// KRW -> AUD
				}else if(woncurrencyresults.equals("AUD")){
					double aussiebucksresults = amount * currencyresults[8];
					System.out.println(""+amount+" KRW ="+conversion.format(aussiebucksresults)+" AUD");
					// KRW -> NZD
				}else if(woncurrencyresults.equals("NZD")){
					double newzealandbucks = amount * currencyresults[9];
					System.out.println(""+amount+" KRW ="+conversion.format(newzealandbucks)+" NZD");
				}
		}
	}}