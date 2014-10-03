package com.limitless.audio.core.xml.itunes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for channelType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="itunesOwnerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}name"/>
 *         &lt;element ref="{}email"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itunesOwnerType", propOrder = { "name", "email" })
public class ItunesOwnerType {
	@XmlElement(required = true, namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private String name;
	@XmlElement(required = true, namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private String email;

	/**
	 * Gets the value of the title property.
	 * 
	 * @return name is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the title property.
	 * 
	 * @param name
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTitle(String name) {
		this.name = name;
	}

	/**
	 * Gets the value of the title property.
	 * 
	 * @return name is {@link String }
	 * 
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the value of the title property.
	 * 
	 * @param email
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}
