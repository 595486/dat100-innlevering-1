package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {
		
		int i;
		
		for (i = 1; i <= 10; i++) {
			
		
		// Les inn poengsum
		
		int Poengsum = 0;
		
		Poengsum = Integer.parseInt(showInputDialog("Poengsum"));
		
		// Beregn karakter
		
		char Karakter = 'F';
		
		if (Poengsum >= 0 && Poengsum <= 39) {
			
		Karakter = 'F';
			
		}
			
		
		else if (Poengsum >= 0 && Poengsum <= 49) {
			
		Karakter = 'E';
			
		}
		
		else if (Poengsum >= 0 && Poengsum <= 59) {
			
		Karakter = 'D';
			
		}
		
		else if (Poengsum >= 0 && Poengsum <= 79) {
			
		Karakter = 'C';
			
		}
		
		else if (Poengsum >= 0 && Poengsum <= 89) {
			
		Karakter = 'B';
		
		}
		
		else if (Poengsum >= 0 && Poengsum <= 100) {
			
		Karakter = 'A';
		
		}
		
		else {
		
		Karakter = 'K';
			
		}
		
		// Skriv ut karakter
		
		if (Karakter == 'K') {
		
		showMessageDialog(null, "Angitt verdi er feil");
			
		}
		
		else {
		
		showMessageDialog(null, Karakter);
		
			}
		
		}

	}

}
