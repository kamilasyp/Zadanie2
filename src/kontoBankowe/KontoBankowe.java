package kontoBankowe;

import java.math.BigInteger;
import java.util.*;


public class KontoBankowe 
{

	public static void main (String[] args){
		final String kodLiterowy = "2521";
		
		System.out.println("Proszê o wprowadzanie numeru rachunku w celu weryfikacji. ");
		
		Scanner odczyt = new Scanner (System.in);
		String numerRachunku = odczyt.nextLine();
		

			numerRachunku = numerRachunku + kodLiterowy;		
			String odejmujeDwiePierwszeLiczby = numerRachunku.substring(0, 2);		
			String uzyskanyNumer = numerRachunku.substring(2, 30) + odejmujeDwiePierwszeLiczby; 
		
			BigInteger numer = new BigInteger (uzyskanyNumer);
			BigInteger modulo = new BigInteger ("97");
			BigInteger dzielenieModulo = numer.mod(modulo);
		
			int resztaZdzielenia = dzielenieModulo.intValue();
		
			if (resztaZdzielenia == 1) System.out.println("Podano prawid³owy numer rachunku");
				else System.out.println("Podano nieprawid³owy numer rachunku");

		
		odczyt.close();
	
	}
	
}
