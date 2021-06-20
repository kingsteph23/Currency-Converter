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
		}

//
		System.out.println();
		int amount = scan.nextInt();

		// actual conversions

// Conversions for US dollars
		if (currencyconvert1.equals("US dollar") || (currencyconvert1.equals("USD"))) {
			String[] muricanselectors = {"EUR", "CAD", "GBP", "CHF", "JPY",
										"CNY", "HKD", "KRW", "INR", "AUD", "NZD"};

			double[]  usdexchanges = {0.84284859,
					1.2470347,
					0.72437585,
					0.92275915,
					110.24367,
					6.4530238,
					7.76255,
					1134.9152,
					74.131551,
					1.3369583,1.4421582};
			System.out.println("Please select a currency to convert to of your choice:" +
					"\n" + Arrays.toString(muricanselectors));
			scan.nextLine();
			String usconverter = scan.nextLine();


// USD -> EUROS
			if(usconverter.equals(muricanselectors[0])) {
				double euro = amount * usdexchanges[0];
				System.out.println("" + amount + " USD =" + conversion.format(euro) + " Euros");
// USD -> CAD(Canadian dollars)
			} else if (usconverter.equals(muricanselectors[1])) {
				double canadiandollar = amount *usdexchanges[1] ;
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
				double southkoreanwon = amount *usdexchanges[7] ;
				System.out.println("" + amount + " USD =" + conversion.format(southkoreanwon) + " KRW");
// USD -> INR(Indian rupees)
			} else if (usconverter.equals(muricanselectors[8])) {
				double indianrupee = amount * usdexchanges[8] ;
				System.out.println("" + amount + " USD =" + conversion.format(indianrupee) + " INR");
// USD -> AUD(Australian Dollars)
			} else if (usconverter.equals(muricanselectors[9])){
				double australiandollar = amount * usdexchanges[9] ;
			System.out.println("" + amount + " USD =" + conversion.format(australiandollar) + " AUD");
// USD -> NZD(New Zealand Dollars)
		}else if(usconverter.equals(muricanselectors[10])) {
				double newzealanddollar = amount *  usdexchanges[10];
				System.out.println("" + amount + " USD =" + conversion.format(newzealanddollar) + " NZD");
			}
			// conversions for Canadian dollar
		}

		if (currencyconvert1.equals("Canadian Dollar") || currencyconvert1.equals("CAD")) {
// All canadian potential options
			String[]  candaianselector = {"USD","EUR","GBP","CHF","JPY",
					                      "CNY","HKD","KRW","INR","AUD","NZD"};

			double[]  canadianexchanges = {0.80190232,
					0.67588224,
					0.58087867,
					0.7399627,
					88.4052,
					5.1746879,
					6.2248068,
					910.09113,
					59.446262,
					1.07211,1.15647 };
System.out.println("Select a currency you wish to convert to?:"+
		"\n"+Arrays.toString(candaianselector));
			scan.nextLine();
			String  canadiancurrencies = scan.nextLine();
// CAD -> USD
			if(canadiancurrencies.equals(candaianselector[0])) {
				double usdollar = amount * canadianexchanges[0] ;
				System.out.println("" + amount + " CAD =" + conversion.format(usdollar) + " USD");

// CAD -> EUR
           }else if(canadiancurrencies.equals(candaianselector[1])) {
				double euro = amount *  canadianexchanges[1];
				System.out.println("" + amount + " CAD =" + conversion.format(euro) + " EUR");
// CAD -> GBP
			}else if(canadiancurrencies.equals(candaianselector[2])) {
				double britishpound = amount * canadianexchanges[2] ;
				System.out.println("" + amount + " CAD=" + conversion.format(britishpound) + " GBP");
// CAD -> CHF
			}else if(canadiancurrencies.equals(candaianselector[3])) {
				double swissfrancs = amount *  canadianexchanges[3];
				System.out.println("" + amount + " CAD=" + conversion.format(swissfrancs) + " CHF");
// CAD -> JPY
			}else if(canadiancurrencies.equals(candaianselector[4])) {
				double japaneseyen = amount *  canadianexchanges[4];
				System.out.println("" + amount + " CAD=" + conversion.format(japaneseyen) + " JPY");
// CAD -> CNY
			}else if(canadiancurrencies.equals(candaianselector[5])) {
				double chineseyuan = amount * canadianexchanges[5];
				System.out.println("" + amount + " CAD=" + conversion.format(chineseyuan) + " CNY");
// CAD -> HKD
			}else if(canadiancurrencies.equals(candaianselector[6])) {
				double hkdollar = amount * canadianexchanges[6];
				System.out.println("" + amount + " CAD=" + conversion.format(hkdollar) + " HKD");
// CAD -> KRW
			}else if(canadiancurrencies.equals(candaianselector[7])) {
				double skwon = amount * canadianexchanges[7];
				System.out.println("" + amount + " CAD=" + conversion.format(skwon) + " KRW");
// CAD -> INR
			}else if(canadiancurrencies.equals(candaianselector[8])) {
				double indianrupee = amount * canadianexchanges[8] ;
				System.out.println("" + amount + " CAD=" + conversion.format(indianrupee) + " INR");
// CAD -> AUD
			}else if(canadiancurrencies.equals(candaianselector[9])) {
				double aussiedollar = amount *  canadianexchanges[9];
				System.out.println("" + amount + " CAD=" + conversion.format(aussiedollar) + " AUD");
// CAD->NZD
			}else if(canadiancurrencies.equals(candaianselector[10])) {
				double zealanddollar = amount * canadianexchanges[10];
				System.out.println("" + amount + " CAD=" + conversion.format(zealanddollar) + " NZD");
			}
			// British currency conversion
		}
		if (currencyconvert1.equals("Pounds") || currencyconvert1.equals("GBP")) {
			String[] britishpounds = {"USD","CAD","EUR","CHF","JPY",
									  "CNY","HKD","KRW","INR","AUD","NZD"};
			// british exchanges rates based on british pounds array
			double[]  britishexchanges = {1.3804988,
					1.7215299,
					1.1635515,
					1.2739899,
					152.19385,
					8.9086918 ,
					10.716526,
					1566.8004,
					102.34187,
					1.8456689,1.9909629};
				System.out.println("Select a currency you wish to convert to?: "+
						"\n"+Arrays.toString(britishpounds));
               scan.nextLine();
				String britishconversionoptions = scan.nextLine();

// GBP-USD
			if(britishconversionoptions.equals(britishpounds[0])) {
				double muricadollar = amount * britishexchanges[0];
				System.out.println("" + amount + " GBP=" + conversion.format(muricadollar) + " USD");
// GBP-> CAD
			}else if(britishconversionoptions.equals(britishpounds[1])) {
				double canadiandolla = amount *  britishexchanges[1];
				System.out.println("" + amount + " GBP=" + conversion.format(canadiandolla) + " CAD");
//  GBP -> EURO
			}else if(britishconversionoptions.equals(britishpounds[2])) {
				double euro = amount * britishexchanges[2] ;
				System.out.println("" + amount + " GBP=" + conversion.format(euro) + " EUR");
// GBP -> CHF
			}else if(britishconversionoptions.equals(britishpounds[3])) {
				double swiss = amount *  britishexchanges[3];
				System.out.println("" + amount + " GBP=" + conversion.format(swiss) + " CHF");
// GBP -> JPY
			}else if(britishconversionoptions.equals(britishpounds[4])) {
				double jpyen = amount *  britishexchanges[4];
				System.out.println("" + amount + " GBP=" + conversion.format(jpyen) + " JPY");
// GBP -> CNY
			}else if(britishconversionoptions.equals(britishpounds[5])) {
				double chineseyuan = amount * britishexchanges[5];
				System.out.println("" + amount + " GBP=" + conversion.format(chineseyuan) + " CNY");
// GBP -> HKD
			}else if(britishconversionoptions.equals(britishpounds[6])) {
				double hkdollar = amount *  britishexchanges[6];
				System.out.println("" + amount + " GBP=" + conversion.format(hkdollar) + " HKD");
// GBP -> KRW
			}else if(britishconversionoptions.equals(britishpounds[7])) {
				double koreanwon = amount *  britishexchanges[7];
				System.out.println("" + amount + " GBP=" + conversion.format(koreanwon) + " KRW");
// GBP -> INR
			}else if(britishconversionoptions.equals(britishpounds[8])) {
				double indianrupee = amount *  britishexchanges[8];
				System.out.println("" + amount + " GBP=" + conversion.format(indianrupee) + " INR");
// GBP -> AUD
			}else if(britishconversionoptions.equals(britishpounds[9])) {
				double australiandollar = amount * britishexchanges[9] ;
				System.out.println("" + amount + " GBP=" + conversion.format(australiandollar) + " AUD");
// GBP -> NZD
			}else if(britishconversionoptions.equals(britishpounds[10])) {
				double nzddollar = amount *  britishexchanges[10];
				System.out.println("" + amount + " GBP=" + conversion.format(nzddollar) + " NZD");
			}
		}

		// Euro conversions
		if (currencyconvert1.equals("EUR") || currencyconvert1.equals("Euros")) {
			String[] euroconversionoptions = {"USD", "CAD", "GBP", "CHF","JPY",
					                          "CNY", "HKD", "KRW", "INR", "AUD", "NZD"};
// EURO currency exchange rates based on conversion options array
			double[]  euroexchanges = {1.1864322,
					1.4794711,
					0.85939466,
					1.0948602 ,
					130.79458,
					7.6563218,
					9.2097248,
					1346.4999,
					87.952057,
					1.586158,1.7110228};


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
				double cad = amount *  euroexchanges[1];
				System.out.println("" + amount + " EUR=" + conversion.format(cad) + " CAD");
// EUR -> GBP
			} else if (euroselector.equals(euroconversionoptions[2])) {
				double britpounds = amount * euroexchanges[2] ;
				System.out.println("" + amount + " EUR=" + conversion.format(britpounds) + " GBP");
// EUR -> CHF
			} else if (euroselector.equals(euroconversionoptions[3])) {
				double swissyfranc = amount * euroexchanges[3] ;
				System.out.println("" + amount + " EUR=" + conversion.format(swissyfranc) + " CHF");
// EUR -> JPY
			} else if (euroselector.equals(euroconversionoptions[4])){
				double jpy = amount * euroexchanges[4] ;
			System.out.println("" + amount + " EUR=" + conversion.format(jpy) + " JPY");
// EUR -> CNY
		}else if(euroselector.equals(euroconversionoptions[5])) {
				double cny = amount *  euroexchanges[5] ;
				System.out.println("" + amount + " Eur=" + conversion.format(cny) + " CNY");
// EUR-> HKD
			}else if(euroselector.equals(euroconversionoptions[6])) {
				double hkd = amount *  euroexchanges[6];
				System.out.println("" + amount + " Eur=" + conversion.format(hkd) + "  HKD");
// EUR -> KRW
			}else if(euroselector.equals(euroconversionoptions[7])) {
				double skwon = amount *  euroexchanges[7];
				System.out.println("" + amount + " EUR=" + conversion.format(skwon) + " KRW");
// EUR -> INR
			}else if(euroselector.equals(euroconversionoptions[8])) {
				double INR = amount *  euroexchanges[8];
				System.out.println("" + amount + " EUR=" + conversion.format(INR) + " INR");
// EUR -> AUD
			}else if(euroselector.equals(euroconversionoptions[9])) {
				double AUD = amount * euroexchanges[9] ;
				System.out.println("" + amount + " EUR=" + conversion.format(AUD) + " AUD");
// EUR -> NZD
			}else if(euroselector.equals(euroconversionoptions[10])) {
				double NZD = amount *  euroexchanges[10];
				System.out.println("" + amount + " EUR=" + conversion.format(NZD) + " NZD");


			}
