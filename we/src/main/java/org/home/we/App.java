package org.home.we;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.slf4j.MarkerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

/**
 * Hello world!
 *
 */
public class App {
	private static Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {

		System.out.println("Hello World!");
		System.out.println("Hello world 2");

		LOGGER.debug("Hello World! LOGGER");

		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		StatusPrinter.print(lc);
		
		MDC.put("client", "Alina");


		LOGGER.debug("Hello World! LOGGER","gdgs");
		LOGGER.debug(MarkerFactory.getMarker("NOTIFY_ADMIN"),"Ionut");
		
		MDC.remove("client");
		

	}
}
