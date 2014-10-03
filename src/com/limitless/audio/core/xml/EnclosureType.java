package com.limitless.audio.core.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for enclosureType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="enclosureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="url" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="length" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 * iTunes supported enclosures:
 * 
 * <pre>
 * File Type
 * 
 * MP3	audio/mpeg
 * M4A 	audio/x-m4a 
 * MP4 	video/mp4 
 * M4V 	video/x-m4v 
 * MOV 	video/quicktime 
 * PDF 	application/pdf 
 * EPUB 	document/x-epub
 * </pre>
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enclosureType")
public class EnclosureType {

	@XmlAttribute(name = "url", required = true)
	private String url;
	@XmlAttribute(name = "length", required = true)
	private int length;
	@XmlAttribute(name = "type", required = true)
	private String type;

	/**
	 * Gets the value of the url property.
	 * 
	 * @return url is {@link String }
	 * 
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets the value of the url property.
	 * 
	 * @param url
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Gets the value of the length property.
	 * 
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Sets the value of the length property.
	 * 
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 * @return type is {@link String }
	 * 
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param type
	 *            allowed object is {@link String }
	 * 
	 */
	public void setType(String type) {
		this.type = type;
	}

}
