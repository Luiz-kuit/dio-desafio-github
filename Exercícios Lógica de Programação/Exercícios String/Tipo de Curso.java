/*Escreva um programa para receber a matricula (string) de um aluno e mostra o tipo de
curso que ele faz, de acordo com a seguinte tabela:

Início da
matricula     Tipo de curso

1               Técnico
2 – 4           Graduação
5 – 6           Lato Sensu
7 – 8           Stricto Sensu

Caso o início da matricula não seja um desse valores, mostrar “Matricula incorreta”.

*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
        String matricula;
        int inicioMatricula;
        
		System.out.print("Qual a matrícula do aluno: ");
		matricula = ler.nextLine();
		
		inicioMatricula = Integer.parseInt(matricula.substring(0,1));
		
		if (inicioMatricula == 1){
            System.out.println("Curso Técnico");
            
		} else if (inicioMatricula == 2 || inicioMatricula == 4){
            System.out.println("Graduação");
            
		} else if (inicioMatricula == 5 || inicioMatricula == 6){
            System.out.println("Lato Sensu");
            
		} else if (inicioMatricula == 7 || inicioMatricula == 8){
            System.out.println("Stricto Sensu");		    
            
		} else {
            System.out.println("Matricula incorreta");		    
		}
		
		
		
	}
}
