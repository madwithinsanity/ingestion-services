package com.madwithinsanity.ingestion.services.parsing;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.junit.Test;

import com.madwithinsanity.ingestion.services.parsers.ParsingResult;
import com.madwithinsanity.ingestion.services.parsers.ParsingService;
import com.madwithinsanity.ingestion.services.parsers.ParsingServiceImpl;
import com.madwithinsanity.ingestion.services.reporting.ReportingService;
import com.madwithinsanity.ingestion.services.reporting.ReportingServiceImpl;

import junit.framework.TestCase;

public class ParsingServiceTest {

	private ParsingService parsingService = new ParsingServiceImpl();
	private ReportingService reportingService = new ReportingServiceImpl();

	@Test
	public void testParsing() throws IOException {
		File csvFile = new File("src/test/resources/testFile.csv");
		ParsingResult parsedFile = parsingService.parseFile(csvFile);
		TestCase.assertNotNull(parsedFile);
		File out = reportingService.createReport(parsedFile);
		System.out.println(Files.readAllLines(out.toPath()));
	}
}