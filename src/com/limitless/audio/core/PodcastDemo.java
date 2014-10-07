package com.limitless.audio.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.limitless.audio.core.xml.Rss;

public class PodcastDemo {

	public static void main(String[] args) {
		try {
			reading();
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void reading() throws JAXBException, FileNotFoundException {
		JAXBContext ctx = JAXBContext.newInstance(Rss.class);
		Unmarshaller unmarshaller = ctx.createUnmarshaller();
		Marshaller marshaller = ctx.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		Rss rss = (Rss) unmarshaller.unmarshal(new File("1.xml"));

		System.out.println("\n\t RSS Channel Data: \n");
		System.out.println("Title: \t" + rss.getChannel().getTitle());
		System.out.println("Description: \t"
				+ rss.getChannel().getDescription());
		System.out.println("Link: \t" + rss.getChannel().getLink());

		System.out.println("\n");
		System.out.println("itunes:author : "
				+ rss.getChannel().getItunesAuthor());

		for (com.limitless.audio.core.xml.ItemType act : rss.getChannel()
				.getItem()) {
			System.out.println("Title: " + act.getTitle());

		}

		OutputStream outputXml = new FileOutputStream("output.xml");

		marshaller.marshal(rss, outputXml);
	}
}
