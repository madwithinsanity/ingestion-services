package com.madwithinsanity.ingestion.services.parsing;

import java.io.File;

import org.junit.Test;

import com.madwithinsanity.ingestion.services.parsers.ParsingResult;
import com.madwithinsanity.ingestion.services.parsers.ParsingService;
import com.madwithinsanity.ingestion.services.parsers.ParsingServiceImpl;

import junit.framework.TestCase;

public class ParsingServiceTest {

	private ParsingService parsingService = new ParsingServiceImpl();

	@Test
	public void testParsing() {
		File csvFile = new File("src/test/resources/testFile.csv");
		ParsingResult parsedFile = parsingService.parseFile(csvFile);
		TestCase.assertNotNull(parsedFile);
	}
}
