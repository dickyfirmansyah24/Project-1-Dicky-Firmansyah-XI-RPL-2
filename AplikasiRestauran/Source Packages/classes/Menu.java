package classes;

public class Menu {
	private String nama_menu;
	private double harga;
	private String kategori;
	
	public String getNama_Menu () { 
		return nama_menu; 
	}
	
	public void setNama_Menu (String nama_menu) {
		this.nama_menu = nama_menu;
	}
	
	public double getHarga () { 
		return harga;
	}
	
	void setHarga (double harga) {
		this.harga = harga;
	}
	
	public String getKategori () { 
		return kategori;
	}
	
	public void setKategori (String kategori) {
		this.kategori = kategori;
	}

}