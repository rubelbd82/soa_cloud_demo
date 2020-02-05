package fi.jyu.jyudirectory.service.imp;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import fi.jyu.jyudirectory.models.FacultyModel;
import fi.jyu.jyudirectory.service.JyuDirectoryService;
import fi.jyu.jyudirectory.utils.FacultyRepository;

@WebService
public class JyuDirectoryServiceImpl implements JyuDirectoryService {
	
	public JyuDirectoryServiceImpl() {
		FacultyRepository.facultyModelList.add(new FacultyModel(1, "Faculty of Education and Psychology", "Alvar Aallon katu 9, Building Ruusupuisto (RUU)", "+358 14 260 1211", "FIN", "Jyväskylä University"));
		FacultyRepository.facultyModelList.add(new FacultyModel(2, "Faculty of Humanities and Social Sciences", "Keskussairaalantie 2, Building Opinkivi (OPK)", "+358 14 260 1211", "FIN", "Jyväskylä University"));
		FacultyRepository.facultyModelList.add(new FacultyModel(3, "Faculty of Information Technology", "Mattilanniemi 2, Building Agora (Ag)", "+358 14 260 1211", "FIN", "Jyväskylä University"));
	}

	@Override
	@WebMethod
	@WebResult(name = "FacultyModelList")
	public List<FacultyModel> getFacultyList() {
		// TODO Auto-generated method stub
		return FacultyRepository.facultyModelList;
	}

	@Override
	@WebMethod
	@WebResult(name = "result")
	public String addFaculty(FacultyModel facultyModel) {
		// TODO Auto-generated method stub
		int index = this.findFacultyIndexById(facultyModel.getId());
		if (index != -1) {
			return "fail";
		}
		
		FacultyRepository.facultyModelList.add(facultyModel);
		
		return "success";
	}

	@Override
	@WebMethod
	@WebResult(name = "result")
	public String editFaculty(FacultyModel facultyModel) {
		// TODO Auto-generated method stub
		int index = this.findFacultyIndexById(facultyModel.getId());
		
		if (index != -1) {
			FacultyRepository.facultyModelList.get(index).setTitle(facultyModel.getTitle());
			FacultyRepository.facultyModelList.get(index).setAddress(facultyModel.getAddress());
			FacultyRepository.facultyModelList.get(index).setTelephone(facultyModel.getTelephone());
			return "success";
		}
		return "fail";
	}

	@Override
	@WebMethod
	@WebResult(name = "FacultyModel")
	public FacultyModel findFacultyById(int id) {
		for (FacultyModel facultyModel : FacultyRepository.facultyModelList) {
			if (facultyModel.getId() == id) {
				return facultyModel;
			}
		}
		return null;
	}
	
	private int findFacultyIndexById(int id) {
		int i = 0;
		for (FacultyModel facultyModel : FacultyRepository.facultyModelList) {
			if (facultyModel.getId() == id) {
				return i;
			}
			i++;
		}
		return -1;
	}

	@Override
	@WebMethod
	@WebResult(name = "result")
	public String deleteFaculty(int id) {
		// TODO Auto-generated method stub
		int index = this.findFacultyIndexById(id);
		if (index != -1) {
			FacultyRepository.facultyModelList.remove(index);
			return "success";
		}
		return "fail";
	}

}
