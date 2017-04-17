//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.15 at 02:14:42 PM MSK 
//


package taxi_by_jaxb;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Trip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Trip">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trips_pkey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="driver_pkey" type="{}Driver"/>
 *         &lt;element name="passenger_pkey" type="{}Passenger"/>
 *         &lt;element name="address_from" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address_to" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date_start" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="date_change" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{}Status"/>
 *         &lt;element name="estimate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="report" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trip", propOrder = {
    "trips_pkey",
    "driverPkey",
    "passengerPkey",
    "addressFrom",
    "addressTo",
    "dateStart",
    "dateChange",
    "price",
    "status",
    "estimate",
    "report"
})
@XmlRootElement
public class Trip {

    @XmlElement(name = "trips_pkey")
    protected long trips_pkey;
    @XmlElement(name = "driver_pkey", required = true)
    protected Driver driverPkey;
    @XmlElement(name = "passenger_pkey", required = true)
    protected Passenger passengerPkey;
    @XmlElement(name = "address_from", required = true)
    protected String addressFrom;
    @XmlElement(name = "address_to", required = true)
    protected String addressTo;
    @XmlElement(name = "date_start", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateStart;
    @XmlElement(name = "date_change", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateChange;
    protected int price;
    @XmlElement(required = true)
    protected Status status;
    protected boolean estimate;
    @XmlElement(required = true)
    protected String report;

    /**
     * Gets the value of the tripsId property.
     * 
     */
    public long gettrips_pkey() {
        return trips_pkey;
    }

    /**
     * Sets the value of the tripsId property.
     * 
     */
    public void settrips_pkey(long value) {
        this.trips_pkey = value;
    }

    /**
     * Gets the value of the driverPkey property.
     * 
     * @return
     *     possible object is
     *     {@link Driver }
     *     
     */
    public Driver getDriverPkey() {
        return driverPkey;
    }

    /**
     * Sets the value of the driverPkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Driver }
     *     
     */
    public void setDriverPkey(Driver value) {
        this.driverPkey = value;
    }

    /**
     * Gets the value of the passengerPkey property.
     * 
     * @return
     *     possible object is
     *     {@link Passenger }
     *     
     */
    public Passenger getPassengerPkey() {
        return passengerPkey;
    }

    /**
     * Sets the value of the passengerPkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Passenger }
     *     
     */
    public void setPassengerPkey(Passenger value) {
        this.passengerPkey = value;
    }

    /**
     * Gets the value of the addressFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressFrom() {
        return addressFrom;
    }

    /**
     * Sets the value of the addressFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressFrom(String value) {
        this.addressFrom = value;
    }

    /**
     * Gets the value of the addressTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTo() {
        return addressTo;
    }

    /**
     * Sets the value of the addressTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTo(String value) {
        this.addressTo = value;
    }

    /**
     * Gets the value of the dateStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateStart() {
        return dateStart;
    }

    /**
     * Sets the value of the dateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateStart(XMLGregorianCalendar value) {
        this.dateStart = value;
    }

    /**
     * Gets the value of the dateChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateChange() {
        return dateChange;
    }

    /**
     * Sets the value of the dateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateChange(XMLGregorianCalendar value) {
        this.dateChange = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(int value) {
        this.price = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the estimate property.
     * 
     */
    public boolean isEstimate() {
        return estimate;
    }

    /**
     * Sets the value of the estimate property.
     * 
     */
    public void setEstimate(boolean value) {
        this.estimate = value;
    }

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReport(String value) {
        this.report = value;
    }

}
