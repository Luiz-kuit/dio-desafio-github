/**************************

Colocando nomes em ordem alfabética

***************************/

import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String alunos[] = {"João", "Thyago", "Luiz", "Zelia"};
		
		Arrays.sort(alunos);
        for (String nome:alunos) {
            System.out.println(nome);
        }
            		    
		
	}
}