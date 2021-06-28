/*
Name:Steph
Note: Currency converter

Currency exchange values are based on currency exchange rates of Xe
Currency exchange rates expected to be updated on a weekly bases

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
				"\nNew Zealand Dollar(NZD)\uD83C\uDDF3\uD83C\uDDFF",
				"\nHaitian Gourde(HTG)\uD83C\uDDED\uD83C\uDDF9",
				"\nCroatian Kuna(HRK)\uD83C\uDDED\uD83C\uDDF7",
				"\nMexican Peso(MXN)\uD83C\uDDF2\uD83C\uDDFD"};

		// Allows me to display current time/date based on user system preferences

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd" +
				"\nHH:mm:ss");
		LocalDateTime now = LocalDateTime.now();


		DecimalFormat conversion = new DecimalFormat("##.##");
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
		System.out.println(dtf.format(now));
		System.out.println("---------------------");
// disclaimer
		System.out.println();
		System.out.println("Note, make sure you type everything EXACTLY AS YOU SEE IT. You have option" +
				"\nOf doing either typing the full response or whatever is in the ().");
		scan.nextLine();
		System.out.println("Note that some currencies may have .345, just round the number to its nearest hundredths place ");
		scan.nextLine();
		System.out.println("Some currencies made be rounded to their nearest whole number, and may be off by a few dollars" +
				"\n");
		scan.nextLine();
		System.out.println("The exchange rates of the currencies will be updated  weekly.  Also new addition of currencies as well");
		// TOD at players location.
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
			System.out.println("How much, " + currencyconvert1 + "(\uD83C\uDDFA\uD83C\uDDF8) do you wish to convert:$");

// Asking to know how much euros you wish to convert
		} else if ("Euros".equals(currencyconvert1) || "EUR".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + "(\uD83C\uDDEA\uD83C\uDDFA) do you wish to convert: €");

// Asking to know how much pounds you wish to convert
		} else if ("Pounds".equals(currencyconvert1) || "GBP".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + "(\uD83C\uDDEC\uD83C\uDDE7)do you wish to convert: £");

// Asking to know how much canadian dollar you wish to convert
		} else if ("Canadian Dollar".equals(currencyconvert1) || "CAD".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + "(\uD83C\uDDE8\uD83C\uDDE6) do you wish to convert:$");

// Asking to know how much swiss franc's you wish to convert
		} else if ("Swiss franc".equals(currencyconvert1) || "CHF".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + "(\uD83C\uDDE8\uD83C\uDDED)Do you wish to convert?:CHF");

// Asking to know how much Japanese Yen you wish to convert
		} else if ("Japanese Yen".equals(currencyconvert1) || "JPY".equals(currencyconvert1)) {
			System.out.println("How much ," + currencyconvert1 + "(\uD83C\uDDEF\uD83C\uDDF5)do you wish to convert?:¥");

// Asking to know how much Chinese Yuan you wish to convert
		} else if ("Chinese Yuan".equals(currencyconvert1) || "CNY".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + "(\uD83C\uDDE8\uD83C\uDDF3) do you wish to convert?:¥");

// Asking to know how much Hong Kong Dollar's you wish to convert
		} else if ("Hong Kong Dollar".equals(currencyconvert1) || "HKD".equals(currencyconvert1)) {
			System.out.println("How much " + currencyconvert1 + "(\uD83C\uDDED\uD83C\uDDF0) do you wish to convert?:$");

// Asking to know how much South Korean Won you wish to convert
		} else if ("South Korean won".equals(currencyconvert1) || "KRW".equals(currencyconvert1)) {
			System.out.println("How much ," + currencyconvert1 + "(\uD83C\uDDF0\uD83C\uDDF7)do you wish to convert?:₩");

// Asking to know how much Indian rupee's you wish to convert
		} else if ("Indian rupee".equals(currencyconvert1) || "INR".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + "(\uD83C\uDDEE\uD83C\uDDF3)do you wish to convert?:₹");

// Asking to know how much Australian dollars you wish to convert
		} else if ("Australian Dollar".equals(currencyconvert1) || "AUD".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + "(\uD83C\uDDE6\uD83C\uDDFA) do you wish to convert?:$");

// New zealand dollars
		} else if ("New Zealand Dollar".equals(currencyconvert1) || "NZD".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + "(\uD83C\uDDF3\uD83C\uDDFF) do wish to convert?:$");

			// Asking to know how much haitian gourde you wish to convert
		} else if ("Haitian Gourde".equals(currencyconvert1) || "HTG".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + "(\uD83C\uDDED\uD83C\uDDF9) do wish to convert?:G");

		// Asking to know how much croatian kuna's you wish to convert
		}else if("Croatian Kuna".equals(currencyconvert1)||"HRK".equals(currencyconvert1)){
			System.out.println("How much, " + currencyconvert1 + "(\uD83C\uDDED\uD83C\uDDF7) do wish to convert?:kn");
		// asking player how much mexican pesos you wish to convert
		}else if("Mexican Peso".equals(currencyconvert1)||"MXN".equals(currencyconvert1)){
			System.out.println("How much, " + currencyconvert1 + "(\uD83C\uDDF2\uD83C\uDDFD) do wish to convert?:$");
		}

		System.out.println();
		int amount = scan.nextInt();

		// actual conversions

// Conversions for US dollars
		if (currencyconvert1.equals("US dollar") || (currencyconvert1.equals("USD"))) {
			String[] muricanselectors = {"EUR", "CAD", "GBP", "CHF", "JPY",
					"CNY", "HKD", "KRW", "INR", "AUD", "NZD", "HTG", "HRK", "MXN"};

			double[] usdexchanges = {0.8378525,
					1.22948,
					0.72050246,
					0.91770028,
					110.80238,
					6.4553835,
					7.7619705,
					1, 127.3826,
					74.177887,
					1.3181212,
					1.413889,
					94.500053,
					6.2769846,
					19.824989};

			System.out.println("Please select a currency to convert to of your choice:" +
					"\n" + Arrays.toString(muricanselectors));
			scan.nextLine();
			String usconverter = scan.nextLine();


// USD -> EUROS
			if (usconverter.equals(muricanselectors[0])) {
				double euro = amount * usdexchanges[0];
				System.out.println("" + amount + " USD =" + conversion.format(euro) + " Euros");
// USD -> CAD(Canadian dollars)
			} else if (usconverter.equals(muricanselectors[1])) {
				double canadiandollar = amount * usdexchanges[1];
				System.out.println("" + amount + " USD = " + conversion.format(canadiandollar) + " CAD");
// USD -> GBP(British pounds
			} else if (usconverter.equals(muricanselectors[2])) {
				double britishpound = amount * usdexchanges[2];
				System.out.println("" + amount + " USD =" + conversion.format(britishpound) + " GBP");
// USD -> CHF(Swiss francs)
			} else if (usconverter.equals(muricanselectors[3])) {
				double swissfranc = amount * usdexchanges[3];
				System.out.println("" + amount + " USD =" + conversion.format(swissfranc) + " CHF");
			} else if (usconverter.equals(muricanselectors[4])) {
// USD -> JPY(Japanese yen)
				double japaneseyen = amount * usdexchanges[4];
				System.out.println("" + amount + " USD =" + conversion.format(japaneseyen) + " JPY");
//USD -> CNY(Chinese Yuan)
			} else if (usconverter.equals(muricanselectors[5])) {
				double chineseyuan = amount * usdexchanges[5];
				System.out.println("" + amount + " USD =" + conversion.format(chineseyuan) + " CNY");
// USD -> HKD(Hong kong Dollars)
			} else if (usconverter.equals(muricanselectors[6])) {
				double hongkongdollar = amount * usdexchanges[6];
				System.out.println("" + amount + " USD =" + conversion.format(hongkongdollar) + "HKD");
// USD -> KRW(South Korean dollars)
			} else if (usconverter.equals(muricanselectors[7])) {
				double southkoreanwon = amount * usdexchanges[7];
				System.out.println("" + amount + " USD =" + conversion.format(southkoreanwon) + " KRW");
// USD -> INR(Indian rupees)
			} else if (usconverter.equals(muricanselectors[8])) {
				double indianrupee = amount * usdexchanges[8];
				System.out.println("" + amount + " USD =" + conversion.format(indianrupee) + " INR");
// USD -> AUD(Australian Dollars)
			} else if (usconverter.equals(muricanselectors[9])) {
				double australiandollar = amount * usdexchanges[9];
				System.out.println("" + amount + " USD =" + conversion.format(australiandollar) + " AUD");
// USD -> NZD(New Zealand Dollars)
			} else if (usconverter.equals(muricanselectors[10])) {
				double newzealanddollar = amount * usdexchanges[10];
				System.out.println("" + amount + " USD =" + conversion.format(newzealanddollar) + " NZD");
			}
			// conversions for Canadian dollar
		}

		if (currencyconvert1.equals("Canadian Dollar") || currencyconvert1.equals("CAD")) {
// All canadian potential options
			String[] candaianselector = {"USD", "EUR", "GBP", "CHF", "JPY",
					"CNY", "HKD", "KRW", "INR", "AUD", "NZD","HTG","HRK","MXN"};

			double[] canadianexchanges = {0.81335202,
					0.68146902,
					0.58602213,
					0.74641337,
					90.121339,
					5.2504992,
					6.313236,
					916.96701,
					60.330584,
					1.0720934,
					1.1499995,
					76.862481,
					5.1054429,
					16.124949};



			System.out.println("Select a currency you wish to convert to?:" +
					"\n" + Arrays.toString(candaianselector));
			scan.nextLine();
			String canadiancurrencies = scan.nextLine();
// CAD -> USD
			if (canadiancurrencies.equals(candaianselector[0])) {
				double usdollar = amount * canadianexchanges[0];
				System.out.println("" + amount + " CAD =" + conversion.format(usdollar) + " USD");

// CAD -> EUR
			} else if (canadiancurrencies.equals(candaianselector[1])) {
				double euro = amount * canadianexchanges[1];
				System.out.println("" + amount + " CAD =" + conversion.format(euro) + " EUR");
// CAD -> GBP
			} else if (canadiancurrencies.equals(candaianselector[2])) {
				double britishpound = amount * canadianexchanges[2];
				System.out.println("" + amount + " CAD=" + conversion.format(britishpound) + " GBP");
// CAD -> CHF
			} else if (canadiancurrencies.equals(candaianselector[3])) {
				double swissfrancs = amount * canadianexchanges[3];
				System.out.println("" + amount + " CAD=" + conversion.format(swissfrancs) + " CHF");
// CAD -> JPY
			} else if (canadiancurrencies.equals(candaianselector[4])) {
				double japaneseyen = amount * canadianexchanges[4];
				System.out.println("" + amount + " CAD=" + conversion.format(japaneseyen) + " JPY");
// CAD -> CNY
			} else if (canadiancurrencies.equals(candaianselector[5])) {
				double chineseyuan = amount * canadianexchanges[5];
				System.out.println("" + amount + " CAD=" + conversion.format(chineseyuan) + " CNY");
// CAD -> HKD
			} else if (canadiancurrencies.equals(candaianselector[6])) {
				double hkdollar = amount * canadianexchanges[6];
				System.out.println("" + amount + " CAD=" + conversion.format(hkdollar) + " HKD");
// CAD -> KRW
			} else if (canadiancurrencies.equals(candaianselector[7])) {
				double skwon = amount * canadianexchanges[7];
				System.out.println("" + amount + " CAD=" + conversion.format(skwon) + " KRW");
// CAD -> INR
			} else if (canadiancurrencies.equals(candaianselector[8])) {
				double indianrupee = amount * canadianexchanges[8];
				System.out.println("" + amount + " CAD=" + conversion.format(indianrupee) + " INR");
// CAD -> AUD
			} else if (canadiancurrencies.equals(candaianselector[9])) {
				double aussiedollar = amount * canadianexchanges[9];
				System.out.println("" + amount + " CAD=" + conversion.format(aussiedollar) + " AUD");
// CAD->NZD
			} else if (canadiancurrencies.equals(candaianselector[10])) {
				double zealanddollar = amount * canadianexchanges[10];
				System.out.println("" + amount + " CAD=" + conversion.format(zealanddollar) + " NZD");
			}
			// British currency conversion
		}
		if (currencyconvert1.equals("Pounds") || currencyconvert1.equals("GBP")) {
			String[] britishpounds = {"USD", "CAD", "EUR", "CHF", "JPY",
					"CNY", "HKD", "KRW", "INR", "AUD", "NZD", "HTG", "HRK", "MXN"};
			// british exchanges rates based on british pounds array
			double[] britishexchanges = {1.3896621,
					1.7086516,
					1.1643368,
					1.2755846,
					153.93983,
					8.972421,
					10.786759,
					1566.8003,
					103.10119,
					1.832998,
					1.9652243,
					129.00479,
					8.7298127,
					27.534986};

			System.out.println("Select a currency you wish to convert to?: " +
					"\n" + Arrays.toString(britishpounds));
			scan.nextLine();
			String britishconversionoptions = scan.nextLine();

// GBP-USD
			if (britishconversionoptions.equals(britishpounds[0])) {
				double muricadollar = amount * britishexchanges[0];
				System.out.println("" + amount + " GBP=" + conversion.format(muricadollar) + " USD");
// GBP-> CAD
			} else if (britishconversionoptions.equals(britishpounds[1])) {
				double canadiandolla = amount * britishexchanges[1];
				System.out.println("" + amount + " GBP=" + conversion.format(canadiandolla) + " CAD");
//  GBP -> EURO
			} else if (britishconversionoptions.equals(britishpounds[2])) {
				double euro = amount * britishexchanges[2];
				System.out.println("" + amount + " GBP=" + conversion.format(euro) + " EUR");
// GBP -> CHF
			} else if (britishconversionoptions.equals(britishpounds[3])) {
				double swiss = amount * britishexchanges[3];
				System.out.println("" + amount + " GBP=" + conversion.format(swiss) + " CHF");
// GBP -> JPY
			} else if (britishconversionoptions.equals(britishpounds[4])) {
				double jpyen = amount * britishexchanges[4];
				System.out.println("" + amount + " GBP=" + conversion.format(jpyen) + " JPY");
// GBP -> CNY
			} else if (britishconversionoptions.equals(britishpounds[5])) {
				double chineseyuan = amount * britishexchanges[5];
				System.out.println("" + amount + " GBP=" + conversion.format(chineseyuan) + " CNY");
// GBP -> HKD
			} else if (britishconversionoptions.equals(britishpounds[6])) {
				double hkdollar = amount * britishexchanges[6];
				System.out.println("" + amount + " GBP=" + conversion.format(hkdollar) + " HKD");
// GBP -> KRW
			} else if (britishconversionoptions.equals(britishpounds[7])) {
				double koreanwon = amount * britishexchanges[7];
				System.out.println("" + amount + " GBP=" + conversion.format(koreanwon) + " KRW");
// GBP -> INR
			} else if (britishconversionoptions.equals(britishpounds[8])) {
				double indianrupee = amount * britishexchanges[8];
				System.out.println("" + amount + " GBP=" + conversion.format(indianrupee) + " INR");
// GBP -> AUD
			} else if (britishconversionoptions.equals(britishpounds[9])) {
				double australiandollar = amount * britishexchanges[9];
				System.out.println("" + amount + " GBP=" + conversion.format(australiandollar) + " AUD");
// GBP -> NZD
			} else if (britishconversionoptions.equals(britishpounds[10])) {
				double nzddollar = amount * britishexchanges[10];
				System.out.println("" + amount + " GBP=" + conversion.format(nzddollar) + " NZD");
			}
		}

		// Euro conversions
		if (currencyconvert1.equals("EUR") || currencyconvert1.equals("Euros")) {
			String[] euroconversionoptions = {"USD", "CAD", "GBP", "CHF", "JPY",
					"CNY", "HKD", "KRW", "INR", "AUD", "NZD"};
// EURO currency exchange rates based on conversion options array

			double[] euroexchanges = {1.1935435,
					1.4675166,
					0.8590882,
					1.095764,
					132.20582,
					7.7050111,
					9.2633229,
					1345.5942,
					88.549648,
					1.5742671,
					1.6875039,
					110.77819,
					7.4973875,
					23.654266};


			System.out.println("Please select a currency of your choice" +
					"\n" + Arrays.toString(euroconversionoptions));
			scan.nextLine();
			String euroselector = scan.nextLine();

// EUR -> USD
			if (euroselector.equals(euroconversionoptions[0])) {
				double usd = amount * euroexchanges[0];
				System.out.println("" + amount + " EUR=" + conversion.format(usd) + " USD");
// EUR -> CAD
			} else if (euroselector.equals(euroconversionoptions[1])) {
				double cad = amount * euroexchanges[1];
				System.out.println("" + amount + " EUR=" + conversion.format(cad) + " CAD");
// EUR -> GBP
			} else if (euroselector.equals(euroconversionoptions[2])) {
				double britpounds = amount * euroexchanges[2];
				System.out.println("" + amount + " EUR=" + conversion.format(britpounds) + " GBP");
// EUR -> CHF
			} else if (euroselector.equals(euroconversionoptions[3])) {
				double swissyfranc = amount * euroexchanges[3];
				System.out.println("" + amount + " EUR=" + conversion.format(swissyfranc) + " CHF");
// EUR -> JPY
			} else if (euroselector.equals(euroconversionoptions[4])) {
				double jpy = amount * euroexchanges[4];
				System.out.println("" + amount + " EUR=" + conversion.format(jpy) + " JPY");
// EUR -> CNY
			} else if (euroselector.equals(euroconversionoptions[5])) {
				double cny = amount * euroexchanges[5];
				System.out.println("" + amount + " Eur=" + conversion.format(cny) + " CNY");
// EUR-> HKD
			} else if (euroselector.equals(euroconversionoptions[6])) {
				double hkd = amount * euroexchanges[6];
				System.out.println("" + amount + " Eur=" + conversion.format(hkd) + "  HKD");
// EUR -> KRW
			} else if (euroselector.equals(euroconversionoptions[7])) {
				double skwon = amount * euroexchanges[7];
				System.out.println("" + amount + " EUR=" + conversion.format(skwon) + " KRW");
// EUR -> INR
			} else if (euroselector.equals(euroconversionoptions[8])) {
				double INR = amount * euroexchanges[8];
				System.out.println("" + amount + " EUR=" + conversion.format(INR) + " INR");
// EUR -> AUD
			} else if (euroselector.equals(euroconversionoptions[9])) {
				double AUD = amount * euroexchanges[9];
				System.out.println("" + amount + " EUR=" + conversion.format(AUD) + " AUD");
// EUR -> NZD
			} else if (euroselector.equals(euroconversionoptions[10])) {
				double NZD = amount * euroexchanges[10];
				System.out.println("" + amount + " EUR=" + conversion.format(NZD) + " NZD");


			}
// Conversions for  Swiss francs
		}
		if (currencyconvert1.equals("Swiss franc") || currencyconvert1.equals("CHF")) {

			String[] swissconversion = {"USD", "CAD", "EUR", "GBP", "JPY",
					"CNY", "HKD", "KRW", "INR", "AUD", "NZD","HTG","HRK","MXN"};
// swiss exchanges based on swissconversion array
			double[] swissexchanges = {1.0891802,
					1.339196,
					0.91284747,
					0.78455427,
					120.70571,
					7.0331472,
					8.4558061,
					1228.2725,
					80.80371,
					1.4368032,
					1.5405808,
					101.48465,
					6.8405835,
					21.586139};
			System.out.println("Please select a currency of your choice:" +
					"\n" + Arrays.toString(swissconversion));
			scan.nextLine();
			String swissselector = scan.nextLine();
			//CHF->USD
			if (swissselector.equals(swissconversion[0])) {
				double usd = amount * swissexchanges[0];
				System.out.println("" + amount + " CHF=" + conversion.format(usd) + " USD");
				// CHF -> CAD
			} else if (swissselector.equals(swissconversion[1])) {
				double cad = amount * swissexchanges[1];
				System.out.println("" + amount + " CHF=" + conversion.format(cad) + " CAD");
				// GBP -> EUR
			} else if (swissselector.equals(swissconversion[2])) {
				double euro = amount * swissexchanges[2];
				System.out.println("" + amount + " CHF" + conversion.format(euro) + " EUR");
				// CHF->GBP
			} else if (swissselector.equals(swissconversion[3])) {
				double britishpound = amount * swissexchanges[3];
				System.out.println("" + amount + " CHF=" + conversion.format(britishpound) + " GBP");
// CHF ->JPY
			} else if (swissselector.equals(swissconversion[4])) {
				double japaneseyen = amount * swissexchanges[4];
				System.out.println("" + amount + " CHF=" + conversion.format(japaneseyen) + " JPY");
// CHF -> CNY
			} else if (swissselector.equals(swissconversion[5])) {
				double chinayuan = amount * swissexchanges[5];
				System.out.println("" + amount + " CHF=" + conversion.format(chinayuan) + " CNY");
// CHF -> HKD
			} else if (swissselector.equals(swissconversion[6])) {
				double hongkongdollas = amount * swissexchanges[6];
				System.out.println("" + amount + " CHF=" + conversion.format(hongkongdollas) + " HKD");
// CHF -> KRW
			} else if (swissselector.equals(swissconversion[7])) {
				double skoreanwon = amount * swissexchanges[7];
				System.out.println("" + amount + " CHF=" + conversion.format(skoreanwon) + " WON");
				// CHF -> INR
			} else if (swissselector.equals(swissconversion[8])) {
				double indianrupee = amount * swissexchanges[8];
				System.out.println("" + amount + " CHF=" + conversion.format(indianrupee) + " INR");
				// CHF-> Australian dollars
			} else if (swissselector.equals(swissconversion[9])) {
				double aussiedoller = amount * swissexchanges[9];
				System.out.println("" + amount + " CHF=" + conversion.format(aussiedoller) + " AUD");
				// CHF->NZD
			} else if (swissselector.equals(swissconversion[10])) {
				double nzdoller = amount * swissexchanges[10];
				System.out.println("" + amount + " CHF=" + conversion.format(nzdoller) + " NZD");
			}


			//if player choses yen
		}
		if (currencyconvert1.equals("Japanese Yen") || currencyconvert1.equals("JPY")) {
			/* japanese yen potential conversions(in a array to store them rather
			how i did it prior(The whole double system.Prints out all currencies rather than specific one)
			 */
			String[] jpycurrencies = {"USD", "EUR", "CAD", "GBP", "HKD",
					"CNY", "KRW", "INR", "AUD", "NZD", "HTG", "HRK", "MXN"};
