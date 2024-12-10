package com.informatika.data;

public class Mobil extends Kendaraan implements BahanBakar {
	
	public Mobil(String merk, String model, int tahunPorduksi) {
		super(merk, model, tahunPorduksi);
		// TODO Auto-generated constructor stub
		
	}

	public String jenisTransmisi;

	@Override
	public void nyalakanMesin() {
		System.out.println("Nyalakan mesin: Tekan tombol start");
	}
	
	@Override
	public String jenisBahanBakar() {
		
		return "Bensin";
	}
	
	public void fiturMobil() {
		System.out.println("Fitur mobil : Memiliki AC dan audio premium");
	}

}
