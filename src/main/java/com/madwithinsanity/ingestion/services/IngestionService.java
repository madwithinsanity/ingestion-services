package com.madwithinsanity.ingestion.services;

import java.io.File;

public interface IngestionService {

	/**
	 * Ingests a File
	 * 
	 * @param originalFile
	 *            - input file
	 * @param outputFileLocation
	 *            - location where the file is dropped after it's ingested
	 * @return Report
	 */
	public File ingestFile(File originalFile, String outputFileLocation);
}
