
/**
 * A short class for storing information about Homeowner's Manual Pro.
 * 
 * @author Evan McAllister
 * @author Romi Tshiorny
 * @author Collin Nguyen
 * @author Idris Istanbul
 * @version 0.5
 */
public class About 
{
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
		
}
