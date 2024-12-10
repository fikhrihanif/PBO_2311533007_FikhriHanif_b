package table;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.OrderDetail;

public class TableOrderDetail extends AbstractTableModel {
	List<OrderDetail> ls;
	private String[] columnNames = {"IdDetail","tanggal_datang_order","tanggalP","jumlahKg","Total"};
	public TableOrderDetail(List<OrderDetail> ls) {
		this.ls = ls;
}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return ls.size();
	}
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 8;
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		switch (columnIndex) {
		case 0:
			return ls.get(rowIndex).getIdDetail();
		case 1:
			return ls.get(rowIndex).getJumlahKg();
		case 2:
			return ls.get(rowIndex).getTotal();
		case 3:
			return ls.get(rowIndex).getTanggal();
		case 4:
			return ls.get(rowIndex).getTanggalP();
		case 5:
			return ls.get(rowIndex).getStatus();
		case 6:
			return ls.get(rowIndex).getPembayaran();
		case 7:
			return ls.get(rowIndex).getStatusPembayaran();
		default:
			return null;
	}
}
}