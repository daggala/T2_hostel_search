package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LocationPanel implements ActionListener  {

	private String location;
	
	public JPanel locationPanelMaker() {
			
			JPanel locationPanel = new JPanel();
			JLabel locationLabel = new JLabel("Choose destination : ");
			String comboBoxItems[] = {"SELECT", "Reykjavik", "Akureyri", "Isafjordur", "Hofn", "Egilsstadir"};
			JComboBox locationCombo = new JComboBox(comboBoxItems);
			
			locationCombo.addActionListener(this);
			
			locationPanel.add(locationLabel);
			locationPanel.add(locationCombo);
			
			
			return locationPanel;
		}
	
	
	public String getLocation() {
		return location;
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// Get the value from combobox here
				 JComboBox combo = (JComboBox)e.getSource();
				 String chosenLocation = (String)combo.getSelectedItem();
				 this.location = chosenLocation;
				 System.out.println(location);
		
	}

}
