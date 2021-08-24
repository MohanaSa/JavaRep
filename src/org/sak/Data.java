package org.sak;


public class Data {
	
	public void loadUrl() {

System.out.println("Load Url");
	}
	public void getDriver() {

		System.out.println("Get Driver");
	}
	
	
	public static void main(String[] args) {

		
		Data d=new Data();
		d.getDriver();
		d.loadUrl();
		
	}
	
	
}

