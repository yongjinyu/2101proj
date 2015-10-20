import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class FatBlaster {

	private JFrame frmFatBlasterPrototype;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FatBlaster window = new FatBlaster();
					window.frmFatBlasterPrototype.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FatBlaster() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFatBlasterPrototype = new JFrame();
		frmFatBlasterPrototype.setTitle("Fat Blaster Prototype");
		frmFatBlasterPrototype.setBounds(100, 100, 450, 300);
		frmFatBlasterPrototype.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frmFatBlasterPrototype.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		
		
		JPanel pnlCalculation = new JPanel();
		tabbedPane.addTab("Calculations", null, pnlCalculation, null);
		tabbedPane.setComponentAt(0, new DropdownPaneComponent(tabbedPane));
		
		JPanel pnlBMI = new JPanel();
		tabbedPane.addTab("BMI", null, pnlBMI, null);
		
		JPanel pnlBMR = new JPanel();
		tabbedPane.addTab("BMR", null, pnlBMR, null);
		
		JPanel pnlBFP = new JPanel();
		tabbedPane.addTab("BFP", null, pnlBFP, null);
		
		JPanel pnlWeightLoss = new JPanel();
		tabbedPane.addTab("Weight Loss", null, pnlWeightLoss, null);
		
		JPanel pnlFoodDiary = new JPanel();
		tabbedPane.addTab("Food Diary", null, pnlFoodDiary, null);
		
		JMenuBar menuBar = new JMenuBar();
		frmFatBlasterPrototype.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("View");
		menuBar.add(mnNewMenu_1);
	}

}
