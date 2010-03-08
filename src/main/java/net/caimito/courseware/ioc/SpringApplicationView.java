package net.caimito.courseware.ioc;

public class SpringApplicationView {
	private SpringApplicationModel model ;
	private SpringApplicationController controller ;
	
	public SpringApplicationView() {
	}

	public void setController(SpringApplicationController controller) {
		this.controller = controller;
	}
	
	public void setModel(SpringApplicationModel model) {
		this.model = model;
	}
	
	public void show() {
		System.out.println("------------------------------------") ;
		System.out.println("This comes from the application view") ;
		System.out.println("Getting data from application model:") ;
		System.out.println(model.getData().toUpperCase()) ;
		System.out.println("------------------------------------") ;
	}
	
	public void start() {
		show() ;
		
		controller.askForInput() ;
		
		show() ;
	}

}
