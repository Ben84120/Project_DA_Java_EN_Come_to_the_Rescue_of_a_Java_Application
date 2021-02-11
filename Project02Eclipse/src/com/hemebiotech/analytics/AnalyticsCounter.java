package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

		/**
		 * 
		 * @param Main function of the program
		 */
		AnalyticsCounter counter = new AnalyticsCounter();
		List<String> symptoms = counter.readingFile("Project02Eclipse/symptoms.txt");
		System.out.println(symptoms.toString());
		Map<String, Integer> map = counter.cumputingSymptoms(symptoms);
		counter.saving(map);

	}

	/**
	 * method allows reading file an build list of symptoms
	 * 
	 * @param file the input file of symptoms
	 * @return list of symptoms
	 */
	public List<String> readingFile(String file) {
		ISymptomReader reader = new ReadSymptomDataFromFile(file);
		return reader.GetSymptoms();

	}

	/**
	 * method allow to browse the list of symptoms, build the Map and sorting it.
	 * 
	 * @param symptoms List of symptoms
	 * @return Map symptoms with occurrences
	 */

	public Map<String, Integer> cumputingSymptoms(List<String> symptoms) {
		Map<String, Integer> map = new TreeMap<>();
		for (String symptom : symptoms) {
			if (symptom != null) {

				if (!map.containsKey(symptom)) {
					map.put(symptom, 1);
				} else {
					map.put(symptom, map.get(symptom) + 1);

				}

			}
		}

		return map;

	}

	/**
	 * method who write the result of our Map into a text file.
	 * 
	 * @param map Map symptoms with occurrences
	 */
	public void saving(Map<String, Integer> map) {

		IWriterMap writer = new WriteFromDataMap();
		writer.ecrireResult(map);

	}

}
