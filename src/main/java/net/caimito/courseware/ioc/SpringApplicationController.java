package net.caimito.courseware.ioc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpringApplicationController {
	
	private SpringApplicationModel model;

	public SpringApplicationController() {
	}

	public void setModel(SpringApplicationModel model) {
		this.model = model;
	}
	
	public void askForInput() {
		System.out.println();
		System.out
				.println("Please enter some data. Terminate with . on a single line:");

		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(reader);

		String data = "";
		String input = ".";
		try {
			do {
				input = bufferedReader.readLine();
				if (!input.equals("."))
					data += input + "\r\n";
			} while (!input.equals("."));
		} catch (IOException e) {
			System.out.println("IO exception " + e);
		}

		model.setInput(data);
	}
}
