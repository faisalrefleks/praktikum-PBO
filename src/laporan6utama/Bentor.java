package laporan6utama;

import laporan6.Becak;
import laporan6.OdongOdong;

public class Bentor {
	public Becak becak1;
	public OdongOdong odong1;
	private int nomor;
	protected String nama;

	public Bentor() {
		becak1 = new Becak();
		odong1 = new OdongOdong();
		System.out.println("Konstruktor Bentor");
	}

	public void stater() {
		System.out.println("Tarik Bentor");
	}

	public Bentor(String nama) {
		this.nama = nama;
	}
}