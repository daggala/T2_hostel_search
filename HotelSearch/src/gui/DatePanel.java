package gui;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;



/*
 *  
 *  Bannað að velja fleiri en 20 daga'
 *  
 * 
 *  */

public class DatePanel implements ActionListener {
	
	private int arrMonth, arrDay, depMonth, depDay;
	private JComboBox arrDayCombo;

	public JPanel datePanelMaker() {
		
		Integer[] arrDaysCB = new Integer[32];
		Integer[] depDaysCB = new Integer[32];
		String[] arrMonthCB = {"SELECT", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String[] depMonthCB = {"SELECT", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		for(int i = 0; i<arrDaysCB.length; i++) {
			arrDaysCB[i] = i;
			depDaysCB[i] = i;
			} 

		
		JPanel datePanel = new JPanel();
		
		
		JLabel arrLabel = new JLabel("Choose arrival date : ");
		JLabel depLabel = new JLabel("Choose departure date : ");
		
		final JComboBox arrDayCombo = new JComboBox(arrDaysCB);
		final JComboBox depDayCombo = new JComboBox(depDaysCB);
		final JComboBox arrMonthCombo = new JComboBox(arrMonthCB);
		final JComboBox depMonthCombo = new JComboBox(depMonthCB);
		
		arrDayCombo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e){
				Integer chosenDay = (Integer) arrDayCombo.getSelectedItem();
				arrDay = chosenDay;
				
			}
		} );
		
		
		depDayCombo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e){
				Integer chosenDay = (Integer) depDayCombo.getSelectedItem();
				depDay = chosenDay;
			}
		} );
		
		arrMonthCombo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e){
				String chosenMonth = (String) arrMonthCombo.getSelectedItem();
				if (chosenMonth == "January") {
					arrMonth = 1;
				}
				if (chosenMonth == "February") {
					arrMonth = 2;
				}
				if (chosenMonth == "March") {
					arrMonth = 3;
				}
				if (chosenMonth == "April") {
					arrMonth = 4;
				}
				if (chosenMonth == "May") {
					arrMonth = 5;
				}
				if (chosenMonth == "June") {
					arrMonth = 6;
				}
				if (chosenMonth == "July") {
					arrMonth = 7;
				}
				if (chosenMonth == "August") {
					arrMonth = 8;
				}
				if (chosenMonth == "September") {
					arrMonth = 9;
				}
				if (chosenMonth == "October") {
					arrMonth = 10;
				}
				if (chosenMonth == "November") {
					arrMonth = 11;
				}
				if (chosenMonth == "December") {
					arrMonth = 12;
				}
			}
		} );
		
		depMonthCombo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e){
				String chosenMonth = (String) depMonthCombo.getSelectedItem();
				if (chosenMonth == "January") {
					depMonth = 1;
				}
				if (chosenMonth == "February") {
					depMonth = 2;
				}
				if (chosenMonth == "March") {
					depMonth = 3;
				}
				if (chosenMonth == "April") {
					depMonth = 4;
				}
				if (chosenMonth == "May") {
					depMonth = 5;
				}
				if (chosenMonth == "June") {
					depMonth = 6;
				}
				if (chosenMonth == "July") {
					depMonth = 7;
				}
				if (chosenMonth == "August") {
					depMonth = 8;
				}
				if (chosenMonth == "September") {
					depMonth = 9;
				}
				if (chosenMonth == "October") {
					depMonth = 10;
				}
				if (chosenMonth == "November") {
					depMonth = 11;
				}
				if (chosenMonth == "December") {
					depMonth = 12;
				}
			}
		} );
		
		
		datePanel.add(arrLabel);
		datePanel.add(arrDayCombo);
		datePanel.add(arrMonthCombo);
		datePanel.add(depLabel);
		datePanel.add(depDayCombo);
		datePanel.add(depMonthCombo);
		
		return datePanel;
	}
	
	public int getArrDay() {
		return arrDay;
	}
	
	public int getArrMonth() {
		return arrMonth;
	}
	
	public int getDepDay() {
		return depDay;
	}
	
	public int getDepMonth() {
		return depMonth;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
 
}
