package Introducao;

import java.util.Scanner;

public class exercício7 {

	public static void main(String[] args) 
	{
		int a,b,c,d,E,f,x,y;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("entre com a");
		a=leia.nextInt();
		System.out.print("entre com b");
		b=leia.nextInt();
		System.out.print("entre com c");
		c=leia.nextInt();
		System.out.print("entre com d");
		d=leia.nextInt();
		System.out.print("entre com E");
		E=leia.nextInt();
		System.out.print("entre com f");
		f=leia.nextInt();
		
		x=(c*E - b*f)/(a*E - b*d);
		y=(a*f - c*d)/(a*E - b*d);
		
		System.out.printf("x é: %d" ,x);
		System.out.printf("\ny é: %d" ,y);
		
		
		

	}

}
