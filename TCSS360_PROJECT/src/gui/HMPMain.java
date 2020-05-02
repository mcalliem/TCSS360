package gui;

import java.awt.EventQueue;

/**
 * Homeowner's Manual PRO main class. Starts gui.
 * 
 * @author Team Quasars
 * @version 1.0
 */
public class HMPMain {

	private HMPMain() {
		throw new IllegalStateException();
	}
	
	public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HMPGUI().start();
            }
        });
    }
	
}
