package laporan5;

public class Motor {
	public void motor() {
		System.out.println("GL Pro");
	}

	public void motor(String nama) {
		System.out.println("Beat");
	}

	public void motor(int jumlah) {
		System.out.println("Vario");
	}

	public void motor(long jumlah) {
		System.out.println("Supra X");
	}

	public String motor(String nama, int jumlah) {
		return "CBR 150";
	}

	public static void main(String args[]) {
		Motor motoran = new Motor();
		motoran.motor();
		motoran.motor("CBR 500");
		motoran.motor("4");
		motoran.motor("51");
		System.out.println(motoran.motor("Motornya", 5));
	}
}