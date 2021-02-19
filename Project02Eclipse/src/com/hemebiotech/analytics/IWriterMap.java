package com.hemebiotech.analytics;

import java.util.Map;

/**
 * *
 *  Write the results into a new file 
 *  The important of our interface is to write the resultat of our MAP into the new file
 *  Writing of the result obtained using the IWriterMap interface. 
 *  Setting up exceptions to catch any errors with the blocks "try & catch" setting up a finally block to close the file's resources.
 *  @author Benoît Vacher
 */

public interface IWriterMap {

	/**	 
	 * 
	 * @param symptoms Contain all symptoms with numbers of occurrences
	 */

	public void ecrireResult(Map<String, Integer> symptoms);
}
