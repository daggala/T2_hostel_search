package gui;

import hotelSearch.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class HotelListPanel implements ActionListener{
	
	public JPanel makeHotelListPanel(ArrayList<Hotel> hotels) {
		JPanel hotelListPanel = new JPanel();
		
		System.out.println("ég fór í hótellistpanel");
		JLabel hotelListLabel = new JLabel("Listi af h��telum");
		
		
		JPanel[] hotel = new JPanel[hotels.size()];
		
		for (int i = 0; i< hotels.size(); i++) {
			JLabel label = new JLabel("OMG");
			hotel[i] = new JPanel();
			
			hotel[i].add(label);
			
			System.out.println(hotels.get(i));
			hotelListPanel.add(hotel[i]);
			
			System.out.println(i);
		}
		
		
		
		
		hotelListPanel.add(hotelListLabel);
		
	
		
	
		return hotelListPanel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
