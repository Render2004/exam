package giaodien;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField usernametp;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JButton btnSignIn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 304);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Loginlb = new JLabel("Login");
		Loginlb.setForeground(Color.RED);
		Loginlb.setFont(new Font("Tahoma", Font.BOLD, 30));
		Loginlb.setHorizontalAlignment(SwingConstants.CENTER);
		Loginlb.setBounds(175, 26, 127, 35);
		contentPane.add(Loginlb);
		
		usernametp = new JTextField();
		usernametp.setBounds(189, 92, 207, 20);
		contentPane.add(usernametp);
		usernametp.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(78, 92, 82, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(78, 152, 82, 17);
		contentPane.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(189, 152, 207, 20);
		contentPane.add(textField_1);
		
		btnNewButton = new JButton("Sign in");
		btnNewButton.setBounds(114, 208, 89, 23);
		contentPane.add(btnNewButton);
		
		btnSignIn = new JButton("Login");
		btnSignIn.setBounds(271, 208, 89, 23);
		contentPane.add(btnSignIn);
	}
}
