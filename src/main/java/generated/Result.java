
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://foobar.com}codeType"/>
 *         &lt;choice>
 *           &lt;element name="persons" type="{http://foobar.com}personListType" minOccurs="0"/>
 *           &lt;element name="films" type="{http://foobar.com}filmListType" minOccurs="0"/>
 *           &lt;element name="serials" type="{http://foobar.com}serialListType" minOccurs="0"/>
 *           &lt;element name="person" type="{http://foobar.com}personType" minOccurs="0"/>
 *           &lt;element name="serial" type="{http://foobar.com}serialType" minOccurs="0"/>
 *           &lt;element name="film" type="{http://foobar.com}filmType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "code",
    "persons",
    "films",
    "serials",
    "person",
    "serial",
    "film"
})
@XmlRootElement(name = "result", namespace = "http://foobar.com")
public class Result {

    @XmlElement(namespace = "http://foobar.com", required = true)
    @XmlSchemaType(name = "string")
    protected CodeType code;
    @XmlElement(namespace = "http://foobar.com")
    protected PersonListType persons;
    @XmlElement(namespace = "http://foobar.com")
    protected FilmListType films;
    @XmlElement(namespace = "http://foobar.com")
    protected SerialListType serials;
    @XmlElement(namespace = "http://foobar.com")
    protected PersonType person;
    @XmlElement(namespace = "http://foobar.com")
    protected SerialType serial;
    @XmlElement(namespace = "http://foobar.com")
    protected FilmType film;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCode(CodeType value) {
        this.code = value;
    }

    /**
     * Gets the value of the persons property.
     * 
     * @return
     *     possible object is
     *     {@link PersonListType }
     *     
     */
    public PersonListType getPersons() {
        return persons;
    }

    /**
     * Sets the value of the persons property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonListType }
     *     
     */
    public void setPersons(PersonListType value) {
        this.persons = value;
    }

    /**
     * Gets the value of the films property.
     * 
     * @return
     *     possible object is
     *     {@link FilmListType }
     *     
     */
    public FilmListType getFilms() {
        return films;
    }

    /**
     * Sets the value of the films property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilmListType }
     *     
     */
    public void setFilms(FilmListType value) {
        this.films = value;
    }

    /**
     * Gets the value of the serials property.
     * 
     * @return
     *     possible object is
     *     {@link SerialListType }
     *     
     */
    public SerialListType getSerials() {
        return serials;
    }

    /**
     * Sets the value of the serials property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialListType }
     *     
     */
    public void setSerials(SerialListType value) {
        this.serials = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setPerson(PersonType value) {
        this.person = value;
    }

    /**
     * Gets the value of the serial property.
     * 
     * @return
     *     possible object is
     *     {@link SerialType }
     *     
     */
    public SerialType getSerial() {
        return serial;
    }

    /**
     * Sets the value of the serial property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialType }
     *     
     */
    public void setSerial(SerialType value) {
        this.serial = value;
    }

    /**
     * Gets the value of the film property.
     * 
     * @return
     *     possible object is
     *     {@link FilmType }
     *     
     */
    public FilmType getFilm() {
        return film;
    }

    /**
     * Sets the value of the film property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilmType }
     *     
     */
    public void setFilm(FilmType value) {
        this.film = value;
    }

}