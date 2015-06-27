package laporan5;

public class HandphoneDua {
	public String merek;
	public String type;
	public int harga;
	public int diskon;

	public void cetakHandphone() {
		System.out.println(merek + "," + type + "," + harga + "," + diskon);
	}

	public static void main(String[] args) {
		HandphoneDua objekHandphone = new HandphoneDua();
		objekHandphone.merek = "Smartfren";
		objekHandphone.type = "Andromax C3";
		objekHandphone.harga = 1600000;
		objekHandphone.diskon = 50000;
		objekHandphone.cetakHandphone();
		HandphoneDua objekHandphoneDua = new HandphoneDua();
		objekHandphoneDua.merek = "Smartfren";
		objekHandphoneDua.type = "Andromac i";
		objekHandphoneDua.harga = 1500000;
		objekHandphoneDua.diskon = 65000;
		objekHandphoneDua.cetakHandphone();
	}
}