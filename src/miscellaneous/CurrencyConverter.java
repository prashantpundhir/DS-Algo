package miscellaneous;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double cur = 25.60;
		Locale indiaLocale = new Locale("en", "IN");
		
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		
		
		System.out.println("US: " + us.format(cur));
		System.out.println("India: " + india.format(cur));
		System.out.println("China: " + china.format(cur));
		System.out.println("France: " + france.format(cur));

	}

}
