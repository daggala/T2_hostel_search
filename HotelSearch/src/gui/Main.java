package gui;

import javax.swing.*;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainFrame.createAndShowGUI();
			}
		});
	}
}