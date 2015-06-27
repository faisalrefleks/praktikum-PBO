package laporan7InterfaceExtends;

import laporan7Interface.BentukKeliling;
import laporan7Interface.BentukLuas;

public class Trapesium {
	public interface BentukInterface {
		public static final double PHI = 3.14;

		public void tulis();
	}

	public interface HitungKeliling extends BentukInterface {
		public double hitungKeliling();
	}

	public interface HitungLuas extends BentukInterface {
		public double hitungLuas();
	}
	
	public abstract class Lingkaran implements HitungKeliling, HitungLuas {
		private double jariJari;
		public void lingkaran(double jariJari) {
		this.jariJari = jariJari;
		}
		}
}