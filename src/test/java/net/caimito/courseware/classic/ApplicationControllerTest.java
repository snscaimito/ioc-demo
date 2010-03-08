package net.caimito.courseware.classic;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;

import org.easymock.classextension.EasyMock;
import org.junit.Test;

public class ApplicationControllerTest {

	@Test 
	public void askForInputWithOutText() throws IOException {
		BufferedReader mockReader = EasyMock.createMock(BufferedReader.class) ;
		EasyMock.expect(mockReader.readLine()).andReturn(".") ;
		EasyMock.replay(mockReader) ;

		ApplicationModel model = new ApplicationModel() ;
		ApplicationController controller = new ApplicationController(model, mockReader) ;
		
		controller.askForInput() ;
		assertEquals("", model.getData()) ;
	}

	@Test 
	public void askForInputWithText() throws IOException {
		BufferedReader mockReader = EasyMock.createMock(BufferedReader.class) ;
		EasyMock.expect(mockReader.readLine()).andReturn("this is a test") ;
		EasyMock.expect(mockReader.readLine()).andReturn(".") ;
		EasyMock.replay(mockReader) ;

		ApplicationModel model = new ApplicationModel() ;
		ApplicationController controller = new ApplicationController(model, mockReader) ;
		
		controller.askForInput() ;
		assertEquals("THIS IS A TEST\r\n", model.getData()) ;
	}

	@Test
	public void askForInputThrowException() throws IOException {
		BufferedReader mockReader = EasyMock.createMock(BufferedReader.class) ;
		EasyMock.expect(mockReader.readLine()).andThrow(new IOException()) ;
		EasyMock.replay(mockReader) ;

		ApplicationModel model = new ApplicationModel() ;
		ApplicationController controller = new ApplicationController(model, mockReader) ;
		
		controller.askForInput() ;
		assertEquals("", model.getData()) ;
	}

}
