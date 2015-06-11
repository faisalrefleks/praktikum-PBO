package laporan3;

public class Perbandingan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Operator Perbandingan,Kondisional dan Bitwise");
		System.out.println("");
		System.out.println("Operasi PERBANDINGAN");
		int nilai1 = 5;
		int nilai2 = 7;
		if (nilai1 == nilai2) {
			System.out.println(nilai1 + " = " + nilai2);
		}
		if (nilai1 != nilai2) {
			System.out.println(nilai1 + " != " + nilai2);
		}
		if (nilai1 > nilai2) {
			System.out.println(nilai1 + " > " + nilai2);
		}
		if (nilai1 < nilai2) {
			System.out.println(nilai1 + " < " + nilai2);
		}
		if (nilai1 <= nilai2) {
			System.out.println(nilai1 + " <= " + nilai2);
		}

		System.out.println("");
		System.out.println("Operasi KONDISIONAL");
		int nilai3 = 14;
		int nilai4 = 11;

		if ((nilai3 == 14) && (nilai4 == 11))
			System.out.println("Nilai3 adalah 14 AND nilai4 adalah 11");
		if ((nilai3 == 14) || (nilai4 == 11))
			System.out.println("Nilai3 adalah 14 OR nilai4 adalah 11");

		System.out.println("");
		System.out.println("Operasi BITWISE");
		byte nilai5 = 90;
		byte nilai6 = -75;

		System.out.println(~nilai5);
		System.out.println(~nilai6);
		System.out.println("hgcgfc");
		System.out.println("operator AND "+(nilai5 & 5));
		System.out.println("operator OR "+(nilai6 | 5));
		System.out.println("operator XOR "+(nilai6 ^ 5));
		System.out.println(nilai5 >> 2);
		System.out.println(nilai6 << 7);
		System.out.println(nilai5 << 3);
		System.out.println(nilai5 >>> 3);
		System.out.println(nilai6 >>> 5);

	}

}
