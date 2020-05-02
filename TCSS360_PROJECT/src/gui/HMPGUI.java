package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 * Homeowner's Manual PRO GUI class. Handles creation of GUI frame and elements.
 * 
 * @author Team Quasars
 * @version 1.0
 */
public class HMPGUI extends JFrame{

	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = -4328079188596764858L;

	/**
	 * Main JFrame
	 */
	private HMPGUI myFrame;
	
	/**
	 * Frame preferred dimension
	 */
	private Dimension myPreferredDimension = new Dimension(600, 600);
	
	/**
	 * Parameterless constructor
	 */
	public HMPGUI() {
		super("Homeowner's Manual PRO");
	}
	
	/**
	 * Start JFrame
	 */
	public void start() {
		myFrame = new HMPGUI();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(new BorderLayout());
		
		myFrame.add(generateMenuBar(), BorderLayout.NORTH);
		myFrame.add(generateMainPanel(), BorderLayout.CENTER);
		
		myFrame.pack();
		myFrame.setVisible(true);
		myFrame.setLocationRelativeTo(null);
	}
	
	/**
	 * Generates main panel.
	 * 
	 * @return the generated main panel
	 */
	private JPanel generateMainPanel() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.setPreferredSize(myPreferredDimension);
		
		JLabel testLabel = new JLabel("Hello", SwingConstants.CENTER);
		testLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		mainPanel.add(testLabel);
		
		return mainPanel;
	}
	
	/**
	 * Generates the menu bar.
	 * 
	 * @return the generated menu bar
	 */
	private JMenuBar generateMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		JMenu aboutMenu = new JMenu("About");
		menuBar.add(aboutMenu);
		
		About aboutBox = new About();
		
		aboutMenu.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(final MenuEvent theEvent) {
            	aboutBox.show();
            }
			@Override
			public void menuDeselected(MenuEvent e) {	
			}
			@Override
			public void menuCanceled(MenuEvent e) {	
			}
        });
		
		return menuBar;
	}
	
}

