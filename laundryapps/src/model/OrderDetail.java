package model;

public class OrderDetail {
	
	String IdDetail,tanggal,tanggalP,jumlahKg,Total,Status,Pembayaran,StatusPembayaran;

	public String getIdDetail() {
		return IdDetail;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getPembayaran() {
		return Pembayaran;
	}

	public void setPembayaran(String pembayaran) {
		Pembayaran = pembayaran;
	}

	public String getStatusPembayaran() {
		return StatusPembayaran;
	}

	public void setStatusPembayaran(String statusPembayaran) {
		StatusPembayaran = statusPembayaran;
	}

	public void setIdDetail(String idDetail) {
		IdDetail = idDetail;
	}

	public String getTanggal() {
		return tanggal;
	}

	public void setTanggal(String idOrder) {
		tanggal = idOrder;
	}

	public String getTanggalP() {
		return tanggalP;
	}

	public void setTanggalP(String idLayanan) {
		tanggalP = idLayanan;
	}

	public String getJumlahKg() {
		return jumlahKg;
	}

	public void setJumlahKg(String jumlah) {
		jumlahKg = jumlah;
	}

	public String getTotal() {
		return Total;
	}

	public void setTotal(String total) {
		Total = total;
	}

}
