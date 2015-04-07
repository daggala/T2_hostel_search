package gui;

import hotelSearch.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class HotelListPanel implements ActionListener{
	
	public JPanel makeHotelListPanel(Request request) throws ConnectException{
		JPanel hotelListPanel = new JPanel();
		JLabel hotelListLabel = new JLabel("Listi af hótelum");
		
		ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
		HotelSearch hotelSearch = new HotelSearch();
		hotelSearch.makeQuery(request);
		hotelList = hotelSearch.getMatchingHotelsFromDB(request);
		
		System.out.println(hotelList.get(0).getHotelName());
		
		hotelListPanel.add(hotelListLabel);
	
		JPanel locationPanel = new JPanel();
		JLabel locationLabel = new JLabel("Choose destination : ");
		String comboBoxItems[] = {"SELECT", "Reykjavik", "Akureyri", "Ísafjörður", "Höfn", "Egilsstaðir"};
		JComboBox locationCombo = new JComboBox(comboBoxItems);
		
		locationCombo.addActionListener(this);
		
		locationPanel.add(locationLabel);
		locationPanel.add(locationCombo);	
		
		return hotelListPanel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
