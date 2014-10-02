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
		// TODO Auto-generated method stub
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

		Rss rss = (Rss) unmarshaller.unmarshal(new File("2.xml"));

		System.out.println(rss.getVersion() + " version");

		System.out.println("itunes:author : "
				+ rss.getChannel().getItunesAuthor());

		for (com.limitless.audio.core.xml.ItemType act : rss.getChannel()
				.getItem()) {
			System.out.println("Title: " + act.getTitle());

		}

		OutputStream outputXml = new FileOutputStream("1.xml");

		marshaller.marshal(rss, outputXml);
	}
}
