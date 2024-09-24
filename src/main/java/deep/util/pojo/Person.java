package deep.util.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element name="c" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="employeenumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ikeahrid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="facsimiletelephonenumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="givenname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ikeacostcenter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ikeadepartment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ikeahomesite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ikealangcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ikealegacyuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ikearolelist">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="initials" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="l" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="manager" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ou" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telephonenumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ikeastatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ikeaguid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ikeabusinessunit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createtimestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modifytimestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "c",
        "cn",
        "employeenumber",
        "ikeahrid",
        "facsimiletelephonenumber",
        "givenname",
        "sn",
        "ikeacostcenter",
        "ikeadepartment",
        "ikeahomesite",
        "ikealangcode",
        "ikealegacyuid",
        "ikearolelist",
        "initials",
        "l",
        "mail",
        "manager",
        "mobile",
        "ou",
        "telephonenumber",
        "title",
        "uid",
        "ikeastatus",
        "ikeaguid",
        "ikeabusinessunit",
        "createtimestamp",
        "modifytimestamp"
})
public class Person {

    @XmlElement(required = true)
    protected String c;
    @XmlElement(required = true)
    protected String cn;
    @XmlElement(required = true)
    protected String employeenumber;
    @XmlElement(required = true)
    protected String ikeahrid;
    @XmlElement(required = true)
    protected String facsimiletelephonenumber;
    @XmlElement(required = true)
    protected String givenname;
    @XmlElement(required = true)
    protected String sn;
    @XmlElement(required = true)
    protected String ikeacostcenter;
    @XmlElement(required = true)
    protected String ikeadepartment;
    @XmlElement(required = true)
    protected String ikeahomesite;
    @XmlElement(required = true)
    protected String ikealangcode;
    @XmlElement(required = true)
    protected String ikealegacyuid;
    @XmlElement(required = true)
    protected Ikearolelist ikearolelist;
    @XmlElement(required = true)
    protected String initials;
    @XmlElement(required = true)
    protected String l;
    @XmlElement(required = true)
    protected String mail;
    @XmlElement(required = true)
    protected String manager;
    @XmlElement(required = true)
    protected String mobile;
    @XmlElement(required = true)
    protected String ou;
    @XmlElement(required = true)
    protected String telephonenumber;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String uid;
    @XmlElement(required = true)
    protected String ikeastatus;
    @XmlElement(required = true)
    protected String ikeaguid;
    @XmlElement(required = true)
    protected String ikeabusinessunit;
    @XmlElement(required = true)
    protected String createtimestamp;
    @XmlElement(required = true)
    protected String modifytimestamp;

    /**
     * Gets the value of the c property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getC() {
        return c;
    }

    /**
     * Sets the value of the c property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setC(String value) {
        this.c = value;
    }

    /**
     * Gets the value of the cn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCn() {
        return cn;
    }

    /**
     * Sets the value of the cn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCn(String value) {
        this.cn = value;
    }

    /**
     * Gets the value of the employeenumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmployeenumber() {
        return employeenumber;
    }

    /**
     * Sets the value of the employeenumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmployeenumber(String value) {
        this.employeenumber = value;
    }

    /**
     * Gets the value of the ikeahrid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIkeahrid() {
        return ikeahrid;
    }

    /**
     * Sets the value of the ikeahrid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIkeahrid(String value) {
        this.ikeahrid = value;
    }

    /**
     * Gets the value of the facsimiletelephonenumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFacsimiletelephonenumber() {
        return facsimiletelephonenumber;
    }

    /**
     * Sets the value of the facsimiletelephonenumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFacsimiletelephonenumber(String value) {
        this.facsimiletelephonenumber = value;
    }

    /**
     * Gets the value of the givenname property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGivenname() {
        return givenname;
    }

    /**
     * Sets the value of the givenname property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGivenname(String value) {
        this.givenname = value;
    }

    /**
     * Gets the value of the sn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSn() {
        return sn;
    }

    /**
     * Sets the value of the sn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSn(String value) {
        this.sn = value;
    }

    /**
     * Gets the value of the ikeacostcenter property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIkeacostcenter() {
        return ikeacostcenter;
    }

    /**
     * Sets the value of the ikeacostcenter property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIkeacostcenter(String value) {
        this.ikeacostcenter = value;
    }

    /**
     * Gets the value of the ikeadepartment property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIkeadepartment() {
        return ikeadepartment;
    }

    /**
     * Sets the value of the ikeadepartment property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIkeadepartment(String value) {
        this.ikeadepartment = value;
    }

    /**
     * Gets the value of the ikeahomesite property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIkeahomesite() {
        return ikeahomesite;
    }

    /**
     * Sets the value of the ikeahomesite property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIkeahomesite(String value) {
        this.ikeahomesite = value;
    }

    /**
     * Gets the value of the ikealangcode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIkealangcode() {
        return ikealangcode;
    }

    /**
     * Sets the value of the ikealangcode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIkealangcode(String value) {
        this.ikealangcode = value;
    }

    /**
     * Gets the value of the ikealegacyuid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIkealegacyuid() {
        return ikealegacyuid;
    }

    /**
     * Sets the value of the ikealegacyuid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIkealegacyuid(String value) {
        this.ikealegacyuid = value;
    }

    /**
     * Gets the value of the ikearolelist property.
     *
     * @return
     *     possible object is
     *     {@link Ikearolelist }
     *
     */
    public Ikearolelist getIkearolelist() {
        return ikearolelist;
    }

