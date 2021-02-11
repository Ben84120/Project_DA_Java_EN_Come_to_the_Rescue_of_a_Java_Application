package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * 
 * @author bvach
 *
 */

public class WriteFromDataMap implements IWriterMap {

	public WriteFromDataMap() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ecrireResult(Map<String, Integer> symptoms) {
		
		
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("Project02Eclipse/results.txt"));
			
			

			for (String key : symptoms.keySet()) {

				writer.write(key + ":" + symptoms.get(key) + "\r\n");

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
