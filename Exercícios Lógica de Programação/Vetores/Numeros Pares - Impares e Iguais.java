/*
Considere um array carregado com 10 números inteiros positivos ou negativos.
•Informar se tem mais números pares, mais números impares ou iguais
•Informar se tem mais números positivos ou números negativos ou iguais

*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
        int numeros[] = {2, 3, -1, 4, 12, 54, 89, 41, 11, -5};
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;
        
        
        for (int i = 0; i < numeros.length; i++){
            
            if (numeros[i] % 2 == 0) {
                par++;
                
            }
            else {
                impar++;
                
            }
            if (numeros[i] >= 0){
                positivo++;
                
            }
            else {
                negativo++;
             
            }
            
        }
        if (par > impar) {
            System.out.println("Existem mais números pares, quantidade: " + par);
        }
        if (par < impar) {
            System.out.println("Existem mais números ímpares, quantidade: " + impar);
        }
        if (par == impar){
            System.out.println("A quantidade de números pares e ímpares são iguais, quantidade: " + par);
        }
        if (positivo > negativo){
            System.out.println("Existem mais números positivos, quantidade: " + positivo);
        }
        if (positivo < negativo){
            System.out.println("Existem mais números negativos, quantidade: " + negativo);
        }
        if (positivo == negativo){
            System.out.println("A quantidade de números positivos e negativos são iguais: " + positivo);
        }
        
        
	}
}