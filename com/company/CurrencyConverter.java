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
				"\nMexican Peso(MXN)\uD83C\uDDF2\uD83C\uDDFD",
				"\nDominican Pesos(DOP)\uD83C\uDDE9\uD83C\uDDF4",
				"\nRussian Rubles(RUB)\uD83C\uDDF7\uD83C\uDDFA",
				"\nBrazilian Real(BRL)\uD83C\uDDE7\uD83C\uDDF7",
				"\nTurkish lira(TRY)\uD83C\uDDF9\uD83C\uDDF7",
				"\nMoroccan Dirham(MAD)\uD83C\uDDF2\uD83C\uDDE6",
				"\nSouth African Rad(ZAR)\uD83C\uDDFF\uD83C\uDDE6"};

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
// Asking to know how much mexican pesos you wish to convert
		}else if ("Mexican Peso".equals(currencyconvert1) || "MXN".equals(currencyconvert1)) {
				System.out.println("How much, " + currencyconvert1 + "(\uD83C\uDDF2\uD83C\uDDFD) do wish to convert?:$");

			// Asking to know how much croatian kuna's you wish to convert
		} else if ("Croatian Kuna".equals(currencyconvert1) || "HRK".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + "(\uD83C\uDDED\uD83C\uDDF7) do wish to convert?:kn");
			// asking player how much Dominican pesos you wish to convert
		} else if ("Dominican Pesos".equals(currencyconvert1) || "DOP".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + "(\uD83C\uDDE9\uD83C\uDDF4) do wish to convert?:Rd$");
			// asking player how much russian rubles you wish to convert
		}else if ("Russian Rubles".equals(currencyconvert1) || "RUB".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + "(\uD83C\uDDF7\uD83C\uDDFA) do wish to convert?:₽");
			//asking player how much Brazilian real you wish to convert
		}else if ("Brazilian Real".equals(currencyconvert1) || "BRL".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + "(\uD83C\uDDE7\uD83C\uDDF7) do wish to convert?:R$");
			//asking player how much turkish lira you wish to convert
		}else if ("Turkish lira".equals(currencyconvert1) || "TRY".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + "(\uD83C\uDDF9\uD83C\uDDF7) do wish to convert?:₺");
			//asking player how much moroccan dirham you wish to convert
		}else if ("Moroccan Dirham".equals(currencyconvert1) || "MAD".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + "(\uD83C\uDDF2\uD83C\uDDE6) do wish to convert?::MAD");
			//asking player how much south african rad you wish to convert
		}else if ("South African Rad".equals(currencyconvert1) || "ZAR".equals(currencyconvert1)) {
			System.out.println("How much, " + currencyconvert1 + "(\uD83C\uDDFF\uD83C\uDDE6) do wish to convert?:R");
		}

		System.out.println();
		int amount = scan.nextInt();

		// actual conversions

// Conversions for US dollars
		if (currencyconvert1.equals("US dollar") || (currencyconvert1.equals("USD"))) {
			String[] muricanselectors = {"EUR", "CAD", "GBP", "CHF", "JPY",
					"CNY", "HKD", "KRW", "INR", "AUD", "NZD", "HTG", "HRK", "MXN",
					"DOP", "RUB", "BRL", "TRY", "MAD","ZAR"};

			double[] usdexchanges = {0.84585934,
					1.2458876,
					0.72458925,
					0.92475727,
					110.63821,
					6.4787226 ,
					7.7678381,
					1137.1167,
					74.749936,
					1.3343848,
					1.426094,
					92.038629,
					6.3315703,
					20.028229,
					57.125548,
					74.322906,
					5.2001166 ,
					8.6940042,
					8.9451126,
					14.361101};

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
				// USD -> HTG
			} else if (usconverter.equals(muricanselectors[11])) {
				double haiticherie = amount * usdexchanges[11];
				System.out.println("" + amount + " USD =" + conversion.format(haiticherie) + " HTG");
				// USD -> HRK(Croatian kuna)
			} else if (usconverter.equals(muricanselectors[12])) {
				double zagrebbucks = amount * usdexchanges[12];
				System.out.println("" + amount + " USD =" + conversion.format(zagrebbucks) + " HRK");
				// USD-> MXN(Mexican pesos)
			} else if (usconverter.equals(muricanselectors[13])) {
				double mexicodolla = amount * usdexchanges[13];
				System.out.println("" + amount + " USD =" + conversion.format(mexicodolla) + " MXN");


			}else if (usconverter.equals(muricanselectors[14])) {
			double russianresult = amount * usdexchanges[14];
			System.out.println("" + amount + "USD = " + conversion.format(russianresult) + " DOP");
//  USD -> RUB
		}else if (usconverter.equals(muricanselectors[15])) {
			double brazilrealresult = amount *usdexchanges[15];
			System.out.println("" + amount + " USD = " + conversion.format(brazilrealresult) + " RUB");
// USD-> BRL
		}else if (usconverter.equals(muricanselectors[16])) {
			double turkishresult = amount * usdexchanges[16];
			System.out.println("" + amount + "USD = " + conversion.format(turkishresult) + " BRL");
//   USD -> MAD
		}else if (usconverter.equals(muricanselectors[17])) {
			double nordafricanresult = amount * usdexchanges[17];
			System.out.println("" + amount + "  USD = " + conversion.format(nordafricanresult) + " TRY");
//USD -> MAD
		}else if (usconverter.equals(muricanselectors[18])) {
			double morrocoresult = amount *  usdexchanges[18];
			System.out.println("" + amount + " USD = " + conversion.format(morrocoresult) + "MAD");

			//  USD-> ZAR
		}else if (usconverter.equals(muricanselectors[19])) {
			double saresult = amount * usdexchanges[19];
			System.out.println("" + amount +"V = " + conversion.format(saresult) + "ZAR");
		}

			// conversions for Canadian dollar
		}

		if (currencyconvert1.equals("Canadian Dollar") || currencyconvert1.equals("CAD")) {
// All canadian potential options
			String[] candaianselector = {"USD", "EUR", "GBP", "CHF", "JPY",
					"CNY", "HKD", "KRW", "INR", "AUD", "NZD", "HTG", "HRK", "MXN","DOP", "RUB", "BRL", "TRY", "MAD","ZAR"};

			double[] canadianexchanges = {0.802661,
					0.67880239,
					0.58154713,
					0.74197394,
					88.791914,
					5.2007658,
					6.2351161,
					912.87151 ,
					60.014548,
					1.0708801,
					1.1450251,
					73.821295,
					5.0812734,
					16.075755,
					45.853624,
					59.807151,
					4.1797216,
					6.9749077,
					7.1809248,
					11.526731};


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
				// CAD -> HTG
			} else if (canadiancurrencies.equals(candaianselector[11])) {
				double zoebucks = amount * canadianexchanges[11];
				System.out.println("" + amount + " CAD=" + conversion.format(zoebucks) + " HTG");
				// CAD ->  HRK
			} else if (canadiancurrencies.equals(candaianselector[12])) {
				double slavbucks = amount * canadianexchanges[12];
				System.out.println("" + amount + " CAD=" + conversion.format(slavbucks) + " HRK");
				//  CAD ->  MXN
			} else if (canadiancurrencies.equals(candaianselector[13])) {
				double pesobucks = amount * canadianexchanges[13];
				System.out.println("" + amount + " CAD=" + conversion.format(pesobucks) + " MXN");


		}else if (canadiancurrencies.equals(candaianselector[14])) {
			double russianresult = amount * canadianexchanges[14];
			System.out.println("" + amount + "CAD = " + conversion.format(russianresult) + " DOP");
//  CAD -> RUB
		}else if (canadiancurrencies.equals(candaianselector[15])) {
			double brazilrealresult = amount *canadianexchanges[15];
			System.out.println("" + amount + " CAD = " + conversion.format(brazilrealresult) + " RUB");
// CAD-> BRL
		}else if (canadiancurrencies.equals(candaianselector[16])) {
			double turkishresult = amount * canadianexchanges[16];
			System.out.println("" + amount + "CAD = " + conversion.format(turkishresult) + " BRL");
//   CAD -> MAD
		}else if (canadiancurrencies.equals(candaianselector[17])) {
			double nordafricanresult = amount * canadianexchanges[17];
			System.out.println("" + amount + "  CAD = " + conversion.format(nordafricanresult) + " TRY");
// CAD -> MAD
		}else if (canadiancurrencies.equals(candaianselector[18])) {
			double morrocoresult = amount *  canadianexchanges[18];
			System.out.println("" + amount + " CAD = " + conversion.format(morrocoresult) + "MAD");

			//  CAD-> ZAR
		}else if (canadiancurrencies.equals(candaianselector[19])) {
			double saresult = amount * canadianexchanges[19];
			System.out.println("" + amount +"CAD = " + conversion.format(saresult) + "ZAR");
		}
			// British currency conversion
		}
		if (currencyconvert1.equals("Pounds") || currencyconvert1.equals("GBP")) {
			String[] britishpounds = {"USD", "CAD", "EUR", "CHF", "JPY",
					"CNY", "HKD", "KRW", "INR", "AUD", "NZD", "HTG", "HRK", "MXN","DOP", "RUB", "BRL", "TRY", "MAD","ZAR"};
			// british exchanges rates based on british pounds array
			double[] britishexchanges = {1.3801117,
					1.7193224,
					1.1671444,
					1.2754596,
					152.63012,
					8.9399756,
					10.717605,
					1568.7721,
					103.15294 ,
					1.8410504,
					1.9680196,
					126.26072,
					8.7370688,
					27.627174,
					78.84035,
					102.78641,
					7.1707613,
					11.990188,
					12.346295,
					19.853628};

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
				// GBP -> HTG
			} else if (britishconversionoptions.equals(britishpounds[11])) {
				double haitianddollas = amount * britishexchanges[11];
				System.out.println("" + amount + " GBP=" + conversion.format(haitianddollas) + " HTG");
				// GBP -> HRK
			} else if (britishconversionoptions.equals(britishpounds[12])) {
				double croatddollas = amount * britishexchanges[12];
				System.out.println("" + amount + " GBP=" + conversion.format(croatddollas) + " HRK");
				// GBP -> MXN
			} else if (britishconversionoptions.equals(britishpounds[13])) {
				double mexicanddollas = amount * britishexchanges[13];
				System.out.println("" + amount + " GBP=" + conversion.format(mexicanddollas) + " MXN");

			}else if (britishconversionoptions.equals(britishpounds[14])) {
			double russianresult = amount * britishexchanges[14];
			System.out.println("" + amount + "GBP = " + conversion.format(russianresult) + " DOP");
//  GBP -> RUB
		}else if (britishconversionoptions.equals(britishpounds[15])) {
			double brazilrealresult = amount * britishexchanges[15];
			System.out.println("" + amount + " GBP = " + conversion.format(brazilrealresult) + " RUB");
// GBP -> BRL
		}else if (britishconversionoptions.equals(britishpounds[16])) {
			double turkishresult = amount * britishexchanges[16];
			System.out.println("" + amount + "GBP = " + conversion.format(turkishresult) + " BRL");
//   GBP -> MAD
		}else if (britishconversionoptions.equals(britishpounds[17])) {
			double nordafricanresult = amount * britishexchanges[17];
			System.out.println("" + amount + "  GBP = " + conversion.format(nordafricanresult) + " TRY");
// GBP -> MAD
		}else if (britishconversionoptions.equals(britishpounds[18])) {
			double morrocoresult = amount *  britishexchanges[18];
			System.out.println("" + amount + " GBP = " + conversion.format(morrocoresult) + "MAD");

			//  GBP-> ZAR
		}else if (britishconversionoptions.equals(britishpounds[19])) {
			double saresult = amount *  britishexchanges[19];
			System.out.println("" + amount +"GBP = " + conversion.format(saresult) + "ZAR");
		}
		}

		// Euro conversions
		if (currencyconvert1.equals("EUR") || currencyconvert1.equals("Euros")) {
			String[] euroconversionoptions = {"USD", "CAD", "GBP", "CHF", "JPY",
					"CNY", "HKD", "KRW", "INR", "AUD", "NZD", "HTG", "HRK", "MXN","DOP", "RUB", "BRL", "TRY", "MAD","ZAR"};
// EURO currency exchange rates based on conversion options array

			double[] euroexchanges = {1.1820081,
					1.4730674,
					0.85644636,
					1.0928493,
					130.76688,
					7.6584121,
					9.1816647,
					1344.0893,
					88.399817,
					1.5776713,
					1.6860263,
					108.47104,
					7.4861322,
					23.67076,
					67.535796,
					88.064635,
					6.143627,
					10.272657,
					10.57939,
					16.997018};


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


			} else if (euroselector.equals(euroconversionoptions[11])) {
				double haitian = amount * euroexchanges[11];
				System.out.println("" + amount + " EUR=" + conversion.format(haitian) + " HTG");
// EUR -> HRK
			} else if (euroselector.equals(euroconversionoptions[12])) {
				double croatian = amount * euroexchanges[12];
				System.out.println("" + amount + " EUR=" + conversion.format(croatian) + " HRK");
// EUR -> MXN
			} else if (euroselector.equals(euroconversionoptions[13])) {
				double mexicanpesos = amount * euroexchanges[13];
				System.out.println("" + amount + " EUR=" + conversion.format(mexicanpesos) + " MXN");

			}else if (euroselector.equals(euroconversionoptions[14])) {
			double russianresult = amount * euroexchanges[14];
			System.out.println("" + amount + "EUR = " + conversion.format(russianresult) + " DOP");
//  EUR -> RUB
		}else if (euroselector.equals(euroconversionoptions[15])) {
			double brazilrealresult = amount * euroexchanges[15];
			System.out.println("" + amount + " EUR = " + conversion.format(brazilrealresult) + " RUB");
// EUR -> BRL
		}else if (euroselector.equals(euroconversionoptions[16])) {
			double turkishresult = amount * euroexchanges[16];
			System.out.println("" + amount + " EUR = " + conversion.format(turkishresult) + " BRL");
//   EUR -> MAD
		}else if (euroselector.equals(euroconversionoptions[17])) {
			double nordafricanresult = amount * euroexchanges[17];
			System.out.println("" + amount + "  EUR = " + conversion.format(nordafricanresult) + " TRY");
// EUR -> MAD
		}else if (euroselector.equals(euroconversionoptions[18])) {
			double morrocoresult = amount *  euroexchanges[18];
			System.out.println("" + amount + " EUR = " + conversion.format(morrocoresult) + "MAD");

			//  EUR-> ZAR
		}else if (euroselector.equals(euroconversionoptions[19])) {
			double saresult = amount *  euroexchanges[19];
			System.out.println("" + amount +"EUR = " + conversion.format(saresult) + "ZAR");
		}
