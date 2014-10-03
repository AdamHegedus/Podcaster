package com.limitless.audio.core.xml.itunes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itunesImageType", propOrder = { "href" })
public class ItunesImageType {
	@XmlAttribute(name = "href", required = true)
	private String href;
}
