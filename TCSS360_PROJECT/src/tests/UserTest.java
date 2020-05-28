package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import objects.User;
import info.UserSettings;

class UserTest {

	/**
	 * Test parameterized constructor
	 * @author Collin Nguyen
	 */
	@Test
	void testUserStringStringBoolean() {
		User user = new User("Test", "Pass", true);
		assertNotNull(user);
		assertTrue(user.getAdminStat());
	}

	/**
	 * Test default constructor
	 * @author Collin Nguyen
	 */
	@Test
	void testUserStringString() {
		User user = new User("Test", "Pass");
		assertNotNull(user);
		assertFalse(user.getAdminStat());
	}

	/**
	 * Test admin status getter
	 * @author Collin Nguyen
	 */
	@Test
	void testGetAdminStat() {
		User user1 = new User("Test", "Pass");
		User user2 = new User("Test", "Pass", true);
		assertTrue(user2.getAdminStat());
		assertFalse(user1.getAdminStat());
	}

	/**
	 * Test credential verification
	 * @author Collin Nguyen
	 */
	@Test
	void testVerifyCredentials() {
		User user = new User("Test", "Pass");
		assertTrue(user.verifyCredentials("Test", "Pass"));
		assertFalse(user.verifyCredentials("NotTest", "NotPass"));
		assertFalse(user.verifyCredentials("test", "pass"));
		assertFalse(user.verifyCredentials("Test", "notPass"));
	}

	/**
	 * Test settings getter
	 * @author Collin Nguyen
	 */
	@Test
	void testGetSettings() {
		UserSettings us = new UserSettings("Name", "Email");
		User user = new User("Test", "Pass");
		user.setSettings(us);
		assertNotNull(user.getSettings());
	}
	
	/**
	 * Test settings setter
	 * @author Collin Nguyen
	 */
	@Test
	void testSetSettings() {
		UserSettings us = new UserSettings("Name", "Email");
		User user = new User("Test", "Pass");
		user.setSettings(us);
		assertNotNull(user.getSettings());
	}

}
