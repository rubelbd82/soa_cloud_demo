package fi.jyu.directory.rest.endpoints;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;
import fi.jyu.directory.rest.servlets.FacultiesServlet;

public class RestEndpoint {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServletHandler servletHandler = new ServletHandler();
		servletHandler.addServletWithMapping(FacultiesServlet.class, "/jyuDirectory/Faculties"); 
		
		//Create a new Server, add the handler to it and start
		// Uncomment for local server deployment
		 Server server = new Server(1234);	        
		server.setHandler(servletHandler);
		server.start();
		//this dumps a lot of debug output to the console. 
		server.dumpStdErr();
		server.join();
        
		
		// Uncomment for cloud deployment
//		Integer port = Integer.valueOf(System.getenv("PORT")); 
//		Server server = new Server(port);   
//		server.setHandler(servletHandler);
//		server.start();
//		//this dumps a lot of debug output to the console. 
//		server.dumpStdErr();
//		server.join();

	}

}
