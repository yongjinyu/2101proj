import java.awt.EventQueue;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FatBlaster {

	private JFrame frmFatBlasterPrototype;
	private String[] calcStrings = { "BMI", "BMR", "BFP", "Weight Loss" };
	private String gender = " ";
	private JTextField textHeight1;
	private JTextField textWeight;
	private JTextField heightField;
	private JTextField weightField;
	private JTextField ageField;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	public boolean metric =true;
	private JTextField textHeight2;
	private JTextField inchField;
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
		frmFatBlasterPrototype.setBounds(100, 100, 492, 327);
		frmFatBlasterPrototype.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frmFatBlasterPrototype.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		
		
		JPanel pnlBMI = new JPanel();
		tabbedPane.addTab("BMI", null, pnlBMI, null);
		pnlBMI.setLayout(new MigLayout("", "[55px][63px,grow]", "[23px][][][][][]"));
		
		JRadioButton rdBtnImperial = new JRadioButton("Imperial");

		pnlBMI.add(rdBtnImperial, "cell 0 1,alignx left,aligny top");
		
		JRadioButton rdBtnMetric = new JRadioButton("Metric");
		pnlBMI.add(rdBtnMetric, "cell 0 0,alignx left,aligny top");
		rdBtnMetric.setSelected(true);
		

		
		JLabel lblNewLabel = new JLabel("Height");
		pnlBMI.add(lblNewLabel, "cell 0 2,alignx left");
		
		textHeight1 = new JTextField();
		pnlBMI.add(textHeight1, "flowx,cell 1 2,alignx left");
		textHeight1.setColumns(10);
		
		JLabel lblWeightBMI1 = new JLabel("Weight");
		pnlBMI.add(lblWeightBMI1, "cell 0 3,alignx left");
		
		textWeight = new JTextField();
		pnlBMI.add(textWeight, "flowx,cell 1 3");
		textWeight.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");

		pnlBMI.add(btnCalculate, "cell 0 5");
		
		JLabel lblBMI = new JLabel("");
		pnlBMI.add(lblBMI, "cell 1 5");
		
		JLabel lblHeight1 = new JLabel("metres");
		pnlBMI.add(lblHeight1, "cell 1 2");
		
		JLabel lblWeightBMI2 = new JLabel("kg");
		pnlBMI.add(lblWeightBMI2, "cell 1 3");
		
		textHeight2 = new JTextField();
		pnlBMI.add(textHeight2, "cell 1 2");
		textHeight2.setColumns(10);
		
		JLabel lblHeight2 = new JLabel("centimetres");
		pnlBMI.add(lblHeight2, "cell 1 2");
		
		
		//BMR START HERE-----------------------------------------------------------------------------//
		JPanel pnlBMR = new JPanel();
		tabbedPane.addTab("BMR", null, pnlBMR, null);
		pnlBMR.setLayout(new MigLayout("", "[55px][71px,grow]", "[23px][][][][][]"));
		// Metric and Imperial setting
		JRadioButton rdbtnMetric = new JRadioButton("Metric");
		JRadioButton rdbtnImperial_3 = new JRadioButton("Imperial");
		
		
		rdbtnMetric.setSelected(true);
		pnlBMR.add(rdbtnMetric, "cell 0 0,alignx left,aligny top");
		pnlBMR.add(rdbtnImperial_3, "cell 0 1");
		
		// Male and Female setting
		JRadioButton rdbtnMale = new JRadioButton("Male");
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		
		rdbtnMale.setSelected(true);
	
		pnlBMR.add(rdbtnMale, "cell 1 0");
		pnlBMR.add(rdbtnFemale, "cell 1 1");
		
		// Height, Weight and Age setting
		JLabel lblHeight = new JLabel("Height");
		pnlBMR.add(lblHeight, "cell 0 2,alignx trailing");
		
		heightField = new JTextField();
		pnlBMR.add(heightField, "flowx,cell 1 2,alignx left");
		heightField.setColumns(10);
		
		JLabel lblWeight_1 = new JLabel("Weight");
		pnlBMR.add(lblWeight_1, "cell 0 3,alignx trailing");
		
		weightField = new JTextField();
		pnlBMR.add(weightField, "flowx,cell 1 3,alignx left");
		weightField.setColumns(10);
		
		JLabel lblAge = new JLabel("Age");
		pnlBMR.add(lblAge, "cell 0 4,alignx trailing");
		
		ageField = new JTextField();
		pnlBMR.add(ageField, "flowx,cell 1 4,alignx left");
		ageField.setColumns(10);
		
		JLabel lblCm = new JLabel("Centimeters");
		pnlBMR.add(lblCm, "cell 1 2");
		
		JLabel lblKilogram = new JLabel("Kilograms");
		pnlBMR.add(lblKilogram, "cell 1 3");
		
		JLabel lblYears = new JLabel("Years");
		pnlBMR.add(lblYears, "cell 1 4");
		
		JLabel lblNewLabel_2 = new JLabel("");
		pnlBMR.add(lblNewLabel_2, "cell 1 5");
		
		inchField = new JTextField();
		inchField.setEnabled(false);
		inchField.setVisible(false);
		pnlBMR.add(inchField, "cell 1 2");
		inchField.setColumns(10);
		
		JLabel lblInches = new JLabel("Inches");
		lblInches.setEnabled(false);
		lblInches.setVisible(false);
		pnlBMR.add(lblInches, "cell 1 2");
		
		//EVENT HANDLER BMR--------------------------------------------------------------------------//
		rdbtnMetric.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				metric = true;
				rdbtnImperial_3.setSelected(false);
				lblCm.setText("Centimeters");
				lblKilogram.setText("Kilograms");
				heightField.setText("");
				weightField.setText("");
				inchField.setEnabled(false);
				inchField.setVisible(false);
				lblInches.setEnabled(false);
				lblInches.setVisible(false);
			}
		});
		
		rdbtnImperial_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				metric = false;
				rdbtnMetric.setSelected(false);
				lblCm.setText("Foot");
				lblKilogram.setText("Pounds");
				heightField.setText("");
				weightField.setText("");
				inchField.setEnabled(true);
				inchField.setVisible(true);
				lblInches.setEnabled(true);
				lblInches.setVisible(true);
			}
		});
		
		rdbtnMale.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				gender = "M";
				rdbtnFemale.setSelected(false);
			}
		});
		rdbtnFemale.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				gender = "F";
				rdbtnMale.setSelected(false);
			}
		});
		
		//CALCULATE BMR------------------------------------------------------------------------------//
		JButton btnCalculate_1 = new JButton("Calculate");
		btnCalculate_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int tabIndex;
				tabIndex = tabbedPane.getSelectedIndex();
				if(tabIndex==1)
				{
					float BMRvalue;
					
					if(metric)
					{
						String height = heightField.getText();
						String weight = weightField.getText();
						String age = ageField.getText();
						BMRvalue= BMR(Float.parseFloat(weight),Float.parseFloat(height),Integer.parseInt(age));
						String strBMR = String.format("%.2f", BMRvalue);
						lblNewLabel_2.setText("Your Daily BMR is:"+ strBMR +"calories");
					}
					else if(!metric)
					{
						String height = heightField.getText();
						String inch = inchField.getText();
						String weight = weightField.getText();
						String age = ageField.getText();
						double impWeight  = Double.parseDouble(weight)* 0.453592;
						double impInch = Double.parseDouble(inch) * 2.54 ;
						double impFeet = Double.parseDouble(height) * 12 * 2.54 ;
						double total = impInch + impFeet;
						BMRvalue= BMR(((float)(impWeight)),((float)(total)),Integer.parseInt(age));
						String strBMR = String.format("%.2f", BMRvalue);
						lblNewLabel_2.setText("Your Daily BMR is: "+ strBMR +" calories");
					}
				}
			}
		});
		pnlBMR.add(btnCalculate_1, "cell 0 5");
		//BMR ENDS ----------------------------------------------------------------------------------//

		
		
		//BFP START----------------------------------------------------------------------------------//
		JPanel pnlBFP = new JPanel();
		tabbedPane.addTab("BFP", null, pnlBFP, null);
		pnlBFP.setLayout(new MigLayout("", "[55px][63px,grow]", "[23px][][][][][][]"));
		
		JRadioButton rdbtnMetric_1 = new JRadioButton("Metric");
		pnlBFP.add(rdbtnMetric_1, "cell 0 0,alignx left,aligny top");
		
		JRadioButton rdbtnMale_1 = new JRadioButton("Male");
		pnlBFP.add(rdbtnMale_1, "cell 1 0");
		
		JRadioButton rdbtnImperial_1 = new JRadioButton("Imperial");
		pnlBFP.add(rdbtnImperial_1, "cell 0 1,alignx left,aligny top");
		
		JRadioButton rdbtnFemale_1 = new JRadioButton("Female");
		pnlBFP.add(rdbtnFemale_1, "cell 1 1");
		
		JLabel lblWeight_2 = new JLabel("Weight");
		pnlBFP.add(lblWeight_2, "cell 0 2,alignx trailing");
		
		textField_5 = new JTextField();
		pnlBFP.add(textField_5, "cell 1 2,alignx left");
		textField_5.setColumns(10);
		
		JLabel lblHeight_1 = new JLabel("Waist");
		pnlBFP.add(lblHeight_1, "cell 0 3,alignx trailing");
		
		textField_6 = new JTextField();
		pnlBFP.add(textField_6, "cell 1 3,alignx left");
		textField_6.setColumns(10);
		
		JLabel lblHip = new JLabel("Hip");
		pnlBFP.add(lblHip, "cell 0 4,alignx trailing");
		
		textField_7 = new JTextField();
		pnlBFP.add(textField_7, "cell 1 4,alignx left");
		textField_7.setColumns(10);
		
		JLabel lblNeck = new JLabel("Neck");
		pnlBFP.add(lblNeck, "cell 0 5,alignx trailing");
		
		textField_8 = new JTextField();
		pnlBFP.add(textField_8, "cell 1 5,alignx left");
		textField_8.setColumns(10);
		
		JButton btnCalculate_2 = new JButton("Calculate");
		pnlBFP.add(btnCalculate_2, "cell 0 6");
		
		JLabel lblYouHave = new JLabel("You have 10.5% body fat");
		pnlBFP.add(lblYouHave, "cell 1 6");
		
		JPanel pnlWeightloss = new JPanel();
		tabbedPane.addTab("Weight Loss", null, pnlWeightloss, null);
		pnlWeightloss.setLayout(new MigLayout("", "[55px][63px,grow]", "[23px][][][][][][]"));
		
		JRadioButton rdbtnMetric_2 = new JRadioButton("Metric");
		pnlWeightloss.add(rdbtnMetric_2, "cell 0 0,alignx left,aligny top");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Male");
		pnlWeightloss.add(rdbtnNewRadioButton_1, "cell 1 0");
		
		JRadioButton rdbtnImperial_2 = new JRadioButton("Imperial");
		pnlWeightloss.add(rdbtnImperial_2, "cell 0 1,alignx left,aligny top");
		
		JRadioButton rdbtnFemale_2 = new JRadioButton("Female");
		pnlWeightloss.add(rdbtnFemale_2, "cell 1 1");
		
		JLabel lblNewLabel_3 = new JLabel("Height");
		pnlWeightloss.add(lblNewLabel_3, "cell 0 2");
		
		textField_9 = new JTextField();
		pnlWeightloss.add(textField_9, "cell 1 2,alignx left");
		textField_9.setColumns(10);
		
		JLabel lblWeight_3 = new JLabel("Weight");
		pnlWeightloss.add(lblWeight_3, "cell 0 3,alignx left");
		
		textField_10 = new JTextField();
		pnlWeightloss.add(textField_10, "cell 1 3,alignx left");
		textField_10.setColumns(10);
		
		JLabel lblAge_1 = new JLabel("Age");
		pnlWeightloss.add(lblAge_1, "cell 0 4,alignx left");
		
		textField_11 = new JTextField();
		pnlWeightloss.add(textField_11, "cell 1 4,alignx left");
		textField_11.setColumns(10);
		
		JLabel lblGoalWeight = new JLabel("Goal Weight");
		pnlWeightloss.add(lblGoalWeight, "cell 0 5,alignx left");
		
		textField_12 = new JTextField();
		pnlWeightloss.add(textField_12, "cell 1 5,alignx left");
		textField_12.setColumns(10);
		
		JButton btnCalculate_3 = new JButton("Calculate");
		pnlWeightloss.add(btnCalculate_3, "cell 0 6");
		
		JLabel lblNewLabel_4 = new JLabel("You will achieve your goal weight in 4months\r\n with a 500 daily calorie deficit");
		pnlWeightloss.add(lblNewLabel_4, "cell 1 6");
		//tabbedPane.setTabComponentAt(0, new JComboBox(calcStrings));
		
		JPanel pnlFoodDiary = new JPanel();
		tabbedPane.addTab("Food Diary", null, pnlFoodDiary, null);
		pnlFoodDiary.setLayout(new MigLayout("", "[389px,grow]", "[33px][top][grow]"));
		
		JPanel panel = new JPanel();
		pnlFoodDiary.add(panel, "cell 0 0,grow");
		
		JLabel lblFood = new JLabel("Food");
		panel.add(lblFood);
		
		textField_13 = new JTextField();
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblCalorie = new JLabel("Calorie");
		panel.add(lblCalorie);
		
		textField_14 = new JTextField();
		panel.add(textField_14);
		textField_14.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Morning", "Afternoon", "Dinner", "Snacks"}));
		
		JButton btnAdd = new JButton("Add");
		panel.add(btnAdd);
		
		JPanel panel_2 = new JPanel();
		pnlFoodDiary.add(panel_2, "cell 0 1,growx,aligny top");
		panel_2.setLayout(new MigLayout("", "[][][][][][][][][][][]", "[]"));
		
		DateTimeFormatter dTF = DateTimeFormatter.ofPattern("EEEE , MMMM dd");
		
		JButton btnNewButton = new JButton("Previous Day");
		panel_2.add(btnNewButton, "cell 0 0");
		
			JLabel lblNewLabel_5 = new JLabel(LocalDateTime.now().format(dTF));
			panel_2.add(lblNewLabel_5, "cell 4 0");
		
		JButton btnNewButton_1 = new JButton("Next Day");
		panel_2.add(btnNewButton_1, "cell 10 0");
		
		JPanel panel_1 = new JPanel();
		pnlFoodDiary.add(panel_1, "cell 0 2,grow");
		panel_1.setLayout(new MigLayout("", "[grow][grow][grow][grow]", "[][grow]"));
		
		JLabel lblMorning = new JLabel("Morning");
		panel_1.add(lblMorning, "cell 0 0");
		
		JLabel lblAfternoon = new JLabel("Afternoon");
		panel_1.add(lblAfternoon, "cell 1 0");
		
		JLabel lblDinner = new JLabel("Dinner");
		panel_1.add(lblDinner, "cell 2 0");
		
		JLabel lblSnacks = new JLabel("Snacks");
		panel_1.add(lblSnacks, "cell 3 0");
		
		JList list_3 = new JList();
		panel_1.add(list_3, "cell 0 1,grow");
		
		JList list_2 = new JList();
		panel_1.add(list_2, "cell 1 1,grow");
		
		JList list_1 = new JList();
		panel_1.add(list_1, "cell 2 1,grow");
		
		JList list = new JList();
		panel_1.add(list, "cell 3 1,grow");
		
		JMenuBar menuBar = new JMenuBar();
		frmFatBlasterPrototype.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("View");
		menuBar.add(mnNewMenu_1);
		
		btnCalculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				int tabIndex;
				tabIndex = tabbedPane.getSelectedIndex();
				if(tabIndex==0)
				{
					float BMIvalue;
					
					if(metric)
					{
					String height = textHeight1.getText();
					String height2 = textHeight2.getText();
					String weight = textWeight.getText();
					BMIvalue= BMI(	(	(Float.parseFloat(height))	+	Float.parseFloat(height2)/100),	Float.parseFloat(weight)	);
					String strBMI = String.format("%.2f", BMIvalue);
					lblBMI.setText("Your BMI is:"+ strBMI);
					}
					else if(!metric)
					{
						String height = textHeight1.getText();
						String height2 = textHeight2.getText();
						String weight = textWeight.getText();
						
						BMIvalue= BMI(	(	(Float.parseFloat(height)*12)	+	Float.parseFloat(height2)	),	Float.parseFloat(weight)	);
						String strBMI = String.format("%.2f", BMIvalue);
						lblBMI.setText("Your BMI is:"+ strBMI);
						
						
					}
					
					
					
				}
			}
		});
		rdBtnMetric.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				metric=true;
				if(rdBtnImperial.isSelected())
				{
					rdBtnImperial.setSelected(false);
					lblHeight1.setText("metres");
					lblHeight2.setText("centimetres");
					lblWeightBMI2.setText("kg");
					
				}
			}
		});
		rdBtnImperial.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				metric=false;
				if(rdBtnMetric.isSelected())
				{
					rdBtnMetric.setSelected(false);
					lblHeight1.setText("feet");
					lblHeight2.setText("inches");
					lblWeightBMI2.setText("pounds");
				}
			}
		});

	}

	public float BMI(float height,float weight)
	{
		float BMI;
		if(metric)
		{
			 BMI = weight/(height*height);
		}
		else
		{
			BMI = weight*703/(height*height);
		}
		return BMI;
		
	}
	
	public float BMR(float weight, float height, int age)
	{
		float BMR = 0;
		if(gender == "F"){
			BMR = (float)((10.0*weight) + (6.25*height) - (5.0*age) - 161);
		}
		else{ 
			BMR = (float)((10.0*weight) + (6.25*height) - (5.0*age) + 5);
		}
		return BMR;
	}
	
	public float BFP(float waist, float height, float neck, float hip)
	{
		float BFP = 0;
		
			if(gender == "F"){
				BFP = 	(float) (495/(1.0324 - (0.19077*(Math.log(waist-neck))) + (0.15456*(Math.log(height))))-450);
			}
	
			else if(gender == "M"){
				BFP = (float) (495/(1.29579-(0.35004*(Math.log(waist+hip-neck)))+(0.22100*(Math.log(height))))-450);
			}
		
		
		return BFP;
	}
}
