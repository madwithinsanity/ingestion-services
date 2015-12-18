package com.madwithinsanity.ingestion.services;

import java.io.File;

import org.junit.Test;

import junit.framework.TestCase;

public class IngestionServiceTest {

	private IngestionService ingestionService;
	
	@Test
	public void testIngestion() {
		File csvFile = new File("src/test/resources/testFile.csv");
		File ingestedFile = ingestionService.ingestFile(csvFile, "build/testOutput/ingestedFile.html");
		TestCase.assertNotNull(ingestedFile);
	}
}
