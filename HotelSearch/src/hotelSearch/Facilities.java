package hotelSearch;

import java.util.HashMap;
import java.util.Map;


public class Facilities {
	
	private int alwaysOpen;
	private int bar;
	private int wifi; 
	private int ensuite;
	private int tv;
	private HashMap allFacs = new HashMap();
	
	public Facilities(int alwaysOpen, int bar, int Wifi, int enSuite, int tv){
		this.alwaysOpen = alwaysOpen;
		this.bar = bar;
		this.wifi = wifi;
		this.ensuite = ensuite;
		this.tv = tv;
			
	}
	
	public int isAlwaysOpen(){
		return alwaysOpen;
	}
	
	public int isBar(){
		return bar;
	}
	
	public int isWifi(){
		return wifi;
	}
	
	public int isEnsuite(){
		return ensuite;
	}
	
	public int isTV(){
		return tv;
	}
	
	public HashMap getAllFacs(){
		
		//setja inn tv, etc...
		return allFacs;
		
		
	}
}
