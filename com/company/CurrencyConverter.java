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
					"CNY", "HKD", "KRW", "INR", "AUD", "NZD", "HTG", "HRK", "MXN"};

			double[] usdexchanges = {0.83835206,
					1.2335826,
					0.72030522,
					0.91919243,
					110.53877,
					6.4560868,
					7.7619931,
					1130.6365,
					74.275198,
					1.3213756,
					1.4192552,
					92.836658,
					6.2840873,
					19.812208};

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


			}

			// conversions for Canadian dollar
		}

		if (currencyconvert1.equals("Canadian Dollar") || currencyconvert1.equals("CAD")) {
// All canadian potential options
			String[] candaianselector = {"USD", "EUR", "GBP", "CHF", "JPY",
					"CNY", "HKD", "KRW", "INR", "AUD", "NZD", "HTG", "HRK", "MXN"};

			double[] canadianexchanges = {0.810554,
					0.67963396,
					0.58388961,
					0.74511903,
					89.591705,
					5.233252,
					6.2905938,
					916.36407,
					60.189995,
					1.0711448,
					1.1504785,
					75.31686,
					5.0929884,
					16.049402};


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

			}
			// British currency conversion
		}
		if (currencyconvert1.equals("Pounds") || currencyconvert1.equals("GBP")) {
			String[] britishpounds = {"USD", "CAD", "EUR", "CHF", "JPY",
					"CNY", "HKD", "KRW", "INR", "AUD", "NZD", "HTG", "HRK", "MXN"};
			// british exchanges rates based on british pounds array
			double[] britishexchanges = {1.3878456,
					1.7126065,
					1.1637854,
					1.2762759,
					153.40546,
					8.9597239,
					10.771369,
					1569.3489,
					1103.0423,
					1.8341399,
					1.9705914,
					128.84753,
					8.7214906,
					27.497044};

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
			}
		}

		// Euro conversions
		if (currencyconvert1.equals("EUR") || currencyconvert1.equals("Euros")) {
			String[] euroconversionoptions = {"USD", "CAD", "GBP", "CHF", "JPY",
					"CNY", "HKD", "KRW", "INR", "AUD", "NZD", "HTG", "HRK", "MXN"};
// EURO currency exchange rates based on conversion options array

			double[] euroexchanges = {1.192518,
					1.4717208,
					0.85933247,
					1.0966219,
					131.8389,
					7.6991508,
					9.2561885,
					1348.5596,
					88.56182,
					1.5762709,
					1.6934045,
					110.71338,
					7.4951563,
					23.62066};


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
			}
