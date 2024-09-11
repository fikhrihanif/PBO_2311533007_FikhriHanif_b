package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Laundry Apps");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(56, 25, 118, 28);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("PESANAN");
		btnNewButton.setBounds(56, 64, 112, 49);
		contentPane.add(btnNewButton);
		
		JButton btnLayanan = new JButton("LAYANAN");
		btnLayanan.setBounds(178, 64, 112, 49);
		contentPane.add(btnLayanan);
		
		JButton btnPelanggan = new JButton("PELANGGAN");
		btnPelanggan.setBounds(300, 64, 112, 49);
		contentPane.add(btnPelanggan);
		
		JButton btnPengguna = new JButton("PENGGUNA");
		btnPengguna.setBounds(56, 124, 112, 49);
		contentPane.add(btnPengguna);
		
		JButton btnNewButton_3_1 = new JButton("LAPORAN");
		btnNewButton_3_1.setBounds(178, 124, 112, 49);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("PROFILE");
		btnNewButton_3_2.setBounds(300, 124, 112, 49);
		contentPane.add(btnNewButton_3_2);
		
		JButton btnNewButton_3_3 = new JButton("KELUAR");
		btnNewButton_3_3.setBounds(56, 184, 356, 36);
		contentPane.add(btnNewButton_3_3);
	}

}