// jpy exchange rates based on jpycurrency array
			double[] jpyexchangerates = {0.0090252854,
					0.0075621801,
					0.011097333,
					0.0064973919,
					0.070051201,
					0.05826855,
					10.17488,
					0.66966838,
					0.011904896,
					0.012763449,
					0.83827471,
					0.056694686,
					0.17886937};

			System.out.println("Please select a currency of your choice:" + Arrays.toString(jpycurrencies));
			scan.nextLine();
			String jpyselector = scan.nextLine();
// jpy -> usd
			if (jpyselector.equals(jpycurrencies[0])) {
				double murica = amount * jpyexchangerates[0];
				System.out.println("" + amount + " JPY=" + conversion.format(murica) + " usd");
// jpy-> euro
			} else if (jpyselector.equals(jpycurrencies[1])) {
				double euro = amount * jpyexchangerates[1];
				System.out.println("" + amount + "JPY=" + conversion.format(euro) + " EUR");
// JPY -> GBP
			} else if (jpyselector.equals(jpycurrencies[3])) {
				double britishpounds = amount * jpyexchangerates[3];
				System.out.println("" + amount + " JPY=" + conversion.format(britishpounds) + " GBP");
				// JPY-> HKD
			} else if (jpyselector.equals(jpycurrencies[4])) {
				double hkdollar = amount * jpyexchangerates[4];
				System.out.println("" + amount + " JPY=" + conversion.format(hkdollar) + " HKD");
				// JPY-> CNY
			} else if (jpyselector.equals(jpycurrencies[5])) {
				double chineseyuan = amount * jpyexchangerates[5];
				System.out.println("" + amount + " JPY=" + conversion.format(chineseyuan) + " CNY");
				// JPY->KRW
			} else if (jpyselector.equals(jpycurrencies[6])) {
				double skwon = amount * jpyexchangerates[6];
				System.out.println("" + amount + " JPY=" + conversion.format(skwon) + " KRW");
				// JPY->INR
			} else if (jpyselector.equals(jpycurrencies[7])) {
				double indianrupee = amount * jpyexchangerates[7];
				System.out.println("" + amount + " JPY=" + conversion.format(indianrupee) + " INR");
				// JPY -> AUD
			} else if (jpyselector.equals(jpycurrencies[8])) {
				double aussiebucks = amount * jpyexchangerates[8];
				System.out.println("" + amount + " JPY=" + conversion.format(aussiebucks) + " AUD");
				// JPY -> NZD
			} else if (jpyselector.equals(jpycurrencies[9])) {
				double nzdollar = amount * jpyexchangerates[9];
				System.out.println("" + amount + " JPY=" + conversion.format(nzdollar) + " NZD");

// JPY -> CAD
			} else if (jpyselector.equals(jpycurrencies[2])) {
				double canadadollar = amount * jpyexchangerates[2];
				System.out.println("" + amount + " JPY=" + conversion.format(canadadollar) + " CAD");
			}


			// chinese yuan conversions
		}
		if (currencyconvert1.equals("Chinese Yuan") || currencyconvert1.equals("CNY")) {
			String[] chinayuancovert = {"USD",
					"GBP",
					"CAD",
					"EUR",
					"CHF",
					"JPY",
					"HKD",
					"KRW",
					"INR",
					"AUD", "NZD", "HTG", "HRK", "MXN"};


			// chinese currency exchanges
			double[] chinacurrencyexchanges = {0.15489162,
					0.11150764,
					0.19044185,
					0.12978363,
					0.1422277,
					17.161782,
					1.2021664,
					174.62463,
					11.492887,
					0.20435696,
					0.21923473,
					14.3791,
					0.97302982,
					3.0698236};


			System.out.println("Please select a currency of your choice" +
					"\n" + Arrays.toString(chinayuancovert));
			scan.nextLine();
			String chinayuanselector = scan.nextLine();
// CNY -> USD
			if (chinayuanselector.equals(chinayuancovert[0])) {
				double usdresult = amount * chinacurrencyexchanges[0];
				System.out.println("" + amount + " CNY = " + conversion.format(usdresult) + " USD");
				// CNY -> GBP
			} else if (chinayuanselector.equals(chinayuancovert[1])) {
				double britishpoundresults = amount * chinacurrencyexchanges[1];
				System.out.println("" + amount + " CNY = " + conversion.format(britishpoundresults) + " GBP");
				// CNY ->cad
			} else if (chinayuanselector.equals(chinayuancovert[2])) {
				double cadresults = amount * chinacurrencyexchanges[2];
				System.out.println("" + amount + " CNY = " + conversion.format(cadresults) + " CAD");
				// CNY -> EUR
			} else if (chinayuanselector.equals(chinayuancovert[3])) {
				double euroresults = amount * chinacurrencyexchanges[3];
				System.out.println("" + amount + " CNY = " + conversion.format(euroresults) + " EUR");
				// CNY-> CHF
			} else if (chinayuanselector.equals(chinayuancovert[4])) {
				double swissyfrancs = amount * chinacurrencyexchanges[4];
				System.out.println("" + amount + " CNY =" + conversion.format(swissyfrancs) + " CHF");
				// CNY-> JPY
			} else if (chinayuanselector.equals(chinayuancovert[5])) {
				double japanyenresults = amount * chinacurrencyexchanges[5];
				System.out.println("" + amount + " CNY =" + conversion.format(japanyenresults) + " JPY");
				// CNY -> HKD
			} else if (chinayuanselector.equals(chinayuancovert[6])) {
				double hongkongmoney = amount * chinacurrencyexchanges[6];
				System.out.println("" + amount + " CNY =" + conversion.format(hongkongmoney) + " HKD");
				// CNY -> KRW
			} else if (chinayuanselector.equals(chinayuancovert[7])) {
				double southkoreawon = amount * chinacurrencyexchanges[7];
				System.out.println("" + amount + " CNY = " + conversion.format(southkoreawon) + " KRW");
				//CNY -> INR
			} else if (chinayuanselector.equals(chinayuancovert[8])) {
				double indiarupeeresults = amount * chinacurrencyexchanges[8];
				System.out.println("" + amount + " CNY = " + conversion.format(indiarupeeresults) + " INR");
				// CNY -> AUD
			} else if (chinayuanselector.equals(chinayuancovert[9])) {
				double aussiedollaresults = amount * chinacurrencyexchanges[9];
				System.out.println("" + amount + " CNY = " + conversion.format(aussiedollaresults) + " AUD");
				// CNY -> NZD
			} else if (chinayuanselector.equals(chinayuancovert[10])) {
				double nzdresults = amount * chinacurrencyexchanges[10];
				System.out.println("" + amount + " CNY =" + conversion.format(nzdresults) + " NZD");


// if player wishes to convert hong kong dollars
			}

		}
		if (currencyconvert1.equals("Hong Kong Dollar") || currencyconvert1.equals("HKD")) {
			String[] HKDconversions = {"USD", "CAD", "EUR", "GBP", "CHF",
					"\n" + "JPY", "CNY", "KRW", "INR", "AUD", "NZD", "HTG", "HRK", "MXN"};
// currency exchange rates based on  hkd currencies array
			double[] hkcurrencyexchange = {0.12884056,
					0.15840684,
					0.10795292,
					0.092747291,
					0.11830891,
					14.27569,
					0.83179533,
					145.24931,
					9.5597888,
					0.16995157,
					0.18240799,
					11.959454,
					0.80939376,
					2.5537292};
			//
			System.out.println("Select a currency to convert to" +
					"\n" + Arrays.toString(HKDconversions));
			scan.nextLine();
			String hkconverter = scan.nextLine();
			// HKD -> US
			if (hkconverter.equals(HKDconversions[0])) {
				double usdresult = amount * hkcurrencyexchange[0];
				System.out.println("" + amount + " HKD =" + conversion.format(usdresult) + " USD  ");
				// HKD -> CAD
			} else if (hkconverter.equals(HKDconversions[1])) {
				double cadresult = amount * hkcurrencyexchange[1];
				System.out.println("" + amount + " HKD = " + conversion.format(cadresult) + " CAD");
				// HKD -> EUR
			} else if (hkconverter.equals(HKDconversions[2])) {
				double euroconvert = amount * hkcurrencyexchange[2];
				System.out.println("" + amount + " HKD =" + conversion.format(euroconvert) + " EUR");
				// HKD -> GPD
			} else if (hkconverter.equals(HKDconversions[3])) {
				double britishresult = amount * hkcurrencyexchange[3];
				System.out.println("" + amount + " HKD = " + conversion.format(britishresult) + " GBP");
				// HKD -> CHF
			} else if (hkconverter.equals(HKDconversions[4])) {
				double swissfranc = amount * hkcurrencyexchange[4];
				System.out.println("" + amount + " HKD = " + conversion.format(swissfranc) + " CHF");
				// HKD -> JPY
			} else if (hkconverter.equals(HKDconversions[5])) {
				double jpyresult = amount * hkcurrencyexchange[5];
				System.out.println("" + amount + " HKD =" + conversion.format(jpyresult) + " JPY");
				// HKD -> CNY
			} else if (hkconverter.equals(HKDconversions[6])) {
				double chinaconvert = amount * hkcurrencyexchange[6];
				System.out.println("" + amount + " HKD =" + conversion.format(chinaconvert) + " CNY");
				// HKD -> KRW
			} else if (hkconverter.equals(HKDconversions[7])) {
				double koreanwon = amount * hkcurrencyexchange[7];
				System.out.println("" + amount + " HKD = " + conversion.format(koreanwon) + " KRW");
				// HKD -> INR
			} else if (hkconverter.equals(HKDconversions[8])) {
				double rupees = amount * hkcurrencyexchange[8];
				System.out.println("" + amount + " HKD = " + conversion.format(rupees) + " INR");

				// HKD -> AUD
			} else if (hkconverter.equals(HKDconversions[9])) {
				double aussiebucks = amount * hkcurrencyexchange[9];
				System.out.println("" + amount + " HKD =" + conversion.format(aussiebucks) + " AUD");
				// HKD -> NZD
			} else if (hkconverter.equals(HKDconversions[10])) {
				double nzdollas = amount * hkcurrencyexchange[10];
				System.out.println("" + amount + " HKD =" + conversion.format(nzdollas) + " NZD");
			}
			// if player wishes to use south korean won
		}
		if (currencyconvert1.equals("KRW") || currencyconvert1.equals("South Korean won")) {
			String[] potientalwonconversions = {"USD", "CAD", "GBP", "EUR", "CHF",
					"JPY", "CNY", "HKD", "INR", "AUD", "NZD", "HTG", "HKR", "MXN"};
				/*Based on potientalwonconversions array. Currency exchange rates of that array
				Order based on the order of currencies. So first is the USD, and goes all the way to NZD
				 */
			double[] currencyresults = {0.00088713332,
					0.001090705,
					0.00063871071,
					0.00074323486,
					0.00081473396,
					0.098285588,
					0.0057270997,
					0.0068849683,
					0.065819536,
					0.0011704272,
					0.0012552817,
					0.082343466,
					0.0055728683,
					0.01757879};

			System.out.println("Please select a currency you wish to convert to:" +
					"\n" + Arrays.toString(potientalwonconversions));
			scan.nextLine();
			String woncurrencyresults = scan.nextLine();
// KRW -> USD
			if (woncurrencyresults.equals(potientalwonconversions[0])) {
				double usdresult = amount * currencyresults[0];
				System.out.println("" + amount + " KRW = " + conversion.format(usdresult) + " USD");
				// KRW -> CAD
			} else if (woncurrencyresults.equals(potientalwonconversions[1])) {
				double cadresult = amount * currencyresults[1];
				System.out.println("" + amount + " KRW =" + conversion.format(cadresult) + " CAD");
				// KRW -> GBP
			} else if (woncurrencyresults.equals(potientalwonconversions[2])) {
				double poundoutcomes = amount * currencyresults[2];
				System.out.println("" + amount + " KRW =" + conversion.format(poundoutcomes) + " GBP");
				// KRW -> EUR
			} else if (woncurrencyresults.equals(potientalwonconversions[3])) {
				double euroresult = amount * currencyresults[3];
				System.out.println("" + amount + " KRW =" + conversion.format(euroresult) + " EUR");
				// KRW -> CHF
			} else if (woncurrencyresults.equals(potientalwonconversions[4])) {
				double swissyfrancresult = amount * currencyresults[4];
				System.out.println("" + amount + " KRW = " + conversion.format(swissyfrancresult) + " CHF");
				// KRW -> JPY
			} else if (woncurrencyresults.equals(potientalwonconversions[5])) {
				double jpyoutcome = amount * currencyresults[5];
				System.out.println("" + amount + " KRW =" + conversion.format(jpyoutcome) + " JPY");
				// KRW -> CNY
			} else if (woncurrencyresults.equals(potientalwonconversions[6])) {
				double chinayuan = amount * currencyresults[6];
				System.out.println("" + amount + " KRW = " + conversion.format(chinayuan) + " CNY");
				// KRW -> HKD
			} else if (woncurrencyresults.equals(potientalwonconversions[7])) {
				double hkresult = amount * currencyresults[7];
				System.out.println("" + amount + " KRW =" + conversion.format(hkresult) + " HKD");
				// KRW -> INR
			} else if (woncurrencyresults.equals(potientalwonconversions[8])) {
				double indiamoneyresult = amount * currencyresults[8];
				System.out.println("" + amount + " KRW =" + conversion.format(indiamoneyresult) + " INR");
				// KRW -> AUD
			} else if (woncurrencyresults.equals(potientalwonconversions[9])) {
				double aussiebucksresults = amount * currencyresults[9];
				System.out.println("" + amount + " KRW =" + conversion.format(aussiebucksresults) + " AUD");
				// KRW -> NZD
			} else if (woncurrencyresults.equals(potientalwonconversions[10])) {
				double newzealandbucks = amount * currencyresults[10];
				System.out.println("" + amount + " KRW =" + conversion.format(newzealandbucks) + " NZD");


			}
			// INDIAN RUPEE CURRENCIES
		}
		if (currencyconvert1.equals("INR") || currencyconvert1.equals("Indian rupee")) {
			String[] indianconversions = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "KRW", "AUD", "NZD", "HTG", "HRK", "MXN"};
				/*Based on indianconversions array. Currency exchange rates of that array
				Order based on the order of currencies. So first is the USD, and goes all the way to NZD
				 */
			double[] indianexchangerates = {0.013478634,
					0.01657218,
					0.0097040523,
					0.011292455,
					0.012374242,
					1.4933337,
					0.087012939,
					0.10461052,
					15.193976,
					0.017789571,
					0.019074313,
					1.2541429,
					0.084661481,
					0.26706922};

			System.out.println("Please select a currency you wish to convert to:" +
					"\n" + Arrays.toString(indianconversions));
			scan.nextLine();
			String indianresults = scan.nextLine();
			// INR -> USD
			if (indianresults.equals(indianconversions[0])) {
				double usdresult = amount * indianexchangerates[0];
				System.out.println("" + amount + " INR = " + conversion.format(usdresult) + " USD");
				// INR -> CAD
			} else if (indianresults.equals(indianconversions[1])) {
				double cadresult = amount * indianexchangerates[1];
				System.out.println("" + amount + " INR =" + conversion.format(cadresult) + " CAD");
				// INR -> GBP
			} else if (indianresults.equals(indianconversions[2])) {
				double poundoutcomes = amount * indianexchangerates[2];
				System.out.println("" + amount + " INR =" + conversion.format(poundoutcomes) + " GBP");
				// INR -> EUR
			} else if (indianresults.equals(indianconversions[3])) {
				double euroresult = amount * indianexchangerates[3];
				System.out.println("" + amount + " INR =" + conversion.format(euroresult) + " EUR");
				// INR -> CHF
			} else if (indianresults.equals(indianconversions[4])) {
				double swissyfrancresult = amount * indianexchangerates[4];
				System.out.println("" + amount + " INR = " + conversion.format(swissyfrancresult) + " CHF");
				// INR -> JPY
			} else if (indianresults.equals(indianconversions[5])) {
				double jpyoutcome = amount * indianexchangerates[5];
				System.out.println("" + amount + " INR =" + conversion.format(jpyoutcome) + " JPY");
				// INR -> CNY
			} else if (indianresults.equals(indianconversions[6])) {
				double chinayuan = amount * indianexchangerates[6];
				System.out.println("" + amount + " INR = " + conversion.format(chinayuan) + " CNY ");
				// INR -> HKD
			} else if (indianresults.equals(indianconversions[7])) {
				double hkresult = amount * indianexchangerates[7];
				System.out.println("" + amount + " INR =" + conversion.format(hkresult) + " HKD");
				// INR -> KRW
			} else if (indianresults.equals(indianconversions[8])) {
				double koreamoneyresult = amount * indianexchangerates[8];
				System.out.println("" + amount + " INR =" + conversion.format(koreamoneyresult) + " KRW");
				// INR -> AUD
			} else if (indianresults.equals(indianconversions[9])) {
				double aussiebucksresults = amount * indianexchangerates[9];
				System.out.println("" + amount + " INR =" + conversion.format(aussiebucksresults) + " AUD");
				// INR -> NZD
			} else if (indianresults.equals(indianconversions[10])) {
				double newzealandresults = amount * indianexchangerates[10];
				System.out.println("" + amount + " INR =" + conversion.format(newzealandresults) + " NZD");
			}
