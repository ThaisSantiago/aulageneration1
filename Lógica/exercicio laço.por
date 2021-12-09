programa
{
	
	funcao inicio()
	{
		inteiro dado[10], x, m
        para (x=0;x<10;x++) 
        {
        	escreva("Insira o valor do dado: ")
        	leia(dado[x])
        }
        para (x=0;x<10;x++) 
        {
        	escreva("\n",dado[x])
        }
        
        m=(dado[0]+dado[1]+dado[2]+dado[3]+dado[4]+dado[5]+dado[6]+dado[7]+dado[8]+dado[9])/10    
        escreva("\n A média aritmética dos lançamentos é: ", m)    
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 436; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */