package laporan6Dua;

import laporan6.OdongOdong;
import laporan6.Becak;
import laporan6utama.Bentor;

public class Motor extends Bentor {
	public Motor() {
	}

	public void balap() {
		OdongOdong Odong2 = new OdongOdong();
		stater();
		nama = "Motor isna";
		System.out.println("Balappppp ");
	}

	public static void main(String args[]) {
		Motor motor = new Motor();
		motor.balap();
	}

	public void stater() {
		System.out.println("Tarik motor");
	}
}