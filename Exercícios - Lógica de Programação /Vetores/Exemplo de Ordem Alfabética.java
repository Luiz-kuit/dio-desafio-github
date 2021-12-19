/**************************

Exemplo de ordem alfabética

***************************/

import java.util.Scanner;
import java.util.Arrays;


public class Main
{
	public static void main(String[] args) {
	       Scanner input = new Scanner(System.in);
        String nome[] = new String[3];

        for(int i = 0; i<nome.length; ++i) {

        System.out.print("Digite o nome do " +(i+1) + "º aluno: ");
        nome[i] = input.nextLine();

        }

    System.out.println(" ");

    Arrays.sort(nome);

    for (int i=0; i< nome.length; i++){

        System.out.print(nome[i]+"\n");         
    }

    input.close();

    }       
}