package Stockinng;

public class Traders implements Observer {
	
	private String tradersname;
	
	
	
	public Traders(String tradersname) {
		// TODO Auto-generated constructor stub
		this.tradersname = tradersname;
	}

	@Override
	public void update(String stockSymbol, double price) {
		// TODO Auto-generated method stub
		 System.out.println("Trader " + tradersname + " notified: " + stockSymbol + " price changed to $" + price);
	        // Custom logic for responding to price changes
	}
	

	
}
