package giaodien;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Create_Room extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Create_Room frame = new Create_Room();
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
	public Create_Room() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 501, 265);
		contentPane.add(contentPane_1);
		
		JLabel lblToPhng = new JLabel("TẠO PHÒNG");
		lblToPhng.setHorizontalAlignment(SwingConstants.CENTER);
		lblToPhng.setForeground(Color.RED);
		lblToPhng.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblToPhng.setBounds(138, 26, 191, 35);
		contentPane_1.add(lblToPhng);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(189, 92, 207, 20);
		contentPane_1.add(textField);
		
		JLabel lblIdPhng = new JLabel("ID Phòng");
		lblIdPhng.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdPhng.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIdPhng.setBounds(78, 92, 82, 17);
		contentPane_1.add(lblIdPhng);
		
		JLabel lblTnPhng = new JLabel("Tên phòng");
		lblTnPhng.setHorizontalAlignment(SwingConstants.CENTER);
		lblTnPhng.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTnPhng.setBounds(78, 152, 82, 17);
		contentPane_1.add(lblTnPhng);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(189, 152, 207, 20);
		contentPane_1.add(textField_1);
		
		JButton btnHy = new JButton("Hủy");
		btnHy.setBounds(114, 208, 89, 23);
		contentPane_1.add(btnHy);
		
		JButton btnTo = new JButton("Tạo");
		btnTo.setBounds(271, 208, 89, 23);
		contentPane_1.add(btnTo);
	}

}
