package com.madwithinsanity.ingestion.services.parsers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ParsingResult {

	ArrayList<String> headers = new ArrayList<String>();
	List<String[]> data = new LinkedList<String[]>();

	public ArrayList<String> getHeaders() {
		return headers;
	}

	public void setHeaders(ArrayList<String> headers) {
		this.headers = headers;
	}

	public List<String[]> getData() {
		return data;
	}

	public void setData(List<String[]> data) {
		this.data = data;
	}
}
