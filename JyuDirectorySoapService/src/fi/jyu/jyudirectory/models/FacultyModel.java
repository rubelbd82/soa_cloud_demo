package fi.jyu.jyudirectory.models;

public class FacultyModel {
	int id;
	String title;
	String address;
	String telephone;
	String countryCode;
	String universityName;
	
	public FacultyModel() {
		super();
	}
	
	public FacultyModel(int id, String title, String address, String telephone, String countryCode,
			String universityName) {
		super();
		this.id = id;
		this.title = title;
		this.address = address;
		this.telephone = telephone;
		this.countryCode = countryCode;
		this.universityName = universityName;
	}



	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

}
