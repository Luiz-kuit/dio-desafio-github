/*Escreva um programa para receber a idade de 6 alunos.
Se a idade do aluno menor que 15 anos, informar que o aluno NÃO PODE SE MATRICULAR;
Se a idade do aluno for maior ou igual a 15 anos e menor que 21 anos, informar que o aluno só poderá se matricular com o
responsável e receber o nome do responsável; 
Se a idade for igual ou maior que 21 anos, informar PODE SE MATRICULAR.
No final mostrar:
O percentual de matriculas rejeitadas
A quantidade de matriculas realizadas com responsáveis
A quantidade total de matriculas realizadas
*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade; 
		int cont = 0; 
		int matRealComResp = 0, quantTotalReje = 0, quantMatReal = 0;
		float percMatRejeitadas = 0;
		
		
		do {
		    
		    cont++;
		    
		    System.out.println("Digite a " + cont + "° idade: ");    
	        idade = ler.nextInt();
	        
	        
	        if (idade < 15){
	            System.out.println("Aluno Não Pode Se Matricular ");
	            quantTotalReje++;
	        }
	        
	        else if (idade >= 15 && idade < 21){
	            System.out.println("O Aluno só poderá se Matricular Com o Responsável, Qual o nome do Responsável: ");
	            ler.nextLine();
	            String nomeResp = ler.nextLine();
	            matRealComResp++;
	        }
	        
	        else {
	            System.out.println("Pode se Matricular");
	            
	        }
		          
		    
		} while (cont < 6);
		
		quantMatReal = 6 - quantTotalReje;
		percMatRejeitadas = (quantTotalReje * 100.0f) / 6.0f;
		System.out.println("\nPercentual de Matrículas Rejeitadas: " + String.format("%.2f", percMatRejeitadas) + "%");
		System.out.println("Quantidade de Matrículas Realizadas com Responsável: " + matRealComResp);
		System.out.println("Quantidade Total de Matrículas Realizadas: " + quantMatReal);
		
		
	}
}