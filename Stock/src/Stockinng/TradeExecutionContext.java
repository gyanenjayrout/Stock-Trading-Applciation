package Stockinng;

public class TradeExecutionContext {
	
	private TradeStrategy tradeStartegy;
	
	public void setTradeStrategy (TradeStrategy tradeStartegy)
	{
		this.tradeStartegy = tradeStartegy;
	}
	
	public void excuteTreade(String stocksymbol, double price)
	{
		if(tradeStartegy !=null)
		{
			
			tradeStartegy.executeTrade(stocksymbol, price);
        } else {
            System.out.println("Trade strategy not set.");
        }
	}

}