// Conversions for  Swiss francs
		}
		if (currencyconvert1.equals("Swiss franc") || currencyconvert1.equals("CHF")) {

			String[] swissconversion = {"USD", "CAD", "EUR", "GBP", "JPY",
					"CNY", "HKD", "KRW", "INR", "AUD", "NZD", "HTG", "HRK", "MXN","DOP", "RUB", "BRL", "TRY", "MAD","ZAR"};
// swiss exchanges based on swissconversion array
			double[] swissexchanges = {1.0815714,
					1.3475556,
					0.91497272,
					0.7836186,
					119.65409,
					7.007072,
					8.4010197,
					1229.8797,
					80.854403,
					1.443059,
					1.5426652,
					98.963965,
					6.848509 ,
					6.848509 ,
					61.801609,
					80.57649,
					5.6207972,
					9.3996396,
					9.6786985,
					15.546845};
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
				// CHF -> HTG
			} else if (swissselector.equals(swissconversion[11])) {
				double htdoller = amount * swissexchanges[11];
				System.out.println("" + amount + " CHF=" + conversion.format(htdoller) + " HTG");
// CHF -> HRK
			} else if (swissselector.equals(swissconversion[12])) {
				double croatdoller = amount * swissexchanges[12];
				System.out.println("" + amount + " CHF=" + conversion.format(croatdoller) + " HRK");
// CHF -> MXN
			} else if (swissselector.equals(swissconversion[13])) {
				double mexicandoller = amount * swissexchanges[13];
				System.out.println("" + amount + " CHF=" + conversion.format(mexicandoller) + " MXN");

		}else if (swissselector.equals(swissconversion[14])) {
			double russianresult = amount *swissexchanges[14];
			System.out.println("" + amount + "CHF = " + conversion.format(russianresult) + " DOP");
//  CHF -> RUB
		}else if (swissselector.equals(swissconversion[15])) {
			double brazilrealresult = amount *swissexchanges[15];
			System.out.println("" + amount + " CHF = " + conversion.format(brazilrealresult) + " RUB");
// CHF -> BRL
		}else if (swissselector.equals(swissconversion[16])) {
			double turkishresult = amount *swissexchanges[16];
			System.out.println("" + amount + " CHF = " + conversion.format(turkishresult) + " BRL");
//   CHF -> MAD
		}else if (swissselector.equals(swissconversion[17])) {
			double nordafricanresult = amount *swissexchanges[17];
			System.out.println("" + amount + "  CHF = " + conversion.format(nordafricanresult) + " TRY");
// CHF -> MAD
		}else if (swissselector.equals(swissconversion[18])) {
			double morrocoresult = amount * swissexchanges[18];
			System.out.println("" + amount + " CHF = " + conversion.format(morrocoresult) + "MAD");

			//  CHF-> ZAR
		}else if (swissselector.equals(swissconversion[19])) {
			double saresult = amount * swissexchanges[19];
			System.out.println("" + amount +"CHF = " + conversion.format(saresult) + "ZAR");
		}



		//if player choses yen
		}
		if (currencyconvert1.equals("Japanese Yen") || currencyconvert1.equals("JPY")) {
			/* japanese yen potential conversions(in a array to store them rather
			how i did it prior(The whole double system.Prints out all currencies rather than specific one)
			 */
			String[] jpycurrencies = {"USD", "EUR", "CAD", "GBP", "HKD",
					"CNY", "KRW", "INR", "AUD", "NZD", "HTG", "HRK", "MXN","DOP", "RUB", "BRL", "TRY", "MAD","ZAR"};
// jpy exchange rates based on jpycurrency array
			double[] jpyexchangerates = {0.0090392081 ,
					0.0076457116,
					0.011262115,
					0.0065484059,
					0.070210822 ,
					0.058568952,
					10.277719,
					0.67580093,
					0.012059376,
					0.012893229,
					0.82703577,
					0.057236687,
					0.057236687,
					0.51630183,
					0.67345538,
					0.046981552,
					0.078559907,
					0.080888066 ,
					0.12994979};

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
			} else if (jpyselector.equals(jpycurrencies[10])) {
				double gourdehaitien = amount * jpyexchangerates[10];
				System.out.println("" + amount + " JPY=" + conversion.format(gourdehaitien) + " HTG");
				// JPY -> HRK
			} else if (jpyselector.equals(jpycurrencies[11])) {
				double croatiebucks = amount * jpyexchangerates[11];
				System.out.println("" + amount + " JPY=" + conversion.format(croatiebucks) + " HRK");
				// JPY -> MXN
			} else if (jpyselector.equals(jpycurrencies[12])) {
				double mexicianpesos = amount * jpyexchangerates[12];
				System.out.println("" + amount + " JPY=" + conversion.format(mexicianpesos) + " MXN");

			}else if (jpyselector.equals(jpycurrencies[13])) {
			double russianresult = amount *jpyexchangerates[13];
			System.out.println("" + amount + " JPY = " + conversion.format(russianresult) + " DOP");
//  JPY -> RUB
		}else if (jpyselector.equals(jpycurrencies[14])) {
			double brazilrealresult = amount *jpyexchangerates[14];
			System.out.println("" + amount + "  JPY = " + conversion.format(brazilrealresult) + " RUB");
// JPY -> BRL
		}else if (jpyselector.equals(jpycurrencies[15])) {
			double turkishresult = amount *jpyexchangerates[15];
			System.out.println("" + amount + " JPY = " + conversion.format(turkishresult) + " BRL");
//   JPY -> MAD
		}else if (jpyselector.equals(jpycurrencies[16])) {
			double nordafricanresult = amount *jpyexchangerates[16];
			System.out.println("" + amount + "  JPY = " + conversion.format(nordafricanresult) + " TRY");
//  JPY -> MAD
		}else if (jpyselector.equals(jpycurrencies[17])) {
			double morrocoresult = amount * jpyexchangerates[17];
			System.out.println("" + amount + " JPY = " + conversion.format(morrocoresult) + "MAD");

			//  JPY-> ZAR
		}else if (jpyselector.equals(jpycurrencies[18])) {
			double saresult = amount * jpyexchangerates[18];
			System.out.println("" + amount +"JPY = " + conversion.format(saresult) + "ZAR");
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
					"AUD", "NZD", "HTG", "HRK", "MXN","DOP", "RUB", "BRL", "TRY", "MAD","ZAR"};


			// chinese currency exchanges
			double[] chinacurrencyexchanges = {0.15433558,
					0.11180972 ,
					0.19227509,
					0.13055039,
					0.14270461,
					17.073099,
					1.198737,
					175.52127,
					11.538724,
					0.20589525,
					0.22015003,
					14.129378,
					0.97734378,
					3.0904804,
					8.8186016,
					11.499165,
					0.80211631,
					1.3412443,
					1.3809687,
					2.2190621};


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
				// CNY -> HTG
			} else if (chinayuanselector.equals(chinayuancovert[11])) {
				double haitiresults = amount * chinacurrencyexchanges[11];
				System.out.println("" + amount + " CNY =" + conversion.format(haitiresults) + " HTG");
				// CNY ->  HRK
			} else if (chinayuanselector.equals(chinayuancovert[12])) {
				double croatieresults = amount * chinacurrencyexchanges[12];
				System.out.println("" + amount + " CNY =" + conversion.format(croatieresults) + " HRK");
// CNY -> MXN
			} else if (chinayuanselector.equals(chinayuancovert[13])) {
				double mexicoresults = amount * chinacurrencyexchanges[13];
				System.out.println("" + amount + " CNY =" + conversion.format(mexicoresults) + " MXN");
			}else if (chinayuanselector.equals(chinayuancovert[14])) {
			double russianresult = amount *chinacurrencyexchanges[14];
			System.out.println("" + amount + " CNY = " + conversion.format(russianresult) + " DOP");
//  CNY -> RUB
		}else if (chinayuanselector.equals(chinayuancovert[15])) {
			double brazilrealresult = amount *chinacurrencyexchanges[15];
			System.out.println("" + amount + "  CNY = " + conversion.format(brazilrealresult) + " RUB");
// CNY -> BRL
		}else if (chinayuanselector.equals(chinayuancovert[16])) {
			double turkishresult = amount *chinacurrencyexchanges[16];
			System.out.println("" + amount + " CNY = " + conversion.format(turkishresult) + " BRL");
//   CNY -> MAD
		}else if (chinayuanselector.equals(chinayuancovert[17])) {
			double nordafricanresult = amount *chinacurrencyexchanges[17];
			System.out.println("" + amount + "  CNY = " + conversion.format(nordafricanresult) + " TRY");
//  CNY -> MAD
		}else if (chinayuanselector.equals(chinayuancovert[18])) {
			double morrocoresult = amount * chinacurrencyexchanges[18];
			System.out.println("" + amount + " CNY = " + conversion.format(morrocoresult) + "MAD");

			//  CNY-> ZAR
		}else if (chinayuanselector.equals(chinayuancovert[19])) {
			double saresult = amount * chinacurrencyexchanges[19];
			System.out.println("" + amount +"CNY = " + conversion.format(saresult) + "ZAR");
		}

		}

		// if player wishes to convert hong kong dollars
		if (currencyconvert1.equals("Hong Kong Dollar") || currencyconvert1.equals("HKD")) {
			String[] HKDconversions = {"USD", "CAD", "EUR", "GBP", "CHF",
					"\n" + "JPY", "CNY", "KRW", "INR", "AUD", "NZD", "HTG", "HRK", "MXN","DOP", "RUB", "BRL", "TRY", "MAD","ZAR"};
// currency exchange rates based on  hkd currencies array
			double[] hkcurrencyexchange = {0.12874298,
					0.1603922,
					0.10890208,
					0.093301381,
					0.119054,
					14.243132,
					0.83419625,
					146.39855 ,
					9.6274418,
					0.17175951,
					0.18364074,
					11.779491,
					0.81516909,
					2.5774883 ,
					7.35606,
					9.5920218,
					0.6690371,
					1.1187692,
					1.1518929,
					1.8507561};
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
				// HKD -> HTG
			} else if (hkconverter.equals(HKDconversions[11])) {
				double gourdes = amount * hkcurrencyexchange[11];
				System.out.println("" + amount + " HKD =" + conversion.format(gourdes) + " HTG");
				// HKD -> HRK
			} else if (hkconverter.equals(HKDconversions[12])) {
				double kunas = amount * hkcurrencyexchange[12];
				System.out.println("" + amount + " HKD =" + conversion.format(kunas) + " HRK");
				// HKD -> MXN
			} else if (hkconverter.equals(HKDconversions[13])) {
				double mexiquepesos = amount * hkcurrencyexchange[13];
				System.out.println("" + amount + " HKD =" + conversion.format(mexiquepesos) + " MXN");
			}else if (hkconverter.equals(HKDconversions[14])) {
			double russianresult = amount *hkcurrencyexchange[14];
			System.out.println("" + amount + " HKD = " + conversion.format(russianresult) + " DOP");
//  HKD -> RUB
		}else if (hkconverter.equals(HKDconversions[15])) {
			double brazilrealresult = amount *hkcurrencyexchange[15];
			System.out.println("" + amount + "  HKD = " + conversion.format(brazilrealresult) + " RUB");
// HKD -> BRL
		}else if (hkconverter.equals(HKDconversions[16])) {
			double turkishresult = amount *hkcurrencyexchange[16];
			System.out.println("" + amount + "  HKD = " + conversion.format(turkishresult) + " BRL");
//   HKD -> MAD
		}else if (hkconverter.equals(HKDconversions[17])) {
			double nordafricanresult = amount *hkcurrencyexchange[17];
			System.out.println("" + amount + "  HKD = " + conversion.format(nordafricanresult) + " TRY");
//   HKD -> MAD
		}else if (hkconverter.equals(HKDconversions[18])) {
			double morrocoresult = amount * hkcurrencyexchange[18];
			System.out.println("" + amount + " HKD = " + conversion.format(morrocoresult) + "MAD");

			//  HKD-> ZAR
		}else if (hkconverter.equals(HKDconversions[19])) {
			double saresult = amount * hkcurrencyexchange[19];
			System.out.println("" + amount + "HKD = " + conversion.format(saresult) + " ZAR");
		}
			// if player wishes to use south korean won
		}
		if (currencyconvert1.equals("KRW") || currencyconvert1.equals("South Korean won")) {
			String[] potientalwonconversions = {"USD", "CAD", "GBP", "EUR", "CHF",
					"JPY", "CNY", "HKD", "INR", "AUD", "NZD", "HTG", "HRK", "MXN","DOP", "RUB", "BRL", "TRY", "MAD","ZAR"};
				/*Based on potientalwonconversions array. Currency exchange rates of that array
				Order based on the order of currencies. So first is the USD, and goes all the way to NZD
				 */
			double[] currencyresults = {0.00087929428,
					0.0010954299,
					0.00063718219,
					0.00074380407,
					0.00081300554,
					0.097275425,
					0.0056974887,
					0.0068297441,
					0.065655461,
					0.0011732667 ,
					0.0012538756,
					0.081412563,
					0.0055681561,
					0.017610793,
					0.050241882,
					0.06552619,
					0.0045710091,
					0.0076417144,
					0.0078696299,
					0.012641883};

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

				// KRW -> HTG
			} else if (woncurrencyresults.equals(potientalwonconversions[11])) {
				double zoepoundbucks = amount * currencyresults[11];
				System.out.println("" + amount + " KRW =" + conversion.format(zoepoundbucks) + " HTG");
// KRW -> HRK
			} else if (woncurrencyresults.equals(potientalwonconversions[12])) {
				double slavicbucks = amount * currencyresults[12];
				System.out.println("" + amount + " KRW =" + conversion.format(slavicbucks) + " HRK");
// KRW -> MXN
			} else if (woncurrencyresults.equals(potientalwonconversions[13])) {
				double vivamexicobucks = amount * currencyresults[13];
				System.out.println("" + amount + " KRW =" + conversion.format(vivamexicobucks) + " MXN");
			}else if (woncurrencyresults.equals(potientalwonconversions[14])) {
				double russianresult = amount *currencyresults[14];
				System.out.println("" + amount + " KRW = " + conversion.format(russianresult) + " DOP");
//  KRW -> RUB
			}else if (woncurrencyresults.equals(potientalwonconversions[15])) {
				double brazilrealresult = amount *currencyresults[15];
				System.out.println("" + amount + "  KRW = " + conversion.format(brazilrealresult) + " RUB");
// KRW -> BRL
			}else if (woncurrencyresults.equals(potientalwonconversions[16])) {
				double turkishresult = amount *currencyresults[16];
				System.out.println("" + amount + "  KRW = " + conversion.format(turkishresult) + " BRL");
//   KRW -> MAD
			}else if (woncurrencyresults.equals(potientalwonconversions[17])) {
				double nordafricanresult = amount *currencyresults[17];
				System.out.println("" + amount + "  KRW = " + conversion.format(nordafricanresult) + " TRY");
//   KRW -> MAD
			}else if (woncurrencyresults.equals(potientalwonconversions[18])) {
				double morrocoresult = amount * currencyresults[18];
				System.out.println("" + amount + " KRW = " + conversion.format(morrocoresult) + "MAD");

				//  INR-> ZAR
			}else if (woncurrencyresults.equals(potientalwonconversions[19])) {
				double saresult = amount * currencyresults[19];
				System.out.println("" + amount + "KRW = " + conversion.format(saresult) + " ZAR");
			}
			// INDIAN RUPEE CURRENCIES
		}
		if (currencyconvert1.equals("INR") || currencyconvert1.equals("Indian rupee")) {
			String[] indianconversions = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "KRW", "AUD", "NZD", "HTG", "HRK", "MXN","DOP", "RUB", "BRL", "TRY", "MAD","ZAR"};
				/*Based on indianconversions array. Currency exchange rates of that array
				Order based on the order of currencies. So first is the USD, and goes all the way to NZD
				 */
			double[] indianexchangerates = {0.013379685,
					0.016669297,
					0.0096942881,
					0.011315252,
					0.012369263,
					1.4800144,
					0.086674277,
					0.10390627,
					15.210067,
					0.017850618,
					0.019079465,
					1.2238974,
					1.2238974,
					0.26788249,
					0.76410879,
					0.99679317,
					0.069528319 ,
					0.11622709,
					0.11967369,
					0.19248612};

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
				// INR -> HTG
			} else if (indianresults.equals(indianconversions[11])) {
				double haitiengourde = amount * indianexchangerates[11];
				System.out.println("" + amount + " INR =" + conversion.format(haitiengourde) + " HTG");
				// INR -> HRK
			} else if (indianresults.equals(indianconversions[12])) {
				double slavickunas = amount * indianexchangerates[12];
				System.out.println("" + amount + " INR =" + conversion.format(slavickunas) + " HRK");
				// INR -> MXN
			} else if (indianresults.equals(indianconversions[13])) {
				double vivapesos = amount * indianexchangerates[13];
				System.out.println("" + amount + " INR =" + conversion.format(vivapesos) + " MXN");

		}else if (indianresults.equals(indianconversions[14])) {
			double russianresult = amount *indianexchangerates[14];
			System.out.println("" + amount + " INR = " + conversion.format(russianresult) + " DOP");
//  INR -> RUB
		}else if (indianresults.equals(indianconversions[15])) {
			double brazilrealresult = amount *indianexchangerates[15];
			System.out.println("" + amount + "  INR = " + conversion.format(brazilrealresult) + " RUB");
// INR -> BRL
		}else if (indianresults.equals(indianconversions[16])) {
			double turkishresult = amount *indianexchangerates[16];
			System.out.println("" + amount + "  INR = " + conversion.format(turkishresult) + " BRL");
//   INR -> MAD
		}else if (indianresults.equals(indianconversions[17])) {
			double nordafricanresult = amount *indianexchangerates[17];
			System.out.println("" + amount + "  INR = " + conversion.format(nordafricanresult) + " TRY");
//   INR -> MAD
		}else if (indianresults.equals(indianconversions[18])) {
			double morrocoresult = amount * indianexchangerates[18];
			System.out.println("" + amount + "  INR = " + conversion.format(morrocoresult) + "MAD");

			//  INR-> ZAR
		}else if (indianresults.equals(indianconversions[19])) {
			double saresult = amount * indianexchangerates[19];
			System.out.println("" + amount + "   INR = " + conversion.format(saresult) + " ZAR");
		}
