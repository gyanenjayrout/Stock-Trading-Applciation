package Stockinng;

public interface StuckSubject {
	
	void addObserver(Observer observer);
	
	void RemoveObersver(Observer observer);
	
	void NotifyObserver();
	
	void setPreice(double ammont);

}
