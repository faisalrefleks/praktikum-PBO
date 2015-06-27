package laporan5;

public class Motor {
	public void motor() {
<<<<<<< HEAD
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
=======
		System.out.println("Sanex");
	}

	public void motor(String nama) {
		System.out.println("Mio");
	}

	public void motor(int jumlah) {
		System.out.println("Jupiter");
	}

	public void motor(long jumlah) {
		System.out.println("Shogun");
	}

	public String motor(String nama, int jumlah) {
		return "Scorpio";
>>>>>>> 93dc04052d48956a031f1097719ea212a2c35ce2
	}

	public static void main(String args[]) {
		Motor motoran = new Motor();
		motoran.motor();
<<<<<<< HEAD
		motoran.motor("CBR 500");
=======
		motoran.motor("Vixion");
>>>>>>> 93dc04052d48956a031f1097719ea212a2c35ce2
		motoran.motor("4");
		motoran.motor("51");
		System.out.println(motoran.motor("Motornya", 5));
	}
}