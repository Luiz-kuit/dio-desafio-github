/*Uso do equals*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome1 = "Luiz";
		String nome2 = "Luiz";
		String nome3 = "Rosa";
        String resp;
        
        resp = (nome1.equals(nome3)) ? "Igual" : "Diferente";
        System.out.println(resp);
	}
}
