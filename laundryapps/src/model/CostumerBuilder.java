package model;
import model.Costumer;

public class CostumerBuilder {
	private String id_costumer, nama_costumer, alamat_costumer, nohp_costumer;
	
	public CostumerBuilder() {
		
	}
	
	public CostumerBuilder setId(String id) {
		this.id_costumer = id;
		return this;
	}
	public CostumerBuilder setNama(String nama) {
		this.nama_costumer = nama;
		return this;
	}
	public CostumerBuilder setAlamat(String alamat) {
		this.alamat_costumer = alamat;
		return this;
	}
	public CostumerBuilder setNohp(String nohp) {
		this.nohp_costumer = nohp;
		return this;
	}
	public Costumer build() {
		return new Costumer(id_costumer, nama_costumer, alamat_costumer, nohp_costumer);
	}

}
