package GenericsProje;

public class Say�sal extends Aday {

	public Say�sal(int t�rk�e, int matematik, int edebiyat, int fizik, String isim) {
		super(t�rk�e, matematik, edebiyat, fizik, isim);
		// TODO Auto-generated constructor stub
	}

	@Override
	int puanHesapla() {
		// TODO Auto-generated method stub
		 return getT�rk�e() * 5 + getMatematik() * 5 + getFizik() * 4 + getEdebiyat() * 1; 
	}

	
	
	
}
