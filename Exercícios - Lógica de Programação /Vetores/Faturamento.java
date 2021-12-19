/******************************************************************************

Em um vetor estão armazenados o faturamento mensal de um ano de uma determinada
empresa, conforme arquivo em anexo.

Elabore um programa para mostrar:

O faturamento de cada trimestre.
O trimestre com maior faturamento.
Considerar que não houve trimestre com igual faturamento.
O faturamento médio:
           - dos primeiros meses dos trimestres (jan, abr, jul e out)


           - dos segundos meses dos trimestres (fev, mai, ago e nov) 

           - dos terceiros meses dos trimestres (mar, jun, set e dez)

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
        
        double faturamento [] = {150350.50, 170980.30, 140341.90, 158480.50,
                                167120.10, 181380.60, 173875.20, 153987.50,
                                175680.80, 180360.10, 162450.80, 157650.40};
        
        double acumTri1 = 0, acumTri2 = 0, acumTri3 = 0, acumTri4 = 0;
        double acumPMesTri = 0, acumSMesTri = 0, acumTMesTri = 0;
        double media1, media2, media3;
        
        for (int i = 0; i < 3; i++){
            acumTri1 += faturamento[i];
            
        }
        System.out.println("Faturamento 1º trimestre: " + String.format("%.2f", acumTri1));
        
        for (int i = 3; i < 6; i++){
            acumTri2 += faturamento[i];
            
        }
        System.out.println("Faturamento 2º trimestre: " + String.format("%.2f", acumTri2)); 
        
        for (int i = 6; i < 9; i++){
            acumTri3 += faturamento[i];
            
        }
        System.out.println("Faturamento 3º trimestre: " + String.format("%.2f", acumTri3));
        
        for (int i = 9; i < 12; i++){
            acumTri4 += faturamento[i];
            
        }
        System.out.println("Faturamento 4º trimestre: " + String.format("%.2f", acumTri4));
        
        if (acumTri1 > acumTri2 && acumTri1 > acumTri3 && acumTri1 > acumTri4){
            System.out.println("\nO 1º trimestre obteve o maior faturamento ");
        }
        
        if (acumTri2 > acumTri1 && acumTri2 > acumTri3 && acumTri2 > acumTri4){
            System.out.println("\nO 2º trimestre obteve o maior faturamento ");
        }
        
        if (acumTri3 > acumTri1 && acumTri3 > acumTri2 && acumTri3 > acumTri4){
            System.out.println("\nO 3º trimestre obteve o maior faturamento ");
        }
        if (acumTri4 > acumTri1 && acumTri4 > acumTri2 && acumTri4 > acumTri3){
            
        }
        
        for (int i = 0; i < 12; i = i + 3){
            acumPMesTri += faturamento[i];
           
        }
        for (int i = 1; i < 12; i = i + 3){
            acumSMesTri += faturamento[i];
            
        }
        for (int i = 2; i < 12; i = i + 3){
            acumTMesTri += faturamento[i];
            
        }
        
        media1 = acumPMesTri / 4;
        media2 = acumSMesTri / 4;
        media3 = acumTMesTri / 4;
         
         System.out.println("\nMédia dos primeiros meses dos trimestres: " + String.format("%.2f", media1));     
         System.out.println("Média dos segundos meses dos trimestres: " + String.format("%.2f", media2));
         System.out.println("Média dos terceiros meses dos trimestres: " + String.format("%.2f", media3));
	}
}