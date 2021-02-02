package org.fujitsu.training.codes;

import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Mathematics {
	
	//Step 1 : Create the logger
	private static Logger logger = Logger.getLogger(Mathematics.class.getName());
	
	//Step 1b : Set the default levels ont the constructor
	
	public Mathematics() {
		//logger.setLevel(Level.INFO);
		logger.setLevel(Level.INFO);
		
		//HANDLER
		// Step 1: set type of handler (sa isang class, isang file handler lang dapat.)
		
		try {
			// Step 2: add desired medium
			FileHandler file = new FileHandler("./src/logs/math.log", true);
			file.setEncoding("UTF-8");
			file.setLevel(Level.WARNING);
			
			// Step 3: set ng formatter or own message format on the medium
			//xml type ang default
			SimpleFormatter simple = new SimpleFormatter();
			file.setFormatter(simple);
			
			logger.addHandler(file);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		logger.info("Welcome! Mathematics is created.");
	}
	
	public Mathematics(int x) {
		logger.info("Welcome! Mathematics is created." + x);
	}

	
	public int add(int x, int y) {
		logger.info("add() called...");
		logger.info("result =" + (x + y));
		logger.info("add() exits...");
		return x + y;
	}
	
	@SuppressWarnings("unused")
	public int div(int x, int y) throws ArithmeticException, Exception{
		logger.info("div() called...");
		//logger.info(logger.getLevel().getName() + "");
		
		logger.warning("deprecated or suspicious Date object used...");
		Date now = new Date(121, 0, 29);
		if(y == 0) {
			logger.severe("division by zero error...");
			throw new ArithmeticException();
		}
		logger.info("div() exits...");
			return x / y;	
	}
	
	public static void display() {
		logger.info("display() called...");
		logger.info("display() exits...");
	}

}
