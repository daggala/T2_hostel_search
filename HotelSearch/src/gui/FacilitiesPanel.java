package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FacilitiesPanel implements ItemListener {

	private JCheckBox chkTVCB = new JCheckBox("TV");
	private JCheckBox chkEnSuiteCB = new JCheckBox("En Suite");
	private JCheckBox chkWifiCB = new JCheckBox("WIFI"); 
	private JCheckBox chkOpenAllHoursCB = new JCheckBox("24h rezi");
	private JCheckBox chkBarCB = new JCheckBox("Bar"); 
	
	private boolean chkTV, chkEnSuite, chkWifi, chkOpenAllHours, chkBar;
	
	public JPanel facPanelMaker() {
		
		JPanel facPanel = new JPanel();
		JLabel facLabel = new JLabel("Facilities : ");
		
		chkTVCB.addItemListener(this);
		chkEnSuiteCB.addItemListener(this);
		chkWifiCB.addItemListener(this);
		chkOpenAllHoursCB.addItemListener(this);
		chkBarCB.addItemListener(this);
		
		facPanel.add(facLabel);
		facPanel.add(chkTVCB);
		facPanel.add(chkEnSuiteCB);
		facPanel.add(chkWifiCB); 
		facPanel.add(chkOpenAllHoursCB);
		facPanel.add(chkBarCB);
		
		return facPanel;
	}
	
	
	public boolean getTV() {
		return chkTV;
	}
	
	public boolean getEnSuite() {
		return chkEnSuite;
	}
	
	public boolean getWifi() {
		return chkWifi;
	}
	
	public boolean getOpenAllHours() {
		return chkOpenAllHours;
	}

	public boolean getBar() {
		return chkBar;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		boolean checked = false;
		
		if (e.getStateChange() == ItemEvent.DESELECTED) {
			checked = false;
        }
        else
        {
        	checked = true;
        }
		
		
		if (e.getItemSelectable() ==  chkTVCB) {
			if (checked) { 
				chkTV = true;
			}
			else {
				chkTV = false;
				
			}
		}
		if (e.getItemSelectable() ==  chkEnSuiteCB) {
			if (checked) { 
				chkEnSuite = true;
			}
			else {
				chkEnSuite = false;
			}
		}
		
		
		if (e.getItemSelectable() ==  chkWifiCB) {
			if (checked) { 
				chkWifi = true;
			}
			else {
				chkWifi = false;
			}
		}
		
		if (e.getItemSelectable() ==  chkOpenAllHoursCB) {
			if (checked) { 
				chkOpenAllHours = true;
			}
			else {
				chkOpenAllHours = false;
			}
		}
		
		if (e.getItemSelectable() ==  chkBarCB) {
			if (checked) { 
				chkBar = true;
			}
			else {
				chkBar = false;
			}
		}
	}
}
