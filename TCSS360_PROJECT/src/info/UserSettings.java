package info;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Class for info stored about a user that can be imported/exported.
 * @author Romi Tshiorny
 * @version 1.0
 */
public class UserSettings {

	private String firstName;
	private String email;
	
	/**
	 * Constructor for settings when making a new user from scratch.
	 * @param firstName user inputed first name
	 * @param email user inputed email
	 */
	public UserSettings(String firstName, String email) {
		this.firstName = firstName;
		this.email = email;
	}
	/**
	 * Constructor for importing user settings.
	 * @param importFile file to import data from
	 */
	public UserSettings(File importFile) {
		importSettings(importFile);
	}	
	
	/**
	 * Setter for firstName.
	 * @param firstName user inputed first name
	 */
	public void updateFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Setter for email.
	 * @param email user inputed first name
	 */
	public void updateEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Getter for firstName.
	 * @return the first name of the user
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Getter for email.
	 * @return the email of the user
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Method for importing settings from a file.
	 * @param importFile file to import
	 */
	public void importSettings(File importFile) {
		try {
			Scanner importer = new Scanner(importFile);
			firstName = importer.nextLine();
			email = importer.nextLine();
			importer.close();
		} catch(IOException e) {
			System.out.println("Error retrieving file");
			e.printStackTrace();
		}
	}
	
	/**
	 * Method for exporting settings to a file.
	 * @param fileName desired name for export file
	 */
	public void exportSettings(String fileName) {
		String outputLocation = System.getProperty("user.dir") 
				+ System.getProperty("file.separator") + "client files" + System.getProperty("file.separator")
				+ fileName + ".txt";
		try {
			File exportFile =  new File(outputLocation);
			PrintWriter writer = new PrintWriter(exportFile);
			writer.println(firstName);
			writer.println(email);
			writer.close();
		} catch(IOException e) {
			System.out.println("Error creating file");
			e.printStackTrace();
		}
	}
}
