package com.madwithinsanity.ingestion.services.parsers;

import java.io.File;

public interface ParsingService {

	/**
	 * Parses the File
	 * @param file - File to be parsed
	 * @return - Parsed Result
	 */
	public ParsingResult parseFile(File file);
}
