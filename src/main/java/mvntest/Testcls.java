
	package mvntest;
	
	import java.io.*;
	
	public class Testcls {
		
		public String lentx;
		public String zemyn;
		//public String[] laukai;
		//public String[] n_pav;
		//public String sal;
		//public String comma;
		 public BufferedReader br;
		 public String line;
		 public int[] lent;
		 public int temp;
		 public int suma;
		// public Double;
		
		public Testcls() {
			
		}
		
		public Testcls ( int[] lentele ) {
			
			lent = lentele;

		}
		
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
		
		public String lentele () {
		
			lentx = "";
			
			for ( int i = 0; i<lent.length; i++ ) {

			lentx += ( ( lent [i] ) + "\n" );
			}
					
			return lentx;
		}
		
		public int[] perrikiuotZemyn() {

		temp = 0;
      
			for (int i = 0; i < lent.length; i++) {     
				for (int j = i+1; j < lent.length; j++) {     
					if(lent[i] < lent[j]) {    
					temp = lent[i];    
					lent[i] = lent[j];    
					lent[j] = temp;    
				}     
            }     
        }    
				
		
			return lent; 
		}
		
		public void spausdintMasyva() {
			
			for (int i = 0; i <lent.length; i++){
			
			System.out.println (lent[i]);
			
			}
		}
		
		public int sudeti(){
			suma = 0;
			for (int i = 0; i < lent.length; i++) { 
				suma = suma + lent [i];
			}
			return suma;
		}
		//return skaiciu*/
		
	}