// if player decides to choose  Australian dollar

		}
		if(currencyconvert1.equals("AUD") || currencyconvert1.equals("Australian Dollar")) {
			//  Player choices when choosing australian dollars
			String[] aussieconversions = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "INR", "KRW", "NZD", "HTG", "HRK", "MXN","DOP", "RUB", "BRL", "TRY", "MAD","ZAR"};
				/*Based on indianconversions array. Currency exchange rates of that array
				Order based on the order of currencies. So first is the USD, and goes all the way to NZD
				 */
			double[] aussieexchangerates = {0.74944082,
					0.93374686,
					0.54300615,
					0.63387727,
					0.69293784,
					82.909246,
					4.8550223,
					5.8197339,
					55.999723,
					852.08099,
					1.0689571,
					68.576063,
					68.576063,
					15.000943,
					42.8147,
					55.819113,
					3.8937341,
					6.5104217,
					6.7047435,
					10.763572};

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
				// AUD -> NZD
			} else if (aussieresults.equals(aussieconversions[10])) {
				double newzealandresults = amount * aussieexchangerates[10];
				System.out.println("" + amount + " AID =" + conversion.format(newzealandresults) + " NZD");
				// AUD -> HTG
			} else if (aussieresults.equals(aussieconversions[11])) {
				double hispanolabucks = amount * aussieexchangerates[11];
				System.out.println("" + amount + " AUD =" + conversion.format(hispanolabucks) + " HTG");
// AUD -> HRK
			} else if (aussieresults.equals(aussieconversions[12])) {
				double balkandollas = amount * aussieexchangerates[12];
				System.out.println("" + amount + " AUD =" + conversion.format(balkandollas) + " HRK");
//  AUD -> MXN
			} else if (aussieresults.equals(aussieconversions[13])) {
				double centralamericabucks = amount * aussieexchangerates[13];
				System.out.println("" + amount + " AUD =" + conversion.format(centralamericabucks) + " MXN");

			}else if (aussieresults.equals(aussieconversions[14])) {
			double russianresult = amount *aussieexchangerates[14];
			System.out.println("" + amount + " AUD = " + conversion.format(russianresult) + " DOP");
//  NZD -> RUB
		}else if (aussieresults.equals(aussieconversions[15])) {
			double brazilrealresult = amount *aussieexchangerates[15];
			System.out.println("" + amount + "  AUD = " + conversion.format(brazilrealresult) + " RUB");
//  NZD -> BRL
		}else if (aussieresults.equals(aussieconversions[16])) {
			double turkishresult = amount *aussieexchangerates[16];
			System.out.println("" + amount + "  AUD = " + conversion.format(turkishresult) + " BRL");
//   NZD -> MAD
		}else if (aussieresults.equals(aussieconversions[17])) {
			double nordafricanresult = amount *aussieexchangerates[17];
			System.out.println("" + amount + "  AUD = " + conversion.format(nordafricanresult) + " TRY");
//   NZD -> MAD
		}else if (aussieresults.equals(aussieconversions[18])) {
			double morrocoresult = amount * aussieexchangerates[18];
			System.out.println("" + amount + "  AUD = " + conversion.format(morrocoresult) + "MAD");

			//  NZD -> ZAR
		}else if (aussieresults.equals(aussieconversions[19])) {
			double saresult = amount * aussieexchangerates[19];
			System.out.println("" + amount + "   AUD = " + conversion.format(saresult) + " ZAR");
		}
