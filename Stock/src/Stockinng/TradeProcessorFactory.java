
package Stockinng;

public class TradeProcessorFactory {
	
	public TradeProcessor createTradeProcsser(String tradeType)
	{
		if("MArket".equalsIgnoreCase(tradeType))
		{
			return new MarketTradeProcessor();
		}
		else if("LIMIT".equalsIgnoreCase(tradeType))
		{
			return new LimitTradeProcessor();
		}
		
		 throw new IllegalArgumentException("Unknown trade type: " + tradeType);
	}

}
