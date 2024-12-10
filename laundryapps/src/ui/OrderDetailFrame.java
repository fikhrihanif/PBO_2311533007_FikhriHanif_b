package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.ServiceRepo;
import model.Service;
import table.TableService;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderDetailFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTrx;
	private JTextField txtTanggal;
	private JTextField txtTanggalPengambilan;
	private JTextField txtJumlah;
	private JTextField txtTotal;
	private JTextField txtHarga;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderDetailFrame frame = new OrderDetailFrame();
					frame.setVisible(true);
					frame.loadTable();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	ServiceRepo srv = new ServiceRepo();
	List<Service> ls;
	public String id;
	private JTable tableService;
	private JTable tableOrderDetail;
	private JTextField txtPelanggan;
	private JTextField txtTotalOrder;
	
	
	public void loadTable() {
		ls = srv.show();
		TableService ts = new TableService(ls);
		tableService.setModel(ts);
		tableService.getTableHeader().setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public OrderDetailFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 731);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Order ID");
		lblNewLabel.setBounds(46, 68, 61, 22);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblNewLabel);
		
		JLabel lblPelanggan = new JLabel("Pelanggan");
		lblPelanggan.setBounds(46, 128, 61, 22);
		lblPelanggan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblPelanggan);
		
		JLabel lblTanggal = new JLabel("Tanggal");
		lblTanggal.setBounds(46, 199, 61, 22);
		lblTanggal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblTanggal);
		
		JLabel lblTanggalPengambilan = new JLabel("Tanggal Pengambilan");
		lblTanggalPengambilan.setBounds(46, 273, 138, 22);
		lblTanggalPengambilan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblTanggalPengambilan);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(46, 344, 61, 22);
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblStatus);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(46, 415, 61, 22);
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblTotal);
		
		JLabel lblPembayaran = new JLabel("Pembayaran");
		lblPembayaran.setBounds(46, 484, 97, 22);
		lblPembayaran.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblPembayaran);
		
		JLabel lblStatusPembayaran = new JLabel("Status Pembayaran");
		lblStatusPembayaran.setBounds(46, 555, 138, 22);
		lblStatusPembayaran.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblStatusPembayaran);
		
		JLabel lblLayanan = new JLabel("Layanan");
		lblLayanan.setBounds(342, 68, 86, 22);
		lblLayanan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblLayanan);
		
		JLabel lblHargakg = new JLabel("Harga/Kg");
		lblHargakg.setBounds(342, 199, 86, 22);
		lblHargakg.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblHargakg);
		
		JLabel lblJumlah = new JLabel("jumlahKg");
		lblJumlah.setBounds(342, 271, 86, 22);
		lblJumlah.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblJumlah);
		
		JLabel lblTotal_1 = new JLabel("Total");
		lblTotal_1.setBounds(600, 273, 61, 22);
		lblTotal_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblTotal_1);
		
		txtTrx = new JTextField();
		txtTrx.setBounds(46, 90, 241, 27);
		contentPane.add(txtTrx);
		txtTrx.setColumns(10);
		
		txtTanggal = new JTextField();
		txtTanggal.setBounds(46, 232, 241, 27);
		txtTanggal.setColumns(10);
		contentPane.add(txtTanggal);
		
		txtTanggalPengambilan = new JTextField();
		txtTanggalPengambilan.setBounds(46, 306, 241, 27);
		txtTanggalPengambilan.setColumns(10);
		contentPane.add(txtTanggalPengambilan);
		
		
		
		txtJumlah = new JTextField();
		txtJumlah.setBounds(342, 304, 241, 27);
		txtJumlah.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
		
		            int jumlah = Integer.parseInt(txtJumlah.getText());
		            int harga = Integer.parseInt(txtHarga.getText());

		            int total = jumlah * harga;
		            txtTotal.setText(String.valueOf(total));
		        } catch (NumberFormatException ex) {
		            txtTotal.setText("");
		        }
			}
			public void reset() {
				txtHarga.setText("");
				txtJumlah.setText("");
				txtTotal.setText("");
				id=null;
			}
		});
		txtJumlah.setColumns(10);
		contentPane.add(txtJumlah);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(600, 304, 241, 27);
		txtTotal.setColumns(10);
		contentPane.add(txtTotal);
		
		txtHarga = new JTextField();
		txtHarga.setBounds(342, 232, 241, 27);
		txtHarga.setColumns(10);
		contentPane.add(txtHarga);
		
		txtPelanggan = new JTextField();
		txtPelanggan.setBounds(46, 161, 241, 27);
		txtPelanggan.setColumns(10);
		contentPane.add(txtPelanggan);
		
		JComboBox cbxPembayaran = new JComboBox();
		cbxPembayaran.setBounds(46, 517, 241, 27);
		contentPane.add(cbxPembayaran);
		
		JComboBox cbxStatusPembayaran = new JComboBox();
		cbxStatusPembayaran.setBounds(46, 588, 241, 27);
		contentPane.add(cbxStatusPembayaran);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(46, 377, 241, 22);
		contentPane.add(comboBox);
		
		JButton btnSimpanOrder = new JButton("Simpan");
		btnSimpanOrder.setBounds(46, 638, 89, 23);
		btnSimpanOrder.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(btnSimpanOrder);
		
		JButton btnBatalOrder = new JButton("Batal");
		btnBatalOrder.setBounds(198, 639, 89, 23);
		btnBatalOrder.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(btnBatalOrder);
		
		JButton btnSimpanDetail = new JButton("Simpan");
		btnSimpanDetail.setBounds(342, 354, 89, 23);
		btnSimpanDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSimpanDetail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(btnSimpanDetail);
		
		JButton btnUbahDetail = new JButton("Ubah");
		btnUbahDetail.setBounds(441, 354, 89, 23);
		btnUbahDetail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(btnUbahDetail);
		
		JButton btnHapusDetail = new JButton("Hapus");
		btnHapusDetail.setBounds(540, 354, 89, 23);
		btnHapusDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnHapusDetail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(btnHapusDetail);
		
		JButton btnBatalDetail = new JButton("Batal");
		btnBatalDetail.setBounds(639, 354, 89, 23);
		btnBatalDetail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(btnBatalDetail);
		
		tableService = new JTable();
		tableService.setBounds(343, 89, 498, 99);
		tableService.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				id = tableService.getValueAt(tableService.getSelectedRow(), 0).toString();
				txtHarga.setText(tableService.getValueAt(tableService.getSelectedRow(), 3).toString());
				
			}
			
		});
		contentPane.add(tableService);
		
		tableOrderDetail = new JTable();
		tableOrderDetail.setBounds(342, 403, 500, 258);
		contentPane.add(tableOrderDetail);
		
		txtTotalOrder = new JTextField();
		txtTotalOrder.setColumns(10);
		txtTotalOrder.setBounds(46, 446, 241, 27);
		contentPane.add(txtTotalOrder);
	}
}