// if player decides to choose  Australian dollar

		}
		if (currencyconvert1.equals("AUD") || currencyconvert1.equals("Australian Dollar")) {
			//  Player choices when choosing australian dollars
			String[] aussieconversions = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "INR", "KRW", "NZD", "HTG", "HRK", "MXN"};
				/*Based on indianconversions array. Currency exchange rates of that array
				Order based on the order of currencies. So first is the USD, and goes all the way to NZD
				 */
			double[] aussieexchangerates = {0.7576552,
					0.93154306,
					0.54538661,
					0.6347393,
					0.6956297,
					83.943528,
					4.8909596,
					5.8798709,
					56.207973,
					853.96375,
					1.0720983,
					70.36036,
					4.759412,
					15.014489};

			System.out.println("Please select a currency you wish to convert to:" +
					"\n" + Arrays.toString(aussieconversions));
			scan.nextLine();
			String aussieresults = scan.nextLine();
			// AUD -> USD
			if (aussieresults.equals(aussieconversions[0])) {
				double usdresult = amount * aussieexchangerates[0];
				System.out.println("" + amount + " AUD = " + conversion.format(usdresult) + " USD");
				// AUD -> CAD
			} else if (aussieresults.equals(aussieconversions[1])) {
				double cadresult = amount * aussieexchangerates[1];
				System.out.println("" + amount + " AUD =" + conversion.format(cadresult) + " CAD");
				// AUD -> GBP
			} else if (aussieresults.equals(aussieconversions[2])) {
				double poundoutcomes = amount * aussieexchangerates[2];
				System.out.println("" + amount + " AUD =" + conversion.format(poundoutcomes) + " GBP");
				// AUD -> EUR
			} else if (aussieresults.equals(aussieconversions[3])) {
				double euroresult = amount * aussieexchangerates[3];
				System.out.println("" + amount + " AUD =" + conversion.format(euroresult) + " EUR");
				// AUD -> CHF
			} else if (aussieresults.equals(aussieconversions[4])) {
				double swissyfrancresult = amount * aussieexchangerates[4];
				System.out.println("" + amount + " AUD = " + conversion.format(swissyfrancresult) + " CHF");
				// AUD -> JPY
			} else if (aussieresults.equals(aussieconversions[5])) {
				double jpyoutcome = amount * aussieexchangerates[5];
				System.out.println("" + amount + " AUD =" + conversion.format(jpyoutcome) + " JPY");
				// AUD -> CNY
			} else if (aussieresults.equals(aussieconversions[6])) {
				double chinayuan = amount * aussieexchangerates[6];
				System.out.println("" + amount + " AUD = " + conversion.format(chinayuan) + " CNY ");
				// AUD -> HKD
			} else if (aussieresults.equals(aussieconversions[7])) {
				double hkresult = amount * aussieexchangerates[7];
				System.out.println("" + amount + " AUD =" + conversion.format(hkresult) + " HKD");
				// AUD -> INR
			} else if (aussieresults.equals(aussieconversions[8])) {
				double koreamoneyresult = amount * aussieexchangerates[8];
				System.out.println("" + amount + " AUD =" + conversion.format(koreamoneyresult) + " INR");
				// AUD -> KRW
			} else if (aussieresults.equals(aussieconversions[9])) {
				double aussiebucksresults = amount * aussieexchangerates[9];
				System.out.println("" + amount + " AUD =" + conversion.format(aussiebucksresults) + " KRW");
				// INR -> NZD
			} else if (aussieresults.equals(aussieconversions[10])) {
				double newzealandresults = amount * aussieexchangerates[10];
				System.out.println("" + amount + " AID =" + conversion.format(newzealandresults) + " NZD");
			}
