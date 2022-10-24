package reCapDemo_Classes;

public class Main {
	//classlar ortak operasyonları tutar
	//classlar özellikleri tutar (field veya attribute)
	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.Topla(3, 4);
		System.out.println(sonuc);
	}

}
