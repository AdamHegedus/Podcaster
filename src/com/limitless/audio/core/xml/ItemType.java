package com.limitless.audio.core.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.limitless.audio.core.xml.itunes.ItunesCategoryType;
import com.limitless.audio.core.xml.itunes.ItunesImageType;

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
 *         &lt;element ref="{}guid"/>
 *         &lt;element name="enclosure" type="{}enclosureType"/>
 *         &lt;element ref="{}pubDate"/>
 *         &lt;element ref="{}author"/>
 *         
 *         
 *         
 *         
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
		"guid", "enclosure", "pubDate", "author", "itunesAuthor",
		"itunesSubtitle", "itunesSummary", "itunesCategory", "itunesDuration",
		"itunesImage", "itunesExplicit" })
public class ItemType {

	// the required tags for the items
	@XmlElement(required = true)
	private String title;
	@XmlElement(required = true)
	private String link;
	@XmlElement(required = true)
	private String description;
	@XmlElement(required = true)
	private String guid;
	@XmlElement(required = true)
	private EnclosureType enclosure;
	@XmlElement(required = true)
	private String pubDate;

	// the optional tags for the items
	@XmlElement
	private String author;

	// the iTunes specific tags for the items
	@XmlElement(required = true, name = "author", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private String itunesAuthor;
	@XmlElement(required = true, name = "subtitle", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private String itunesSubtitle;
	@XmlElement(required = true, name = "summary", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private String itunesSummary;
	@XmlElement(name = "category", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private ItunesCategoryType itunesCategory;
	@XmlElement(name = "duration", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private String itunesDuration;
	@XmlElement(required = true, name = "image", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private ItunesImageType itunesImage;
	@XmlElement(required = true, name = "explicit", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private String itunesExplicit;

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
	 * @return the guid
	 */
	public String getGuid() {
		return guid;
	}

	/**
	 * @param guid
	 *            the guid to set
	 */
	public void setGuid(String guid) {
		this.guid = guid;
	}

	/**
	 * @return the enclosure
	 */
	public EnclosureType getEnclosure() {
		return enclosure;
	}

	/**
	 * @param enclosure
	 *            the enclosure to set
	 */
	public void setEnclosure(EnclosureType enclosure) {
		this.enclosure = enclosure;
	}

	/**
	 * @return the pubDate
	 */
	public String getPubDate() {
		return pubDate;
	}

	/**
	 * @param pubDate
	 *            the pubDate to set
	 */
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the itunesAuthor
	 */
	public String getItunesAuthor() {
		return itunesAuthor;
	}

	/**
	 * @param itunesAuthor
	 *            the itunesAuthor to set
	 */
	public void setItunesAuthor(String itunesAuthor) {
		this.itunesAuthor = itunesAuthor;
	}

	/**
	 * @return the itunesSubtitle
	 */
	public String getItunesSubtitle() {
		return itunesSubtitle;
	}

	/**
	 * @param itunesSubtitle
	 *            the itunesSubtitle to set
	 */
	public void setItunesSubtitle(String itunesSubtitle) {
		this.itunesSubtitle = itunesSubtitle;
	}

	/**
	 * @return the itunesSummary
	 */
	public String getItunesSummary() {
		return itunesSummary;
	}

	/**
	 * @param itunesSummary
	 *            the itunesSummary to set
	 */
	public void setItunesSummary(String itunesSummary) {
		this.itunesSummary = itunesSummary;
	}

	/**
	 * @return the itunesCategory
	 */
	public ItunesCategoryType getItunesCategory() {
		return itunesCategory;
	}

	/**
	 * @param itunesCategory
	 *            the itunesCategory to set
	 */
	public void setItunesCategory(ItunesCategoryType itunesCategory) {
		this.itunesCategory = itunesCategory;
	}

	/**
	 * @return the itunesDuration
	 */
	public String getItunesDuration() {
		return itunesDuration;
	}

	/**
	 * @param itunesDuration
	 *            the itunesDuration to set
	 */
	public void setItunesDuration(String itunesDuration) {
		this.itunesDuration = itunesDuration;
	}

	/**
	 * @return the itunesImage
	 */
	public ItunesImageType getItunesImage() {
		return itunesImage;
	}

	/**
	 * @param itunesImage
	 *            the itunesImage to set
	 */
	public void setItunesImage(ItunesImageType itunesImage) {
		this.itunesImage = itunesImage;
	}

	/**
	 * @return the itunesExplicit
	 */
	public String getItunesExplicit() {
		return itunesExplicit;
	}

	/**
	 * @param itunesExplicit
	 *            the itunesExplicit to set
	 */
	public void setItunesExplicit(String itunesExplicit) {
		this.itunesExplicit = itunesExplicit;
	}

}
