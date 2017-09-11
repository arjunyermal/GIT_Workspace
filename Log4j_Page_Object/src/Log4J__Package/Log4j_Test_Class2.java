package Log4J__Package;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;

public class Log4j_Test_Class2 {
	
	private static final Logger log = LogManager.getLogger(Log4j_Test_Class2.class.getName());
	@Test
	public void Log4j_Practice2()
	{
		
		log.trace("Trace");
		log.debug("Debug");
		log.error("Error");
		log.fatal("Fatal");
		log.info("Info");
		log.warn("Warn");	
		
	}

}
