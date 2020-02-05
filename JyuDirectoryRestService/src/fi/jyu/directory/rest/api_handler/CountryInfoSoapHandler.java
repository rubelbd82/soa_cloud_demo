package fi.jyu.directory.rest.api_handler;

import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;
import org.oorsprong.websamples.TCountryInfo;

import fi.jyu.directory.rest.model.ExtFacultyModel;

public class CountryInfoSoapHandler {
	public ExtFacultyModel getCountryInformation(ExtFacultyModel extFacultyModel) {	
		CountryInfoService service = new CountryInfoService();
		CountryInfoServiceSoapType soap = service.getCountryInfoServiceSoap();
		TCountryInfo countryInfo = soap.fullCountryInfo(extFacultyModel.getCountryCode());
		extFacultyModel.setCapitalCity(countryInfo.getSCapitalCity());
		extFacultyModel.setContinentCode(countryInfo.getSContinentCode());
		extFacultyModel.setCurrencyISOCode(countryInfo.getSCurrencyISOCode());
		return extFacultyModel;
	}
}
