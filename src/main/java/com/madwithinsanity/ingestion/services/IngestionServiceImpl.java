package com.madwithinsanity.ingestion.services;

import java.io.File;

import com.madwithinsanity.ingestion.services.parsers.ParsingService;
import com.madwithinsanity.ingestion.services.parsers.ParsingServiceImpl;
import com.madwithinsanity.ingestion.services.reporting.ReportingService;
import com.madwithinsanity.ingestion.services.reporting.ReportingServiceImpl;

public class IngestionServiceImpl implements IngestionService{

	@Override
	public File ingestFile(File originalFile) {
		// TODO Auto-generated method stub
		ParsingService parsingService = new ParsingServiceImpl();
		ReportingService reportingService = new ReportingServiceImpl();
		
		File parsedFile = reportingService.createReport(parsingService.parseFile(originalFile));

		return parsedFile;
	}
}