// if player wants to convert from  new zealand dollars

		}
		if (currencyconvert1.equals("NZD") || currencyconvert1.equals("New Zealand Dollar")) {

			//  Player choices when choosing australian dollars
			String[] nzdconversions = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "INR", "KRW", "AUD", "HTG", "HRK", "MXN"};
				/*Based on newleazandconversions array. Currency exchange rates of that array
				Order based on the order of currencies. So first is the USD, and goes all the way to NZD
				 */
			double[] nzdexchangerates = {0.70683276,
					0.86906347,
					0.50891807,
					0.59212457,
					0.64898728,
					78.307804,
					4.5621928,
					5.4848988,
					52.432823,
					796.84492,
					0.93281665,
					65.614902,
					4.4403515,
					14.006664};
// Selecting currency to choose too based on nzd currency conversion array
			System.out.println("Please select a currency you wish to convert to:" +
					"\n" + Arrays.toString(nzdconversions));
			scan.nextLine();
			String nzdresults = scan.nextLine();
			// NZD -> USD
			if (nzdresults.equals(nzdconversions[0])) {
				double usdresult = amount * nzdexchangerates[0];
				System.out.println("" + amount + " NZD = " + conversion.format(usdresult) + " USD");
				// NZD -> CAD
			} else if (nzdresults.equals(nzdconversions[1])) {
				double cadresult = amount * nzdexchangerates[1];
				System.out.println("" + amount + " NZD =" + conversion.format(cadresult) + " CAD");
				// NZD -> GBP
			} else if (nzdresults.equals(nzdconversions[2])) {
				double poundoutcomes = amount * nzdexchangerates[2];
				System.out.println("" + amount + " NZD =" + conversion.format(poundoutcomes) + " GBP");
				// NZD -> EUR
			} else if (nzdresults.equals(nzdconversions[3])) {
				double euroresult = amount * nzdexchangerates[3];
				System.out.println("" + amount + " NZD =" + conversion.format(euroresult) + " EUR");
				// NZD -> CHF
			} else if (nzdresults.equals(nzdconversions[4])) {
				double swissyfrancresult = amount * nzdexchangerates[4];
				System.out.println("" + amount + " NZD = " + conversion.format(swissyfrancresult) + " CHF");
				// NZD -> JPY
			} else if (nzdresults.equals(nzdconversions[5])) {
				double jpyoutcome = amount * nzdexchangerates[5];
				System.out.println("" + amount + " NZD =" + conversion.format(jpyoutcome) + " JPY");
				// NZD -> CNY
			} else if (nzdresults.equals(nzdconversions[6])) {
				double chinayuan = amount * nzdexchangerates[6];
				System.out.println("" + amount + " NZD = " + conversion.format(chinayuan) + " CNY ");
				// NZD -> HKD
			} else if (nzdresults.equals(nzdconversions[7])) {
				double hkresult = amount * nzdexchangerates[7];
				System.out.println("" + amount + " NZD =" + conversion.format(hkresult) + " HKD");
				// NZD -> INR
			} else if (nzdresults.equals(nzdconversions[8])) {
				double koreamoneyresult = amount * nzdexchangerates[8];
				System.out.println("" + amount + " NZD =" + conversion.format(koreamoneyresult) + " INR");
				// NZD -> KRW
			} else if (nzdresults.equals(nzdconversions[9])) {
				double aussiebucksresults = amount * nzdexchangerates[9];
				System.out.println("" + amount + " NZD =" + conversion.format(aussiebucksresults) + " KRW");
				// NZD-> AUD
			} else if (nzdresults.equals(nzdconversions[10])) {
				double newzealandresults = amount * nzdexchangerates[10];
				System.out.println("" + amount + " NZD =" + conversion.format(newzealandresults) + " AUD");
			}
			// if player decides to convert haitian currencies
		}
		if (currencyconvert1.equals("HTG") || currencyconvert1.equals("Haitian Gourde")) {
			String[] htgconversions = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "INR", "KRW", "AUD", "NZD", "MXN", "HRK"};
