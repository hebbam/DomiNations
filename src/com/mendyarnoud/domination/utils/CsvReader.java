package com.mendyarnoud.domination.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.mendyarnoud.domination.objet.Domino;

public class CsvReader {

	public static List<Domino> readCsvFile(String path) throws IOException {

		BufferedReader br = null;
		String line = "";
		List<Domino> dominos = new ArrayList<>();
		try {

			int index = 0;
			br = new BufferedReader(new FileReader(path));
			while ((line = br.readLine()) != null) {
				if (index != 0) {
					String[] items = line.split(",");
					Domino domino = new Domino();

					int couronne1 = Integer.parseInt(items[0]);
					domino.setCouronne1(couronne1);
					String type1 = items[1];
					domino.setType1(type1);
					int couronne2 = Integer.parseInt(items[2]);
					domino.setCouronne2(couronne2);
					String type2 = items[3];
					domino.setType2(type2);
					int dominoNumber = Integer.parseInt(items[4]);
					domino.setDominoNumber(dominoNumber);
					dominos.add(domino);
				}
				index++;
			}
		} catch (Exception e) {

		} finally {
			br.close();
		}
		return dominos;
	}

}
