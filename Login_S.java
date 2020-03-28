package Login_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Login_S {

	private JFrame frame;
	private JTextField txtCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_S window = new Login_S();
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
	public Login_S() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1386, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(38, 43, 381, 188);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBugger = new JLabel("Chicken Burger");
		lblChickenBugger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblChickenBugger.setBounds(10, 44, 178, 22);
		panel.add(lblChickenBugger);
		
		JLabel label = new JLabel("Chicken Burger Meal");
		label.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label.setBounds(10, 110, 246, 22);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Cheese Burger");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_1.setBounds(10, 77, 178, 22);
		panel.add(label_1);
		
		JLabel label_19 = new JLabel("");
		label_19.setHorizontalAlignment(SwingConstants.RIGHT);
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_19.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_19.setBackground(Color.BLACK);
		label_19.setBounds(246, 110, 125, 22);
		panel.add(label_19);
		
		JLabel label_20 = new JLabel("");
		label_20.setHorizontalAlignment(SwingConstants.RIGHT);
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_20.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_20.setBackground(Color.BLACK);
		label_20.setBounds(246, 44, 125, 22);
		panel.add(label_20);
		
		JLabel label_21 = new JLabel("");
		label_21.setHorizontalAlignment(SwingConstants.RIGHT);
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_21.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_21.setBackground(Color.BLACK);
		label_21.setBounds(246, 77, 125, 22);
		panel.add(label_21);
		
		JLabel label_26 = new JLabel("Meals");
		label_26.setFont(new Font("Tahoma", Font.BOLD, 28));
		label_26.setBounds(85, 11, 178, 22);
		panel.add(label_26);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(435, 43, 424, 188);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_13 = new JLabel("Milk Shake");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_13.setBounds(23, 60, 178, 22);
		panel_1.add(label_13);
		
		JLabel label_14 = new JLabel("Normal Shake");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_14.setBounds(22, 93, 246, 22);
		panel_1.add(label_14);
		
		JLabel label_15 = new JLabel("Chocolate Milk Shake");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_15.setBounds(22, 123, 235, 29);
		panel_1.add(label_15);
		
		JLabel label_16 = new JLabel("");
		label_16.setHorizontalAlignment(SwingConstants.RIGHT);
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_16.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_16.setBackground(Color.BLACK);
		label_16.setBounds(278, 93, 125, 22);
		panel_1.add(label_16);
		
		JLabel label_17 = new JLabel("");
		label_17.setHorizontalAlignment(SwingConstants.RIGHT);
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_17.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_17.setBackground(Color.BLACK);
		label_17.setBounds(278, 60, 125, 22);
		panel_1.add(label_17);
		
		JLabel label_18 = new JLabel("");
		label_18.setHorizontalAlignment(SwingConstants.RIGHT);
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_18.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_18.setBackground(Color.BLACK);
		label_18.setBounds(278, 130, 125, 22);
		panel_1.add(label_18);
		
		JLabel label_27 = new JLabel("Drinks");
		label_27.setFont(new Font("Tahoma", Font.BOLD, 28));
		label_27.setBounds(112, 11, 178, 29);
		panel_1.add(label_27);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(38, 249, 381, 167);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_2 = new JLabel("Cost of Drinks");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_2.setBounds(10, 44, 178, 22);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("Cost of Meal");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_3.setBounds(10, 77, 246, 22);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("Cost of Delivery");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_4.setBounds(14, 113, 190, 29);
		panel_2.add(label_4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(214, 120, 125, 22);
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.add(lblNewLabel_1);
		
		JLabel label_5 = new JLabel("");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_5.setBackground(Color.BLACK);
		label_5.setBounds(214, 44, 125, 22);
		panel_2.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_6.setBackground(Color.BLACK);
		label_6.setBounds(214, 77, 125, 22);
		panel_2.add(label_6);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(876, 43, 213, 526);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		txtCalculator = new JTextField();
		txtCalculator.setText("Calculator");
		txtCalculator.setBounds(44, 25, 99, 33);
		panel_4.add(txtCalculator);
		txtCalculator.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_5.setBounds(38, 438, 821, 131);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel label_22 = new JLabel("");
		label_22.setHorizontalAlignment(SwingConstants.RIGHT);
		label_22.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_22.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_22.setBackground(Color.BLACK);
		label_22.setBounds(61, 52, 125, 35);
		panel_5.add(label_22);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTotal.setBounds(61, 52, 125, 35);
		panel_5.add(btnTotal);
		
		JLabel label_23 = new JLabel("Receipt");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_23.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_23.setBackground(Color.BLACK);
		label_23.setBounds(271, 52, 125, 35);
		panel_5.add(label_23);
		
		JLabel label_24 = new JLabel("Reset");
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_24.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_24.setBackground(Color.BLACK);
		label_24.setBounds(469, 52, 125, 35);
		panel_5.add(label_24);
		
		JLabel label_25 = new JLabel("Exit");
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		label_25.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_25.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_25.setBackground(Color.BLACK);
		label_25.setBounds(670, 52, 125, 35);
		panel_5.add(label_25);
		
		JLabel lblNewLabel = new JLabel("Hotel Management System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(61, 0, 704, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setBounds(429, 249, 430, 167);
		frame.getContentPane().add(panel_3);
		
		JLabel label_7 = new JLabel("Tax");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_7.setBounds(10, 44, 178, 22);
		panel_3.add(label_7);
		
		JLabel label_8 = new JLabel("Sub Total");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_8.setBounds(10, 77, 246, 22);
		panel_3.add(label_8);
		
		JLabel label_9 = new JLabel("Total");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_9.setBounds(14, 106, 190, 29);
		panel_3.add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setHorizontalAlignment(SwingConstants.RIGHT);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_10.setBackground(Color.BLACK);
		label_10.setBounds(214, 113, 125, 22);
		panel_3.add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_11.setBackground(Color.BLACK);
		label_11.setBounds(214, 44, 125, 22);
		panel_3.add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setHorizontalAlignment(SwingConstants.RIGHT);
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_12.setBackground(Color.BLACK);
		label_12.setBounds(214, 77, 125, 22);
		panel_3.add(label_12);
	}
}
