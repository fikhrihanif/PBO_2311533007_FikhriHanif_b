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

public class OrderDetail extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtOrderID;
	private JTextField txtTanggal;
	private JTextField txtTanggalP;
	private JTextField txtJumlah;
	private JTextField txtTotl;
	private JTextField txtHargaKg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderDetail frame = new OrderDetail();
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
	
	public void loadTable() {
		ls = srv.show();
		TableService ts = new TableService(ls);
		tableService.setModel(ts);
		tableService.getTableHeader().setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public OrderDetail() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 731);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Order ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(46, 68, 61, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblPelanggan = new JLabel("Pelanggan");
		lblPelanggan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPelanggan.setBounds(46, 128, 61, 22);
		contentPane.add(lblPelanggan);
		
		JLabel lblTanggal = new JLabel("Tanggal");
		lblTanggal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTanggal.setBounds(46, 199, 61, 22);
		contentPane.add(lblTanggal);
		
		JLabel lblTanggalPengambilan = new JLabel("Tanggal Pengambilan");
		lblTanggalPengambilan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTanggalPengambilan.setBounds(46, 273, 138, 22);
		contentPane.add(lblTanggalPengambilan);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStatus.setBounds(46, 344, 61, 22);
		contentPane.add(lblStatus);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTotal.setBounds(46, 415, 61, 22);
		contentPane.add(lblTotal);
		
		JLabel lblPembayaran = new JLabel("Pembayaran");
		lblPembayaran.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPembayaran.setBounds(46, 484, 97, 22);
		contentPane.add(lblPembayaran);
		
		JLabel lblStatusPembayaran = new JLabel("Status Pembayaran");
		lblStatusPembayaran.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStatusPembayaran.setBounds(46, 555, 138, 22);
		contentPane.add(lblStatusPembayaran);
		
		JLabel lblLayanan = new JLabel("Layanan");
		lblLayanan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLayanan.setBounds(342, 68, 86, 22);
		contentPane.add(lblLayanan);
		
		JLabel lblHargakg = new JLabel("Harga/Kg");
		lblHargakg.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHargakg.setBounds(342, 199, 86, 22);
		contentPane.add(lblHargakg);
		
		JLabel lblJumlah = new JLabel("Jumlah");
		lblJumlah.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblJumlah.setBounds(342, 271, 86, 22);
		contentPane.add(lblJumlah);
		
		JLabel lblTotal_1 = new JLabel("Total");
		lblTotal_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTotal_1.setBounds(600, 273, 61, 22);
		contentPane.add(lblTotal_1);
		
		txtOrderID = new JTextField();
		txtOrderID.setBounds(46, 90, 241, 27);
		contentPane.add(txtOrderID);
		txtOrderID.setColumns(10);
		
		txtTanggal = new JTextField();
		txtTanggal.setColumns(10);
		txtTanggal.setBounds(46, 232, 241, 27);
		contentPane.add(txtTanggal);
		
		txtTanggalP = new JTextField();
		txtTanggalP.setColumns(10);
		txtTanggalP.setBounds(46, 306, 241, 27);
		contentPane.add(txtTanggalP);
		
		
		
		txtJumlah = new JTextField();
		txtJumlah.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
		
		            int jumlah = Integer.parseInt(txtJumlah.getText());
		            int harga = Integer.parseInt(txtHargaKg.getText());

		            int total = jumlah * harga;
		            txtTotl.setText(String.valueOf(total));
		        } catch (NumberFormatException ex) {
		            txtTotl.setText("");
		        }
			}
		});
		txtJumlah.setColumns(10);
		txtJumlah.setBounds(342, 304, 241, 27);
		contentPane.add(txtJumlah);
		
		txtTotl = new JTextField();
		txtTotl.setColumns(10);
		txtTotl.setBounds(600, 304, 241, 27);
		contentPane.add(txtTotl);
		
		txtHargaKg = new JTextField();
		txtHargaKg.setColumns(10);
		txtHargaKg.setBounds(342, 232, 241, 27);
		contentPane.add(txtHargaKg);
		
		JComboBox CBPelanggan = new JComboBox();
		CBPelanggan.setBounds(46, 161, 241, 27);
		contentPane.add(CBPelanggan);
		
		JComboBox CBStatus = new JComboBox();
		CBStatus.setBounds(46, 377, 241, 27);
		contentPane.add(CBStatus);
		
		JComboBox CBPembayaran = new JComboBox();
		CBPembayaran.setBounds(46, 517, 241, 27);
		contentPane.add(CBPembayaran);
		
		JComboBox CBStatusPembayaran = new JComboBox();
		CBStatusPembayaran.setBounds(46, 588, 241, 27);
		contentPane.add(CBStatusPembayaran);
		
		JButton Btn = new JButton("Simpan");
		Btn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Btn.setBounds(46, 638, 89, 23);
		contentPane.add(Btn);
		
		JButton btnBatal = new JButton("Batal");
		btnBatal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBatal.setBounds(198, 639, 89, 23);
		contentPane.add(btnBatal);
		
		JButton Btn_1 = new JButton("Simpan");
		Btn_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Btn_1.setBounds(342, 354, 89, 23);
		contentPane.add(Btn_1);
		
		JButton btnUbah = new JButton("Ubah");
		btnUbah.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnUbah.setBounds(441, 354, 89, 23);
		contentPane.add(btnUbah);
		
		JButton btnHapus = new JButton("Hapus");
		btnHapus.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnHapus.setBounds(540, 354, 89, 23);
		contentPane.add(btnHapus);
		
		JButton btnBatal_1 = new JButton("Batal");
		btnBatal_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBatal_1.setBounds(639, 354, 89, 23);
		contentPane.add(btnBatal_1);
		
		tableService = new JTable();
		tableService.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				id = tableService.getValueAt(tableService.getSelectedRow(), 0).toString();
				txtHargaKg.setText(tableService.getValueAt(tableService.getSelectedRow(), 3).toString());
				
			}
			
		});
		tableService.setBounds(343, 89, 498, 99);
		contentPane.add(tableService);
		
		tableOrderDetail = new JTable();
		tableOrderDetail.setBounds(342, 403, 500, 258);
		contentPane.add(tableOrderDetail);
	}
}