// if player wants to convert from  new zealand dollars

		}
	if (currencyconvert1.equals("NZD") || currencyconvert1.equals("New Zealand Dollar")) {

			//  Player choices when choosing australian dollars
			String[] nzdconversions = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "INR", "KRW", "AUD", "HTG", "HRK", "MXN","DOP", "RUB", "BRL", "TRY", "MAD","ZAR"};
				/*Based on newleazandconversions array. Currency exchange rates of that array
				Order based on the order of currencies. So first is the USD, and goes all the way to NZD
				 */
			double[] nzdexchangerates = {0.70092129,
					0.87342216,
					0.50788918,
					0.59296442,
					0.64820434,
					77.559694,
					4.5412467,
					5.444257,
					52.375776,
					796.9754,
					0.9354474,
					0.9354474,
					4.4386106 ,
					14.03465,
					40.054569,
					52.223061,
					3.6430809,
					6.0909128,
					6.2737164,
					6.2737164};

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
				// NZD -> HTG
			} else if (nzdresults.equals(nzdconversions[11])) {
				double htgbucks = amount * nzdexchangerates[11];
				System.out.println("" + amount + " NZD =" + conversion.format(htgbucks) + " HTG");
				// NZD -> HRK
			} else if (nzdresults.equals(nzdconversions[12])) {
				double hrkdollas = amount * nzdexchangerates[12];
				System.out.println("" + amount + " NZD =" + conversion.format(hrkdollas) + " HRK");
				// NZD -> MXN
			} else if (nzdresults.equals(nzdconversions[13])) {
				double mxnbucks = amount * nzdexchangerates[13];
				System.out.println("" + amount + " NZD =" + conversion.format(mxnbucks) + " MXN");
			// NZD -> DOP
	}else if (nzdresults.equals(nzdconversions[14])) {
		double russianresult = amount *nzdexchangerates[14];
		System.out.println("" + amount + " NZD = " + conversion.format(russianresult) + " DOP");
//  NZD -> RUB
	}else if (nzdresults.equals(nzdconversions[15])) {
		double brazilrealresult = amount *nzdexchangerates[15];
		System.out.println("" + amount + "  NZD = " + conversion.format(brazilrealresult) + " RUB");
//  NZD -> BRL
	}else if (nzdresults.equals(nzdconversions[16])) {
		double turkishresult = amount *nzdexchangerates[16];
		System.out.println("" + amount + "  NZD = " + conversion.format(turkishresult) + " BRL");
//   NZD -> MAD
	}else if (nzdresults.equals(nzdconversions[17])) {
		double nordafricanresult = amount *nzdexchangerates[17];
		System.out.println("" + amount + "  NZD = " + conversion.format(nordafricanresult) + " TRY");
//   NZD -> MAD
	}else if (nzdresults.equals(nzdconversions[18])) {
		double morrocoresult = amount * nzdexchangerates[18];
		System.out.println("" + amount + "  NZD = " + conversion.format(morrocoresult) + "MAD");

		//  NZD -> ZAR
	}else if (nzdresults.equals(nzdconversions[19])) {
		double saresult = amount * nzdexchangerates[19];
		System.out.println("" + amount + "   NZD = " + conversion.format(saresult) + " ZAR");
	}
			// if player decides to convert haitian currencies
		}
	else if (currencyconvert1.equals("HTG") || currencyconvert1.equals("Haitian Gourde")) {
			String[] htgconversions = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "INR", "KRW", "AUD", "NZD", "MXN", "HRK","DOP", "RUB", "BRL", "TRY", "MAD","ZAR"};
