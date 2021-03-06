//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.29 at 12:59:29 AM CEST 
//


package de.nrw.hbz.deepzoomer.dzi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="Size">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Format" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Overlap" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TileSize" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "size"
})
@XmlRootElement(name = "Image")
public class Image {

    @XmlElement(name = "Size", required = true)
    protected Image.Size size;
    @XmlAttribute(name = "Format")
    protected String format;
    @XmlAttribute(name = "Overlap")
    protected String overlap;
    @XmlAttribute(name = "TileSize")
    protected String tileSize;

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Image.Size }
     *     
     */
    public Image.Size getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image.Size }
     *     
     */
    public void setSize(Image.Size value) {
        this.size = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the overlap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverlap() {
        return overlap;
    }

    /**
     * Sets the value of the overlap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverlap(String value) {
        this.overlap = value;
    }

    /**
     * Gets the value of the tileSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTileSize() {
        return tileSize;
    }

    /**
     * Sets the value of the tileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTileSize(String value) {
        this.tileSize = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Size {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Height")
        protected String height;
        @XmlAttribute(name = "Width")
        protected String width;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the height property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHeight() {
            return height;
        }

        /**
         * Sets the value of the height property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHeight(String value) {
            this.height = value;
        }

        /**
         * Gets the value of the width property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWidth() {
            return width;
        }

        /**
         * Sets the value of the width property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWidth(String value) {
            this.width = value;
        }

    }

}
