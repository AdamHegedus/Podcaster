package com.limitless.audio.core.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for itemType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="itemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}title"/>
 *         &lt;element ref="{}link"/>
 *         &lt;element ref="{}description"/>
 *         &lt;element ref="{}subtitle"/>
 *         &lt;element ref="{}summary"/>
 *         &lt;element name="enclosure" type="{}enclosureType"/>
 *         &lt;element ref="{}guid"/>
 *         &lt;element ref="{}pubDate"/>
 *         &lt;element ref="{}duration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemType", propOrder = { "title", "link", "description",
		"subtitle", "summary", "enclosure", "guid", "pubDate", "duration" })
public class ItemType {

	@XmlElement(required = true)
	private String title;
	@XmlElement(required = true)
	private String link;
	@XmlElement(required = true)
	private String description;
	@XmlElement(required = true)
	private String subtitle;
	@XmlElement(required = true)
	private String summary;
	@XmlElement(required = true)
	private EnclosureType enclosure;
	@XmlElement(required = true)
	private String guid;
	@XmlElement(required = true)
	private String pubDate;
	@XmlElement(required = true)
	private String duration;

	/**
	 * Gets the value of the title property.
	 * 
	 * @return title is {@link String }
	 * 
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the value of the title property.
	 * 
	 * @param title
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the value of the link property.
	 * 
	 * @return link is {@link String }
	 * 
	 */
	public String getLink() {
		return link;
	}

	/**
	 * Sets the value of the link property.
	 * 
	 * @param link
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return description is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param description
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the value of the subtitle property.
	 * 
	 * @return subtitle is {@link String }
	 * 
	 */
	public String getSubtitle() {
		return subtitle;
	}

	/**
	 * Sets the value of the subtitle property.
	 * 
	 * @param subtitle
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	/**
	 * Gets the value of the summary property.
	 * 
	 * @return summary is {@link String }
	 * 
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * Sets the value of the summary property.
	 * 
	 * @param summary
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**
	 * Gets the value of the enclosure property.
	 * 
	 * @return enclosure is {@link EnclosureType }
	 * 
	 */
	public EnclosureType getEnclosure() {
		return enclosure;
	}

	/**
	 * Sets the value of the enclosure property.
	 * 
	 * @param enclosure
	 *            allowed object is {@link EnclosureType }
	 * 
	 */
	public void setEnclosure(EnclosureType enclosure) {
		this.enclosure = enclosure;
	}

	/**
	 * Gets the value of the guid property.
	 * 
	 * @return guid is {@link String }
	 * 
	 */
	public String getGuid() {
		return guid;
	}

	/**
	 * Sets the value of the guid property.
	 * 
	 * @param guid
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGuid(String guid) {
		this.guid = guid;
	}

	/**
	 * Gets the value of the pubDate property.
	 * 
	 * @return pubDate is {@link String }
	 * 
	 */
	public String getPubDate() {
		return pubDate;
	}

	/**
	 * Sets the value of the pubDate property.
	 * 
	 * @param pubDate
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	/**
	 * Gets the value of the duration property.
	 * 
	 * @return duration is {@link String }
	 * 
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * Sets the value of the duration property.
	 * 
	 * @param duration
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

}
