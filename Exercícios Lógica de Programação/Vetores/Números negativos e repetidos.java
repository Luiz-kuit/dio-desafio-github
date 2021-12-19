/* Escreva um programa para armazenar números em um vetor de 5 posições, considerando as seguintes regras:
- Só aceitar números positivos
- Não aceitar números duplicados  */


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean achou = false;        
        int[] vetor = new int[5];
        
        for (int i=0; i<vetor.length; i++) {
            
            do {
                System.out.printf("%dº número: ", (i+1));
                vetor[i]=ler.nextInt();
                
                if (vetor[i] < 0) {
                    System.out.println("Número não pode ser negativo");
                    continue;
                }
                
                // revificando duplicidade
                achou = false;
                for (int j = 0; j<i; j++) {
                    if (vetor[i] == vetor[j]) {
                        System.out.println("Número já informado");
                        achou = true;
                        break;
                    }
                }
                // achou => true se encontrou
                // achou => false se não encontrou
                if (achou == false) {
                    break;
                }
            } while (true);
            
            
        }

	}
}