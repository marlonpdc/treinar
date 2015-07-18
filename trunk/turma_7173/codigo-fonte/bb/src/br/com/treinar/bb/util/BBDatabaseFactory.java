package br.com.treinar.bb.util;

public class BBDatabaseFactory {

	
	public static IDatabase fabricarDatabase(String nomeClasse) {
		
		IDatabase database = null;
		
		switch (nomeClasse) {
		case "DatabaseFile":
			database = DatabaseFile.getInstance();
			break;
		case "DatabaseArray":
			database = DatabaseArray.getInstance();
			
			break;
		case "DatabaseCollection":
			database = DatabaseCollection.getInstance();
			
			break;

		default:
			break;
		}
		return database;
	}
	
}
