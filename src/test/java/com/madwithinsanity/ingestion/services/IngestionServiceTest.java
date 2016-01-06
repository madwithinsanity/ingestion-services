package com.madwithinsanity.ingestion.services;

import java.io.File;

import org.junit.Test;

import junit.framework.TestCase;

public class IngestionServiceTest {

	IngestionService ingestionService = new IngestionServiceImpl();
	
	@Test
	public void testIngestion() {
		File csvFile = new File("src/test/resources/testFile.csv");
		File ingestedFile = ingestionService.ingestFile(csvFile);
		TestCase.assertNotNull(ingestedFile);
	}
}
