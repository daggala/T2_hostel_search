package hotelSearch;

import java.util.ArrayList;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class StayLength {
	
		private int arrivalYear;
		private int arrivalMonth;
		private int arrivalDate;
		private int departureYear;
		private int departureMonth;
		private int departureDate;
		private DateTime start;
		private DateTime end;
		
		private ArrayList<String> datesOfStay;
		
		public StayLength(int arrYear, int arrMonth, int arrDate, int depYear, int depMonth, int depDate){
		
			arrivalYear = arrYear;
			arrivalMonth = arrMonth;
			arrivalDate = arrDate;
			departureYear = depYear;
			departureMonth = depMonth;
			departureDate = depDate;
			start = new DateTime(this.arrivalYear, this.arrivalMonth, this.arrivalDate, 0, 0, 0, 0);
			end = new DateTime(this.departureYear, this.departureMonth, this.departureDate, 0, 0, 0, 0);
		}
		
		public int getArrYear() {
			return arrivalYear;
		}

		public int getArrMonth() {
			return arrivalMonth;
		}

		public int getArrDay() {
			return arrivalDate;
		}

		public int getDepYear() {
			return departureYear;
		}

		public int getDepMonth() {
			return departureMonth;
		}

		public int getDepDay() {
			return departureDate;
		}
		
		//Returns number of days the guest requests
		public int getDuration(){
			
			Days d = Days.daysBetween(start, end);
			int days = d.getDays();
			
			return days;
		}
		
		//Returns string list of all dates requested on this form "010615" 
		public ArrayList<String> getDatesOfStay(){
			
			datesOfStay = new ArrayList();
		
			DateTimeFormatter fmt = DateTimeFormat.forPattern("ddMMyy");
			
			for(int i=0; i<= getDuration(); i++){
				
				DateTime d = start.plusDays(i);
				
			    String dayString = fmt.print(d);
			    
			    datesOfStay.add(dayString);
			
			}

			return datesOfStay;
		}
}