    /**
     * Sets the value of the ikearolelist property.
     *
     * @param value
     *     allowed object is
     *     {@link Ikearolelist }
     *
     */
    public void setIkearolelist(Ikearolelist value) {
        this.ikearolelist = value;
    }

    /**
     * Gets the value of the initials property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInitials() {
        return initials;
    }

    /**
     * Sets the value of the initials property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInitials(String value) {
        this.initials = value;
    }

    /**
     * Gets the value of the l property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getL() {
        return l;
    }

    /**
     * Sets the value of the l property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setL(String value) {
        this.l = value;
    }

    /**
     * Gets the value of the mail property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMail() {
        return mail;
    }

    /**
     * Sets the value of the mail property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMail(String value) {
        this.mail = value;
    }

    /**
     * Gets the value of the manager property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setManager(String value) {
        this.manager = value;
    }

    /**
     * Gets the value of the mobile property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the ou property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOu() {
        return ou;
    }

    /**
     * Sets the value of the ou property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOu(String value) {
        this.ou = value;
    }

    /**
     * Gets the value of the telephonenumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTelephonenumber() {
        return telephonenumber;
    }

    /**
     * Sets the value of the telephonenumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTelephonenumber(String value) {
        this.telephonenumber = value;
    }

    /**
     * Gets the value of the title property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the uid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the ikeastatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIkeastatus() {
        return ikeastatus;
    }

    /**
     * Sets the value of the ikeastatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIkeastatus(String value) {
        this.ikeastatus = value;
    }

    /**
     * Gets the value of the ikeaguid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIkeaguid() {
        return ikeaguid;
    }

    /**
     * Sets the value of the ikeaguid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIkeaguid(String value) {
        this.ikeaguid = value;
    }

    /**
     * Gets the value of the ikeabusinessunit property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIkeabusinessunit() {
        return ikeabusinessunit;
    }

    /**
     * Sets the value of the ikeabusinessunit property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIkeabusinessunit(String value) {
        this.ikeabusinessunit = value;
    }

    /**
     * Gets the value of the createtimestamp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreatetimestamp() {
        return createtimestamp;
    }

    /**
     * Sets the value of the createtimestamp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreatetimestamp(String value) {
        this.createtimestamp = value;
    }

    /**
     * Gets the value of the modifytimestamp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getModifytimestamp() {
        return modifytimestamp;
    }

    /**
     * Sets the value of the modifytimestamp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setModifytimestamp(String value) {
        this.modifytimestamp = value;
    }


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
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
            "value"
    })
    public static class Ikearolelist {

        protected List<String> value;

        /**
         * Gets the value of the value property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         *
         *
         */
        public List<String> getValue() {
            if (value == null) {
                value = new ArrayList<String>();
            }
            return this.value;
        }

    }

}
