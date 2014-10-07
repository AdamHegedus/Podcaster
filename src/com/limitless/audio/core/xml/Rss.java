package com.limitless.audio.core.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for RSS representation.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="channel" type="{}channelType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;enumeration value="2.0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "channel" })
@XmlRootElement(name = "rss")
public class Rss {

	@XmlElement(required = true)
	private ChannelType channel;
	@XmlAttribute(name = "version", required = true)
	private String version;

	/**
	 * Gets the channel.
	 * 
	 * @return channel is {@link ChannelType }
	 * 
	 */
	public ChannelType getChannel() {
		return channel;
	}

	/**
	 * Sets the channel.
	 * 
	 * @param channel
	 *            allowed object is {@link ChannelType }
	 * 
	 */
	public void setChannel(ChannelType channel) {
		this.channel = channel;
	}
}
