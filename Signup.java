package giaodien;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Signup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Signup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 304);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSignIn = new JLabel("Sign up");
		lblSignIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignIn.setForeground(Color.RED);
		lblSignIn.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblSignIn.setBounds(192, 22, 127, 35);
		contentPane.add(lblSignIn);
		
		JLabel lblUsername = new JLabel("Your username");
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsername.setBounds(68, 93, 127, 17);
		contentPane.add(lblUsername);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(205, 93, 207, 20);
		contentPane.add(textField);
		
		JLabel lblYourPassword = new JLabel("Your password");
		lblYourPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblYourPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblYourPassword.setBounds(83, 136, 112, 17);
		contentPane.add(lblYourPassword);
		
		JLabel lblNewLabel_1_1 = new JLabel("Your password \r\n\tagain");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(27, 182, 168, 17);
		contentPane.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(205, 136, 207, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(205, 182, 207, 20);
		contentPane.add(passwordField_1);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.setBounds(201, 231, 89, 23);
		contentPane.add(btnSignUp);
		btnSignUp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (!textField.equals("")&&passwordField.equals(passwordField_1)&&!passwordField.equals("")&&!passwordField_1.equals(""))
				{
					
				}
				// TODO Auto-generated method stub
				
			}
		});
	}
}
