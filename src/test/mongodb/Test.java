package test.mongodb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("properties/application.xml");

		 //FileRepository rep = (FileRepository)ctx.getBean("fileRepository");

		 

	}

}
