package Stockinng;

public class MarketTradeProcessor implements TradeProcessor {
    @Override
    public void processTrade(double amount) {
        System.out.println("Processing market order for amount: " + amount);
        // Logic to execute a market order
    }
}