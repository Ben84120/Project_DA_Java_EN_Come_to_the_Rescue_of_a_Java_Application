package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

	/**
	 * main method for launching the program
	 * @param args 
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {

		AnalyticsCounter counter = new AnalyticsCounter();
		List<String> symptoms = counter.readingFile("Project02Eclipse/symptoms.txt");
		Map<String, Integer> map = counter.cumputingSymptoms(symptoms);
		counter.saving(map);

	}

	/**
	 * method allows reading file an build list of symptoms
	 * 
	 * @param file the input file of symptoms
	 * @return list of symptoms
	 */
	private List<String> readingFile(String file) {
		ISymptomReader reader = new ReadSymptomDataFromFile(file);
		return reader.getSymptoms();

	}
	/**
	 * method allow to browse the list of symptoms, build the Map and sorting it.
	 * 
	 * @param symptoms List of symptoms
	 * @return Map symptoms with occurrences
	 */

	private Map<String, Integer> cumputingSymptoms(List<String> symptoms) {
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
	private void saving(Map<String, Integer> map) {

		IWriterMap writer = new WriteFromDataMap();
		writer.ecrireResult(map);

	}

}
