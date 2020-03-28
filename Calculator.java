package calculator_h;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operation;
	String answer;
	protected JTextComponent txtDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.setBounds(100, 100, 278, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(20, 11, 230, 57);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//---------------------Row 1-----------------
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(20, 159, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(80, 159, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(140, 159, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("-");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			firstnum=Double.parseDouble(txtDisplay.getText());
			txtDisplay.setText("");
			operation="-";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(200, 159, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		//---------------------Row 2-----------------
				JButton btn4 = new JButton("4");
				btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn4.setBounds(20, 220, 50, 50);
				frame.getContentPane().add(btn4);
				
				JButton btn5 = new JButton("5");
				btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn5.setBounds(80, 220, 50, 50);
				frame.getContentPane().add(btn5);
				
				JButton btn6 = new JButton("6");
				btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn6.setBounds(140, 220, 50, 50);
				frame.getContentPane().add(btn6);
				
				//---------------------Row 3-----------------
				JButton btn1 = new JButton("1");
				btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn1.setBounds(20, 281, 50, 50);
				frame.getContentPane().add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn2.setBounds(80, 281, 50, 50);
				frame.getContentPane().add(btn2);
				
				JButton btn3 = new JButton("3");
				btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn3.setBounds(140, 281, 50, 50);
				frame.getContentPane().add(btn3);
				
				JButton btnMul = new JButton("/");
				btnMul.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum=Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operation="*";
					}
				});
				btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnMul.setBounds(200, 281, 50, 50);
				frame.getContentPane().add(btnMul);
				
				//---------------------Row 4-----------------
				JButton btn0 = new JButton("0");
				btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn0.setBounds(20, 352, 50, 50);
				frame.getContentPane().add(btn0);
				
				JButton btnDot = new JButton(".");
				btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnDot.setBounds(80, 352, 50, 50);
				frame.getContentPane().add(btnDot);
				
				JButton btnPM = new JButton("+-");
				btnPM.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnPM.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnPM.setBounds(132, 352, 55, 50);
				frame.getContentPane().add(btnPM);
				
				JButton btnEqual = new JButton("=");
				btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnEqual.setBounds(200, 352, 50, 50);
				frame.getContentPane().add(btnEqual);
				
				JButton button = new JButton("*");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				button.setFont(new Font("Tahoma", Font.BOLD, 18));
				button.setBounds(200, 220, 50, 50);
				frame.getContentPane().add(button);
				
				JButton button_1 = new JButton("");
				button_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
				button_1.setFont(new Font("Tahoma", Font.BOLD, 18));
				button_1.setBounds(20, 98, 50, 50);
				frame.getContentPane().add(button_1);
				
				JButton button_2 = new JButton("c");
				button_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				button_2.setFont(new Font("Tahoma", Font.BOLD, 18));
				button_2.setBounds(80, 98, 50, 50);
				frame.getContentPane().add(button_2);
				
				JButton button_3 = new JButton("%");
				button_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				button_3.setFont(new Font("Tahoma", Font.BOLD, 18));
				button_3.setBounds(134, 98, 55, 50);
				frame.getContentPane().add(button_3);
				
				JButton button_4 = new JButton("+");
				button_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				button_4.setFont(new Font("Tahoma", Font.BOLD, 18));
				button_4.setBounds(200, 98, 50, 50);
				frame.getContentPane().add(button_4);


		
	}
}
