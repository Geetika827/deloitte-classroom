package com.deloitte;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("jio")


public class Jio implements Sim{
	@Value("${jio.callCharge}")
	private float callCharge;
	@Value("${jio.speed}")
	private float speed;
	@Autowired
	@Qualifier("ms")
	private MessageSender ms;
	
	public void sendSms()
	{
		ms.sendSms();
		System.out.println("From Jio");
	}
	
	public void sendMms()
	{
		ms.sendMms();
		System.out.println("From Jio");
	}
	
	
//	public MessageSender getMs() {
//		return ms;
//	}
//	public void setMs(MessageSender ms) {
//		this.ms = ms;
//	}
	
	public float getCallCharge() {
		return callCharge;
	}
	public void setCallCharge(float callCharge) {
		this.callCharge = callCharge;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}    
	 @Override
	public void browse() {
		System.out.println("Browsing with Jio...Speed "+speed+"mb/s");
		
	}@Override
	public void call() {
		System.out.println("Calling with Jio...Charges "+callCharge+"rs");
		
	}
}
