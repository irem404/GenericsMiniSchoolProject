package GenericsProje;

public abstract class Aday {

	private int t�rk�e;
	private int matematik;
	private int edebiyat;
	private int fizik;
	private String isim;
	
	public Aday(int t�rk�e, int matematik,int edebiyat,int fizik,String isim) {
		this.t�rk�e=t�rk�e;
		this.matematik=matematik;
		this.edebiyat=edebiyat;
		this.fizik=fizik;
		this.isim=isim;
	}

	public int getT�rk�e() {
		return t�rk�e;
	}

	public void setT�rk�e(int t�rk�e) {
		this.t�rk�e = t�rk�e;
	}

	public int getMatematik() {
		return matematik;
	}

	public void setMatematik(int matematik) {
		this.matematik = matematik;
	}

	public int getEdebiyat() {
		return edebiyat;
	}

	public void setEdebiyat(int edebiyat) {
		this.edebiyat = edebiyat;
	}

	public int getFizik() {
		return fizik;
	}

	public void setFizik(int fizik) {
		this.fizik = fizik;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	abstract int puanHesapla();
	
	
	
}
