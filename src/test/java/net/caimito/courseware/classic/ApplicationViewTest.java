package net.caimito.courseware.classic;

import static org.junit.Assert.*;

import org.junit.Test;

public class ApplicationViewTest {

	@Test
	public void showBeforeUserInput() {
		ApplicationModel model = new ApplicationModel() ;
		ApplicationController controller = new ApplicationController(model, null) ;
		ApplicationView view = new ApplicationView(model, controller) ;
		
		StringBuffer expectedOutput = new StringBuffer() ;
		expectedOutput.append(view.getHeader()) ;
		expectedOutput.append(model.getData() + "\r\n") ;
		expectedOutput.append(view.getFooter()) ;
		
		assertEquals(expectedOutput.toString(), view.renderView()) ;
	}
}
