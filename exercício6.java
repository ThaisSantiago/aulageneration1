package Introducao;

import java.util.Scanner;

public class exercício6 {

	public static void main(String[] args)
	{
		int x1, y1, x2, y2, d;
		double raiz;
		Scanner leia = new Scanner (System.in);
		System.out.print("Entre com o x1 de P1:");
		x1=leia.nextInt();
		System.out.print("Entre com o y1 de P1:");
		y1=leia.nextInt();
		System.out.print("Entre com o x2 de P1:");
		x2=leia.nextInt();
		System.out.print("Entre com o y2 de P1:");
		y2=leia.nextInt();
		
		d = ((x2+x1)*(x2+x1)) + ((y2-y1)*(y2-y1));
		raiz = Math.sqrt(d);
		System.out.printf("A distancia é: ");
		System.out.print(raiz);
	}

}
