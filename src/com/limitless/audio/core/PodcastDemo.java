package com.limitless.audio.core;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.limitless.audio.core.xml.Rss;

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

		Rss rss = (Rss) unmarshaller.unmarshal(new File("2.xml"));

		System.out.println(rss.getVersion());
		for (com.limitless.audio.core.xml.ItemType act : rss.getChannel()
				.getItem()) {
			System.out.println("Title: " + act.getTitle());

		}
	}
}
