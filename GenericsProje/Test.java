package GenericsProje;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("YGS LYS Birinci Bulma");
		Scanner scanner =new Scanner(System.in);
		
		String i�lemler=("i�lemler: "
				+ "1- E�it A��rk�k"
				+ "2- Say�sal "
				+ "��k�� i�in q");
		System.out.println("******************");
		System.out.println(i�lemler);
		System.out.println("*******************");
		
		
		
		while(true) {
			System.out.println("��k�� i�in q");
			String cevap= scanner.nextLine();
			if(cevap.equals("q")) {
				System.out.println("programdan ��k�l�yor");
				return;
			}
			
			System.out.println("1. ��renci ismi");
			String isim1=scanner.nextLine();
			System.out.println("netler:(t�rk�e, matematik,edebiyat,fizik) ");
			int t�rk�e1=scanner.nextInt();
			int matematik1=scanner.nextInt();
			int edebiyat1=scanner.nextInt();
			int fizik1=scanner.nextInt();
			scanner.nextLine();
			
			
			System.out.println("2. ��renci ismi");
			String isim2=scanner.nextLine();
			System.out.println("netler:(t�rk�e, matematik,edebiyat,fizik) ");
			int t�rk�e2=scanner.nextInt();
			int matematik2=scanner.nextInt();
			int edebiyat2=scanner.nextInt();
			int fizik2=scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("3. ��renci ismi");
			String isim3=scanner.nextLine();
			System.out.println("netler:(t�rk�e, matematik,edebiyat,fizik) ");
			int t�rk�e3=scanner.nextInt();
			int matematik3=scanner.nextInt();
			int edebiyat3=scanner.nextInt();
			int fizik3=scanner.nextInt();
			scanner.nextLine();
			
			
			
			System.out.print("i�lemi giriniz");
			String i�lem=scanner.nextLine();
			
			
			
			 if(i�lem.equals("1")) {
				E�itA��rl�k ��renci1=new E�itA��rl�k(t�rk�e1,matematik1,edebiyat1,fizik1,isim1);
				E�itA��rl�k ��renci2=new E�itA��rl�k(t�rk�e2,matematik2,edebiyat2,fizik2,isim2);
				E�itA��rl�k ��renci3=new E�itA��rl�k(t�rk�e3,matematik3,edebiyat3,fizik3,isim3);
				
				E�itA��rl�k birinci = birinci(��renci1,��renci2,��renci3);
				System.out.println("birinci e�it a��rl�k ��rencisi "+ birinci.getIsim());
                System.out.println("��renci puan�: "+ birinci.puanHesapla());
			}
			else if(i�lem.equals("2")) {	
				
				Say�sal ��renci1=new Say�sal(t�rk�e1,matematik1,edebiyat1,fizik1,isim1);
				Say�sal ��renci2=new Say�sal(t�rk�e2,matematik2,edebiyat2,fizik2,isim2);
				Say�sal ��renci3=new Say�sal(t�rk�e3,matematik3,edebiyat3,fizik3,isim3);
				
				Say�sal birinci = birinci(��renci1,��renci2,��renci3);
				System.out.println("birinci say�sal ��rencisi "+ birinci.getIsim());
				 System.out.println("��renci puan�: "+ birinci.puanHesapla());

			}
			else {
				System.out.println("ge�ersiz i�lem");
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
