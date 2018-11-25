package com.mendyarnoud.domination;

import java.io.IOException;
import java.util.List;

import com.mendyarnoud.domination.objet.Domino;
import com.mendyarnoud.domination.utils.CsvReader;

public class Main {

	public static void main(String[] args) throws IOException {
		List<Domino> dominos = CsvReader.readCsvFile("/home/hebbam/Téléchargements/dominos.csv");
		for (Domino domino : dominos) {
			System.out.println(domino);
		}
	}

}
