package hotelSearch;



import org.joda.time.DateTime;
import org.joda.time.Days;



public class StayLength {
	
		private int arrivalYear;
		private int arrivalMonth;
		private int arrivalDate;
		private int departureYear;
		private int departureMonth;
		private int departureDate;
		private DateTime start;
		private DateTime end;
		
		public StayLength(int arrYear, int arrMonth, int arrDate, int depYear, int depMonth, int depDate){
		
			arrivalYear = arrYear;
			arrivalMonth = arrMonth;
			arrivalDate = arrDate;
			departureYear = depYear;
			departureMonth = depMonth;
			departureDate = depDate;
		}
		
		public int getArrYear(){
			return arrivalYear;
		}
		public int getArrMonth(){
			return arrivalMonth;
		}
		public int getArrDate(){
			return arrivalDate;
		}
		public int getDepYear(){
			return departureYear;
		}
		public int getDepMonth(){
			return departureMonth;
		}
		public int getDepDate(){
			return departureDate;
		}
		
		
		public int getTotalDays(){
			
			start = new DateTime(this.arrivalYear, this.arrivalMonth, this.arrivalDate, 0, 0, 0, 0);
			end = new DateTime(this.departureYear, this.departureMonth, this.departureDate, 0, 0, 0, 0);
			Days d = Days.daysBetween(start, end);
			int days = d.getDays();
			
			return days;
		}
		
		
}

