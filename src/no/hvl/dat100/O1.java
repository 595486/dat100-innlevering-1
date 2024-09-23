package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {
		
		// Les inn bruttoinntekt
		
		double Skatt = 0;
		int Inntekt = 0;
		
		Inntekt = Integer.parseInt(showInputDialog("Inntekt"));
	
		
		// Beregn trinnskatten
		
		if (Inntekt <= 208050) {
			
		Skatt = Inntekt * 0.00;
				
		}
		
		else if (Inntekt <= 292850) {
			
		Skatt = Inntekt * 0.17;
		
		}

		else if (Inntekt <= 670000) {
		
		Skatt = Inntekt * 0.04;
	
		}
		
		else if (Inntekt <= 937900) {
			
		Skatt = Inntekt * 0.136;
		
		
		}
		
		else if (Inntekt <= 135000) {
			
		Skatt = Inntekt * 0.166;
		}
		
		else {
			
		Skatt = Inntekt * 0.176;
			
		}
		// Skriv ut trinnskatten

		showMessageDialog(null, Skatt);
		
	}

}