// haitian currency exchange rates
			double[] htgexchanges = {0.010929254,
					0.010929254,
					0.0078431143,
					0.0091564108,
					0.010009938,
					1.2074283,
					0.070735736 ,
					0.0848001,
					0.81634858,
					12.415145,
					0.014584576,
					0.015596873,
					0.21888802,
					0.069216857,
					0.62451209,
					0.62451209,
					0.62451209,
					0.094957693,
					0.094957693,
					0.15697323};
			System.out.println("Please select a currency you wish to convert to:" +
					"\n" + Arrays.toString(htgconversions));
			scan.nextLine();

			String haitianresults = scan.nextLine();

			// HTG -> USD
			if (haitianresults.equals(htgconversions[0])) {
				double usresult = amount * htgexchanges[0];
				System.out.println("" + amount + " HTG =" + conversion.format(usresult) + " USD");
				// HTG -> CAD
			} else if (haitianresults.equals(htgconversions[1])) {
				double cadresult = amount * htgexchanges[1];
				System.out.println("" + amount + " HTG =" + conversion.format(cadresult) + " CAD");
				// HTG -> GBP
			} else if (haitianresults.equals(htgconversions[2])) {
				double britishresult = amount * htgexchanges[2];
				System.out.println("" + amount + " HTG =" + conversion.format(britishresult) + " GBP");
				// HTG -> EUR
			} else if (haitianresults.equals(htgconversions[3])) {
				double euroresult = amount * htgexchanges[3];
				System.out.println("" + amount + " HTG =" + conversion.format(euroresult) + " EUR");
				// HTG -> CHF
			} else if (haitianresults.equals(htgconversions[4])) {
				double swissyfrancresult = amount * htgexchanges[4];
				System.out.println("" + amount + " HTG =" + conversion.format(swissyfrancresult) + " CHF");
				// HTG -> JPY
			} else if (haitianresults.equals(htgconversions[5])) {
				double jpyresult = amount * htgexchanges[5];
				System.out.println("" + amount + " HTG =" + conversion.format(jpyresult) + " JPY");
				// HTG -> CNY
			} else if (haitianresults.equals(htgconversions[6])) {
				double cnyresult = amount * htgexchanges[6];
				System.out.println("" + amount + " HTG =" + conversion.format(cnyresult) + " CNY");
				// HTG -> HKD
			} else if (haitianresults.equals(htgconversions[7])) {
				double hkdresult = amount * htgexchanges[7];
				System.out.println("" + amount + " HTG =" + conversion.format(hkdresult) + " HKD");
				// HTG -> INR
			} else if (haitianresults.equals(htgconversions[8])) {
				double rupeeresult = amount * htgexchanges[8];
				System.out.println("" + amount + " HTG =" + conversion.format(rupeeresult) + " INR");
				// HTG -> KRW
			} else if (haitianresults.equals(htgconversions[9])) {
				double koreanresult = amount * htgexchanges[9];
				System.out.println("" + amount + " HTG =" + conversion.format(koreanresult) + " KRW");
				// HTG -> AUD
			} else if (haitianresults.equals(htgconversions[10])) {
				double australianresult = amount * htgexchanges[10];
				System.out.println("" + amount + " HTG =" + conversion.format(australianresult) + " AUD");
				// HTG -> NZD
			} else if (haitianresults.equals(htgconversions[11])) {
				double nzdresult = amount * htgexchanges[11];
				System.out.println("" + amount + " HTG =" + conversion.format(nzdresult) + " NZD");
				// HTG -> MXN
			} else if (haitianresults.equals(htgconversions[12])) {
				double mpesosresult = amount * htgexchanges[12];
				System.out.println("" + amount + " HTG =" + conversion.format(mpesosresult) + " MXN");
				// HTG -> HRK
			} else if (haitianresults.equals(htgconversions[13])) {
				double croatresult = amount * htgexchanges[13];
				System.out.println("" + amount + " HTG =" + conversion.format(croatresult) + " HRK");
			// HTG -> DOP
	}else if (haitianresults.equals(htgconversions[14])) {
		double russianresult = amount *htgexchanges[14];
		System.out.println("" + amount + "HTG = " + conversion.format(russianresult) + " DOP");
//  HTG -> RUB
	}else if (haitianresults.equals(htgconversions[15])) {
		double brazilrealresult = amount *htgexchanges[15];
		System.out.println("" + amount + "  HTG = " + conversion.format(brazilrealresult) + " RUB");
//  HTG -> BRL
	}else if (haitianresults.equals(htgconversions[16])) {
		double turkishresult = amount *htgexchanges[16];
		System.out.println("" + amount + "  HTG = " + conversion.format(turkishresult) + " BRL");
//  HTG -> MAD
	}else if (haitianresults.equals(htgconversions[17])) {
		double nordafricanresult = amount *htgexchanges[17];
		System.out.println("" + amount + " HTG = " + conversion.format(nordafricanresult) + " TRY");
//  HTG -> MAD
	}else if (haitianresults.equals(htgconversions[18])) {
		double morrocoresult = amount * htgexchanges[18];
		System.out.println("" + amount + "  HTG = " + conversion.format(morrocoresult) + "MAD");

		// HTG -> ZAR
	}else if (haitianresults.equals(htgconversions[19])) {
		double saresult = amount * htgexchanges[19];
		System.out.println("" + amount + "  HTG = " + conversion.format(saresult) + " ZAR");
	}
			// If player chooses Croatian Kunas
		}
	 if (currencyconvert1.equals("Croatian Kuna") || currencyconvert1.equals("HRK")) {
			String[] kunaconversions = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "INR", "KRW", "AUD", "NZD", "HTG", "MXN","DOP", "RUB", "BRL", "TRY", "MAD","ZAR"};
// croatian currency exchange rates
			double[] kunaexchange = {0.15790002 ,
					0.19679477,
					0.11442473,
					0.13359325,
					0.14602024,
					17.469801,
					1.0230488,
					1.2264653,
					11.806394,
					179.54474,
					0.210736,
					0.22528708,
					14.528824 ,
					3.1621197,
					9.0203104,
					11.751665,
					11.751665,
					1.3719338,
					1.4125923,
					2.2678487};

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
// HRK -> DOP
			}else if (croatianresults.equals(kunaconversions[14])) {
		 double russianresult = amount *kunaexchange[14];
		 System.out.println("" + amount + " HRK = " + conversion.format(russianresult) + " DOP");
//  HRK -> RUB
	 }else if (croatianresults.equals(kunaconversions[15])) {
		 double brazilrealresult = amount *kunaexchange[15];
		 System.out.println("" + amount + "  HRK = " + conversion.format(brazilrealresult) + " RUB");
//  HRK -> BRL
	 }else if (croatianresults.equals(kunaconversions[16])) {
		 double turkishresult = amount * kunaexchange[16];
		 System.out.println("" + amount + "  HRK = " + conversion.format(turkishresult) + " BRL");
//  HRK -> MAD
	 }else if (croatianresults.equals(kunaconversions[17])) {
		 double nordafricanresult = amount *kunaexchange[17];
		 System.out.println("" + amount + " HRK = " + conversion.format(nordafricanresult) + " TRY");
//  HRK -> MAD
	 }else if (croatianresults.equals(kunaconversions[18])) {
		 double morrocoresult = amount * kunaexchange[18];
		 System.out.println("" + amount + "  HRK = " + conversion.format(morrocoresult) + "MAD");

		 // HRK -> ZAR
	 }else if (croatianresults.equals(kunaconversions[19])) {
		 double saresult = amount * kunaexchange[19];
		 System.out.println("" + amount + "  HRK = " + conversion.format(saresult) + " ZAR");
	 }



		// if player chooses mexican pesos
		}
		if (currencyconvert1.equals("Mexican Peso") || currencyconvert1.equals("MXN")) {
			String[] mexicanpesoconversions = {"USD", "CAD", "GBP", "EUR", "CHF",
					 "JPY", "CNY", "HKD", "INR", "KRW", "AUD", "NZD",
					"HTG", "HRK","DOP", "RUB", "BRL", "TRY", "MAD","ZAR"};
// mexican currency exchange rates for the conversion array above
			double[] mexicanexchange = {0.049936966,
					0.062230276,
					0.036186161,
					0.042248687,
					0.046177319,
					5.5254265,
					0.32354086,
					0.38788222,
					3.7343155,
					56.785794,
					0.066632014,
					0.071239183,
					4.5738399,
					4.6851848,
					0.31628776,
					2.8537849,
					3.717688,
					0.25956375,
					0.43395212,
					0.44692424,
					0.7173068};

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

			}else if (mexicanresults.equals(mexicanpesoconversions[14])) {
				double russianresult = amount *mexicanexchange[14];
				System.out.println("" + amount + " MXN = " + conversion.format(russianresult) + " DOP");
//  MXN -> RUB
			}else if (mexicanresults.equals(mexicanpesoconversions[15])) {
				double brazilrealresult = amount *mexicanexchange[15];
				System.out.println("" + amount + "  MXN = " + conversion.format(brazilrealresult) + " RUB");
//  MXN -> BRL
			}else if (mexicanresults.equals(mexicanpesoconversions[16])) {
				double turkishresult = amount * mexicanexchange[16];
				System.out.println("" + amount + "   MXN = " + conversion.format(turkishresult) + " BRL");
//  MXN -> MAD
			}else if (mexicanresults.equals(mexicanpesoconversions[17])) {
				double nordafricanresult = amount * mexicanexchange[17];
				System.out.println("" + amount + "  MXN = " + conversion.format(nordafricanresult) + " TRY");
//  MXN -> MAD
			}else if (mexicanresults.equals(mexicanpesoconversions[18])) {
				double morrocoresult = amount * mexicanexchange[18];
				System.out.println("" + amount + "   MXN = " + conversion.format(morrocoresult) + "MAD");

				// MXN -> ZAR
			}else if (mexicanresults.equals(mexicanpesoconversions[19])) {
				double saresult = amount * mexicanexchange[19];
				System.out.println("" + amount + "  MXN = " + conversion.format(saresult) + " ZAR");
			}




			// If player wishes to choose dominican pesos
		}if (currencyconvert1.equals("Dominican Pesos") || currencyconvert1.equals("DOP")) {
			String[] dominicainpesos = {"USD", "CAD", "GBP", "EUR", "CHF"
					, "JPY", "CNY", "HKD", "INR", "KRW", "AUD", "NZD", "HTG", "HRK","MXN",
					"RUB","BRL","TRY","MAD","ZAR"};

			// Dominican pesos exchange rates
			double[] dopexchangerates = {0.01760452,
					0.021709315,
					0.012709331,
					0.014835558,
					0.016232167 ,
					1.9525012,
					0.11380862,
					0.13675132,
					1.3084823,
					19.890172,
					0.023379144,
					0.025066132,
					1.6284538,
					0.11090478,
					0.34900461,
					1.29073,
					0.089300433,
					0.15247862,
					0.15693887,
					0.25082297};

// Array list which displays conversion to options. Based on dominciain conversion options array
			System.out.println("Please select a currency you wish to convert to:" +
					"\n" + Arrays.toString(dominicainpesos));
			scan.nextLine();
			String dominicainresults = scan.nextLine();


			// actual exchanges
// DOP -> USD
			if (dominicainresults.equals(dominicainpesos[0])) {
				double murciaresult = amount * dopexchangerates[0];
				System.out.println("" + amount + " DOP = " + conversion.format(murciaresult) + " USD");
				// MXN -> CAD
			} else if (dominicainresults.equals(dominicainpesos[1])) {
				double cadresult = amount * dopexchangerates[1];
				System.out.println("" + amount + "  DOP = " + conversion.format(cadresult) + " CAD");
// DOP -> GBP
			} else if (dominicainresults.equals(dominicainpesos[2])) {
				double poundresult = amount * dopexchangerates[2];
				System.out.println("" + amount + "  DOP = " + conversion.format(poundresult) + " GBP");
// DOP -> EUR
			} else if (dominicainresults.equals(dominicainpesos[3])) {
				double euroresult = amount * dopexchangerates[3];
				System.out.println("" + amount + "  DOP = " + conversion.format(euroresult) + " EUR");
// DOP -> CHF
			} else if (dominicainresults.equals(dominicainpesos[4])) {
				double swissresult = amount *dopexchangerates[4];
				System.out.println("" + amount + "  DOP = " + conversion.format(swissresult) + " CHF");
// DOP -> JPY
			} else if (dominicainresults.equals(dominicainpesos[5])) {
				double jpyresult = amount * dopexchangerates[5];
				System.out.println("" + amount + "  DOP = " + conversion.format(jpyresult) + " JPY");
// DP[ -> CNY
			} else if (dominicainresults.equals(dominicainpesos[6])) {
				double cnyresult = amount * dopexchangerates[6];
				System.out.println("" + amount + "  DOP = " + conversion.format(cnyresult) + " CNY");
// DOP -> HKD
			} else if (dominicainresults.equals(dominicainpesos[7])) {
				double hkresult = amount * dopexchangerates[7];
				System.out.println("" + amount + "  DOP = " + conversion.format(hkresult) + " HKD");
// DOP -> INR
			} else if (dominicainresults.equals(dominicainpesos[8])) {
				double indianresult = amount * dopexchangerates[8];
				System.out.println("" + amount + "  DOP = " + conversion.format(indianresult) + " INR");
// DOP -> KRW
			} else if (dominicainresults.equals(dominicainpesos[9])) {
				double wonresult = amount * dopexchangerates[9];
				System.out.println("" + amount + "  DOP = " + conversion.format(wonresult) + " KRW");
// DOP -> AUD
			} else if (dominicainresults.equals(dominicainpesos[10])) {
				double aussieresult = amount * dopexchangerates[10];
				System.out.println("" + amount + "  DOP = " + conversion.format(aussieresult) + " AUD");
// DOP -> NZD
			} else if (dominicainresults.equals(dominicainpesos[11])) {
				double newzealandresult = amount * dopexchangerates[11];
				System.out.println("" + amount + "  DOP = " + conversion.format(newzealandresult) + " NZD");
// DOP-> HTG
			} else if (dominicainresults.equals(dominicainpesos[12])) {
				double haitienresult = amount * dopexchangerates[12];
				System.out.println("" + amount + "  DOP = " + conversion.format(haitienresult) + " HTG");
// DOP -> HRK
			} else if (dominicainresults.equals(dominicainpesos[13])) {
				double croatsresult = amount * dopexchangerates[13];
				System.out.println("" + amount + "  DOP = " + conversion.format(croatsresult) + " HRK");
// DOP -> MXN
			}else if (dominicainresults.equals(dominicainpesos[14])) {
				double mexicanresult = amount * dopexchangerates[14];
				System.out.println("" + amount + "  DOP = " + conversion.format(mexicanresult) + " MXN");

			}else if (dominicainresults.equals(dominicainpesos[15])) {
				double russianresult = amount * dopexchangerates[15];
				System.out.println("" + amount + "  DOP = " + conversion.format(russianresult) + " RUB");

			}else if (dominicainresults.equals(dominicainpesos[16])) {
				double brazilrealresult = amount * dopexchangerates[16];
				System.out.println("" + amount + "  DOP = " + conversion.format(brazilrealresult) + " BRL");

			}else if (dominicainresults.equals(dominicainpesos[17])) {
				double turkishresult = amount * dopexchangerates[17];
				System.out.println("" + amount + "  DOP = " + conversion.format(turkishresult) + " TRY");

			}else if (dominicainresults.equals(dominicainpesos[18])) {
				double nordafricanresult = amount * dopexchangerates[18];
				System.out.println("" + amount + "  DOP = " + conversion.format(nordafricanresult) + " MAD");

			}else if (dominicainresults.equals(dominicainpesos[19])) {
				double saresult = amount * dopexchangerates[19];
				System.out.println("" + amount + "  DOP = " + conversion.format(saresult) + " ZAR");
			}


		// If player chooses russian rubles
		}if (currencyconvert1.equals("Russian Rubles") || currencyconvert1.equals("RUB")) {
			String[] rublesconvets = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "INR", "KRW", "AUD", "NZD", "HTG", "HRK", "MXN",
					"DOP", "BRL", "TRY", "MAD", "ZAR"};

					// if player choses russian exchange rates
			double[] rublexchangerates = {0.013617151,
					0.016794067,
					0.0098303127,
					0.011474354,
					0.012556101 ,
					1.5102005,
					0.018081004 ,
					0.019385399,
					1.2459506,
					15.384457,
					0.023379144,
					0.025066132,
					1.6284538,
					1.2459506,
					0.27031276,
					0.77346588,
					0.069257085,
					0.11805357,
					0.11805357,
					0.19412091};


