package com.madwithinsanity.ingestion.services.reporting;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.madwithinsanity.ingestion.services.parsers.ParsingResult;

public class ReportingServiceImpl implements ReportingService {

	@Override
	public File createReport(ParsingResult pr) {
		Gson gson = new Gson();
		String result = gson.toJson(pr);
		try {
			Path path = Files.write(Paths.get("src/test/resources/templateReport.html"), result.getBytes());
			return path.toFile();
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
}
