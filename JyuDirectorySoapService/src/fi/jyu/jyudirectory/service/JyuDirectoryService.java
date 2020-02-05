package fi.jyu.jyudirectory.service;

import java.util.List;

import fi.jyu.jyudirectory.models.FacultyModel;

public interface JyuDirectoryService {

	List<FacultyModel> getFacultyList();
	String addFaculty(FacultyModel facultyModel);
	String editFaculty(FacultyModel facultyModel);
	FacultyModel findFacultyById(int id);
	public String deleteFaculty(int id);
	 
}
