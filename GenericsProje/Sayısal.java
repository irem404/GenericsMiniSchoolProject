package GenericsProje;

public class Sayýsal extends Aday {

	public Sayýsal(int türkçe, int matematik, int edebiyat, int fizik, String isim) {
		super(türkçe, matematik, edebiyat, fizik, isim);
		// TODO Auto-generated constructor stub
	}

	@Override
	int puanHesapla() {
		// TODO Auto-generated method stub
		 return getTürkçe() * 5 + getMatematik() * 5 + getFizik() * 4 + getEdebiyat() * 1; 
	}

	
	
	
}
