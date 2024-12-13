package model;

public class Costumer {
	private String id_costumer, nama_costumer, alamat_costumer, nohp_costumer;

	public Costumer(String id_costumer, String nama_costumer, String alamat_costumer, String nohp_costumer) {
		this.id_costumer = id_costumer;
		this.nama_costumer = nama_costumer;
		this.alamat_costumer = alamat_costumer;
		this.nohp_costumer = nohp_costumer;
	}

	public String getId_costumer() {
		return id_costumer;
	}

	public String getNama_costumer() {
		return nama_costumer;
	}

	public String getAlamat_costumer() {
		return alamat_costumer;
	}

	public String getNohp_costumer() {
		return nohp_costumer;
	}
	

	
}
