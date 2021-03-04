
	package mvntest;
	
	import java.io.*;
	
	public class Testcls {
		
	//	public String lent;
		//public String[] laukai;
		//public String[] n_pav;
		//public String sal;
		//public String comma;
		 public BufferedReader br;
		 public String line;
		// public Double;
		
		public Testcls() {
		}
		
		/*public Testcls ( String lentele, String[] laukeliai ) {
			
			//lent = lentele;
		//	laukai = laukeliai;
		}*/
		
		public void skaiciavimas () {
		
			BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );
			line = "";
			Double a = 0.0, b = 0.0, c, d;
		
			try {
			
				
				System.out.println ( "\n Iveskite a kintamaji" );
				
				a = Double.parseDouble ( br.readLine() );
				
				System.out.println ( "\n Iveskite b kintamaji" );
				
				b = Double.parseDouble ( br.readLine() );
				
				System.out.println ( "Jus ivedete tokia eilute: " + line + "\n" );
				System.out.println ( "Jus ivedete toki a skaiciu: " + a + "\n" );				
				System.out.println ( "Jus ivedete toki b skaiciu: " + b + "\n" );		
			
			} catch ( IOException ioe ) {
			
				ioe.printStackTrace();
			}
			
				c = (a * a) + (b * b);
				d = (c / 2);
				
			
			System.out.println ( "C kvadratu: " + c + "\n" + "C " + d + "\n");

			System.out.println ( "Pabaiga\n" );
	
		}
		
	}