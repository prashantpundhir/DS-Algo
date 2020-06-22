package miscellaneous;

import java.time.LocalDate;

public class DayFromDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int yy= 20;
		int mm= 06;
		int dd= 27;
		
		System.out.println(LocalDate.of(yy, mm, dd).getDayOfWeek().name());

	}

}