// Array  which displays conversion to options. Based on russian ruble's conversion options array
			System.out.println("Please select a currency you wish to convert to:" +
					"\n" + Arrays.toString(rublesconvets));
			scan.nextLine();
			String russianresults = scan.nextLine();



			// actual exchanges
//  RUB -> USD
			if (russianresults.equals(rublesconvets[0])) {
				double murciaresult = amount * rublexchangerates[0];
				System.out.println("" + amount + " RUB = " + conversion.format(murciaresult) + " USD");
				// MXN -> CAD
			} else if (russianresults.equals(rublesconvets[1])) {
				double cadresult = amount * rublexchangerates[1];
				System.out.println("" + amount + "   RUB = " + conversion.format(cadresult) + " CAD");
//  RUB -> GBP
			} else if (russianresults.equals(rublesconvets[2])) {
				double poundresult = amount * rublexchangerates[2];
				System.out.println("" + amount + "   RUB = " + conversion.format(poundresult) + " GBP");
//  RUB -> EUR
			} else if (russianresults.equals(rublesconvets[3])) {
				double euroresult = amount * rublexchangerates[3];
				System.out.println("" + amount + "  RUB = " + conversion.format(euroresult) + " EUR");
//  RUB-> CHF
			} else if (russianresults.equals(rublesconvets[4])) {
				double swissresult = amount * rublexchangerates[4];
				System.out.println("" + amount + "   RUB = " + conversion.format(swissresult) + " CHF");
// RUB-> JPY
			} else if (russianresults.equals(rublesconvets[5])) {
				double jpyresult = amount * rublexchangerates[5];
				System.out.println("" + amount + "   RUB = " + conversion.format(jpyresult) + " JPY");
//  RUB -> CNY
			} else if (russianresults.equals(rublesconvets[6])) {
				double cnyresult = amount * rublexchangerates[6];
				System.out.println("" + amount + "   RUB = " + conversion.format(cnyresult) + " CNY");
//  RUB -> HKD
			} else if (russianresults.equals(rublesconvets[7])) {
				double hkresult = amount * rublexchangerates[7];
				System.out.println("" + amount + "  RUB = " + conversion.format(hkresult) + " HKD");
//  RUB-> INR
			} else if (russianresults.equals(rublesconvets[8])) {
				double indianresult = amount * rublexchangerates[8];
				System.out.println("" + amount + "   RUB = " + conversion.format(indianresult) + " INR");
//  RUB -> KRW
			} else if (russianresults.equals(rublesconvets[9])) {
				double wonresult = amount * rublexchangerates[9];
				System.out.println("" + amount + "  RUB = " + conversion.format(wonresult) + " KRW");
//  RUB -> AUD
			} else if (russianresults.equals(rublesconvets[10])) {
				double aussieresult = amount * rublexchangerates[10];
				System.out.println("" + amount + "  RUB = " + conversion.format(aussieresult) + " AUD");
// RUB -> NZD
			} else if (russianresults.equals(rublesconvets[11])) {
				double newzealandresult = amount * rublexchangerates[11];
				System.out.println("" + amount + "  RUB = " + conversion.format(newzealandresult) + " NZD");
//  RUB-> HTG
			} else if (russianresults.equals(rublesconvets[12])) {
				double haitienresult = amount * rublexchangerates[12];
				System.out.println("" + amount + "   RUB = " + conversion.format(haitienresult) + " HTG");
//  RUB -> HRK
			} else if (russianresults.equals(rublesconvets[13])) {
				double croatsresult = amount * rublexchangerates[13];
				System.out.println("" + amount + "   RUB = " + conversion.format(croatsresult) + " HRK");
//  RUB -> MXN
			}else if (russianresults.equals(rublesconvets[14])) {
				double mexicanresult = amount * rublexchangerates[14];
				System.out.println("" + amount + "   RUB = " + conversion.format(mexicanresult) + " MXN");
//  RUB -> DOP
			}else if (russianresults.equals(rublesconvets[15])) {
				double russianresult = amount * rublexchangerates[15];
				System.out.println("" + amount + "   RUB = " + conversion.format(russianresult) + " DOP");
//  RUB -> BRL
			}else if (russianresults.equals(rublesconvets[16])) {
				double brazilrealresult = amount * rublexchangerates[16];
				System.out.println("" + amount + "   RUB = " + conversion.format(brazilrealresult) + " BRL");
//  RUB -> TRY
			}else if (russianresults.equals(rublesconvets[17])) {
				double turkishresult = amount * rublexchangerates[17];
				System.out.println("" + amount + "   RUB = " + conversion.format(turkishresult) + " TRY");
//  RUB -> MAD
			}else if (russianresults.equals(rublesconvets[18])) {
				double nordafricanresult = amount * rublexchangerates[18];
				System.out.println("" + amount + "   RUB = " + conversion.format(nordafricanresult) + " MAD");
//  RUB -> ZAR
			}else if (russianresults.equals(rublesconvets[19])) {
				double saresult = amount * rublexchangerates[19];
				System.out.println("" + amount + "   RUB = " + conversion.format(saresult) + " ZAR");
			}









			// If players chooses Brazilian real's
		}if (currencyconvert1.equals("Brazilian Real") || currencyconvert1.equals("BRL")) {
			String[] brasilllloptions = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "INR", "KRW", "AUD", "NZD", "HTG", "HRK", "MXN",
					"DOP", "RUB", "TRY", "MAD", "ZAR"};
				// Brazilian exchange rates
			double[] brasillexchangerates = {0.19658694,
					0.24245871,
					0.14190189,
					0.16562584,
					0.16562584 ,
					21.801536,
					1.2707462 ,
					1.5269613,
					14.613454,
					222.11393,
					0.26105255,
					0.26105255,
					18.054097,
					18.054097,
					3.9021358,
					11.167665 ,
					14.43724,
					1.7038286,
					1.7545675,
					2.803353};


// Array list which displays conversion to options. Based on Brazilian real conversion options array
			System.out.println("Please select a currency you wish to convert to:" +
					"\n" + Arrays.toString(brasilllloptions));
			scan.nextLine();
			String brazillianresults = scan.nextLine();

			// actual exchanges
