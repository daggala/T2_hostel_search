package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NrBedsPanel implements ActionListener {
	
	private int nrOfBeds;
	
	
	public JPanel nrBedsPanelMaker() {
		
		JPanel nrBedPanel = new JPanel();
		JLabel nrBedLabel = new JLabel("Pick number of guests : ");
		String comboBoxItems[] = {"SELECT", "1", "2", "3","4","5","6","7","8","9" };
		JComboBox nrBedsCombo = new JComboBox(comboBoxItems);
		
		nrBedsCombo.addActionListener(this);
		
		nrBedPanel.add(nrBedLabel);
		nrBedPanel.add(nrBedsCombo);
		
		
		return nrBedPanel;
	}
	
	public int getNrBeds() {
		return nrOfBeds;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 JComboBox combo = (JComboBox)e.getSource();
		 String chosenNrOfBeds = (String)combo.getSelectedItem();
		 this.nrOfBeds = Integer.parseInt(chosenNrOfBeds);
		 
		 System.out.println(nrOfBeds);
	}

}