// haitian currency exchange rates
			double[] htgexchanges = {0.010582005,
					0.013013648,
					0.0076222255,
					0.0088665181,
					0.0097087868,
					1.1724261,
					0.06830844,
					0.082137249,
					0.7848665,
					11.929971,
					0.013934393,
					0.014974283,
					0.2097716,
					0.066426214};
			System.out.println("Please select a currency you wish to convert to:" +
					"\n" + Arrays.toString(htgconversions));
			scan.nextLine();

			String haitianresults = scan.nextLine();

			// HTG -> USD
			if (haitianresults.equals(htgconversions[0])) {
				double usresult = amount * htgexchanges[0];
				System.out.println(""+amount+" HTG ="+conversion.format(usresult)+" USD");
				// HTG -> CAD
			} else if (haitianresults.equals(htgconversions[1])) {
				double cadresult = amount * htgexchanges[1];
				System.out.println(""+amount+" HTG ="+conversion.format(cadresult)+" CAD");
				// HTG -> GBP
			}else if (haitianresults.equals(htgconversions[2])){
				double britishresult = amount * htgexchanges[2];
				System.out.println(""+amount+" HTG ="+conversion.format(britishresult)+" GBP");
			// HTG -> EUR
		}else if (haitianresults.equals(htgconversions[3])){
				double euroresult = amount * htgexchanges[3];
				System.out.println(""+amount+" HTG ="+conversion.format(euroresult)+" EUR");
		// HTG -> CHF
	}else if (haitianresults.equals(htgconversions[4])){
				double swissyfrancresult = amount * htgexchanges[4];
				System.out.println(""+amount+" HTG ="+conversion.format(swissyfrancresult)+" CHF");
	// HTG -> JPY
}else if (haitianresults.equals(htgconversions[5])){
				double jpyresult = amount * htgexchanges[5];
				System.out.println(""+amount+" HTG ="+conversion.format(jpyresult)+" JPY");
			// HTG -> CNY
}else if (haitianresults.equals(htgconversions[6])){
				double cnyresult = amount * htgexchanges[6];
				System.out.println(""+amount+" HTG ="+conversion.format(cnyresult)+" CNY");
			// HTG -> HKD
		}else if (haitianresults.equals(htgconversions[7])){
				double hkdresult = amount * htgexchanges[7];
				System.out.println(""+amount+" HTG ="+conversion.format(hkdresult)+" HKD");
			// HTG -> INR
		}else if (haitianresults.equals(htgconversions[8])){
				double rupeeresult = amount * htgexchanges[8];
				System.out.println(""+amount+" HTG ="+conversion.format(rupeeresult)+" INR");
			// HTG -> KRW
		}else if (haitianresults.equals(htgconversions[9])){
				double koreanresult = amount * htgexchanges[9];
				System.out.println(""+amount+" HTG ="+conversion.format(koreanresult)+" KRW");
			// HTG -> AUD
		}else if (haitianresults.equals(htgconversions[10])){
				double australianresult = amount * htgexchanges[10];
				System.out.println(""+amount+" HTG ="+conversion.format(australianresult)+" AUD");
			// HTG -> NZD
		}else if (haitianresults.equals(htgconversions[11])){
				double nzdresult = amount * htgexchanges[11];
				System.out.println(""+amount+" HTG ="+conversion.format(nzdresult)+" NZD");
			// HTG -> MXN
		}else if(haitianresults.equals(htgconversions[12])){
				double mpesosresult = amount * htgexchanges[12];
				System.out.println(""+amount+" HTG ="+conversion.format(mpesosresult)+" MXN");
			// HTG -> HRK
		}else if (haitianresults.equals(htgconversions[13])){
				double croatresult = amount * htgexchanges[13];
				System.out.println(""+amount+" HTG ="+conversion.format(croatresult)+" HRK");
			}
			// If player chooses Croatian Kunas
		}if(currencyconvert1.equals("Croatian Kuna")||currencyconvert1.equals("HRK")) {
			String[] kunaconversions = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "INR", "KRW", "AUD", "NZD", "HTG", "MXN"};
