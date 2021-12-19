/*

Escrevendo meses e dias com vetores

*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
        String mes [] = {"Jan", "Fev", "Mar"};
        int totDias[] = {31, 28, 31};
		    
        for (int c=0; c<mes.length; c++){
            System.out.println("O mês de " + mes[c] + " tem " + totDias[c] + " dias ao todo ");
        }
	}
}
