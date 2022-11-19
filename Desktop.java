package org.system;

public class Desktop extends Computer{
	
	public void desktopSize()
	{
		System.out.println("Desktop size is 24''.");
	}

	public static void main(String[] args) {
		
		Desktop dk = new Desktop();
		
		dk.computerModel();
		dk.desktopSize();
		

	}

}
