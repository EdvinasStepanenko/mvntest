	package mvntest;


	public class App {
		
		
		
		public static void main ( String[] args ) {
		
		int [] masyvas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Testcls testas = new Testcls(masyvas);
		//testas.skaiciavimas();
		System.out.println("Skaičiai masyve yra:");
		System.out.println(testas.lentele());
		System.out.println("Skaičių eiliškumas masyve yra:");
		testas.spausdintMasyva();
		testas.perrikiuotZemyn();
		System.out.println("Perrikiuotas eiliškumas:");
		testas.spausdintMasyva();
		System.out.println("Masyvo skaičių suma yra:");
		System.out.println(testas.sudeti());
		}
	}
	
	