package giaodien;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTable;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Tạo phòng");
		btnNewButton.setBounds(312, 343, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Nhập ID phòng");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(115, 96, 76, 23);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(250, 96, 322, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDanhSchPhng = new JLabel("Danh sách phòng");
		lblDanhSchPhng.setHorizontalAlignment(SwingConstants.CENTER);
		lblDanhSchPhng.setBounds(10, 200, 83, 23);
		contentPane.add(lblDanhSchPhng);
		
		table = new JTable();
		table.setBounds(121, 200, 600, 139);
		contentPane.add(table);
	}
}
