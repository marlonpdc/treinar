package br.com.treinar.bb.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CriarBanco {

	public static void main(String[] args) {
		new CriarBanco().criarBanco();
	}

	private void criarBanco() {
		// Delimiter
		String delimiter = ";";

		InputStream inputFile = getClass().getClassLoader().getResourceAsStream("bb.sql");
		
		// Create scanner
		Scanner scanner;
		try {
			scanner = new Scanner(inputFile).useDelimiter(delimiter);
		} catch (Exception e1) {
			e1.printStackTrace();
			return;
		}

		// Loop through the SQL file statements
		Statement currentStatement = null;
		while (scanner.hasNext()) {

			// Get statement
			String rawStatement = scanner.next() + delimiter;
			Connection conn = ConnectionFactory.getConnection();
			try {
				// Execute statement
				currentStatement = conn.createStatement();
				currentStatement.execute(rawStatement);
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				// Release resources
				if (currentStatement != null) {
					try {
						currentStatement.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				currentStatement = null;
			}
		}
		scanner.close();
	}

}
