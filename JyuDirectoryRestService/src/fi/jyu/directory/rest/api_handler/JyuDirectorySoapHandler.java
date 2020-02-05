package fi.jyu.directory.rest.api_handler;

import java.util.List;

import com.google.gson.Gson;

import fi.jyu.directory.rest.model.ExtFacultyModel;
import fi.jyu.jyudirectory.service.imp.FacultyModel;
import fi.jyu.jyudirectory.service.imp.JyuDirectoryServiceImpl;
import fi.jyu.jyudirectory.service.imp.JyuDirectoryServiceImplService;

public class JyuDirectorySoapHandler {
	
	
	public String addFaculty(StringBuffer request_body) {
		Gson gson = new Gson();
		FacultyModel facultyModel = gson.fromJson(request_body.toString(), FacultyModel.class);
		JyuDirectoryServiceImplService service = new JyuDirectoryServiceImplService(); 
		JyuDirectoryServiceImpl soap = service.getJyuDirectoryServiceImplPort();
		
		String soapResponse = soap.addFaculty(facultyModel);
		if (soapResponse.equals("success")) {
			return "{\"result\" : \"success\"}";
		} else {
			return "{\"result\" : \"fail\", \"message\" : \"faculty with provided id already exists\"}";
		}
	}
	
	public String getFacultyList() {
		JyuDirectoryServiceImplService service = new JyuDirectoryServiceImplService(); 
		JyuDirectoryServiceImpl soap = service.getJyuDirectoryServiceImplPort();
		
		List<FacultyModel> facultyList =  soap.getFacultyList();
		
		Gson gson = new Gson();
		
		return gson.toJson(facultyList);
	}
	
	
	public String findFacultyById(int id) {
		
		System.out.println("1111");
		JyuDirectoryServiceImplService service = new JyuDirectoryServiceImplService(); 
		JyuDirectoryServiceImpl soap = service.getJyuDirectoryServiceImplPort();
		
		FacultyModel faculty =  soap.findFacultyById(id);
		if (faculty != null) {
			ExtFacultyModel extFacultyModel = new ExtFacultyModel(faculty);
			System.out.println("2222");
			CountryInfoSoapHandler countryInfoSoap = new CountryInfoSoapHandler();
			extFacultyModel = countryInfoSoap.getCountryInformation(extFacultyModel);
			
			
			Gson gson = new Gson();
			System.out.println("3333");
			return gson.toJson(extFacultyModel);
		}
		
		return "{\"result\" : \"fail\", \"message\" : \"faculty with provided id does not exist\"}";
		
	}

	public String deleteFaculty(StringBuffer request_body) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		FacultyModel facultyModel = gson.fromJson(request_body.toString(), FacultyModel.class);
		JyuDirectoryServiceImplService service = new JyuDirectoryServiceImplService(); 
		JyuDirectoryServiceImpl soap = service.getJyuDirectoryServiceImplPort();
		
		// return soap.deleteFaculty(facultyModel.getId());
		
		String soapResponse = soap.deleteFaculty(facultyModel.getId());
		if (soapResponse.equals("success")) {
			return "{\"result\" : \"success\"}";
		} else {
			return "{\"result\" : \"fail\", \"message\" : \"faculty with provided id not found\"}";
		}
	}

	public String editFaculty(StringBuffer request_body) {
		Gson gson = new Gson();
		FacultyModel facultyModel = gson.fromJson(request_body.toString(), FacultyModel.class);
		JyuDirectoryServiceImplService service = new JyuDirectoryServiceImplService(); 
		JyuDirectoryServiceImpl soap = service.getJyuDirectoryServiceImplPort();
		
		String soapResponse = soap.editFaculty(facultyModel);
		if (soapResponse.equals("success")) {
			return "{\"result\" : \"success\"}";
		} else {
			return "{\"result\" : \"fail\", \"message\" : \"faculty with provided id not found\"}";
		}
	}

}
