package hotelSearch;

public class PriceGroup {
	private boolean one;
	private boolean two;
	private boolean three; 

	public PriceGroup(boolean one, boolean two, boolean three){
		this.one = one;
		this.two = two;
		this.three = three;

	}
	
	public boolean isInPricegroupOne(){
		return one;
	}
	
	public boolean isInPricegroupTwo(){
		return two;
	}
	
	public boolean isInPricegroupThree(){
		return three;
	}
}
