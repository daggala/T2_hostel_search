package hotelSearch;

public class CheckDate {
	private StayLength stayLength;
	public CheckDate(StayLength stayLength){
		this.stayLength = stayLength;
	}
	public boolean isValid(){
		boolean isValid = true;
		
		if(stayLength.getArrMonth() == 2 && stayLength.getArrDay() > 28){
			isValid = false;
		}
		if(stayLength.getDepMonth() == 2 && stayLength.getDepDay() > 28){
			isValid = false;
		}
		if((stayLength.getArrMonth() == 4 || stayLength.getArrMonth() == 6 || stayLength.getArrMonth() == 9 || stayLength.getArrMonth() == 11)&& stayLength.getArrDay() > 30){
			isValid = false;
		}
		if((stayLength.getDepMonth() == 4 || stayLength.getDepMonth() == 6 || stayLength.getDepMonth() == 9 || stayLength.getDepMonth() == 11)&& stayLength.getDepDay() > 30){
			isValid = false;
		}
		if(stayLength.getArrMonth() > stayLength.getDepMonth()){
			isValid = false;
		}
		if((stayLength.getArrMonth() == stayLength.getDepMonth()) && (stayLength.getArrDay() > stayLength.getDepDay())){
			isValid = false;
		}
		if(stayLength.getDuration() > 20){
			isValid = false;
		}
		return isValid;
	}
}