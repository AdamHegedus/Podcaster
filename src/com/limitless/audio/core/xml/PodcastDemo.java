package com.limitless.audio.core.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class PodcastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			reading();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	private static void reading() throws JAXBException {
		JAXBContext ctx = JAXBContext.newInstance(Rss.class);
		Unmarshaller unmarshaller = ctx.createUnmarshaller();

		Rss ut = (Rss) unmarshaller.unmarshal(new File("2.xml"));

		System.out.println(ut.getVersion());
		for (com.limitless.audio.core.xml.ItemType act : ut.getChannel().item) {
			System.out.println("Title: " + act.getTitle());

		}
	}

}
