package Introducao;

import java.util.Scanner;

public class exerc�cio3 {

	public static void main(String[] args) 
	{
		int segundos, horas, minutos, segundo;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Segundo de dura��o: ");
		segundo = leia.nextInt();
		
		segundos = (segundo%3600)/60; 
		horas = (segundo/3600);
		minutos = (segundo%3600)/60;
		
		System.out.printf("\nA dura��o em segundos %d", segundos);
		System.out.printf("\nA dura��o em minutos %d", minutos);
		System.out.printf("\nA dura��o em horas %d", horas);
		
		System.out.printf("\nTotal em segundo �: 10000");

	}

}
