package model;

public class Order {
	
	String id_order, tanggal_datang_order, tanggal_selesai_order, status_order, pembayaran_order, status_pembayaran_order;
	int total;
	public String getId_order() {
		return id_order;
	}
	public void setId_order(String id_order) {
		this.id_order = id_order;
	}
	public String getTanggal_datang_order() {
		return tanggal_datang_order;
	}
	public void setTanggal_datang_order(String tanggal) {
		this.tanggal_datang_order = tanggal;
	}
	public String getTanggal_selesai_order() {
		return tanggal_selesai_order;
	}
	public void setTanggal_selesai_order(String tanggal_selesai) {
		this.tanggal_selesai_order = tanggal_selesai;
	}
	public String getStatus_order() {
		return status_order;
	}
	public void setStatus_order(String status) {
		this.status_order = status;
	}
	public String getPembayaran_order() {
		return pembayaran_order;
	}
	public void setPembayaran_order(String pembayaran) {
		this.pembayaran_order = pembayaran;
	}
	public String getStatus_pembayaran_order() {
		return status_pembayaran_order;
	}
	public void setStatus_pembayaran_order(String status_pembayaran) {
		this.status_pembayaran_order = status_pembayaran;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
	

}
