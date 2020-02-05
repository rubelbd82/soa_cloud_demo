
package fi.jyu.jyudirectory.service.imp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findFacultyByIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findFacultyByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FacultyModel" type="{http://imp.service.jyudirectory.jyu.fi/}facultyModel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findFacultyByIdResponse", propOrder = {
    "facultyModel"
})
public class FindFacultyByIdResponse {

    @XmlElement(name = "FacultyModel")
    protected FacultyModel facultyModel;

    /**
     * Gets the value of the facultyModel property.
     * 
     * @return
     *     possible object is
     *     {@link FacultyModel }
     *     
     */
    public FacultyModel getFacultyModel() {
        return facultyModel;
    }

    /**
     * Sets the value of the facultyModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacultyModel }
     *     
     */
    public void setFacultyModel(FacultyModel value) {
        this.facultyModel = value;
    }

}
