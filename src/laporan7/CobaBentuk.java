package laporan7;

import laporan7Model.Model;
import laporan7Model.BujurSangkar;
import laporan7Model.SegitigaSamaKaki;
import laporan7Model.SegitigaSamaSisi;

public class CobaBentuk {
	public static void cetakBangun(Model b) {
		System.out.println(b.hitungLuas());
		b.tulis();
		b.geser(5, 5);
	}

	public static void main(String args[]) {
		cetakBangun(new BujurSangkar());
		cetakBangun(new SegitigaSamaKaki());
		cetakBangun(new SegitigaSamaSisi());
	}
}