
package fi.jyu.jyudirectory.service.imp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFacultyListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFacultyListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FacultyModelList" type="{http://imp.service.jyudirectory.jyu.fi/}facultyModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFacultyListResponse", propOrder = {
    "facultyModelList"
})
public class GetFacultyListResponse {

    @XmlElement(name = "FacultyModelList")
    protected List<FacultyModel> facultyModelList;

    /**
     * Gets the value of the facultyModelList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facultyModelList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacultyModelList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacultyModel }
     * 
     * 
     */
    public List<FacultyModel> getFacultyModelList() {
        if (facultyModelList == null) {
            facultyModelList = new ArrayList<FacultyModel>();
        }
        return this.facultyModelList;
    }

}