// croatian currency exchange rates
			double[] kunaexchange = {0.15930466,
					0.19588622,
					0.1147556,
					0.13347511,
					0.14611796,
					17.652264,
					1.0283665,
					1.2364995,
					11.819632,
					179.59731,
					0.20979792,
					0.22538012,
					15.054298,
					3.1578917,};

			System.out.println("Please select a currency you wish to convert to:" +
					"\n" + Arrays.toString(kunaconversions));
			scan.nextLine();
			String croatianresults = scan.nextLine();
// HRK -> USD
			if (croatianresults.equals(kunaconversions[0])) {
				double murciaresult = amount * kunaexchange[0];
				System.out.println("" + amount + " HRK = " + conversion.format(murciaresult) + " USD");
				// HRK -> CAD
			} else if (croatianresults.equals(kunaconversions[1])) {
				double cadresult = amount * kunaexchange[1];
				System.out.println("" + amount + " HRK = " + conversion.format(cadresult) + " CAD");
				// HRK -> GBP
			} else if (croatianresults.equals(kunaconversions[2])) {
				double poundresult = amount * kunaexchange[2];
				System.out.println("" + amount + " HRK = " + conversion.format(poundresult) + " GBP");
				// HRK -> EUR
			} else if (croatianresults.equals(kunaconversions[3])) {
				double euroresult = amount * kunaexchange[3];
				System.out.println("" + amount + " HRK = " + conversion.format(euroresult) + " EUR");
				// HRK -> CHF
			} else if (croatianresults.equals(kunaconversions[4])) {
				double swissresult = amount * kunaexchange[4];
				System.out.println("" + amount + " HRK = " + conversion.format(swissresult) + " CHF");
				// HRK -> JPY
			} else if (croatianresults.equals(kunaconversions[5])) {
				double jpyresult = amount * kunaexchange[5];
				System.out.println("" + amount + " HRK = " + conversion.format(jpyresult) + " JPY");
				// HRK -> CNY
			} else if (croatianresults.equals(kunaconversions[6])) {
				double cnyresult = amount * kunaexchange[6];
				System.out.println("" + amount + " HRK = " + conversion.format(cnyresult) + " CNY");
				// HRK -> HKD
			} else if (croatianresults.equals(kunaconversions[7])) {
				double hkresult = amount * kunaexchange[7];
				System.out.println("" + amount + " HRK = " + conversion.format(hkresult) + " HKD");
				// HRK -> INR
			} else if (croatianresults.equals(kunaconversions[8])) {
				double indianresult = amount * kunaexchange[8];
				System.out.println("" + amount + " HRK = " + conversion.format(indianresult) + " INR");
				// HRK -> KRW
			} else if (croatianresults.equals(kunaconversions[9])) {
				double wonresult = amount * kunaexchange[9];
				System.out.println("" + amount + " HRK = " + conversion.format(wonresult) + " KRW");
				// HRK -> AUD
			} else if (croatianresults.equals(kunaconversions[10])) {
				double aussieresult = amount * kunaexchange[10];
				System.out.println("" + amount + " HRK = " + conversion.format(aussieresult) + " AUD");
				// HRK -> NZD
			} else if (croatianresults.equals(kunaconversions[11])) {
				double newzealandresult = amount * kunaexchange[11];
				System.out.println("" + amount + " HRK = " + conversion.format(newzealandresult) + " NZD");
				// HRK -> HTG
			} else if (croatianresults.equals(kunaconversions[12])) {
				double haitienresult = amount * kunaexchange[12];
				System.out.println("" + amount + " HRK = " + conversion.format(haitienresult) + " HTG");
				// HRK -> MXN
			} else if (croatianresults.equals(kunaconversions[13])) {
				double mexicanresult = amount * kunaexchange[13];
				System.out.println("" + amount + " HRK = " + conversion.format(mexicanresult) + " MXN");
			}
			// if player chooses mexican pesos
		}if(currencyconvert1.equals("Mexican Peso")||currencyconvert1.equals("MXN")) {
			String[] mexicanpesoconversions = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "INR", "KRW", "AUD", "NZD", "HTG", "HRK"};
