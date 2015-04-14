package gui;

import hotelSearch.*;

import javax.swing.*;

import org.joda.time.IllegalFieldValueException;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MainFrame implements ActionListener {
	

	JPanel cards; //a panel that uses CardLayout
	private Container container;
	private Request request;
	private ArrayList<Hotel> hotels = new ArrayList<Hotel>();
	
	LocationPanel locPanel = new LocationPanel();
	DatePanel datePanel = new DatePanel();
	FacilitiesPanel facPanel = new FacilitiesPanel();
	PricePanel pricePanel = new PricePanel();
	NrBedsPanel nrBedPanel = new NrBedsPanel();

	
	// make the first window
	public JPanel makeSearchPanel() {
		
		JPanel searchPanel = new JPanel();
		searchPanel.setLayout(new BoxLayout(searchPanel, BoxLayout.PAGE_AXIS));
		
		/*Header info*/
		JPanel headerPanel = new JPanel();
		JLabel headerLabel = new JLabel("Welcome! Pick a desired hotel");
		headerPanel.add(headerLabel);

		JButton searchBtn = new JButton("Search"); 
		searchBtn.addActionListener(this);
		
		
		searchPanel.add(headerPanel);
		searchPanel.add(locPanel.locationPanelMaker());
		searchPanel.add(datePanel.datePanelMaker());
		searchPanel.add(nrBedPanel.nrBedsPanelMaker());
		searchPanel.add(facPanel.facPanelMaker());
		searchPanel.add(pricePanel.pricePanelMaker());
		searchPanel.add(searchBtn);
		
	
		return searchPanel;
	}
	
	public JPanel makeResultPanel(){
		JPanel resultPanel = new JPanel();
		JLabel resultLabel = new JLabel();
		
		JButton backButton = new JButton("Back");
		JButton forwardButton = new JButton("Forward");
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(backButton);
		buttonPanel.add(forwardButton);
		
		backButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                CardLayout cardLayout = (CardLayout) cards.getLayout();
                cardLayout.first(cards);
            }
        });
		
		
		forwardButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                CardLayout cardLayout = (CardLayout) cards.getLayout();
                cardLayout.next(cards);
            }
        });
		
		BorderLayout layout = new BorderLayout();
		resultPanel.setLayout(layout);
		resultPanel.add(makeHotelListPanel(hotels, request), BorderLayout.CENTER);
		resultPanel.add(buttonPanel, BorderLayout.SOUTH);
		resultPanel.add(resultLabel, BorderLayout.NORTH);
		
		
		
		return resultPanel;
	}
	
	
	
	public JPanel makeHotelListPanel(final ArrayList<Hotel> hotels, final Request request) {
		this.hotels = hotels;
		this.request = request;
					
		JLabel hotelListLabel = new JLabel("List of results:");
	
		JPanel hotelListPanel = new JPanel();
		
		hotelListPanel.add(hotelListLabel, BorderLayout.NORTH);
		
		JPanel[] hotelPanel = new JPanel[hotels.size()];
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
				hotelButton[i].setActionCommand(Integer.toString(i));
				hotelButton[i].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						String cmd = e.getActionCommand();
						Hotel hotel = hotels.get(Integer.parseInt(cmd));
						BookingController book = new BookingController();
						try {
							book.reduceAvailability(hotel, request);
							JPanel card3 = new JPanel();
						    card3.add(makeBookingPanel());
						    cards.add(card3, "3");
							CardLayout cardLayout = (CardLayout) cards.getLayout();
					        cardLayout.last(cards);  
						} catch (ConnectException e1) {
							JOptionPane.showMessageDialog(null, "Booking was not successful");
						}
						
					}
					
				});
				
				Hotel hotel = hotels.get(i);
				
				String hotelName = hotel.getHotelName();
				
				
				JLabel nameLabel = new JLabel(hotelName);
				hotelPanel[i].add(nameLabel);
				
				hotelListPanel.add(hotelPanel[i]);
				hotelListPanel.add(hotelButton[i]);
				
			}
		}
		return hotelListPanel;
	}
	
	
	public JPanel makeBookingPanel() {
		JPanel bookingPanel = new JPanel();
		JLabel bookingLabel = new JLabel("Booking successful");
		
		JButton backButton = new JButton("Back");

		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(backButton);
		
		backButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                CardLayout cardLayout = (CardLayout) cards.getLayout();
                cardLayout.first(cards);  
            }
        });
		
		
		bookingPanel.add(bookingLabel, BorderLayout.NORTH);
		bookingPanel.add(buttonPanel, BorderLayout.SOUTH);
		return bookingPanel;
	}
	
	private void addComponentToPane(Container pane) {
		
		//Create the "cards".
        JPanel card1 = new JPanel();
        card1.add(makeSearchPanel());
        
        
      //Create the panel that contains the "cards".
        cards = new JPanel(new CardLayout());
        cards.add(card1, "1");
        
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
        MainFrame contentPane = new MainFrame();
        contentPane.addComponentToPane(frame.getContentPane());
       
        //Display the window.
        frame.setSize(800, 400);
        frame.setVisible(true);
		
	}
	
	/*bætti try og catch */
	public static Request constructRequest(Facilities fac, StayLength day, double beds, String loc, PriceGroup price) throws InvalidTotalBedsException{
		Request req = null;
		if(beds != 0) {
			req = new Request(loc, day, beds);
			req.addFacilities(fac);
			req.addPriceGroup(price);
		}
		else  {
			throw new InvalidTotalBedsException();
		}
		
		return req;
	} 

	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int TV = facPanel.getTV()? 1 : 0;
		int bar = facPanel.getBar()? 1 : 0;
		int wifi = facPanel.getWifi()? 1: 0;
		int allHours = facPanel.getOpenAllHours()? 1: 0;
		int toilet = facPanel.getEnSuite()? 1: 0;
		
		
		Facilities facilities = new Facilities(allHours,bar,wifi,toilet,TV);
		PriceGroup pricegroup = new PriceGroup(pricePanel.getPrice1(), pricePanel.getPrice2(), pricePanel.getPrice3());
		StayLength day = null;
		try{
			day = new StayLength(2015, datePanel.getArrMonth(), datePanel.getArrDay(), 2015, datePanel.getDepMonth(), datePanel.getDepDay());

		} catch(IllegalFieldValueException e2){
			JOptionPane.showMessageDialog(null, "Please enter a valid date");
		}
		CheckDate check = new CheckDate(day);
		if(!check.isValidDate()){
			JOptionPane.showMessageDialog(null, "Arrival date must be before departure date");
			day = null;
		}
		if(!check.isValidDuration()){
			JOptionPane.showMessageDialog(null, "Duration must be shorter than 20 days");
			day = null;
		}

		try {
			request = constructRequest(facilities, day, (double)nrBedPanel.getNrBeds(), locPanel.getLocation(), pricegroup);
		} catch (InvalidTotalBedsException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
			JOptionPane.showMessageDialog(null, "You must select a number of guests");
			request = null;
		}		
		
		
	
		HotelSearch hotelSearch = new HotelSearch();
	
		
		try {
			hotels = hotelSearch.getMatchingHotelsFromDB(request);
			
		} catch (ConnectException e1) {
			// TODO Auto-generated catch block

			System.out.println("VIRKA EKKI");
		}
		
		
		
		JPanel card2 = new JPanel();
	    card2.add(makeResultPanel());
	        
	    cards.add(card2, "2");
		
		CardLayout cardLayout = (CardLayout) cards.getLayout();
        cardLayout.last(cards);  
		
	
	}  
}