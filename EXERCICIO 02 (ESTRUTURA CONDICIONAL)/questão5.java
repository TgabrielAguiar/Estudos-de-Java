/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.*/

package course;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		double valor;
		
		if(a == 1) {
			valor = 4 *b;
			System.out.printf("Valor:R$ %.2f%n", valor);
		} else if (a == 2) {
			valor = 4.5*b;
			System.out.printf("Valor:R$ %.2f%n", valor);
		} else if(a == 3) {
			valor = 5*b;
			System.out.printf("Valor:R$ %.2f%n", valor);
		} else if(a == 4) {
			valor = 2*b;
			System.out.printf("Valor:R$ %.2f%n", valor);
		} else if (a == 5) {
			valor = 1.5*b;
			System.out.printf("Valor: R$ %.2f%n", valor);
		}
		
		sc.close();
	}

}