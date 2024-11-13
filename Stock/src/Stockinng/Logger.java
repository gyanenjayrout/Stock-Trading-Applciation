package Stockinng;

public class Logger {
	
	private static Logger insatnce;
	
	private   Logger() {
		// TODO Auto-generated constructor stub
	}
	
	public  static Logger getInsatnce()
	
	{
		if(insatnce ==null)
		{
			insatnce = new Logger();
		}
		return insatnce;
	}

	
	public void log(String  message)
	{
		System.out.println( "log  : "  +message);
	}
	
}
