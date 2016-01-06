package com.madwithinsanity.ingestion.services.reporting;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.junit.Test;

import com.madwithinsanity.ingestion.services.parsers.ParsingResult;
import com.madwithinsanity.ingestion.services.parsers.ParsingService;
import com.madwithinsanity.ingestion.services.parsers.ParsingServiceImpl;

import junit.framework.TestCase;

public class ReportingServiceTest {

	private ParsingService parsingService = new ParsingServiceImpl();
	private ReportingService reportingService = new ReportingServiceImpl();
	
	@Test
	public void testReporting() throws IOException {
		File csvFile = new File("src/test/resources/testFile.csv");
		ParsingResult parsedFile = parsingService.parseFile(csvFile);
		TestCase.assertNotNull(parsedFile);
		File out = reportingService.createReport(parsedFile);
		TestCase.assertNotNull(Files.readAllLines(out.toPath()));
	}
}
