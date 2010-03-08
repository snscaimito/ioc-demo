package net.caimito.courseware.ioc;


public class SpringApplicationModel {

	private String applicationData = "This is simulated application data" ;
	
	public String getData() {
		return applicationData ;
	}

	public void setInput(String input) {
		applicationData = input ;
	}

}