// Conversions for  Swiss francs
		}
		if (currencyconvert1.equals("Swiss franc") || currencyconvert1.equals("CHF")) {

			String[] swissconversion = {"USD", "CAD", "EUR", "GBP", "JPY",
					"CNY", "HKD", "KRW", "INR", "AUD", "NZD", "HTG", "HRK", "MXN"};
// swiss exchanges based on swissconversion array
			double[] swissexchanges = {1.0874317,
					1.0874317,
					0.91188028,
					0.78357372,
					120.23182,
					7.020784,
					8.4408763,
					1229.5475,
					80.755847,
					1.4374353,
					1.5443111,
					100.95397,
					6.8347993,
					21.539828};
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
			double[] jpyexchangerates = {0.0090447217,
					0.0075846184,
					0.011163021,
					0.0065180121,
					0.070202966,
					0.058395414,
					10.227702,
					0.67175252,
					0.011956866,
					0.012846427,
					0.84147114,
					0.056849225,
					0.17921287};

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
			double[] chinacurrencyexchanges = {0.1548788,
					0.11162999,
					0.19117953,
					0.12990358,
					0.14244852,
					17.126163,
					1.2022775,
					175.15111,
					11.502633,
					0.20477496,
					0.2200106,
					14.382634,
					0.97353548,
					3.0688448};


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
			}

		}

		// if player wishes to convert hong kong dollars
		if (currencyconvert1.equals("Hong Kong Dollar") || currencyconvert1.equals("HKD")) {
			String[] HKDconversions = {"USD", "CAD", "EUR", "GBP", "CHF",
					"\n" + "JPY", "CNY", "KRW", "INR", "AUD", "NZD", "HTG", "HRK", "MXN"};
// currency exchange rates based on  hkd currencies array
			double[] hkcurrencyexchange = {0.12883176,
					0.15902628,
					0.1080503,
					0.09284315,
					0.11849547,
					14.246892,
					0.8319018,
					145.67692,
					9.5693665,
					0.1702951,
					0.18294883,
					11.960528,
					0.80983105,
					2.552073};
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
			}
			// if player wishes to use south korean won
		}
		if (currencyconvert1.equals("KRW") || currencyconvert1.equals("South Korean won")) {
			String[] potientalwonconversions = {"USD", "CAD", "GBP", "EUR", "CHF",
					"JPY", "CNY", "HKD", "INR", "AUD", "NZD", "HTG", "HRK", "MXN"};
				/*Based on potientalwonconversions array. Currency exchange rates of that array
				Order based on the order of currencies. So first is the USD, and goes all the way to NZD
				 */
			double[] currencyresults = {0.00088445472,
					0.0010918261,
					0.00063740081,
					0.00074190987,
					0.00081356736,
					0.097822713,
					0.0057116846,
					0.0068659194,
					0.06569063,
					0.0011691843,
					0.001256011,
					0.082430948,
					0.0055591241,
					0.017517982};

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
			}
			// INDIAN RUPEE CURRENCIES
		}
		if (currencyconvert1.equals("INR") || currencyconvert1.equals("Indian rupee")) {
			String[] indianconversions = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "KRW", "AUD", "NZD", "HTG", "HRK", "MXN"};
				/*Based on indianconversions array. Currency exchange rates of that array
				Order based on the order of currencies. So first is the USD, and goes all the way to NZD
				 */
			double[] indianexchangerates = {0.013464294,
					0.016618974,
					0.0097019789,
					0.01129091,
					0.01238228,
					1.488783,
					0.086928313,
					0.10451013,
					15.216049,
					0.017794842,
					0.019117068,
					1.2509995,
					0.084616193,
					0.26668204};

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
				System.out.println("" + amount + " INR =" + conversion.format(vivapesos) + " INR");
			}
// if player decides to choose  Australian dollar

		}
		if(currencyconvert1.equals("AUD") || currencyconvert1.equals("Australian Dollar")) {
			//  Player choices when choosing australian dollars
			String[] aussieconversions = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "INR", "KRW", "NZD", "HTG", "HRK", "MXN"};
				/*Based on indianconversions array. Currency exchange rates of that array
				Order based on the order of currencies. So first is the USD, and goes all the way to NZD
				 */
			double[] aussieexchangerates = {0.26668204,
					0.93392476,
					0.54523281,
					0.63455687,
					0.69586911,
					83.682119,
					4.8855211,
					5.8735144,
					56.195684,
					855.2197,
					1.0743797,
					70.255129,
					4.7561792,
					14.990436};

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
			double[] nzdexchangerates = {0.7043073,
					0.86925779,
					0.50749509,
					0.50749509,
					0.64765114,
					77.881003,
					4.5471157,
					5.4663209,
					52.294284,
					796.2045,
					0.93071463,
					65.374863,
					4.4272178,
					4.4272178};
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
			}
			// if player decides to convert haitian currencies
		}
	else if (currencyconvert1.equals("HTG") || currencyconvert1.equals("Haitian Gourde")) {
			String[] htgconversions = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "INR", "KRW", "AUD", "NZD", "MXN", "HRK"};
// haitian currency exchange rates
			double[] htgexchanges = {0.010743448,
					0.013261766,
					0.007741704,
					0.009010012,
					0.0098638676,
					1.186305,
					0.069248318,
					0.083256269,
					0.79668294,
					12.151811,
					0.014206867,
					0.015263384,
					0.21308671,
					0.067610529};
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
			}
			// If player chooses Croatian Kunas
		}
	 if (currencyconvert1.equals("Croatian Kuna") || currencyconvert1.equals("HRK")) {
			String[] kunaconversions = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "INR", "KRW", "AUD", "NZD", "HTG", "MXN"};
