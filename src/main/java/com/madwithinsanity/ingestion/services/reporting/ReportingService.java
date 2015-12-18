package com.madwithinsanity.ingestion.services.reporting;

import java.io.File;

import com.madwithinsanity.ingestion.services.parsers.ParsingResult;

public interface ReportingService {

	public File createReport(ParsingResult pr);
}
