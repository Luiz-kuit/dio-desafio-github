/******************************************************************************
Escreva um programa para:

• Receber a quantidade de alunos que farão a prova de segunda
chamada (pode ser que não haja aluno para fazer)

• Receber a nota de cada um dos alunos

• Mostrar no final a média geral das notas dos alunos


*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int aluno;
		float nota, acumNota = 0, mediaGeral;
		 
		
		System.out.print("Qual a quantidade de alunos que farão a segunda chamada: ");
		aluno = ler.nextInt();
		
		if (aluno == 0){
		    System.out.println("Não tem aluno para segunda chamada");
		    
		}
		else {
		    for (int i = 0; i < aluno; i++){
		        System.out.println("\nQual a nota do " + (i+1) + " aluno");
		        nota = ler.nextInt();
		        acumNota += nota;
		    }
		mediaGeral = acumNota / aluno;
		System.out.printf("\nMédia geral das notas: %.1f ", mediaGeral);
		    
		}
		
	}
}
