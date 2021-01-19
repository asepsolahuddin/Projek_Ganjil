public class Ganjil{
	public static void main(String[] args) {
		System.out.println("==========Aplikasi penghitung ganjil genap===========");
		System.out.println("");
		System.out.println("Deskripsi aplikasi");
		System.out.println("");
		System.out.println("aplikasi ini mencari bilangan ganjil dan gendap");
		System.out.println("Dari 0 sampai 50");
		System.out.println("");
		System.out.print("Bilangan Ganjil = ");
		for ( int i=0 ; i<51 ; i++) {
			if(i%2 == 1){
				System.out.print(i + " ,");
			}			
		}
		System.out.println("");
		System.out.print("Bilangan Genap = ");
		for ( int i=0 ; i<=51 ; i++ ) {
			if(i%2 == 0){
				System.out.print(i + " ,");
			}
		}

	}
}