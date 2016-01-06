package com.madwithinsanity.ingestion.services.reporting;

import java.io.File;

import com.madwithinsanity.ingestion.services.parsers.ParsingResult;

public interface ReportingService {

	/**
	 * Creates a Report
	 * 
	 * @param pr - Parsed .csv file with Header and Data separated into lists.
	 * @return - a .html file displaying the information contained in the ParsingResult.
	 */
	public File createReport(ParsingResult pr);
}
