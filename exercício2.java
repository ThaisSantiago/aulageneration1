package Introducao;

import java.util.Scanner;

public class exerc�cio2 {

	public static void main(String[] args) {
		
		int dia , meses, anos, dias;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("\nEntre com os dias de vida: ");
		dia = leia.nextInt();
		
		anos = (dia / 365); 
		meses = (dia % 365)/12;
		dias = (dia % 365)/31;
		
		System.out.printf("\nVoc� tem : %d " , anos); 
		System.out.printf("anos %d " , meses ); 
		System.out.printf("meses e %d " , dias); 
		System.out.printf("dias"); 
		
			

	}

}