// BRL -> USD
			if (brazillianresults.equals(brasilllloptions[0])) {
				double murciaresult = amount * brasillexchangerates[0];
				System.out.println("" + amount + " BRL = " + conversion.format(murciaresult) + " USD");
				// MXN -> CAD
			} else if (brazillianresults.equals(brasilllloptions[1])) {
				double cadresult = amount * brasillexchangerates[1];
				System.out.println("" + amount + "  BRL = " + conversion.format(cadresult) + " CAD");
// BRL -> GBP
			} else if (brazillianresults.equals(brasilllloptions[2])) {
				double poundresult = amount * brasillexchangerates[2];
				System.out.println("" + amount + "  BRL = " + conversion.format(poundresult) + " GBP");
// BRL -> EUR
			} else if (brazillianresults.equals(brasilllloptions[3])) {
				double euroresult = amount * brasillexchangerates[3];
				System.out.println("" + amount + "  BRL = " + conversion.format(euroresult) + " EUR");
// BRL -> CHF
			} else if (brazillianresults.equals(brasilllloptions[4])) {
				double swissresult = amount *brasillexchangerates[4];
				System.out.println("" + amount + " BRL = " + conversion.format(swissresult) + " CHF");
// BRL -> JPY
			} else if (brazillianresults.equals(brasilllloptions[5])) {
				double jpyresult = amount * brasillexchangerates[5];
				System.out.println("" + amount + "  BRL = " + conversion.format(jpyresult) + " JPY");
// BRL -> CNY
			} else if (brazillianresults.equals(brasilllloptions[6])) {
				double cnyresult = amount * brasillexchangerates[6];
				System.out.println("" + amount + "  BRL = " + conversion.format(cnyresult) + " CNY");
// BRL -> HKD
			} else if (brazillianresults.equals(brasilllloptions[7])) {
				double hkresult = amount *brasillexchangerates[7];
				System.out.println("" + amount + "  BRL = " + conversion.format(hkresult) + " HKD");
// BRL -> INR
			} else if (brazillianresults.equals(brasilllloptions[8])) {
				double indianresult = amount * brasillexchangerates[8];
				System.out.println("" + amount + "  BRL = " + conversion.format(indianresult) + " INR");
// BRL -> KRW
			} else if (brazillianresults.equals(brasilllloptions[9])) {
				double wonresult = amount * brasillexchangerates[9];
				System.out.println("" + amount + "  BRL = " + conversion.format(wonresult) + " KRW");
// BRL -> AUD
			} else if (brazillianresults.equals(brasilllloptions[10])) {
				double aussieresult = amount * brasillexchangerates[10];
				System.out.println("" + amount + "  BRL = " + conversion.format(aussieresult) + " AUD");
// BRL -> NZD
			} else if (brazillianresults.equals(brasilllloptions[11])) {
				double newzealandresult = amount * brasillexchangerates[11];
				System.out.println("" + amount + "  BRL = " + conversion.format(newzealandresult) + " NZD");
//BRL-> HTG
			} else if (brazillianresults.equals(brasilllloptions[12])) {
				double haitienresult = amount * brasillexchangerates[12];
				System.out.println("" + amount + "  BRL = " + conversion.format(haitienresult) + " HTG");
// BRL -> HRK
			} else if (brazillianresults.equals(brasilllloptions[13])) {
				double croatsresult = amount * brasillexchangerates[13];
				System.out.println("" + amount + "  BRL = " + conversion.format(croatsresult) + " HRK");
// BRL -> MXN
			}else if (brazillianresults.equals(brasilllloptions[14])) {
				double mexicanresult = amount * brasillexchangerates[14];
				System.out.println("" + amount + "  BRL = " + conversion.format(mexicanresult) + " MXN");
// BRL -> DOP
			}else if (brazillianresults.equals(brasilllloptions[15])) {
				double russianresult = amount *brasillexchangerates[15];
				System.out.println("" + amount + "  BRL = " + conversion.format(russianresult) + " DOP");
// BRL -> RUB
			}else if (brazillianresults.equals(brasilllloptions[16])) {
				double brazilrealresult = amount * brasillexchangerates[16];
				System.out.println("" + amount + "  BRL = " + conversion.format(brazilrealresult) + " RUB");
// BRL -> TRY
			}else if (brazillianresults.equals(brasilllloptions[17])) {
				double turkishresult = amount * brasillexchangerates[17];
				System.out.println("" + amount + "  BRL = " + conversion.format(turkishresult) + " TRY");
// BRL -> MAD
			}else if (brazillianresults.equals(brasilllloptions[18])) {
				double nordafricanresult = amount * brasillexchangerates[18];
				System.out.println("" + amount + " BRL = " + conversion.format(nordafricanresult) + " MAD");
// BRL -> ZAR
			}else if (brazillianresults.equals(brasilllloptions[19])) {
				double saresult = amount * brasillexchangerates[19];
				System.out.println("" + amount + "  BRL = " + conversion.format(saresult) + " ZAR");
			}




// Turkish lira conversion options
		}if (currencyconvert1.equals("Turkish lira") || currencyconvert1.equals("TRY")) {
			String[] turkoptions = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "INR", "KRW", "AUD", "NZD", "HTG", "HRK", "MXN",
					"DOP", "RUB", "BRL", "MAD", "ZAR"};
// Turkish exchange rates
			double[] turkishexchangerates = {0.11535438 ,
					0.14228222 ,
					0.083275899 ,
					0.097199334,
					0.10637524 ,
					12.793336 ,
					0.74572405  ,
					0.89608557,
					8.5748362,
					130.33405 ,
					0.15317797,
					0.16425286,
					10.555049,
					10.555049,
					2.2893353,
					6.5633123 ,
					8.47585,
					0.58675991,
					1.0298854,
					1.6452217};

// Array list which displays conversion to options. Based on turkish conversion options array
			System.out.println("Please select a currency you wish to convert to:" +
					"\n" + Arrays.toString(turkoptions));
			scan.nextLine();
			String turkresults = scan.nextLine();


			// actual exchanges
// TRY -> USD
			if (turkresults.equals(turkoptions[0])) {
				double murciaresult = amount * turkishexchangerates[0];
				System.out.println("" + amount + " TRY = " + conversion.format(murciaresult) + " USD");
				// MXN -> CAD
			} else if (turkresults.equals(turkoptions[1])) {
				double cadresult = amount * turkishexchangerates[1];
				System.out.println("" + amount + "  TRY = " + conversion.format(cadresult) + " CAD");
// TRY -> GBP
			} else if (turkresults.equals(turkoptions[2])) {
				double poundresult = amount * turkishexchangerates[2];
				System.out.println("" + amount + "  TRY = " + conversion.format(poundresult) + " GBP");
// TRY -> EUR
			} else if (turkresults.equals(turkoptions[3])) {
				double euroresult = amount * turkishexchangerates[3];
				System.out.println("" + amount + "  TRY = " + conversion.format(euroresult) + " EUR");
// TRY -> CHF
			} else if (turkresults.equals(turkoptions[4])) {
				double swissresult = amount *turkishexchangerates[4];
				System.out.println("" + amount + " TRY = " + conversion.format(swissresult) + " CHF");
// TRY -> JPY
			} else if (turkresults.equals(turkoptions[5])) {
				double jpyresult = amount * turkishexchangerates[5];
				System.out.println("" + amount + "  TRY = " + conversion.format(jpyresult) + " JPY");
// TRY -> CNY
			} else if (turkresults.equals(turkoptions[6])) {
				double cnyresult = amount * turkishexchangerates[6];
				System.out.println("" + amount + "  TRY = " + conversion.format(cnyresult) + " CNY");
// BRL -> HKD
			} else if (turkresults.equals(turkoptions[7])) {
				double hkresult = amount *turkishexchangerates[7];
				System.out.println("" + amount + "  TRY = " + conversion.format(hkresult) + " HKD");
// TRY -> INR
			} else if (turkresults.equals(turkoptions[8])) {
				double indianresult = amount * turkishexchangerates[8];
				System.out.println("" + amount + " TRY = " + conversion.format(indianresult) + " INR");
// TRY -> KRW
			} else if (turkresults.equals(turkoptions[9])) {
				double wonresult = amount * turkishexchangerates[9];
				System.out.println("" + amount + "  TRY = " + conversion.format(wonresult) + " KRW");
// TRY -> AUD
			} else if (turkresults.equals(turkoptions[10])) {
				double aussieresult = amount * turkishexchangerates[10];
				System.out.println("" + amount + "  TRY = " + conversion.format(aussieresult) + " AUD");
// TRY -> NZD
			} else if (turkresults.equals(turkoptions[11])) {
				double newzealandresult = amount * turkishexchangerates[11];
				System.out.println("" + amount + "  TRY = " + conversion.format(newzealandresult) + " NZD");
//TRY-> HTG
			} else if (turkresults.equals(turkoptions[12])) {
				double haitienresult = amount * turkishexchangerates[12];
				System.out.println("" + amount + "  TRY = " + conversion.format(haitienresult) + " HTG");
// TRY -> HRK
			} else if (turkresults.equals(turkoptions[13])) {
				double croatsresult = amount * turkishexchangerates[13];
				System.out.println("" + amount + "  TRY = " + conversion.format(croatsresult) + " HRK");
// TRY -> MXN
			}else if (turkresults.equals(turkoptions[14])) {
				double mexicanresult = amount * turkishexchangerates[14];
				System.out.println("" + amount + "  TRY = " + conversion.format(mexicanresult) + " MXN");
// TRY -> DOP
			}else if (turkresults.equals(turkoptions[15])) {
				double russianresult = amount *turkishexchangerates[15];
				System.out.println("" + amount + "  TRY = " + conversion.format(russianresult) + " DOP");
// TRY -> RUB
			}else if (turkresults.equals(turkoptions[16])) {
				double brazilrealresult = amount * turkishexchangerates[16];
				System.out.println("" + amount + "  TRY = " + conversion.format(brazilrealresult) + " RUB");
// TRY -> BRL
			}else if (turkresults.equals(turkoptions[17])) {
				double turkishresult = amount * turkishexchangerates[17];
				System.out.println("" + amount + "  TRY = " + conversion.format(turkishresult) + " BRL");
// TRY -> MAD
			}else if (turkresults.equals(turkoptions[18])) {
				double nordafricanresult = amount * turkishexchangerates[18];
				System.out.println("" + amount + " TRY = " + conversion.format(nordafricanresult) + " MAD");
// TRY -> ZAR
			}else if (turkresults.equals(turkoptions[19])) {
				double saresult = amount * turkishexchangerates[19];
				System.out.println("" + amount + "  TRY = " + conversion.format(saresult) + " ZAR");
			}
// If player chooses Moroccan dirham..
		}  if (currencyconvert1.equals("Moroccan Dirham") || currencyconvert1.equals("MAD")) {
			String[] moroccanoptions = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "INR", "KRW", "AUD", "NZD", "HTG", "HRK", "MXN",
					"DOP", "RUB", "BRL", "TRY", "ZAR"};
// Moroccan exchange rates
			double[] morccoanexchangerates = {0.11202867 ,
					0.13816241 ,
					0.080860411 ,
					0.094376312 ,
					0.094376312  ,
					12.424143 ,
					0.72406349  ,
					0.87008274,
					8.3265249,
					126.55864 ,
					0.14878027,
					0.15955939 ,
					10.275606,
					0.70695802,
					0.70695802,
					6.3629771 ,
					8.2290923,
					0.56991905,
					0.97114625,
					1.59662};


			// Array list which displays conversion to options. Based on Moroccan conversion options array
			System.out.println("Please select a currency you wish to convert to:" +
					"\n" + Arrays.toString(moroccanoptions));
			scan.nextLine();
			String morroccanresults = scan.nextLine();



			// actual exchanges
