package com.deloitte;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.deloitte")
@PropertySource("app.properties")
public class AppConfig {
  @Bean("alternateMS")
  
//	@Bean("ms")
	public MessageSender getMsBean()
  {
	  MessageSender ms= new MessageSender();
	  ms.setMmsCharge(5.2f);
	  ms.setSmsCharge(2.5f);
	  return ms;
  }
//	
//	
//	@Bean("airtel")
//	public Airtel getAirtelBean()
//	{
//		Airtel sim= new Airtel();
//		sim.setCallCharge(1.5f);
//		sim.setSpeed(10f);
//		sim.setMs(getMsBean());
//		return sim;
//	}
//	
//	
//	@Bean("jio")
//	public Jio getJioBean()
//	{
//		Jio sim= new Jio();
//		sim.setCallCharge(.85f);
//		sim.setSpeed(20f);
//		sim.setMs(getMsBean());
//		return sim;
//	}
	
	
}
