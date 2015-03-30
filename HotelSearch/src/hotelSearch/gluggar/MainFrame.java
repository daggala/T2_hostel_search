package hotelSearch.gluggar;



import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class MainFrame implements ActionListener {
	
	private static JFrame mainFrame;
	private JPanel mainGUI;
	private static JPanel searchPanel;
	private static JPanel resultPanel;
	private JLabel headerLabel;
	private JButton searchBtn;
	//private static CardLayout cardlayout;
	private static Container contentPane;
	JPanel cards; //a panel that uses CardLayout
	
	/*public MainFrame() {
		
		CardLayout cardlayout = new CardLayout();
		Container contentPane = mainFrame.getContentPane();
		JFrame mainFrame = new JFrame("Hotel Search Engine");
	}
	 */
	
	
	// make the first window
	public JPanel makeSearchPanel() {
		
		JPanel searchPanel = new JPanel();
		searchPanel.setLayout(new BoxLayout(searchPanel, BoxLayout.PAGE_AXIS));
		
		/*Header info*/
		JPanel headerPanel = new JPanel();
		JLabel headerLabel = new JLabel("Welcome! Pick a desired hotel");
		headerPanel.add(headerLabel);
		
		/*Location drop down menu*/
		JPanel locationPanel = new JPanel();
		String comboBoxItems[] = {"SELECT", "Reykjavík", "Akureyri", "Ísafjörður", "Höfn"};
		JComboBox locationCombo = new JComboBox(comboBoxItems);
		locationPanel.add(locationCombo);

		
	
		/*Dates, dropdown?*/
		// GEYMA
		
		/*Facilities check box*/
		JPanel facPanel = new JPanel();
		final JCheckBox chkTV = new JCheckBox("TV");
		final JCheckBox chkEnSuite = new JCheckBox("En Suite");
		final JCheckBox chkWifi = new JCheckBox("WIFI");
		
		facPanel.add(chkTV);
		facPanel.add(chkEnSuite);
		facPanel.add(chkWifi);
		
		/*Price range check box*/
		JPanel pricePanel = new JPanel();
		
		final JCheckBox price1 = new JCheckBox("1");
		final JCheckBox price2 = new JCheckBox("2");
		final JCheckBox price3 = new JCheckBox("3");
		
		pricePanel.add(price1);
		pricePanel.add(price2);
		pricePanel.add(price3);
		
		JButton searchBtn = new JButton("Search"); 
		searchBtn.addActionListener(this);
		
		
		searchPanel.add(headerPanel);
		searchPanel.add(locationPanel);
		searchPanel.add(facPanel);
		searchPanel.add(pricePanel);
		searchPanel.add(searchBtn);
		

		return searchPanel;
	}
	
	
	
	
	public JPanel makeResultPanel() {
		JPanel resultPanel = new JPanel();
		JLabel resultLabel = new JLabel("List of available hotels");
		
		resultPanel.add(resultLabel);
		
		return resultPanel;
	
	}
	
	private void addComponentToPane(Container pane) {
		// TODO Auto-generated method stub
		
		//Create the "cards".
        JPanel card1 = new JPanel();
        card1.add(makeSearchPanel());
        
        JPanel card2 = new JPanel();
        card2.add(makeResultPanel());
        
      //Create the panel that contains the "cards".
        cards = new JPanel(new CardLayout());
        cards.add(card1, "1");
        cards.add(card2, "2");
        
        pane.add(cards);
		
	}
	
	     
	 /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
	public static void createAndShowGUI() {		
		//Create and set up the window.
        JFrame frame = new JFrame("Hotel Search Engine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        //Create and set up the content pane.
        MainFrame demo = new MainFrame();
        demo.addComponentToPane(frame.getContentPane());
         
        //Display the window.
        frame.setSize(400, 400);
        frame.setVisible(true);
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("haha");
		//searchPanel.setVisible(false);
		CardLayout cardlayout = new CardLayout();
		
		//resultPanel.setVisible(true);
		cardlayout.next(contentPane); 
	} 
}
