package fi.jyu.directory.rest.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class UserProfile
 */
@WebServlet("/UserProfile")
public class SampleDirectoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SampleDirectoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*
		
		String authorName = request.getParameter("authorName").toString();

		Map<String, String> options = new LinkedHashMap<>();
    	options.put("message", "Is not implemented");
///	    String json = new Gson().toJson(options);
		
    	 	
		response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.setStatus(501);
	   /// response.getWriter().write(json.toString());
		
		*/
		System.out.println("Hello world");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		StringBuffer request_body = new StringBuffer();
		String line = null;
		try {
		  BufferedReader reader = request.getReader();
		  while ((line = reader.readLine()) != null)
			  request_body.append(line);
		} catch (Exception e) { /*report an error*/ }
		
		System.out.println("Request body: ");
		
		System.out.println(request_body);
		
		
	}
	
//	@Path("/FeetToInch/{f}")
//    @GET
//    @Produces(MediaType.TEXT_XML)
//    public String convertFeetToInch(@PathParam("f") int f) {
//  	  int inch=0;
//        int feet = f;
//        inch = 12*feet;
// 
//        return "<FeetToInchService>"
//          + "<Feet>" + feet + "</Feet>"
//          + "<Inch>" + inch + "</Inch>"
//          + "</FeetToInchService>";
//    }

}
