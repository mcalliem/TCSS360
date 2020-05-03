package gui;

import java.awt.EventQueue;
import java.io.IOException;

/**
 * Homeowner's Manual PRO main class. Starts gui.
 * 
 * @author Team Quasar
 * @version %I%
 */
public class HMPMain {

	private HMPMain() {
		throw new IllegalStateException();
	}
	
	public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
					new HMPGUI().start();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }
	
}
