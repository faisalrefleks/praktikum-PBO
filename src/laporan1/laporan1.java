package laporan1;

public class laporan1 {
	
	static String praktikum="BELAJAR PEMROGRAMAN";

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			String praktikum2="BERORIENTASI OBJEK";
			System.out.println("Ini Praktikum pertama saya);");
			System.out.println(praktikum);
			System.out.println(praktikum2);
			biodataku();
			tambah();
			kurang();
			kali();
			bagi();
		}
		
		public static void tambah()
		{
			System.out.println("OPERASI MATEMATIKA SEDERHANA");
			int a=8+5;
			System.out.println("8 + 5 = "+a);
		}
		public static void kurang()
		{
			int a=8-5;
			System.out.println("8 - 5 = "+a);
		}
		public static void kali()
		{
			int a=8*5;
			System.out.println("8 X 5 = "+a);
		}
		public static void bagi()
		{
			int a=8/5;
			System.out.println("8 : 5 = "+a);
		}
		public static void biodataku(){
			System.out.println("Nama : Faisal");
			System.out.println("NIM  : 60200112041");
			System.out.println("Kelas: C");
		}

}
