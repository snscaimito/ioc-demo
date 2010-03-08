package net.caimito.courseware.classic;

public class ApplicationModel {

	public static final String NO_INPUT_YET = "THERE IS NO DATA YET" ;
	
	private String applicationData = NO_INPUT_YET ;
	
	public String getData() {
		return applicationData ;
	}

	public void setInput(String input) {
		applicationData = input.toUpperCase() ;
	}

}
