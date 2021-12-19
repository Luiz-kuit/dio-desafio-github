/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
        int segundos = 120;
        int horas = segundos / 3600;
        segundos %= 3600;
        int minutos = segundos / 60;
        segundos %= 60;
        
        System.out.print("Tempo total:");
        
        
        if (horas > 0){
            System.out.printf(" %d horas", horas);
        }
        if (minutos > 0){
            System.out.printf(" %d minutos", minutos);
        }
            
        if (segundos > 0){
            System.out.printf(" %d segundos", segundos);
        }
            
		
		
		
	}
}
