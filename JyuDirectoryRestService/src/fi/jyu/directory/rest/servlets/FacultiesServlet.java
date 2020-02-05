package fi.jyu.directory.rest.servlets;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fi.jyu.directory.rest.api_handler.JyuDirectorySoapHandler;

@WebServlet("/jyuDirectory/Faculties")
public class FacultiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doDelete(req, resp);
		
		StringBuffer request_body = new StringBuffer();
		String line = null;
		try {
		  BufferedReader reader = request.getReader();
		  while ((line = reader.readLine()) != null)
			  request_body.append(line);
		} catch (Exception e) { /*report an error*/ }
		
		JyuDirectorySoapHandler handler = new JyuDirectorySoapHandler();
		String result = handler.deleteFaculty(request_body);
		
		
		response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.setStatus(501);
	    response.getWriter().write(result.toString());
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		
		try {
			String id = request.getParameter("id").toString();
			System.out.println("ID: " + id);
			
			JyuDirectorySoapHandler handler = new JyuDirectorySoapHandler();
			String result = handler.findFacultyById(Integer.parseInt(id));
			System.out.println("4444");
			response.setContentType("application/json");
		    response.setCharacterEncoding("UTF-8");
		    response.setStatus(501);
		    response.getWriter().write(result.toString());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("not found ID");
			JyuDirectorySoapHandler handler = new JyuDirectorySoapHandler();
			String result = handler.getFacultyList();
			response.setContentType("application/json");
		    response.setCharacterEncoding("UTF-8");
		    response.setStatus(501);
		    response.getWriter().write(result.toString());
		}

		
	}

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doHead(req, resp);
	}

	@Override
	protected void doOptions(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doOptions(arg0, arg1);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		StringBuffer request_body = new StringBuffer();
		String line = null;
		try {
		  BufferedReader reader = request.getReader();
		  while ((line = reader.readLine()) != null)
			  request_body.append(line);
		} catch (Exception e) { /*report an error*/ }
		
		JyuDirectorySoapHandler handler = new JyuDirectorySoapHandler();
		String result = handler.addFaculty(request_body);
		response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.setStatus(501);
	    response.getWriter().write(result.toString());
	}

	@Override
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPut(req, resp);
		StringBuffer request_body = new StringBuffer();
		String line = null;
		try {
		  BufferedReader reader = request.getReader();
		  while ((line = reader.readLine()) != null)
			  request_body.append(line);
		} catch (Exception e) { /*report an error*/ }
		
		JyuDirectorySoapHandler handler = new JyuDirectorySoapHandler();
		String result = handler.editFaculty(request_body);
		response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.setStatus(501);
	    response.getWriter().write(result.toString());	
	}

	@Override
	protected void doTrace(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doTrace(arg0, arg1);
	}

	@Override
	protected long getLastModified(HttpServletRequest req) {
		// TODO Auto-generated method stub
		return super.getLastModified(req);
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, res);
	}

}
