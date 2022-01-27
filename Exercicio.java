
/*
 Calcula o salário do colaborador de acordo com as horas, dias e valor informado.
 */
package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int numero, horas;
	    double valorHora, salario;

	    numero = sc.nextInt();
	    horas = sc.nextInt();
	    valorHora = sc.nextDouble();

	    salario = valorHora * horas;

	    System.out.println("NUMBER = " + numero);
	    System.out.printf("SALARY = U$ %.2f%n", salario);

		
		sc.close();
	}
}
