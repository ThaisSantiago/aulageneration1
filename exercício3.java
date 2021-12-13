package Introducao;

import java.util.Scanner;

public class exercício3 {

	public static void main(String[] args) 
	{
		int segundos, horas, minutos, segundo;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Segundo de duração: ");
		segundo = leia.nextInt();
		
		segundos = (segundo%3600)/60; 
		horas = (segundo/3600);
		minutos = (segundo%3600)/60;
		
		System.out.printf("\nA duração em segundos %d", segundos);
		System.out.printf("\nA duração em minutos %d", minutos);
		System.out.printf("\nA duração em horas %d", horas);
		
		System.out.printf("\nTotal em segundo é: 10000");

	}

}
