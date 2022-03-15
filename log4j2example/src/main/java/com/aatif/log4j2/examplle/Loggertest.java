
package com.aatif.log4j2.examplle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Loggertest {
	public static void main(String[] args) {
		System.out.println("Testing");
		Logger logger = LogManager.getLogger(Loggertest.class);
		Logger annLogger = LogManager.getLogger("annLogger");
		Logger cgLogger = LogManager.getLogger("cgLogger");

		annLogger.info("annLogger");
		cgLogger.info("cgLogger");

		logger.info("Testing");
		annLogger.info("annLogger");
		cgLogger.info("cgLogger");

	}
}
