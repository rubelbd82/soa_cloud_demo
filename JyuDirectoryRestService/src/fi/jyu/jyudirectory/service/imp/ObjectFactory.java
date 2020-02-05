
package fi.jyu.jyudirectory.service.imp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fi.jyu.jyudirectory.service.imp package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteFaculty_QNAME = new QName("http://imp.service.jyudirectory.jyu.fi/", "deleteFaculty");
    private final static QName _AddFacultyResponse_QNAME = new QName("http://imp.service.jyudirectory.jyu.fi/", "addFacultyResponse");
    private final static QName _FindFacultyByIdResponse_QNAME = new QName("http://imp.service.jyudirectory.jyu.fi/", "findFacultyByIdResponse");
    private final static QName _AddFaculty_QNAME = new QName("http://imp.service.jyudirectory.jyu.fi/", "addFaculty");
    private final static QName _DeleteFacultyResponse_QNAME = new QName("http://imp.service.jyudirectory.jyu.fi/", "deleteFacultyResponse");
    private final static QName _GetFacultyList_QNAME = new QName("http://imp.service.jyudirectory.jyu.fi/", "getFacultyList");
    private final static QName _EditFacultyResponse_QNAME = new QName("http://imp.service.jyudirectory.jyu.fi/", "editFacultyResponse");
    private final static QName _FindFacultyById_QNAME = new QName("http://imp.service.jyudirectory.jyu.fi/", "findFacultyById");
    private final static QName _EditFaculty_QNAME = new QName("http://imp.service.jyudirectory.jyu.fi/", "editFaculty");
    private final static QName _GetFacultyListResponse_QNAME = new QName("http://imp.service.jyudirectory.jyu.fi/", "getFacultyListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fi.jyu.jyudirectory.service.imp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EditFacultyResponse }
     * 
     */
    public EditFacultyResponse createEditFacultyResponse() {
        return new EditFacultyResponse();
    }

    /**
     * Create an instance of {@link EditFaculty }
     * 
     */
    public EditFaculty createEditFaculty() {
        return new EditFaculty();
    }

    /**
     * Create an instance of {@link GetFacultyListResponse }
     * 
     */
    public GetFacultyListResponse createGetFacultyListResponse() {
        return new GetFacultyListResponse();
    }

    /**
     * Create an instance of {@link FindFacultyById }
     * 
     */
    public FindFacultyById createFindFacultyById() {
        return new FindFacultyById();
    }

    /**
     * Create an instance of {@link DeleteFacultyResponse }
     * 
     */
    public DeleteFacultyResponse createDeleteFacultyResponse() {
        return new DeleteFacultyResponse();
    }

    /**
     * Create an instance of {@link GetFacultyList }
     * 
     */
    public GetFacultyList createGetFacultyList() {
        return new GetFacultyList();
    }

    /**
     * Create an instance of {@link AddFacultyResponse }
     * 
     */
    public AddFacultyResponse createAddFacultyResponse() {
        return new AddFacultyResponse();
    }

    /**
     * Create an instance of {@link FindFacultyByIdResponse }
     * 
     */
    public FindFacultyByIdResponse createFindFacultyByIdResponse() {
        return new FindFacultyByIdResponse();
    }

    /**
     * Create an instance of {@link AddFaculty }
     * 
     */
    public AddFaculty createAddFaculty() {
        return new AddFaculty();
    }

    /**
     * Create an instance of {@link DeleteFaculty }
     * 
     */
    public DeleteFaculty createDeleteFaculty() {
        return new DeleteFaculty();
    }

    /**
     * Create an instance of {@link FacultyModel }
     * 
     */
    public FacultyModel createFacultyModel() {
        return new FacultyModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFaculty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imp.service.jyudirectory.jyu.fi/", name = "deleteFaculty")
    public JAXBElement<DeleteFaculty> createDeleteFaculty(DeleteFaculty value) {
        return new JAXBElement<DeleteFaculty>(_DeleteFaculty_QNAME, DeleteFaculty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFacultyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imp.service.jyudirectory.jyu.fi/", name = "addFacultyResponse")
    public JAXBElement<AddFacultyResponse> createAddFacultyResponse(AddFacultyResponse value) {
        return new JAXBElement<AddFacultyResponse>(_AddFacultyResponse_QNAME, AddFacultyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFacultyByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imp.service.jyudirectory.jyu.fi/", name = "findFacultyByIdResponse")
    public JAXBElement<FindFacultyByIdResponse> createFindFacultyByIdResponse(FindFacultyByIdResponse value) {
        return new JAXBElement<FindFacultyByIdResponse>(_FindFacultyByIdResponse_QNAME, FindFacultyByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFaculty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imp.service.jyudirectory.jyu.fi/", name = "addFaculty")
    public JAXBElement<AddFaculty> createAddFaculty(AddFaculty value) {
        return new JAXBElement<AddFaculty>(_AddFaculty_QNAME, AddFaculty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteFacultyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imp.service.jyudirectory.jyu.fi/", name = "deleteFacultyResponse")
    public JAXBElement<DeleteFacultyResponse> createDeleteFacultyResponse(DeleteFacultyResponse value) {
        return new JAXBElement<DeleteFacultyResponse>(_DeleteFacultyResponse_QNAME, DeleteFacultyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFacultyList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imp.service.jyudirectory.jyu.fi/", name = "getFacultyList")
    public JAXBElement<GetFacultyList> createGetFacultyList(GetFacultyList value) {
        return new JAXBElement<GetFacultyList>(_GetFacultyList_QNAME, GetFacultyList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditFacultyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imp.service.jyudirectory.jyu.fi/", name = "editFacultyResponse")
    public JAXBElement<EditFacultyResponse> createEditFacultyResponse(EditFacultyResponse value) {
        return new JAXBElement<EditFacultyResponse>(_EditFacultyResponse_QNAME, EditFacultyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFacultyById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imp.service.jyudirectory.jyu.fi/", name = "findFacultyById")
    public JAXBElement<FindFacultyById> createFindFacultyById(FindFacultyById value) {
        return new JAXBElement<FindFacultyById>(_FindFacultyById_QNAME, FindFacultyById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditFaculty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imp.service.jyudirectory.jyu.fi/", name = "editFaculty")
    public JAXBElement<EditFaculty> createEditFaculty(EditFaculty value) {
        return new JAXBElement<EditFaculty>(_EditFaculty_QNAME, EditFaculty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFacultyListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imp.service.jyudirectory.jyu.fi/", name = "getFacultyListResponse")
    public JAXBElement<GetFacultyListResponse> createGetFacultyListResponse(GetFacultyListResponse value) {
        return new JAXBElement<GetFacultyListResponse>(_GetFacultyListResponse_QNAME, GetFacultyListResponse.class, null, value);
    }

}
