package laporan5;

public class Motor2 {

	private String namaMotor;
	private int hargaMotor;

	private Motor2() {
		namaMotor = "MIO J";
		hargaMotor = 14500000;
	}

	private Motor2(String nama, int harga) {
		namaMotor = nama;
		hargaMotor = harga;
	}

	public void cetakMotor2() {
		System.out.println(namaMotor + " " + hargaMotor);
	}

	public static void main(String args[]) {
		Motor2 mDua = new Motor2();
		mDua.cetakMotor2();
		mDua = new Motor2("Sanex", 2000000);
		mDua.cetakMotor2();
	}
}