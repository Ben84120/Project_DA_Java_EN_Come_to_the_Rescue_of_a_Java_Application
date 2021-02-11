package com.hemebiotech.analytics;

import java.util.Map;

/**
 * * @author Benoît Vacher
 *  Write the results into a new file 
 *  The important of our interface is to write the resultat of our MAP into the new file
 *  Writing of the result obtained using the IWriterMap interface. 
 *  Setting up exceptions to catch any errors with the blocks "try & catch" setting up a finally block to close the file's resources.
 * 
 */

public interface IWriterMap {

	/**	 
	 * 
	 * @param symptoms
	 */

	public void ecrireResult(Map<String, Integer> symptoms);
}
