package net.caimito.courseware.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIoC {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "ioc-demo.xml" });
		
		System.out.println("SansIoC Demo Application") ;

		SpringApplicationView view = (SpringApplicationView) context.getBean(SpringApplicationView.class) ;
		view.start() ;
	}

}
