package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PricePanel implements ItemListener {

	private boolean price1, price2, price3;
	private JCheckBox price1CB = new JCheckBox("1");
	private JCheckBox price2CB = new JCheckBox("2");
	private JCheckBox price3CB = new JCheckBox("3");
	
	public JPanel pricePanelMaker() {
		
		/*Price range check box*/
		JPanel pricePanel = new JPanel();
		JLabel priceLabel = new JLabel("Price range : ");
		
		price1CB.addItemListener(this);
		price2CB.addItemListener(this);
		price3CB.addItemListener(this);
		
		pricePanel.add(priceLabel);
		pricePanel.add(price1CB);
		pricePanel.add(price2CB);
		pricePanel.add(price3CB);
		
		return pricePanel;
	}
	
	public boolean getPrice1() {
		
		return price1;
	}
	
	public boolean getPrice2() {
		return price2; 
	}
	
	public boolean getPrice3() {
		return price3;
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
		
		if (e.getItemSelectable() ==  price1CB) {
			if (checked) { 
				price1 = true;
			}
			else {
				price1 = false;	
			}
		}
		
		if (e.getItemSelectable() ==  price2CB) {
			if (checked) { 
				price2 = true;
			}
			else {
				price2 = false;	
			}
		}
		if (e.getItemSelectable() ==  price3CB) {
			if (checked) { 
				price3 = true;
			}
			else {
				price3 = false;		
			}
		}	
	}
}
