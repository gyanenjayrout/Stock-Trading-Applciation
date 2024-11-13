package Stockinng;

import java.util.ArrayList;
import java.util.List;

public class Stock implements StuckSubject {
private  String stockName;
private String stocksymbol;
	private double price;
	
	public Stock(String stockName, double price,String stocksymbol) {
        this.stockName = stockName;
        this.price = price;
        this.stocksymbol = stocksymbol;
    }
	
	List<Observer> ob =  new ArrayList<>();
	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		
		ob.add(observer);
		
	}

	@Override
	public void RemoveObersver(Observer observer) {
		// TODO Auto-generated method stub
		ob.remove(observer);
	}
	
	@Override
	public void setPreice(double ammont) {
		// TODO Auto-generated method stub
		
		this.price = ammont;
		
		NotifyObserver();
		
	}

	@Override
	public void NotifyObserver() {
		// TODO Auto-generated method stub
		for(Observer o1 : ob)
		{
			o1.update(stocksymbol, price);
		}
	}

	
	
	
	
	
	
	

}
