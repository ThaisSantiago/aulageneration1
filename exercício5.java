package Introducao;

import java.util.Scanner;

public class exercício5 {

	public static void main(String[] args) 
	{
		int  media, a , b , c;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("entre com primeira nota");
		a=leia.nextInt();
		System.out.print("entre com segunda nota");
		b=leia.nextInt();
		System.out.print("entre com terceira nota");
		c=leia.nextInt();
	
		media = (a*2 + b*3 + c*5)/10;
		
		System.out.printf("media final das notas: %d ", media);
	
	
	}
	

}
