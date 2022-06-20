package Restaurant_S;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Restaurants {

	private JFrame frame;
	private JTextField jtxtChickenBurger;
	private JTextField jtxtChickenBMeal;
	private JTextField jtxtCheeseBurger;
	private JTextField txtDisplayText;
	private JTextField jtxtConvert;
	private JTextField jtxtQty;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	
	double[] i = new double[5];
	
	//"USA", "Brazil", "Canada", "Indonesia", "India"
	double US_Dollar = 1.52;
	double Brazilian_Real = 5.86;
	double Canadian_Dollar = 2.03;
	double Indian_rupee = 100.68;
	double Indonesian_Rupiah = 20746.76;
	
	private JTextField jlblConvert;
	private JTextPane jtxtReceipts;
	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurants window = new Restaurants();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 694);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(67, 85, 517, 256);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Chicken Burger");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(25, 11, 170, 40);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Chicken Burger Meal");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1_1.setBounds(25, 50, 236, 40);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cheese Burger");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1_2.setBounds(25, 88, 170, 40);
		panel.add(lblNewLabel_1_2);
		
		jtxtChickenBurger = new JTextField("0");
		jtxtChickenBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtChickenBurger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jtxtChickenBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtChickenBurger.setBounds(271, 16, 197, 26);
		panel.add(jtxtChickenBurger);
		jtxtChickenBurger.setColumns(10);
		
		jtxtChickenBMeal = new JTextField("0");
		jtxtChickenBMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtChickenBMeal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jtxtChickenBMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtChickenBMeal.setColumns(10);
		jtxtChickenBMeal.setBounds(271, 64, 197, 26);
		panel.add(jtxtChickenBMeal);
		
		jtxtCheeseBurger = new JTextField("0");
		jtxtCheeseBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtCheeseBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtCheeseBurger.setColumns(10);
		jtxtCheeseBurger.setBounds(271, 101, 197, 26);
		panel.add(jtxtCheeseBurger);
		
		JComboBox jCmbDrink = new JComboBox();
		jCmbDrink.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jCmbDrink.setModel(new DefaultComboBoxModel(new String[] {"Selecione a Bebida", "Apple Juice", "Tea", "Cola", "Coke", "Coffee", "Ice tea", "Ice Coffee", "Orange"}));
		jCmbDrink.setBounds(25, 177, 185, 26);
		panel.add(jCmbDrink);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Bebida");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_2.setBounds(25, 139, 140, 28);
		panel.add(lblNewLabel_1_2_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(25, 139, 457, 2);
		panel.add(separator);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Quantidade");
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_2_1.setBounds(271, 138, 140, 28);
		panel.add(lblNewLabel_1_2_2_1);
		
		JCheckBox jCDelivery = new JCheckBox("Delivery");
		jCDelivery.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jCDelivery.setBounds(25, 210, 170, 23);
		panel.add(jCDelivery);
		
		JCheckBox jCTax = new JCheckBox("Imposto");
		jCTax.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jCTax.setBounds(271, 210, 160, 23);
		panel.add(jCTax);
		
		jtxtQty = new JTextField("0");
		jtxtQty.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtQty.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtQty.setColumns(10);
		jtxtQty.setBounds(271, 177, 197, 26);
		panel.add(jtxtQty);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(609, 85, 330, 256);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox jcmbCurrency = new JComboBox();
		jcmbCurrency.setModel(new DefaultComboBoxModel(new String[] {"Escolha um país...", "USA", "Brazil", "Canada", "Indonesia", "India"}));
		jcmbCurrency.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jcmbCurrency.setBounds(64, 65, 197, 26);
		panel_1.add(jcmbCurrency);
		
		jtxtConvert = new JTextField();
		jtxtConvert.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtConvert.setColumns(10);
		jtxtConvert.setBounds(64, 102, 197, 26);
		panel_1.add(jtxtConvert);
		
		JLabel jlblConvert = new JLabel("");
		jlblConvert.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblConvert.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblConvert.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblConvert.setBounds(64, 139, 197, 32);
		panel_1.add(jlblConvert);
		
		JButton jbntConvert = new JButton("Converter");
		jbntConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		

				
				double British_Pound = Double.parseDouble(jtxtConvert.getText());
				if (jcmbCurrency.getSelectedItem().equals("Brazil")) {
					String cConvert1 = String.format("%.2f", British_Pound * Brazilian_Real);
					jlblConvert.setText(cConvert1);
				}
				if (jcmbCurrency.getSelectedItem().equals("USA")) {
					String cConvert2 = String.format("%.2f", British_Pound * US_Dollar);
					jlblConvert.setText(cConvert2);
				}
				if (jcmbCurrency.getSelectedItem().equals("Canada")) {
					String cConvert3 = String.format("%.2f", British_Pound * Canadian_Dollar);
					jlblConvert.setText(cConvert3);
				}
				if (jcmbCurrency.getSelectedItem().equals("Indonesia")) {
					String cConvert4 = String.format("%.2f", British_Pound * Indonesian_Rupiah);
					jlblConvert.setText(cConvert4);
				}
				if (jcmbCurrency.getSelectedItem().equals("India")) {
					String cConvert5 = String.format("%.2f", British_Pound * Indian_rupee);
					jlblConvert.setText(cConvert5);
				}
			}
		});
		jbntConvert.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jbntConvert.setBounds(29, 198, 133, 23);
		panel_1.add(jbntConvert);
		
		JButton jbntClose = new JButton("Resetar");
		jbntClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtConvert.setText(null);
				jlblConvert.setText(null);
				jcmbCurrency.setSelectedItem("Choose One...");
			}
		});
		jbntClose.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jbntClose.setBounds(172, 198, 109, 23);
		panel_1.add(jbntClose);
		
		JLabel lblNewLabel_1_4 = new JLabel("C\u00E2mbio");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Trebuchet MS", Font.BOLD, 26));
		lblNewLabel_1_4.setBounds(29, 11, 274, 40);
		panel_1.add(lblNewLabel_1_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(609, 363, 330, 193);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Total");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_2_1_1.setBounds(36, 131, 126, 40);
		panel_2.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Sub Total");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_1_1_1.setBounds(36, 80, 126, 40);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Imposto");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_3_1.setBounds(36, 29, 126, 40);
		panel_2.add(lblNewLabel_1_3_1);
		
		JLabel jlblTax = new JLabel("");
		jlblTax.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblTax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblTax.setBounds(190, 40, 105, 29);
		panel_2.add(jlblTax);
		
		JLabel jlblSubTotal = new JLabel("");
		jlblSubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblSubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblSubTotal.setBounds(190, 91, 105, 29);
		panel_2.add(jlblSubTotal);
		
		JLabel jlblTotal = new JLabel("");
		jlblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblTotal.setBounds(190, 142, 105, 29);
		panel_2.add(jlblTotal);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setBounds(67, 363, 517, 193);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Custo das Bebidas");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_3.setBounds(26, 25, 218, 40);
		panel_3.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Custo dos Lanches");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_1_1.setBounds(26, 74, 236, 40);
		panel_3.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Custo da Entrega");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_2_1.setBounds(26, 125, 205, 40);
		panel_3.add(lblNewLabel_1_2_1);
		
		JLabel jlblCostofDrinks = new JLabel("");
		jlblCostofDrinks.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostofDrinks.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostofDrinks.setBounds(310, 31, 160, 29);
		jlblCostofDrinks.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.add(jlblCostofDrinks);
		
		JLabel jlblCostofMeal = new JLabel("");
		jlblCostofMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostofMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostofMeal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCostofMeal.setBounds(310, 85, 160, 29);
		panel_3.add(jlblCostofMeal);
		
		JLabel jlblCostofDelivery = new JLabel("");
		jlblCostofDelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostofDelivery.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostofDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCostofDelivery.setBounds(310, 136, 160, 29);
		panel_3.add(jlblCostofDelivery);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(949, 84, 370, 473);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 350, 421);
		panel_4.add(tabbedPane);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Recibo", null, panel_5, null);
		panel_5.setLayout(null);
		
		jtxtReceipts = new JTextPane();
		jtxtReceipts.setBounds(10, 11, 325, 371);
		panel_5.add(jtxtReceipts);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Calculadora", null, panel_6, null);
		panel_6.setLayout(null);
		
		txtDisplayText = new JTextField();
		txtDisplayText.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplayText.setColumns(10);
		txtDisplayText.setBounds(64, 15, 229, 50);
		panel_6.add(txtDisplayText);
		
		JButton btnBackSpace = new JButton("\u2190");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				
				if(txtDisplayText.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplayText.getText());
					strB.deleteCharAt(txtDisplayText.getText().length() - 1 );
					backspace = strB.toString();
					txtDisplayText.setText(backspace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBackSpace.setBounds(64, 81, 55, 55);
		panel_6.add(btnBackSpace);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplayText.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnC.setBounds(124, 81, 55, 55);
		panel_6.add(btnC);
		
		JButton btnPercentual = new JButton("%");
		btnPercentual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplayText.getText());
				txtDisplayText.setText("");
				operations = "%";
			}
		});
		btnPercentual.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPercentual.setBounds(184, 81, 55, 55);
		panel_6.add(btnPercentual);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplayText.getText());
				txtDisplayText.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnPlus.setBounds(243, 81, 55, 55);
		panel_6.add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplayText.getText());
				txtDisplayText.setText("");
				operations = "-";
				
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnMinus.setBounds(244, 141, 55, 55);
		panel_6.add(btnMinus);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplayText.getText() + btn9.getText();
				txtDisplayText.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(184, 142, 55, 55);
		panel_6.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplayText.getText() + btn8.getText();
				txtDisplayText.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(124, 142, 55, 55);
		panel_6.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplayText.getText() + btn7.getText();
				txtDisplayText.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(64, 142, 55, 55);
		panel_6.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplayText.getText() + btn4.getText();
				txtDisplayText.setText(EnterNumber);
				
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(64, 203, 55, 55);
		panel_6.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplayText.getText() + btn5.getText();
				txtDisplayText.setText(EnterNumber);
				
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(124, 203, 55, 55);
		panel_6.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplayText.getText() + btn6.getText();
				txtDisplayText.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(184, 203, 55, 55);
		panel_6.add(btn6);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplayText.getText());
				txtDisplayText.setText("");
				operations = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnMult.setBounds(243, 203, 55, 55);
		panel_6.add(btnMult);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplayText.getText());
				txtDisplayText.setText("");
				operations = "/";
			}
		});
		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnDivision.setBounds(243, 263, 55, 55);
		panel_6.add(btnDivision);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplayText.getText() + btn3.getText();
				txtDisplayText.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(184, 264, 55, 55);
		panel_6.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplayText.getText() + btn2.getText();
				txtDisplayText.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(124, 264, 55, 55);
		panel_6.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplayText.getText() + btn1.getText();
				txtDisplayText.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(64, 264, 55, 55);
		panel_6.add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplayText.getText() + btn0.getText();
				txtDisplayText.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(64, 325, 55, 55);
		panel_6.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (! txtDisplayText.getText().contains(".")) {
					txtDisplayText.setText(txtDisplayText.getText() + btnDot.getText());
				}
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(124, 325, 55, 55);
		panel_6.add(btnDot);
		
		JButton btnPM = new JButton("+-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplayText.getText()));
				ops = ops * (-1);
				txtDisplayText.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPM.setBounds(184, 327, 55, 55);
		panel_6.add(btnPM);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondnum = Double.parseDouble(txtDisplayText.getText());
				
				if (operations == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					txtDisplayText.setText(answer);
				}
				else if (operations == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					txtDisplayText.setText(answer);
				}
				else if (operations == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					txtDisplayText.setText(answer);
				}
				else if (operations == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					txtDisplayText.setText(answer);
				}
				else if (operations == "%") {
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					txtDisplayText.setText(answer);
				}
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnEquals.setBounds(244, 324, 55, 55);
		panel_6.add(btnEquals);
		
		JLabel lblNewLabel = new JLabel("Sistema de Gerenciamento - Lanchonete");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 59));
		lblNewLabel.setBounds(78, 0, 1252, 87);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3_1.setBounds(67, 560, 1252, 84);
		frame.getContentPane().add(panel_3_1);
		
		JButton jbntExit = new JButton("Sair");
		jbntExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		jbntExit.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jbntExit.setBounds(797, 26, 89, 23);
		panel_3_1.add(jbntExit);
		
		JButton jbntReset = new JButton("Resetar");
		jbntReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jlblCostofDelivery.setText(null);
				jlblSubTotal.setText(null);
				jlblTotal.setText(null);
				jlblTax.setText(null);
				jlblConvert.setText(null);
				jlblCostofDelivery.setText(null);
				jlblCostofDrinks.setText(null);
				jlblCostofMeal.setText("0");
				
				
				jlblSubTotal.setText(null);
				jlblTax.setText(null);
				jlblTotal.setText(null);
				jtxtChickenBurger.setText("0");
				jtxtChickenBMeal.setText("0");
				jtxtCheeseBurger.setText("0");
				jtxtQty.setText("0");
				jtxtConvert.setText(null);
				jCmbDrink.setSelectedItem("Selecione a Bebida");
				jcmbCurrency.setSelectedItem("Escolha um país...");

				
			}
		});
		jbntReset.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jbntReset.setBounds(621, 26, 100, 23);
		panel_3_1.add(jbntReset);
		
		JButton jbntTotal = new JButton("Total");
		jbntTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ChicBurger = Double.parseDouble(jtxtChickenBurger.getText());
				double iChicBurger = 2.39;
				double Burger;
				Burger = (ChicBurger * iChicBurger);
				String pMeal = String.format("%.2f", Burger);
				jlblCostofMeal.setText(pMeal);
				
				double ChicBurgerMeal = Double.parseDouble(jtxtChickenBMeal.getText());
				double iChicBurgerMeal = 4.39;
				double BurgerMeal;
				BurgerMeal = (ChicBurgerMeal * iChicBurgerMeal);
				String cbMeal = String.format("%.2f", BurgerMeal + Burger);
				jlblCostofMeal.setText(cbMeal);
				
				double CheeseBurger = Double.parseDouble(jtxtCheeseBurger.getText());
				double CheeseBurgerPrice = 3.39;
				double CheeseBurgerMeal;
				CheeseBurgerMeal = (CheeseBurger * CheeseBurgerPrice);
				String cheese = String.format("%.2f", CheeseBurgerMeal + BurgerMeal + Burger);
				jlblCostofMeal.setText(cheese);
				//--------------------Delivery-----------------------
				double iDelivery = 3.39;
				if (jCDelivery.isSelected()) {
					String pDelivery = String.format("%.2f", iDelivery);
					jlblCostofDelivery.setText(pDelivery);
				} else {
					jlblCostofDelivery.setText("0");
				}
				//--------------------Drinks--------------------------
				double Drinks = Double.parseDouble(jtxtQty.getText());
				double Tea = 1.20 * Drinks;
				double Ice_Tea = 0.90 * Drinks;
				double Coffee = 2.50 * Drinks;
				double Ice_Coffee = 1.10 * Drinks;
				double Cola = 2.10 * Drinks;
				double Coke = 1.60 * Drinks;
				double Orange = 1.70 * Drinks;
				double Apple_Juice = 1.99 * Drinks;
				
				if (jCmbDrink.getSelectedItem().equals("Apple Juice")) {
					String cApple_Juice = String.format("%.2f", Apple_Juice);
					jlblCostofDrinks.setText(cApple_Juice);
				}
				if (jCmbDrink.getSelectedItem().equals("Orange")) {
					String cOrange = String.format("%.2f", Orange);
					jlblCostofDrinks.setText(cOrange);
				}
				if (jCmbDrink.getSelectedItem().equals("Coke")) {
					String cCoke = String.format("%.2f", Coke);
					jlblCostofDrinks.setText(cCoke);
				}
				if (jCmbDrink.getSelectedItem().equals("Cola")) {
					String cCola = String.format("%.2f", Cola);
					jlblCostofDrinks.setText(cCola);
				}
				if (jCmbDrink.getSelectedItem().equals("Ice Coffee")) {
					String cIce_Coffee = String.format("%.2f", Ice_Coffee);
					jlblCostofDrinks.setText(cIce_Coffee);
				}
				if (jCmbDrink.getSelectedItem().equals("Coffee")) {
					String cCoffee = String.format("%.2f", Coffee);
					jlblCostofDrinks.setText(cCoffee);
				}
				if (jCmbDrink.getSelectedItem().equals("Ice tea")) {
					String cIce_Tea = String.format("%.2f", Ice_Tea);
					jlblCostofDrinks.setText(cIce_Tea);
				}
				if (jCmbDrink.getSelectedItem().equals("Tea")) {
					String cTea = String.format("%.2f", Tea);
					jlblCostofDrinks.setText(cTea);
				}
				if (jCmbDrink.getSelectedItem().equals("Selecione a Bebida")) {
					jlblCostofDrinks.setText("0");
				}
				//--------------------Tax Rate----------------------
				
				double cTotal1 = Double.parseDouble(jlblCostofDrinks.getText());
				double cTotal2 = Double.parseDouble(jlblCostofMeal.getText());
				double cTotal3 = Double.parseDouble(jlblCostofDelivery.getText());
				double AllTotal = (cTotal1 + cTotal2 + cTotal3) /100;
				if (jCTax.isSelected()) {
					String iTotal = String.format("%.2f", AllTotal);
					jlblTax.setText(iTotal); 
				}
				else {
					jlblTax.setText("0");
							}
				//--------------------Total---------------------------

				double cTotal4 = Double.parseDouble(jlblTax.getText());
				
				double subTotal = (cTotal1 + cTotal2 + cTotal3 );
				String isubTotal = String.format("%.2f", subTotal);
				jlblSubTotal.setText(isubTotal);
				
				double allTotal = (cTotal1 + cTotal2 + cTotal3 + cTotal4 );
				String iTotal = String.format("%.2f", allTotal);
				jlblTotal.setText(iTotal);
				
				String iTaxTotal = String.format("%.2f", cTotal4);
				jlblTax.setText(iTaxTotal);
				
			}
		});
		jbntTotal.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jbntTotal.setBounds(292, 26, 89, 23);
		panel_3_1.add(jbntTotal);
		
		JButton jbntRecept = new JButton("Recibo");
		jbntRecept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Qty1 = Double.parseDouble(jtxtChickenBurger.getText());
				double Qty2 = Double.parseDouble(jtxtChickenBMeal.getText());
				double Qty3= Double.parseDouble(jtxtChickenBurger.getText());
				
				 jtxtReceipts.setText("\t\nRestaurant Management Systems: \n\n" + "Chicken Burger:\t\t"
				 + Qty1 + "\nChicken Burger Meal:\t\t"+
					Qty2 + "\nCheese Burger:\t\t "
					+ Qty3 +"\n\nThanks for using Job Estimator");
						 
				 
			}
		});
		jbntRecept.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jbntRecept.setBounds(450, 26, 89, 23);
		panel_3_1.add(jbntRecept);
	}
}
