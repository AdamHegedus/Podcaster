package com.limitless.audio.core.xml;

import java.util.ArrayList;

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
 * &lt;complexType name="channelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}title"/>
 *         &lt;element ref="{}link"/>
 *         &lt;element ref="{}language"/>
 *         &lt;element ref="{}description"/>
 *         &lt;element ref="{}pubDate"/>
 *         &lt;element name="image" type="{}imageType"/>
 *         &lt;element ref="{}copyright"/>
 *         &lt;element ref="{}subtitle"/>
 *         &lt;element ref="{}summary"/>
 *         &lt;element name="item" type="{}itemType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channelType", propOrder = { "title", "link", "language",
		"description", "pubDate", "image", "copyright", "subtitle", "summary",
		"itunesAuthor", "itunesSubtitle", "itunesSummary", "itunesCategory",
		"itunesExplicit", "itunesOwner", "item" })
public class ChannelType {

	@XmlElement(required = true)
	private String title;
	@XmlElement(required = true)
	private String link;
	@XmlElement(required = true)
	private String language;
	@XmlElement(required = true)
	private String description;
	@XmlElement(required = true)
	private String pubDate;
	@XmlElement(required = true)
	private ImageType image;
	@XmlElement(required = true)
	private String copyright;
	@XmlElement(required = true)
	private String subtitle;
	@XmlElement(required = true)
	private String summary;
	@XmlElement(required = true)
	private ArrayList<ItemType> item;
	@XmlElement(required = true, name = "author", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private String itunesAuthor;
	@XmlElement(required = true, name = "subtitle", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private String itunesSubtitle;
	@XmlElement(required = true, name = "summary", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private String itunesSummary;
	@XmlElement(required = true, name = "category", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private String itunesCategory;
	@XmlElement(required = true, name = "explicit", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private String itunesExplicit;
	@XmlElement(required = true, name = "owner", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private OwnerType itunesOwner;

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
	 * Gets the value of the language property.
	 * 
	 * @return language is {@link String }
	 * 
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Sets the value of the language property.
	 * 
	 * @param language
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLanguage(String language) {
		this.language = language;
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
	 * Gets the value of the image property.
	 * 
	 * @return image is {@link ImageType }
	 * 
	 */
	public ImageType getImage() {
		return image;
	}

	/**
	 * Sets the value of the image property.
	 * 
	 * @param image
	 *            allowed object is {@link ImageType }
	 * 
	 */
	public void setImage(ImageType image) {
		this.image = image;
	}

	/**
	 * Gets the value of the copyright property.
	 * 
	 * @return copyright is {@link String }
	 * 
	 */
	public String getCopyright() {
		return copyright;
	}

	/**
	 * Sets the value of the copyright property.
	 * 
	 * @param copyright
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCopyright(String copyright) {
		this.copyright = copyright;
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
	 * Gets the value of the item property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the item property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getItem().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ItemType }
	 * 
	 * 
	 */
	public ArrayList<ItemType> getItem() {
		if (item == null) {
			item = new ArrayList<ItemType>();
		}
		return this.item;
	}

	/**
	 * Gets the value of the summary property.
	 * 
	 * @return itunesAuthor is {@link String }
	 * 
	 */
	public String getItunesAuthor() {
		return itunesAuthor;
	}

	/**
	 * Sets the value of the summary property.
	 * 
	 * @param itunesAuthor
	 *            allowed object is {@link String }
	 * 
	 */
	public void setItunesAuthor(String itunesAuthor) {
		this.itunesAuthor = itunesAuthor;
	}

	/**
	 * Gets the value of the itunesSubtitle property.
	 * 
	 * @return itunesSubtitle is {@link String }
	 */
	public String getItunesSubtitle() {
		return itunesSubtitle;
	}

	/**
	 * Sets the value of the itunesSubtitle property.
	 * 
	 * @param itunesSubtitle
	 *            allowed object is {@link String }
	 */
	public void setItunesSubtitle(String itunesSubtitle) {
		this.itunesSubtitle = itunesSubtitle;
	}

	/**
	 * Gets the value of the itunesSummary property.
	 * 
	 * @return itunesSummary is {@link String }
	 */
	public String getItunesSummary() {
		return itunesSummary;
	}

	/**
	 * 
	 * Sets the value of the itunesSummary property.
	 * 
	 * @param itunesSummary
	 *            allowed object is {@link String }
	 */
	public void setItunesSummary(String itunesSummary) {
		this.itunesSummary = itunesSummary;
	}

	/**
	 * Gets the value of the itunesCategory property.
	 * 
	 * @return itunesCategory is {@link String }
	 */
	public String getItunesCategory() {
		return itunesCategory;
	}

	/**
	 * Sets the value of the itunesCategory property.
	 * 
	 * @param itunesCategory
	 *            allowed object is {@link String }
	 */
	public void setItunesCategory(String itunesCategory) {
		this.itunesCategory = itunesCategory;
	}

	/**
	 * Gets the value of the itunesExplicit property.
	 * 
	 * @return itunesExplicit is {@link String }
	 */
	public String getItunesExplicit() {
		return itunesExplicit;
	}

	/**
	 * Sets the value of the itunesExplicit property.
	 * 
	 * @param itunesExplicit
	 *            allowed object is {@link String }
	 */
	public void setItunesExplicit(String itunesExplicit) {
		this.itunesExplicit = itunesExplicit;
	}

	/**
	 * Gets the value of the itunesOwner property.
	 * 
	 * @return itunesOwner is {@link OwnerType }
	 */
	public OwnerType getItunesOwner() {
		return itunesOwner;
	}

	/**
	 * Sets the value of the itunesOwner property.
	 * 
	 * @param itunesOwner
	 *            allowed object is {@link OwnerType }
	 */
	public void setItunesOwner(OwnerType itunesOwner) {
		this.itunesOwner = itunesOwner;
	}

}