// croatian currency exchange rates
			double[] kunaexchange = {0.15910053,
					0.19637593,
					0.11464166,
					0.13341894,
					0.14629917,
					17.597213,
					1.0273129,
					1.2350565,
					11.817843,
					179.92353,
					0.21032429,
					0.22594849,
					14.775891,
					3.1544329};

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
		}
		if (currencyconvert1.equals("Mexican Peso") || currencyconvert1.equals("MXN")) {
			String[] mexicanpesoconversions = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "INR", "KRW", "AUD", "NZD", "HTG", "HRK"};
// mexican currency exchange rates for the conversion array above
			double[] mexicanexchange = {0.050445886,
					0.062273946,
					0.062273946,
					0.042301893,
					0.046388797,
					5.5795476,
					0.32555336,
					0.39137258,
					0.39137258,
					0.39137258,
					0.066648992,
					0.071607296,
					4.6851848,
					4.6851848};

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

			// If player wishes to choose dominican pesos
		}if (currencyconvert1.equals("Dominican Pesos") || currencyconvert1.equals("DOP")) {
			String[] dominicainpesos = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "INR", "KRW", "AUD", "NZD", "HTG", "HRK","MXN",
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
// DP[ -> HRK
			} else if (dominicainresults.equals(dominicainpesos[13])) {
				double mexicanresult = amount * dopexchangerates[13];
				System.out.println("" + amount + "  DOP = " + conversion.format(mexicanresult) + " HRK");
// DOP -> MXN
			}else if (dominicainresults.equals(dominicainpesos[14])) {
				double mexicanresult = amount * dopexchangerates[14];
				System.out.println("" + amount + "  DOP = " + conversion.format(mexicanresult) + " MXN");

			}else if (dominicainresults.equals(dominicainpesos[15])) {
				double mexicanresult = amount * dopexchangerates[15];
				System.out.println("" + amount + "  DOP = " + conversion.format(mexicanresult) + " RUB");

			}else if (dominicainresults.equals(dominicainpesos[16])) {
				double mexicanresult = amount * dopexchangerates[16];
				System.out.println("" + amount + "  DOP = " + conversion.format(mexicanresult) + " BRL");

			}else if (dominicainresults.equals(dominicainpesos[17])) {
				double mexicanresult = amount * dopexchangerates[17];
				System.out.println("" + amount + "  DOP = " + conversion.format(mexicanresult) + " TRY");

			}else if (dominicainresults.equals(dominicainpesos[18])) {
				double mexicanresult = amount * dopexchangerates[18];
				System.out.println("" + amount + "  DOP = " + conversion.format(mexicanresult) + " MAD");

			}else if (dominicainresults.equals(dominicainpesos[19])) {
				double mexicanresult = amount * dopexchangerates[19];
				System.out.println("" + amount + "  DOP = " + conversion.format(mexicanresult) + " ZAR");
			}










		// If player chooses russian rubles
		}if (currencyconvert1.equals("Russian Rubles") || currencyconvert1.equals("RUB")) {
			String[] rublesconvets = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "INR", "KRW", "AUD", "NZD", "HTG", "HRK", "MXN",
					"DOP", "BRL", "TRY", "MAD", "ZAR"};

					// if player choses russian exchange rates
			double[] russianexchangerates = {0.013617151,
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


// if player chooses south african rad
		}if (currencyconvert1.equals("South African Rad") || currencyconvert1.equals("ZAR")) {
			String[] southafriquepotiental = {"USD", "CAD", "GBP", "EUR", "CHF" +
					"\n", "JPY", "CNY", "HKD", "INR", "KRW", "AUD", "NZD", "HTG", "HRK", "MXN",
					"DOP", "RUB", "BRL", "TRY", "MAD"};
			// South african exchange rates
			double[] morccoanexchangerates = {0.070165444 ,
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




		}
	}}