package pre218;

import java.util.Calendar;
import java.util.TimeZone;

public class DateAndTime {

//	public static void main(String[] args) {
//		int year = 2020;
//		int month = 0;
//		int date = 10;
		
//		Calendar cal = Calendar.getInstance();
//		cal.clear();
//		cal.set(Calendar.YEAR, year);
//		cal.set(Calendar.MONTH,  month);
//		cal.set(Calendar.DATE, date);
//		System.out.println(cal.getTime());
//	}
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.get(Calendar.YEAR);
		cal.get(Calendar.MONTH);
		cal.get(Calendar.DATE);
		System.out.println(cal.getTime());
	}
	
//	public static void main(String[] args) {
//		Calendar calNewYork = Calendar.getInstance();
//		calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
//		
//		System.out.println();
//		System.out.println(calNewYork.get(Calendar.HOUR_OF_DAY) + "/" + calNewYork.get(Calendar.MINUTE) + "/" + calNewYork.get(Calendar.SECOND));
//		System.out.println(calNewYork.getActualMaximum(Calendar.DAY_OF_MONTH));
//		System.out.println(calNewYork.get((Calendar.MONTH).atDay(22).getDayOfWeek().name());
//		
//	}
}
