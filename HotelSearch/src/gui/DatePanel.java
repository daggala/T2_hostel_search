package gui;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;



/*
 * ATH að melda fyrir því að júní er 30 dagar og júlí 31, þannig ða dropdown verður
 *  að vita að júní er 30
 *  
 *  Melda fyrir að arr sé ekki á eftir dep
 *  
 *  Bannað að velja fleiri en 20 daga'
 *  
 *  Eitthvað skrýtið gerist í DB þegar við veljum dagsetningar sem eru ekki til
 *  */

public class DatePanel implements ActionListener {
	
	private int arrMonth, arrDay, depMonth, depDay;
	private JComboBox arrDayCombo;

	public JPanel datePanelMaker() {
		
		Integer[] arrDaysCB = new Integer[31];
		Integer[] depDaysCB = new Integer[31];
		String[] arrMonthCB = {"SELECT", "June", "July"};
		String[] depMonthCB = {"SELECT", "June", "July"};
		
		for(int i = 0; i<arrDaysCB.length; i++) {
			arrDaysCB[i] = i+1;
			depDaysCB[i] = i+1;
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
				if (chosenMonth == "June") {
					arrMonth = 6;
				}
				else { 
					arrMonth = 7; 
				}
			}
		} );
		
		depMonthCombo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e){
				String chosenMonth = (String) depMonthCombo.getSelectedItem();
				if (chosenMonth == "June") {
					depMonth = 6;
				}
				else { 
					depMonth = 7; 
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
