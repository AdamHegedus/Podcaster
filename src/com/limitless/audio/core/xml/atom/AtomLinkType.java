package com.limitless.audio.core.xml.atom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atomicLinkType")
public class AtomLinkType {
	@XmlAttribute(name = "href", required = true)
	private String href;
	@XmlAttribute(name = "rel", required = true)
	private String rel;
	@XmlAttribute(name = "type", required = true)
	private String type;

	/**
	 * @return the href
	 */
	public String getHref() {
		return href;
	}

	/**
	 * @param href
	 *            the href to set
	 */
	public void setHref(String href) {
		this.href = href;
	}

	/**
	 * @return the rel
	 */
	public String getRel() {
		return rel;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

}
