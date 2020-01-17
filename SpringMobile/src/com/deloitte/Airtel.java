package com.deloitte;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("airtel")
public class Airtel implements Sim {
    
	@Value("${airtel.callCharge}")
	private float callCharge;
	@Value("${airtel.speed}")
	private float speed;
//	@Value("#{${airtel.supportedNets}}")
//	List<String> supportedNets;
	@Autowired
	@Qualifier("alternateMS")
	private MessageSender ms;
	
	public void sendSms()
	{
		ms.sendSms();
		System.out.println("From Airtel");
	}
	
	public void sendMms()
	{
		ms.sendMms();
		System.out.println("From Airtel");
	}
	
//	
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
		System.out.println("Browsing with Airtel...Speed "+speed+"mb/s");
		
	}@Override
	public void call() {
		System.out.println("Calling with Airtel...Charges "+callCharge+"rs");
		
	}
}
