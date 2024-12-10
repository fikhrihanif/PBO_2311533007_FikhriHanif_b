package model;

public class Service {
	String id_service, jenis_service, status_service;
	int harga_service;
	public String getId_service() {
		return id_service;
	}
	public void setId_service(String id) {
		this.id_service = id;
	}
	public String getJenis_service() {
		return jenis_service;
	}
	public void setJenis_service(String jenis) {
		this.jenis_service = jenis;
	}
	public String getStatus_service() {
		return status_service;
	}
	public void setStatus_service(String status) {
		this.status_service = status;
	}
	public int getHarga_service() {
		return harga_service;
	}
	public void setHarga_service(int harga) {
		this.harga_service = harga;
	}

	
}
