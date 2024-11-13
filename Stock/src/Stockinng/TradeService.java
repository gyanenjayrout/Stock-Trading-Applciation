package Stockinng;

public class TradeService {
	
	private Logger  logger  =  Logger.getInsatnce();
	
	TradeProcessorFactory   factory   =  new TradeProcessorFactory();
	
	
	public void executeTrade(String tradeType,double amount)
	{
		TradeProcessor   processor   =   factory.createTradeProcsser(tradeType);
		
		processor.processTrade(amount);
		
		
		logger.log("Trade executed: " + tradeType + " for amount " + amount);
	}
	

}
