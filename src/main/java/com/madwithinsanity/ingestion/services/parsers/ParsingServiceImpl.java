package com.madwithinsanity.ingestion.services.parsers;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ParsingServiceImpl implements ParsingService {

	@Override
	public ParsingResult parseFile(File file) {

		ParsingResult parsingResult = new ParsingResult();
		Scanner scanner;

		try {
			scanner = new Scanner(file);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}

		scanner.useDelimiter(",");

		parsingResult.setHeaders(scanSingleLine(scanner));
		parsingResult.setData(scanData(scanner));

		scanner.close();
		return parsingResult;
	}

	private ArrayList<String> scanSingleLine(Scanner scanner) {
		ArrayList<String> singleLine = new ArrayList<String>();
		StringTokenizer token = new StringTokenizer(scanner.nextLine(), ",");
		while (token.hasMoreTokens()) {
			singleLine.add(token.nextToken());
		}
		return singleLine;
	}

	private List<String[]> scanData(Scanner scanner) {
		List<String[]> data = new LinkedList<String[]>();
		while (scanner.hasNext()) {
			ArrayList<String> tempList = scanSingleLine(scanner);
			data.add(tempList.toArray(new String[tempList.size()]));
		}
		return data;
	}
}
