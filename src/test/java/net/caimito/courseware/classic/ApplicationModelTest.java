package net.caimito.courseware.classic;

import static org.junit.Assert.*;

import org.junit.Test;

public class ApplicationModelTest {

	@Test
	public void getData() {
		ApplicationModel model = new ApplicationModel() ;
		assertEquals(ApplicationModel.NO_INPUT_YET, model.getData()) ;
	}
	
	@Test
	public void setInput() {
		ApplicationModel model = new ApplicationModel() ;
		
		final String INPUT_STRING = "This is simulated input data" ;
		
		model.setInput(INPUT_STRING) ;
		assertEquals(INPUT_STRING.toUpperCase(), model.getData()) ;
	}
}
