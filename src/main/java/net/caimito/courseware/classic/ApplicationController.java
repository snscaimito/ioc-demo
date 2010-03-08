package net.caimito.courseware.classic;

import java.io.BufferedReader;
import java.io.IOException;

public class ApplicationController {

	private ApplicationModel model ;
	private BufferedReader bufferedReader ;
	
	public ApplicationController(ApplicationModel applicationModel, BufferedReader reader) {
		this.model = applicationModel ;
		this.bufferedReader = reader ;
	}
	
	public void askForInput() {
		System.out.println() ;
		System.out.println("Please enter some data. Terminate with . on a single line:") ;
		
		String data = "" ;
		String input = "." ;
		try {
			do {
				input = bufferedReader.readLine() ;
				if (!input.equals("."))
					data += input + "\r\n" ;
			} while (!input.equals(".")) ;
		} catch (IOException e) {
			data = "" ;
		}
		
		model.setInput(data) ;
	}

}
