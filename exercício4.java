package Introducao;

import java.util.Scanner;

public class exercícios4 {

	public static void main(String[] args) 
	{
		int a,b,c,d,r,s;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("digite a: ");
		a = leia.nextInt();
		
		System.out.print("digite b: ");
		b = leia.nextInt();
		
		System.out.print("digite c: ");
		c = leia.nextInt();
		
		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		d = (r+s)/2;
		
		System.out.printf("D= %d",d);
		

	}

}
