package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.jupiter.api.Test;

import objects.HomeFile;

/**
 * Suite of tests for the HomeFile class. 
 * 
 * @author Evan McAllister
 * @version 1.0
 */
class HomeFileTest 
{
	private HomeFile f; 
	
	//A test that a HomeFile object is successfully created. 
	@Test
	public void testFileCreation()
	{
		f = new HomeFile("filename", "loren ipsum");
		assertTrue(f != null);
	}
	
	//A test for the HomeFile name field getter. 
	@Test
	public void testGetName()
	{
		f = new HomeFile("filename", "loren ipsum");
		assertEquals("filename", f.getFileName());
	}
	
	//A test for the HomeFile notes field getter. 
	@Test
	public void testGetNotes()
	{
		f = new HomeFile("filename", "loren ipsum");
		assertEquals("loren ipsum", f.getFileNotes());
	}
	
	//A test that the creation date on the HomeFile object works correctly. 
	@Test
	public void testGetDate()
	{
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String date = df.format(Calendar.getInstance().getTime());
		f = new HomeFile("filename", "loren ipsum");
		assertTrue(date.equals(f.getImportDate()));
	}
	
	//A test to make sure notes are correctly added to the HomeFile object. 
	@Test
	public void testAddNotes()
	{
		f = new HomeFile("filename", "loren ipsum");
		f.addNote("a");
		assertEquals("loren ipsum\na", f.getFileNotes());
		f.addNote(" b ");
		assertEquals("loren ipsum\na\n b ", f.getFileNotes());
		f.addNote("");
		assertEquals("loren ipsum\na\n b \n", f.getFileNotes());
	}
	
	//A test to make sure notes can be successfully cleared from the HomeFile object. 
	@Test
	public void testClearNotes()
	{
		f = new HomeFile("filename", "loren ipsum");
		f.clearNotes();
		assertEquals("", f.getFileNotes());
	}
	
	//A test to make sure the name of the HomeFile object can be changed. 
	@Test
	public void testChangeName()
	{
		f = new HomeFile("filename", "loren ipsum");
		f.setNewFileName("newname");
		assertEquals("newname", f.getFileName());
	}
}
