package laporan6utama;

import laporan6Dua.Bajaj;
import laporan6Dua.Motor;

public class BentorTest {
	public static void staterBentor(Bentor bentor) {
		bentor.stater();
	}

	public static void main(String args[]) {
		Bentor bajaj = new Bajaj();
		Motor motor = new Motor();
		staterBentor(new Bentor());
		staterBentor(bajaj);
		staterBentor(motor);
	}
}