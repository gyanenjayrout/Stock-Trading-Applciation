package Stockinng;

public class LimitOrderStrategy implements TradeStrategy {
	
	
	private double targetPrice;
	public LimitOrderStrategy(double targetPrice) {
        this.targetPrice = targetPrice;
    }

	@Override
	public void executeTrade(String stockSymbol, double price) {
		// TODO Auto-generated method stub
		
		if (price <= targetPrice) {
            System.out.println("Executing limit order for " + stockSymbol + " at $" + price);
            // Execute trade at target price
        } else {
            System.out.println("Limit order for " + stockSymbol + " pending until price reaches $" + targetPrice);
        }
	}


}