//MAD -> USD
			if (morroccanresults.equals(moroccanoptions[0])) {
				double murciaresult = amount * morccoanexchangerates[0];
				System.out.println("" + amount + " MAD = " + conversion.format(murciaresult) + " USD");
				// MXN -> CAD
			} else if (morroccanresults.equals(moroccanoptions[1])) {
				double cadresult = amount * morccoanexchangerates[1];
				System.out.println("" + amount + "   MAD = " + conversion.format(cadresult) + " CAD");
// MAD -> GBP
			} else if (morroccanresults.equals(moroccanoptions[2])) {
				double poundresult = amount * morccoanexchangerates[2];
				System.out.println("" + amount + "   MAD = " + conversion.format(poundresult) + " GBP");
// MAD -> EUR
			} else if (morroccanresults.equals(moroccanoptions[3])) {
				double euroresult = amount * morccoanexchangerates[3];
				System.out.println("" + amount + "  MAD = " + conversion.format(euroresult) + " EUR");
// MAD -> CHF
			} else if (morroccanresults.equals(moroccanoptions[4])) {
				double swissresult = amount *morccoanexchangerates[4];
				System.out.println("" + amount + "  MAD = " + conversion.format(swissresult) + " CHF");
// MAD -> JPY
			} else if (morroccanresults.equals(moroccanoptions[5])) {
				double jpyresult = amount * morccoanexchangerates[5];
				System.out.println("" + amount + "   MAD = " + conversion.format(jpyresult) + " JPY");
// MAD -> CNY
			} else if (morroccanresults.equals(moroccanoptions[6])) {
				double cnyresult = amount * morccoanexchangerates[6];
				System.out.println("" + amount + " MAD = " + conversion.format(cnyresult) + " CNY");
// MAD -> HKD
			} else if (morroccanresults.equals(moroccanoptions[7])) {
				double hkresult = amount *morccoanexchangerates[7];
				System.out.println("" + amount + "  MAD = " + conversion.format(hkresult) + " HKD");
// MAD -> INR
			} else if (morroccanresults.equals(moroccanoptions[8])) {
				double indianresult = amount * morccoanexchangerates[8];
				System.out.println("" + amount + " MAD = " + conversion.format(indianresult) + " INR");
// MAD -> KRW
			} else if (morroccanresults.equals(moroccanoptions[9])) {
				double wonresult = amount * morccoanexchangerates[9];
				System.out.println("" + amount + "  MAD = " + conversion.format(wonresult) + " KRW");
// MAD -> AUD
			} else if (morroccanresults.equals(moroccanoptions[10])) {
				double aussieresult = amount *morccoanexchangerates[10];
				System.out.println("" + amount + "  MAD = " + conversion.format(aussieresult) + " AUD");
				// MAD -> NZD
			} else if (morroccanresults.equals(moroccanoptions[11])) {
				double newzealandresult = amount * morccoanexchangerates[11];
				System.out.println("" + amount + "  MAD = " + conversion.format(newzealandresult) + " NZD");
//MAD-> HTG
			} else if (morroccanresults.equals(moroccanoptions[12])) {
				double haitienresult = amount * morccoanexchangerates[12];
				System.out.println("" + amount + "  MAD = " + conversion.format(haitienresult) + " HTG");
// MAD -> HRK
			} else if (morroccanresults.equals(moroccanoptions[13])) {
				double croatsresult = amount * morccoanexchangerates[13];
				System.out.println("" + amount + "  MAD = " + conversion.format(croatsresult) + " HRK");
// MAD -> MXN
			}else if (morroccanresults.equals(moroccanoptions[14])) {
				double mexicanresult = amount * morccoanexchangerates[14];
				System.out.println("" + amount + "  MAD = " + conversion.format(mexicanresult) + " MXN");
// MAD -> DOP
			}else if (morroccanresults.equals(moroccanoptions[15])) {
				double russianresult = amount *morccoanexchangerates[15];
				System.out.println("" + amount + " MAD = " + conversion.format(russianresult) + " DOP");
// MAD -> RUB
			}else if (morroccanresults.equals(moroccanoptions[16])) {
				double brazilrealresult = amount * morccoanexchangerates[16];
				System.out.println("" + amount + " MAD  = " + conversion.format(brazilrealresult) + " RUB");
// MAD -> BRL
			}else if (morroccanresults.equals(moroccanoptions[17])) {
				double turkishresult = amount * morccoanexchangerates[17];
				System.out.println("" + amount + "  MAD = " + conversion.format(turkishresult) + " BRL");
// MAD -> MAD
			}else if (morroccanresults.equals(moroccanoptions[18])) {
				double nordafricanresult = amount * morccoanexchangerates[18];
				System.out.println("" + amount + " MAD = " + conversion.format(nordafricanresult) + " TRY");
// MAD -> ZAR
			}else if (morroccanresults.equals(moroccanoptions[19])) {
				double saresult = amount * morccoanexchangerates[19];
				System.out.println("" + amount + "  MAD = " + conversion.format(saresult) + " ZAR");
			}









// if player chooses south african rad
		}if (currencyconvert1.equals("South African Rad") || currencyconvert1.equals("ZAR")) {
			String[] southafriquepotiental = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "INR", "KRW", "AUD", "NZD", "HTG", "HRK", "MXN",
					"DOP", "RUB", "BRL", "TRY", "MAD"};
			// South african exchange rates
			double[] saexchangerates = {0.070165444 ,
					0.086544021 ,
					0.050649946,
					0.059119321  ,
					0.064690594  ,
					7.780826 ,
					0.45350135  ,
					0.54494974,
					5.2108411,
					79.243571 ,
					0.093098677,
					0.099850796 ,
					6.4979641,
					0.44253636,
					1.3918381,
					3.9868921 ,
					5.1531002,
					0.35646359,
					0.60818139,
					0.62583581};

			System.out.println("Please select a currency you wish to convert to:" +
					"\n" + Arrays.toString(southafriquepotiental));
			scan.nextLine();
			String zarresults = scan.nextLine();


			// actual exchanges
//ZAR -> USD
			if (zarresults.equals(southafriquepotiental[0])) {
				double murciaresult = amount * saexchangerates[0];
				System.out.println("" + amount + " ZAR = " + conversion.format(murciaresult) + " USD");
				// MXN -> CAD
			} else if (zarresults.equals(southafriquepotiental[1])) {
				double cadresult = amount * saexchangerates[1];
				System.out.println("" + amount + "   ZAR = " + conversion.format(cadresult) + " CAD");
// ZAR -> GBP
			} else if (zarresults.equals(southafriquepotiental[2])) {
				double poundresult = amount * saexchangerates[2];
				System.out.println("" + amount + "  ZAR = " + conversion.format(poundresult) + " GBP");
// ZAR -> EUR
			} else if (zarresults.equals(southafriquepotiental[3])) {
				double euroresult = amount * saexchangerates[3];
				System.out.println("" + amount + "  ZAR = " + conversion.format(euroresult) + " EUR");
// ZAR -> CHF
			} else if (zarresults.equals(southafriquepotiental[4])) {
				double swissresult = amount *saexchangerates[4];
				System.out.println("" + amount + "  ZAR = " + conversion.format(swissresult) + " CHF");
// ZAR -> JPY
			} else if (zarresults.equals(southafriquepotiental[5])) {
				double jpyresult = amount * saexchangerates[5];
				System.out.println("" + amount + "   ZAR = " + conversion.format(jpyresult) + " JPY");
// ZAR -> CNY
			} else if (zarresults.equals(southafriquepotiental[6])) {
				double cnyresult = amount * saexchangerates[6];
				System.out.println("" + amount + " ZAR = " + conversion.format(cnyresult) + " CNY");
// ZAR -> HKD
			} else if (zarresults.equals(southafriquepotiental[7])) {
				double hkresult = amount *saexchangerates[7];
				System.out.println("" + amount + " ZAR = " + conversion.format(hkresult) + " HKD");
// ZAR -> INR
              } else if (zarresults.equals(southafriquepotiental[8])) {
				double indianresult = amount * saexchangerates[8];
				System.out.println("" + amount + " ZAR = " + conversion.format(indianresult) + " INR");
// ZAR -> KRW
			} else if (zarresults.equals(southafriquepotiental[9])) {
				double wonresult = amount * saexchangerates[9];
				System.out.println("" + amount + "  ZAR = " + conversion.format(wonresult) + " KRW");
// ZAR -> AUD
			} else if (zarresults.equals(southafriquepotiental[10])) {
				double aussieresult = amount *saexchangerates[10];
				System.out.println("" + amount + "  ZAR = " + conversion.format(aussieresult) + " AUD");
				// MAD -> NZD
			} else if (zarresults.equals(southafriquepotiental[11])) {
				double newzealandresult = amount * saexchangerates[11];
				System.out.println("" + amount + "  ZAR = " + conversion.format(newzealandresult) + " NZD");
//ZAR-> HTG
			} else if (zarresults.equals(southafriquepotiental[12])) {
				double haitienresult = amount * saexchangerates[12];
				System.out.println("" + amount + " ZAR = " + conversion.format(haitienresult) + " HTG");
// ZAR -> HRK
			} else if (zarresults.equals(southafriquepotiental[13])) {
				double croatsresult = amount * saexchangerates[13];
				System.out.println("" + amount + " ZAR = " + conversion.format(croatsresult) + " HRK");
// ZAR -> MXN
			}else if (zarresults.equals(southafriquepotiental[14])) {
				double mexicanresult = amount * saexchangerates[14];
				System.out.println("" + amount + "  ZAR = " + conversion.format(mexicanresult) + " MXN");
// ZAR -> DOP
			}else if (zarresults.equals(southafriquepotiental[15])) {
				double russianresult = amount *saexchangerates[15];
				System.out.println("" + amount + " ZAR = " + conversion.format(russianresult) + " DOP");
// ZAR -> RUB
			}else if (zarresults.equals(southafriquepotiental[16])) {
				double brazilrealresult = amount *saexchangerates[16];
				System.out.println("" + amount + " ZAR  = " + conversion.format(brazilrealresult) + " RUB");
// ZAR -> BRL
			}else if (zarresults.equals(southafriquepotiental[17])) {
				double turkishresult = amount * saexchangerates[17];
				System.out.println("" + amount + "  ZAR = " + conversion.format(turkishresult) + " BRL");
// ZAR -> MAD
			}else if (zarresults.equals(southafriquepotiental[18])) {
				double nordafricanresult = amount * saexchangerates[18];
				System.out.println("" + amount + " ZAR = " + conversion.format(nordafricanresult) + " TRY");
// ZAR -> MAD
			}else if (zarresults.equals(southafriquepotiental[19])) {
				double saresult = amount * saexchangerates[19];
				System.out.println("" + amount + "  ZAR = " + conversion.format(saresult) + "MAD");
			}



		}
	}}