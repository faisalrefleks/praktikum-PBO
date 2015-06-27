package laporan7InterfaceExtends;

import laporan7Interface.BentukKeliling;
import laporan7Interface.BentukLuas;
import laporan7Interface.Lingkaran;
import laporan7InterfaceExtends.BentukInterface;

public class CobaInterface {
	public static double hitungLuasBentuk(BentukLuas b) {
		return b.hitungLuas();
	}

	public static double hitungLuasKeliling(BentukKeliling b) {
		return b.hitungKeliling();
	}

	public static void main(String args[]) {
		Lingkaran bentuk = new Lingkaran(3.0);
		System.out.println(hitungLuasBentuk((BentukLuas) bentuk));
		System.out.println(hitungLuasKeliling((BentukKeliling) bentuk));
	}
}