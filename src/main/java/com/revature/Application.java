package com.revature;

import org.apache.log4j.Logger;

public class Application {

	public static void main(String[] args) {
		Logger log = Logger.getLogger(Application.class);
		log.debug("this is debug level");
		log.info("this is info level");
		log.warn("this is warn level");
		log.error("this is error level");
		log.fatal("this is fatal level");
	}
}
