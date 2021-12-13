package Introducao;

import java.util.Scanner;

public class exercício8 {

	public static void main(String[] args) 
	{
		int distribuidor, impostos, carro, fabrica;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Insira o preço de fábrica: ");
		fabrica=leia.nextInt();
		
		distribuidor = ((45*fabrica/100));
		impostos = ((28*fabrica/100));
				
		carro = (distribuidor + impostos + fabrica);	
				
				
		System.out.printf("Preço total:%d ", carro );
	}

}
