package Introducao;

import java.util.Scanner;

public class exerc�cio8 {

	public static void main(String[] args) 
	{
		int distribuidor, impostos, carro, fabrica;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Insira o pre�o de f�brica: ");
		fabrica=leia.nextInt();
		
		distribuidor = ((45*fabrica/100));
		impostos = ((28*fabrica/100));
				
		carro = (distribuidor + impostos + fabrica);	
				
				
		System.out.printf("Pre�o total:%d ", carro );
	}

}
