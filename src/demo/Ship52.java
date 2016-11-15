package demo;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class Ship52 {
	
	//consuming webservice for receiving information about vessels bound for a specific port or a country, within the next few days.
	public static void main (String[]args){
		
		Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target("http://services.marinetraffic.com/api/expectedarrivals/2cbca146f874f6d1bce8a58c4cd8b52dfd1b1710/timespan:2/country:US/shiptype:8/protocol:xml");
		
		System.out.println(target.request(MediaType.TEXT_XML).get(String.class));
	}

}
