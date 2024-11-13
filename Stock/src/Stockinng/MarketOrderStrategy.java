package Stockinng;

public class MarketOrderStrategy implements TradeStrategy {
    @Override
    public void executeTrade(String stockSymbol, double price) {
        System.out.println("Executing market order for " + stockSymbol + " at $" + price);
        // Immediate trade execution logic
    }
}
