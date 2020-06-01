package week3.day11;

import week3.day1.AndroidPhone;

public class SmartPhone extends AndroidPhone{
	
	public void connectWhatsapp()
	
	{
		System.out.println("whatsapp....");
	}
	
	public void takeVideo()
	{
		System.out.println("Video.1..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sm =new SmartPhone();
		
		sm.sendMsg();
		
		sm.makeCall();
		
		sm.saveContact();
		
		sm.takeVideo();
		
		sm.connectWhatsapp();
		
	}

}
