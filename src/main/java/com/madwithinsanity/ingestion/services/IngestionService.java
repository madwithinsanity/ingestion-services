package com.madwithinsanity.ingestion.services;

import java.io.File;

public interface IngestionService {

	/**
	 * Ingests a File
	 * 
	 * @param originalFile
	 *            - input file
	 * @return Report
	 */
	public File ingestFile(File originalFile);
}
