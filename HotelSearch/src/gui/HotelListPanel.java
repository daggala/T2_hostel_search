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
		
		for (int i = 0; i< hotels.size(); i++) {
		

			hotelPanel[i] = new JPanel();
		//	hotelPanel[i].setLayout(BorderLayout.CENTER);
			
		//	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
			hotelButton[i] = new JButton("Choose");
			
			Hotel hotel = hotels.get(i);
			//String hotel = hotels.get(i).toString();
			
			int hotelId = hotel.getHotelID();
			String hotelName = hotel.getHotelName();
			
			
			JLabel Idlabel = new JLabel(String.valueOf(hotelId));
			JLabel nameLabel = new JLabel(hotelName);
		//	label.add(hotel);
			hotelPanel[i].add(Idlabel);
			hotelPanel[i].add(nameLabel);
			
		//	hotelPanel[i].add(label, hotel);
			
			
			hotelListPanel.add(hotelPanel[i]);
			hotelListPanel.add(hotelButton[i]);
			
			System.out.println(i);
			System.out.println(hotelId);
			
		}
		
		return hotelListPanel;
	}

	
/*	@Override
	public String toString() {
		
		
	    return "Player: " + player + "; Category: " + category 
	        + "; Question: " + question + "; Answer: " + answer
	        + "; Score: " + score;
	}
	 */
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
