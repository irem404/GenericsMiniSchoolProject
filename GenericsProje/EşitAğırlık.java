package GenericsProje;

public class EþitAðýrlýk extends Aday {

	public EþitAðýrlýk(int türkçe, int matematik, int edebiyat, int fizik, String isim) {
		super(türkçe, matematik, edebiyat, fizik, isim);
		// TODO Auto-generated constructor stub
	}

	@Override
	int puanHesapla() {
		// TODO Auto-generated method stub
		return getTürkçe() * 5+ getMatematik() * 5 + getFizik() * 1 + getEdebiyat() * 4;
	}

	
	
}
