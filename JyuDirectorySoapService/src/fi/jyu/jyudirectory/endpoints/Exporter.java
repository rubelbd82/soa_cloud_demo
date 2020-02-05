package fi.jyu.jyudirectory.endpoints;

import javax.xml.ws.Endpoint;

import fi.jyu.jyudirectory.service.imp.JyuDirectoryServiceImpl;

public class Exporter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Local
//	Endpoint.publish("http://localhost:8080/JyJyuDirectory", new JyuDirectoryServiceImpl());
		
		System.out.println("SOAP server started");
		
		// Cloud
		Integer port = Integer.valueOf(System.getenv("PORT")); 
		String address = "http://0.0.0.0:"+port+"/JyuDirectory";
		
		address = "https://jyudirectorysoapservice1.apic.eu-gb.mybluemix.net/JyuDirectory";
		Endpoint.publish(address, new JyuDirectoryServiceImpl());
	}

}
