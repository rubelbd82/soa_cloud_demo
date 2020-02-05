package fi.jyu.directory.rest.model;

import javax.xml.bind.annotation.XmlElement;

import fi.jyu.jyudirectory.service.imp.FacultyModel;

public class ExtFacultyModel extends FacultyModel {
    String capitalCity;
    String phoneCode;
    String continentCode;
    String currencyISOCode;
    
	public ExtFacultyModel(FacultyModel facultyModel) {
		this.title = facultyModel.getTitle();
		this.address = facultyModel.getAddress();
		this.id = facultyModel.getId();
		this.countryCode = facultyModel.getCountryCode();
		this.telephone = facultyModel.getTelephone();
		this.universityName = facultyModel.getUniversityName();
	}
	
	public String getCapitalCity() {
		return capitalCity;
	}
	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}
	public String getPhoneCode() {
		return phoneCode;
	}
	public void setPhoneCode(String phoneCode) {
		this.phoneCode = phoneCode;
	}
	public String getContinentCode() {
		return continentCode;
	}
	public void setContinentCode(String continentCode) {
		this.continentCode = continentCode;
	}
	public String getCurrencyISOCode() {
		return currencyISOCode;
	}
	public void setCurrencyISOCode(String currencyISOCode) {
		this.currencyISOCode = currencyISOCode;
	}
	    
}
