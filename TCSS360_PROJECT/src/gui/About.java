package gui;

import java.util.Arrays;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * A short class for storing information about Homeowner's Manual Pro.
 * 
 * @author Evan McAllister
 * @author Romi Tshiorny
 * @author Collin Nguyen
 * @author Idris Istanbul
 * @version 0.5
 */
public class About extends JOptionPane
{
	/**
	 * Serial Verison UID
	 */
	private static final long serialVersionUID = -1591965767072803047L;

	/*
	 * The name of the piece of software. 
	 */
	private final String SOFTWARE_NAME = "Homeowner's Manual PRO";
	
	/*
	 * String array containing the names of all the developers of the software. 
	 */
	private final String[] DEVELOPERS = {"Romi Tshiorny", "Evan McAllister", "Collin Nguyen", "Idris Istanbul"};
	
	/*
	 * String representation of the current software version number.
	 */
	private String myVersion;
	
	/*
	 * The class constructor. 
	 */
	public About()
	{
		myVersion = "0.5";
	}
	
	/*
	 * Getter method for the array containing the names of the software developers.
	 * 
	 * @return Array of names of the software developers.  
	 */
	public String[] getAuthors()
	{
		return DEVELOPERS;
	}
	
	/*
	 * Getter method for the String representation of the name of the software. 
	 * 
	 * @return Name of the software. 
	 */
	public String getName()
	{
		return SOFTWARE_NAME;
	}
	
	/*
	 * Getter method for the String representation of the software version.
	 * 
	 * @return Current software version. 
	 */
	public String getVersion()
	{
		return myVersion; 
	}
	
	/**
	 * Shows the dialog box
	 */
	public void show() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setAlignmentX(CENTER_ALIGNMENT);
		JLabel name = new JLabel(getName());
		JLabel version = new JLabel("Version: " + getVersion());
		JLabel authors = new JLabel(Arrays.toString(getAuthors()));
		name.setAlignmentX(CENTER_ALIGNMENT);
		version.setAlignmentX(CENTER_ALIGNMENT);
		authors.setAlignmentX(CENTER_ALIGNMENT);
		panel.add(name);
		panel.add(version);
		panel.add(authors);
		JOptionPane.showMessageDialog(null, panel, "About", JOptionPane.DEFAULT_OPTION);
	}
		
}
