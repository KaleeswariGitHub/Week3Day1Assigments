package week3.day1;

public class Automation extends MultipleLanguage implements TestTool{

	public static void main(String[] args) 
	{
	    Automation autoMethodAutomation = new Automation();	
	    autoMethodAutomation.java();
	    autoMethodAutomation.selenium();
	    autoMethodAutomation.ruby();
	    autoMethodAutomation.python();
		
	}

	@Override
	public void java() 
	{
	   System.out.println("Java in Automation");	
	}

	@Override
	public void selenium() 
	{
		System.out.println("Selenium in Automation");
	}

	@Override
	public void ruby() 
	{
		System.out.println("Ruby in Automation");		
	}
	

}
