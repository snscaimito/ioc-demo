package net.caimito.courseware.classic;

public class ApplicationView {

	private ApplicationModel model ;
	private ApplicationController controller ;
	
	public ApplicationView(ApplicationModel applicationModel, ApplicationController applicationController) {
		this.model = applicationModel ;
		this.controller = applicationController ;
	}

	public String getHeader() {
		StringBuffer buffer = new StringBuffer() ;
		buffer.append("------------------------------------\r\n") ;
		buffer.append("This comes from the application view\r\n") ;
		buffer.append("Getting data from application model:\r\n") ;
		return buffer.toString() ;
	}
	
	public String getFooter() {
		StringBuffer buffer = new StringBuffer() ;
		buffer.append("------------------------------------\r\n") ;
		return buffer.toString() ;
		
	}
	
	public String renderView() {
		StringBuffer buffer = new StringBuffer() ;
		buffer.append(getHeader()) ;
		buffer.append(model.getData() + "\r\n") ;
		buffer.append(getFooter()) ;
		return buffer.toString() ;
	}
	
	public void start() {
		System.out.println(renderView()) ;
		
		controller.askForInput() ;
		
		System.out.println(renderView()) ;
	}

}
