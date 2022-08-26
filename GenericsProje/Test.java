package GenericsProje;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("YGS LYS Birinci Bulma");
		Scanner scanner =new Scanner(System.in);
		
		String iþlemler=("iþlemler: "
				+ "1- Eþit Aðýrkýk"
				+ "2- Sayýsal "
				+ "Çýkýþ için q");
		System.out.println("******************");
		System.out.println(iþlemler);
		System.out.println("*******************");
		
		
		
		while(true) {
			System.out.println("çýkýþ için q");
			String cevap= scanner.nextLine();
			if(cevap.equals("q")) {
				System.out.println("programdan çýkýlýyor");
				return;
			}
			
			System.out.println("1. öðrenci ismi");
			String isim1=scanner.nextLine();
			System.out.println("netler:(türkçe, matematik,edebiyat,fizik) ");
			int türkçe1=scanner.nextInt();
			int matematik1=scanner.nextInt();
			int edebiyat1=scanner.nextInt();
			int fizik1=scanner.nextInt();
			scanner.nextLine();
			
			
			System.out.println("2. öðrenci ismi");
			String isim2=scanner.nextLine();
			System.out.println("netler:(türkçe, matematik,edebiyat,fizik) ");
			int türkçe2=scanner.nextInt();
			int matematik2=scanner.nextInt();
			int edebiyat2=scanner.nextInt();
			int fizik2=scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("3. öðrenci ismi");
			String isim3=scanner.nextLine();
			System.out.println("netler:(türkçe, matematik,edebiyat,fizik) ");
			int türkçe3=scanner.nextInt();
			int matematik3=scanner.nextInt();
			int edebiyat3=scanner.nextInt();
			int fizik3=scanner.nextInt();
			scanner.nextLine();
			
			
			
			System.out.print("iþlemi giriniz");
			String iþlem=scanner.nextLine();
			
			
			
			 if(iþlem.equals("1")) {
				EþitAðýrlýk öðrenci1=new EþitAðýrlýk(türkçe1,matematik1,edebiyat1,fizik1,isim1);
				EþitAðýrlýk öðrenci2=new EþitAðýrlýk(türkçe2,matematik2,edebiyat2,fizik2,isim2);
				EþitAðýrlýk öðrenci3=new EþitAðýrlýk(türkçe3,matematik3,edebiyat3,fizik3,isim3);
				
				EþitAðýrlýk birinci = birinci(öðrenci1,öðrenci2,öðrenci3);
				System.out.println("birinci eþit aðýrlýk öðrencisi "+ birinci.getIsim());
                System.out.println("öðrenci puaný: "+ birinci.puanHesapla());
			}
			else if(iþlem.equals("2")) {	
				
				Sayýsal öðrenci1=new Sayýsal(türkçe1,matematik1,edebiyat1,fizik1,isim1);
				Sayýsal öðrenci2=new Sayýsal(türkçe2,matematik2,edebiyat2,fizik2,isim2);
				Sayýsal öðrenci3=new Sayýsal(türkçe3,matematik3,edebiyat3,fizik3,isim3);
				
				Sayýsal birinci = birinci(öðrenci1,öðrenci2,öðrenci3);
				System.out.println("birinci sayýsal öðrencisi "+ birinci.getIsim());
				 System.out.println("öðrenci puaný: "+ birinci.puanHesapla());

			}
			else {
				System.out.println("geçersiz iþlem");
			}
		}
	}
	
	
	public static <E extends Aday> E  birinci(E e1, E e2, E e3) {
		
		if(e1.puanHesapla() > e2.puanHesapla() && (e1.puanHesapla()>e3.puanHesapla())) {
			return e1;
		}
		else if(e2.puanHesapla() > e1.puanHesapla() && (e2.puanHesapla() > e3.puanHesapla())) {
			return e2;
		}
		else if(e3.puanHesapla() > e1.puanHesapla() && (e3.puanHesapla() > e2.puanHesapla())) {
			return e3;
		}
		
		else{
			return e1;
		}
	}

}
