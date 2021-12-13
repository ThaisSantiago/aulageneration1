package Introducao;

import java.util.Scanner;

public class exercício1 {

	public static void main(String[] args) 
	{
		int anos,meses,dias, res, x, y;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("\nEntre com anos.");
		anos = leia.nextInt();
		System.out.print("\nEntre com meses.");
		meses = leia.nextInt();
		System.out.print("\nEntre com dias.");
		dias = leia.nextInt();
		
	     x = (anos * 365);
		 y = (meses * 30);
		 res = (x+y+dias);
		System.out.print("Quanto em dias de idade: ");
		System.out.print(res);

	}

}
