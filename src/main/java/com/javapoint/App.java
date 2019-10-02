//package com.javapoint;
//
///**
// * Hello world!
// *
// */
//public class App
//{
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }
//}

package com.javapoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@RestController
@EnableAutoConfiguration
public class App {

	//private static final Logger log = LoggerFactory.getLogger( App.class );
	
	private static final Logger logger = LogManager.getLogger(App.class);
	
	
	@RequestMapping("/")
    String hello() {
        System.out.println("Hello sysout");
       
        //log.info("Log Info - Profile request accessed.");
  	    //log.trace("trace - Profile request accessed.");
  	    
	  	  logger.debug("Debugging log");
	      logger.info("Info log");
	      logger.trace("Trace log");
	      logger.warn("Hey, This is a warning!");
	      logger.error("Oops! We have an Error. OK");
	      logger.fatal("Damn! Fatal error. Please fix me.");   

        
    	return "Hello World! JavaInterviewPoint";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}
