package Stockinng;

public class StockTradingApp {
	
	public static void main(String[] args) {
        Logger logger = Logger.getInsatnce();
        
        Stock appleStock = new Stock("Apple", 150,"AAPL");
        
        Observer trader1 =  new Traders("tardeeer 1");
        Observer trader2 =  new Traders("tardeeer 2");
        
        appleStock.addObserver(trader1);
        appleStock.addObserver(trader2);
        
        appleStock.setPreice(155);
        
        TradeService tradeService = new TradeService();
        
        tradeService.executeTrade("MARKET", 1000);
        tradeService.executeTrade("LIMIT", 2000);
        
        logger.log("Application FInished");
        
        
        
        
        //Using Strategy Pattern for trade execution
        TradeExecutionContext tradeContext = new TradeExecutionContext();

        // Setting and executing a Market Order
        tradeContext.setTradeStrategy(new MarketOrderStrategy());
        tradeContext.excuteTreade("AAPL", 155.00);

        // Setting and executing a Limit Order
        tradeContext.setTradeStrategy(new LimitOrderStrategy(152.00));
        tradeContext.excuteTreade("AAPL", 150.00);
	}

}
