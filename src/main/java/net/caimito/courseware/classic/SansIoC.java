package net.caimito.courseware.classic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SansIoC {

	public static void main(String[] args) {
		InputStreamReader reader = new InputStreamReader(System.in) ;
		BufferedReader bufferedReader = new BufferedReader(reader) ;

		ApplicationModel model = new ApplicationModel() ;
		ApplicationController controller = new ApplicationController(model, bufferedReader) ;
		ApplicationView view = new ApplicationView(model, controller) ;
		
		System.out.println("SansIoC Demo Application") ;
		
		view.start() ;
	}

}




