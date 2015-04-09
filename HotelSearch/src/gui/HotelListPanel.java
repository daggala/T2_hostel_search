package gui;

import hotelSearch.*;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class HotelListPanel implements ActionListener{
	
	
	
	public JPanel makeHotelListPanel(ArrayList<Hotel> hotels) {
		
		BorderLayout layout = new BorderLayout();
			
		JLabel hotelListLabel = new JLabel("List of results:");
	
		JPanel hotelListPanel = new JPanel();
	//	hotelListPanel.setLayout(layout);
		
		hotelListPanel.add(hotelListLabel, BorderLayout.NORTH);
		System.out.println("ég fór í hótellistpanel");
		
		JPanel[] hotelPanel = new JPanel[hotels.size()];
		//hotelPanel[hotels.size()].setLayout(new BoxLayout(hotelPanel, BoxLayout.Y_AXIS));
		hotelListPanel.setLayout(new BoxLayout(hotelListPanel, BoxLayout.PAGE_AXIS));
		JButton[] hotelButton = new JButton[hotels.size()];
		
			
		if (hotels.size() == 0) {
			//JLabel hotelListEmptyLabel = new JLabel("No hotels");
		//	hotelPanel[0].add(hotelListEmptyLabel);
		}
		
		else {
		
			for (int i = 0; i< hotels.size(); i++) {
			
	
				hotelPanel[i] = new JPanel();
		
				hotelButton[i] = new JButton("Book");
				hotelButton[i].addActionListener(this);
				
				Hotel hotel = hotels.get(i);
				
				
				int hotelId = hotel.getHotelID();
				String hotelName = hotel.getHotelName();
				
				
				//JLabel Idlabel = new JLabel(String.valueOf(hotelId));
				JLabel nameLabel = new JLabel(hotelName);
				hotelPanel[i].add(nameLabel);
		
				
				hotelListPanel.add(hotelPanel[i]);
				hotelListPanel.add(hotelButton[i]);
				
				System.out.println(i);
				System.out.println(hotelId);
				
			}
			
		}
		
		return hotelListPanel;
	}

	public void clearPanel(ArrayList<Hotel> hotels) {
		hotels = null;
		makeHotelListPanel(hotels);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("ÞAÐ VAR ÝTT MÉR");
		
	}

}