// mexican currency exchange rates for the conversion array above
			double[] mexicanexchange = {0.050449379,
					0.06203752,
					0.036337057,
					0.042267678,
					0.046282677,
					5.58915,
					0.32564461,
					0.39156383,
					3.7417917,
					56.872748,
					0.066433998,
					0.071370695,
					4.7672159,
					0.3166668};

			System.out.println("Please select a currency you wish to convert to:" +
					"\n" + Arrays.toString(mexicanpesoconversions));
			scan.nextLine();
			String mexicanresults = scan.nextLine();

			// actual exchanges
// MXN -> USD
			if (mexicanresults.equals(mexicanpesoconversions[0])) {
				double murciaresult = amount * mexicanexchange[0];
				System.out.println("" + amount + " MXN = " + conversion.format(murciaresult) + " USD");
				// MXN -> CAD
			} else if (mexicanresults.equals(mexicanpesoconversions[1])) {
				double cadresult = amount * mexicanexchange[1];
				System.out.println("" + amount + " MXN = " + conversion.format(cadresult) + " CAD");
// MXN -> GBP
			} else if (mexicanresults.equals(mexicanpesoconversions[2])) {
				double poundresult = amount * mexicanexchange[2];
				System.out.println("" + amount + " MXN = " + conversion.format(poundresult) + " GBP");
// MXN -> EUR
			} else if (mexicanresults.equals(mexicanpesoconversions[3])) {
				double euroresult = amount * mexicanexchange[3];
				System.out.println("" + amount + " MXN = " + conversion.format(euroresult) + " EUR");
// MXN -> CHF
			} else if (mexicanresults.equals(mexicanpesoconversions[4])) {
				double swissresult = amount * mexicanexchange[4];
				System.out.println("" + amount + " MXN = " + conversion.format(swissresult) + " CHF");
// MXN -> JPY
			} else if (mexicanresults.equals(mexicanpesoconversions[5])) {
				double jpyresult = amount * mexicanexchange[5];
				System.out.println("" + amount + " MXN = " + conversion.format(jpyresult) + " JPY");
// MXN -> CNY
			} else if (mexicanresults.equals(mexicanpesoconversions[6])) {
				double cnyresult = amount * mexicanexchange[6];
				System.out.println("" + amount + " MXN = " + conversion.format(cnyresult) + " CNY");
// MXN -> HKD
			} else if (mexicanresults.equals(mexicanpesoconversions[7])) {
				double hkresult = amount * mexicanexchange[7];
				System.out.println("" + amount + " MXN = " + conversion.format(hkresult) + " HKD");
// MXN -> INR
			} else if (mexicanresults.equals(mexicanpesoconversions[8])) {
				double indianresult = amount * mexicanexchange[8];
				System.out.println("" + amount + " MXN = " + conversion.format(indianresult) + " INR");
// MXN -> KRW
			} else if (mexicanresults.equals(mexicanpesoconversions[9])) {
				double wonresult = amount * mexicanexchange[9];
				System.out.println("" + amount + " MXN = " + conversion.format(wonresult) + " KRW");
// MXN -> AUD
			} else if (mexicanresults.equals(mexicanpesoconversions[10])) {
				double aussieresult = amount * mexicanexchange[10];
				System.out.println("" + amount + " MXN = " + conversion.format(aussieresult) + " AUD");
// MXN -> NZD
			} else if (mexicanresults.equals(mexicanpesoconversions[11])) {
				double newzealandresult = amount * mexicanexchange[11];
				System.out.println("" + amount + " MXN = " + conversion.format(newzealandresult) + " NZD");
// MXN -> HTG
			} else if (mexicanresults.equals(mexicanpesoconversions[12])) {
				double haitienresult = amount * mexicanexchange[12];
				System.out.println("" + amount + " MXN = " + conversion.format(haitienresult) + " HTG");
// MXN -> HRK
			} else if (mexicanresults.equals(mexicanpesoconversions[13])) {
				double mexicanresult = amount * mexicanexchange[13];
				System.out.println("" + amount + " MXN = " + conversion.format(mexicanresult) + " HRK");
			}
		}
	}}