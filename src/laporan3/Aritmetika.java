package laporan3;

public class Aritmetika {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Operator Aritmetika,Concat,Unary dan PrePostDemo");
		System.out.println("");
		System.out.println("Operasi ARITMETIKA");
		int hasil = 1 + 8;
		System.out.println(hasil);
		hasil = hasil - 2;
		System.out.println(hasil);
		hasil = hasil * 6;
		System.out.println(hasil);
		hasil = hasil / 2;
		System.out.println(hasil);
		hasil = hasil + 10;
		hasil = hasil % 5;
		System.out.println(hasil);
		hasil += 4;
		System.out.println(hasil);
		hasil -= 2;
		System.out.println(hasil);
		hasil *= 5;
		System.out.println(hasil);
		System.out.println("");
		System.out.println("Operasi CONCAT");
		String string1 = "Ini adalah";
		String string2 = " string yang di CONCAT.";
		String gabungan = string1 + string2;
		System.out.println(gabungan);
		System.out.println("");
		System.out.println("Operasi UNARY");
		int unary = 8;
		System.out.println(unary);
		unary--;
		System.out.println(unary);
		unary++;
		System.out.println(unary);
		unary = -unary;
		System.out.println(unary);
		boolean sukses = true;
		System.out.println(sukses);
		System.out.println(!sukses);
	}
}