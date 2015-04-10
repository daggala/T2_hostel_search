package hotelSearch;

public class CheckDate {
	private StayLength stayLength;
	public CheckDate(StayLength stayLength){
		this.stayLength = stayLength;
	}
	public boolean isValidDate(){
		boolean isValid = true;	
		if(stayLength.getArrMonth() > stayLength.getDepMonth()){
			isValid = false;
		}
		if((stayLength.getArrMonth() == stayLength.getDepMonth()) && (stayLength.getArrDay() > stayLength.getDepDay())){
			isValid = true;
		}
		return isValid;
	}
	public boolean isValidDuration(){
		boolean isValid = true;
		if(stayLength.getDuration() > 20){
			isValid = false;
		}
		return isValid;
	}
}