// Conversions for  Swiss francs
		}
		if (currencyconvert1.equals("Swiss franc") || currencyconvert1.equals("CHF")) {

			String[] swissconversion = {"USD", "CAD", "EUR", "GBP","JPY",
										"CNY", "HKD", "KRW", "INR", "AUD", "NZD"};
// swiss exchanges based on swissconversion array
			double[] swissexchanges = {1.0836381,
					1.3512878,
					0.91335866,
					0.78493555,
					119.46236,
					6.9927373,
					8.4117819,
					1229.8373,
					80.331772,
					1.4487311,1.5627775};
			System.out.println("Please select a currency of your choice:"+
					          "\n"+ Arrays.toString(swissconversion));
			scan.nextLine();
			String swissselector = scan.nextLine();
			//CHF->USD
			if (swissselector.equals(swissconversion[0])) {
				double usd = amount *  swissexchanges[0];
				System.out.println("" + amount + " CHF=" + conversion.format(usd) + " USD");
				// CHF -> CAD
			} else if (swissselector.equals(swissconversion[1])) {
				double cad = amount * swissexchanges[1] ;
				System.out.println("" + amount + " CHF=" + conversion.format(cad) + " CAD");
				// GBP -> EUR
			} else if (swissselector.equals(swissconversion[2])) {
				double euro = amount *  swissexchanges[2];
				System.out.println("" + amount + " CHF" + conversion.format(euro) + " EUR");
				// CHF->GBP
			} else if (swissselector.equals(swissconversion[3])) {
				double britishpound = amount * swissexchanges[3] ;
				System.out.println("" + amount + " CHF=" + conversion.format(britishpound) + " GBP");
// CHF ->JPY
			} else if (swissselector.equals(swissconversion[4])) {
				double japaneseyen = amount *  swissexchanges[4];
				System.out.println("" + amount + " CHF=" + conversion.format(japaneseyen) + " JPY");
// CHF -> CNY
			}else if(swissselector.equals(swissconversion[5])) {
				double chinayuan = amount * swissexchanges[5] ;
				System.out.println("" + amount + " CHF=" + conversion.format(chinayuan) + " CNY");
// CHF -> HKD
			}else  if(swissselector.equals(swissconversion[6])) {
				double hongkongdollas = amount * swissexchanges[6] ;
				System.out.println("" + amount + " CHF=" + conversion.format(hongkongdollas) + " HKD");
// CHF -> KRW
			}else if(swissselector.equals(swissconversion[7])){
				double skoreanwon = amount *  swissexchanges[7];
				System.out.println("" + amount + " CHF=" + conversion.format(skoreanwon) + " WON");
				// CHF -> INR
			}else if(swissselector.equals(swissconversion[8])){
				double indianrupee = amount *  swissexchanges[8];
				System.out.println("" + amount + " CHF=" + conversion.format(indianrupee) + " INR");
				// CHF-> Australian dollars
			}else if(swissselector.equals(swissconversion[9])) {
				double aussiedoller = amount * swissexchanges[9] ;
				System.out.println("" + amount + " CHF=" + conversion.format(aussiedoller) + " AUD");
				// CHF->NZD
			}else if(swissselector.equals(swissconversion[10])){
				double nzdoller = amount * swissexchanges[10] ;
				System.out.println("" + amount + " CHF=" + conversion.format(nzdoller) + " NZD");
			}


			//if player choses yen
		}
		if (currencyconvert1.equals("Japanese Yen") || currencyconvert1.equals("JPY")) {
			/* japanese yen potential conversions(in a array to store them rather
			how i did it prior(The whole double system.Prints out all currencies rather than specific one)
			 */
			String[] jpycurrencies = {"USD", "EUR","CAD","GBP", "HKD",
									  "CNY", "KRW", "INR", "AUD", "NZD"};
// jpy exchange rates based on jpycurrency array
			double[]  jpyexchangerates = {0.0090709582 ,
					0.0076455768,
					0.01131141,
					0.0065705678,
					0.070413658,
					0.058535032,
					10.294768,
					0.6724442,
					0.012127092,0.013081757};
			System.out.println("Please select a currency of your choice:" + Arrays.toString(jpycurrencies));
			scan.nextLine();
			String jpyselector = scan.nextLine();
// jpy -> usd
			if (jpyselector.equals(jpycurrencies[0])) {
				double murica = amount * jpyexchangerates[0] ;
				System.out.println("" + amount + " JPY=" + conversion.format(murica) + " usd");
// jpy-> euro
			} else if (jpyselector.equals(jpycurrencies[1])) {
				double euro = amount * jpyexchangerates[1] ;
				System.out.println(""+amount+"JPY="+conversion.format(euro)+" EUR");
// JPY -> GBP
			} else if(jpyselector.equals(jpycurrencies[3])){
				double britishpounds = amount *  jpyexchangerates[3];
				System.out.println(""+amount+" JPY="+conversion.format(britishpounds)+" GBP");
				// JPY-> HKD
			}else if(jpyselector.equals(jpycurrencies[4])){
				double hkdollar = amount * jpyexchangerates[4] ;
				System.out.println(""+amount+" JPY="+conversion.format(hkdollar)+" HKD");
				// JPY-> CNY
			}else if(jpyselector.equals(jpycurrencies[5])){
				double chineseyuan =  amount * jpyexchangerates[5];
				System.out.println(""+amount+" JPY="+conversion.format(chineseyuan)+" CNY");
				// JPY->KRW
			}else if(jpyselector.equals(jpycurrencies[6])){
				double skwon =  amount * jpyexchangerates[6];
				System.out.println(""+amount+" JPY="+conversion.format(skwon)+" KRW");
				// JPY->INR
			}else if(jpyselector.equals(jpycurrencies[7])){
				double indianrupee = amount * jpyexchangerates[7];
				System.out.println(""+amount+" JPY="+conversion.format(indianrupee)+" INR");
				// JPY -> AUD
			}else if(jpyselector.equals(jpycurrencies[8])){
				double aussiebucks =  amount * jpyexchangerates[8];
				System.out.println(""+amount+" JPY="+conversion.format(aussiebucks)+" AUD");
				// JPY -> NZD
			}else if(jpyselector.equals(jpycurrencies[9])){
				double nzdollar = amount * jpyexchangerates[9] ;
				System.out.println(""+amount+" JPY="+conversion.format(nzdollar)+" NZD");

// JPY -> CAD
			}else if(jpyselector.equals(jpycurrencies[2])){
				double canadadollar = amount *  jpyexchangerates[2];
				System.out.println(""+amount+" JPY="+conversion.format(canadadollar)+" CAD");
			}





			// chinese yuan conversions
			}if(currencyconvert1.equals("Chinese Yuan")||currencyconvert1.equals("CNY")) {
			String[] chinayuancovert = {"USD",
					"GBP",
					"CAD",
					"EUR",
					"CHF",
					"JPY",
					"HKD",
					"KRW",
					"INR",
					"AUD", "NZD"};


			// chinese currency exchanges
			double[]  chinacurrencyexchanges = {0.15496632,
					0.11225018,
					0.19324172,
					0.1306154,
					0.1430056,
					17.083787,
					1.2029319,
					175.87363 ,
					11.487893,
					0.20717666,0.22348594};


			System.out.println("Please select a currency of your choice" +
					"\n" + Arrays.toString(chinayuancovert));
			scan.nextLine();
			String chinayuanselector = scan.nextLine();
// CNY -> USD
			if(chinayuanselector.equals(chinayuancovert[0])) {
				double usdresult = amount * chinacurrencyexchanges[0] ;
				System.out.println(""+amount+" CNY = "+conversion.format(usdresult)+" USD");
				// CNY -> GBP
			}else if(chinayuanselector.equals(chinayuancovert[1])){
				double britishpoundresults = amount * chinacurrencyexchanges[1] ;
				System.out.println(""+amount+" CNY = "+conversion.format(britishpoundresults)+" GBP");
				// CNY ->cad
			}else if(chinayuanselector.equals(chinayuancovert[2])){
				double cadresults = amount *  chinacurrencyexchanges[2];
				System.out.println(""+amount+" CNY = "+conversion.format(cadresults)+" CAD");
				// CNY -> EUR
			}else if(chinayuanselector.equals(chinayuancovert[3])){
				double euroresults = amount * chinacurrencyexchanges[3] ;
				System.out.println(""+amount+" CNY = "+conversion.format(euroresults)+" EUR");
				// CNY-> CHF
			}else if(chinayuanselector.equals(chinayuancovert[4])){
				double swissyfrancs = amount * chinacurrencyexchanges[4];
				System.out.println(""+amount+" CNY ="+conversion.format(swissyfrancs)+" CHF");
				// CNY-> JPY
			}else if(chinayuanselector.equals(chinayuancovert[5])){
				double japanyenresults = amount * chinacurrencyexchanges[5];
				System.out.println(""+amount+" CNY ="+conversion.format(japanyenresults)+" JPY");
				// CNY -> HKD
			}else if(chinayuanselector.equals(chinayuancovert[6])){
				double hongkongmoney = amount * chinacurrencyexchanges[6] ;
				System.out.println(""+amount+" CNY ="+conversion.format(hongkongmoney)+" HKD");
				// CNY -> KRW
			}else if(chinayuanselector.equals(chinayuancovert[7])){
				double southkoreawon = amount *  chinacurrencyexchanges[7];
				System.out.println(""+amount+" CNY = "+conversion.format(southkoreawon)+" KRW");
				//CNY -> INR
			}else if(chinayuanselector.equals(chinayuancovert[8])){
				double indiarupeeresults = amount * chinacurrencyexchanges[8] ;
				System.out.println(""+amount+" CNY = "+conversion.format(indiarupeeresults)+" INR");
			// CNY -> AUD
			}else if(chinayuanselector.equals(chinayuancovert[9])){
				double aussiedollaresults = amount *  chinacurrencyexchanges[9];
				System.out.println(""+amount+" CNY = "+conversion.format(aussiedollaresults)+" AUD");
				// CNY -> NZD
			}else if(chinayuanselector.equals(chinayuancovert[10])){
				double nzdresults = amount * chinacurrencyexchanges[10];
				System.out.println(""+amount+" CNY ="+conversion.format(nzdresults)+" NZD");


// if player wishes to convert hong kong dollars
			}

			}if(currencyconvert1.equals("Hong Kong Dollar")||currencyconvert1.equals("HKD")) {
			String[] HKDconversions = {"USD", "CAD", "EUR", "GBP", "CHF",
					"\n" + "JPY", "CNY", "KRW", "INR", "AUD", "NZD"};
// currency exchange rates based on  hkd currencies array
			double[] hkcurrencyexchange = {0.12882385,
					0.16064227,
					0.10858088,
					0.093313826,
					0.11888088,
					14.20179,
					0.83130225,
					146.20414,
					9.5499115,
					0.17222642,0.18578436};

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
				System.out.println(""+amount+" HKD ="+conversion.format(chinaconvert)+" CNY");
				// HKD -> KRW
			}else if (hkconverter.equals(HKDconversions[7])){
				double koreanwon = amount * hkcurrencyexchange[7];
				System.out.println(""+amount+" HKD = "+conversion.format(koreanwon)+" KRW");
				// HKD -> INR
			}else if(hkconverter.equals(HKDconversions[8])){
				double rupees = amount * hkcurrencyexchange[8];
				System.out.println(""+amount+" HKD = "+conversion.format(rupees)+" INR");

				// HKD -> AUD
			}else if(hkconverter.equals(HKDconversions[9])){
				double aussiebucks = amount * hkcurrencyexchange[9];
				System.out.println(""+amount+" HKD ="+conversion.format(aussiebucks)+" AUD");
				// HKD -> NZD
			}else if(hkconverter.equals(HKDconversions[10])){
					double nzdollas = amount * hkcurrencyexchange[10];
				System.out.println(""+amount+" HKD ="+conversion.format(nzdollas)+" NZD");
			}
			// if player wishes to use south korean won
		}if(currencyconvert1.equals("KRW")||currencyconvert1.equals("South Korean won")) {
			String[] potientalwonconversions = {"USD", "CAD", "GBP", "EUR", "CHF","JPY", "CNY", "HKD", "INR", "AUD", "NZD"};
				/*Based on potientalwonconversions array. Currency exchange rates of that array
				Order based on the order of currencies. So first is the USD, and goes all the way to NZD
				 */
			double[] currencyresults = {0.0008811231, 0.0010987532, 0.00063824338, 0.00074266622, 0.00081311566,
					0.097136717 , 0.005685896, 0.0068397515, 0.065319022, 0.0011779859, 0.0012707189};

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
				System.out.println(""+amount+" KRW = "+conversion.format(chinayuan)+" CNY");
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
		}if(currencyconvert1.equals("INR") || currencyconvert1.equals("Indian rupee")){
				String[] indianconversions = {"USD", "CAD", "GBP", "EUR", "CHF"+
						"\n","JPY", "CNY", "HKD", "KRW", "AUD", "NZD"};
				/*Based on indianconversions array. Currency exchange rates of that array
				Order based on the order of currencies. So first is the USD, and goes all the way to NZD
				 */
				double[] indianexchangerates = {0.013491 ,
						0.0168279,
						0.00977445,
						0.0113734,
						0.0124493,
						1.48773,
						0.0870872,
						0.104741,
						15.3159,
						0.0180426, 0.0194577};

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
					System.out.println(""+amount+" INR = "+conversion.format(chinayuan)+" CNY ");
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

		}if(currencyconvert1.equals("AUD") || currencyconvert1.equals("Australian Dollar")){
			//  Player choices when choosing australian dollars
				String[] aussieconversions = {"USD", "CAD", "GBP", "EUR", "CHF"+
						"\n","JPY", "CNY", "HKD", "INR", "KRW", "NZD"};
				/*Based on indianconversions array. Currency exchange rates of that array
				Order based on the order of currencies. So first is the USD, and goes all the way to NZD
				 */
				double[] aussieexchangerates = {0.74786779  ,
						0.93264513,
						0.54169693,
						0.63036016,
						0.68989251 ,
						82.453305 ,
						4.8260616,
						5.8039562,
						55.423019,
						848.88694, 1.0785421};

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
					double chinayuan = amount *aussieexchangerates[6];
					System.out.println(""+amount+" AUD = "+conversion.format(chinayuan)+" CNY ");
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

			}if(currencyconvert1.equals("NZD")||currencyconvert1.equals("New Zealand Dollar")){

			//  Player choices when choosing australian dollars
			String[] nzdconversions = {"USD", "CAD", "GBP", "EUR", "CHF"+
					"\n","JPY", "CNY", "HKD", "INR", "KRW", "AUD"};
				/*Based on newleazandconversions array. Currency exchange rates of that array
				Order based on the order of currencies. So first is the USD, and goes all the way to NZD
				 */
			double[] nzdexchangerates = {0.69343394  ,
					0.86476732,
					0.50229558,
					0.58448133,
					0.63973472 ,
					76.437699 ,
					4.4747442,
					5.3831017,
					51.411522 ,
					787.03819, 0.92694341};
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
				double chinayuan = amount *  nzdexchangerates[6];
				System.out.println(""+amount+" NZD = "+conversion.format(chinayuan)+" CNY ");
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
		}
		}
	}