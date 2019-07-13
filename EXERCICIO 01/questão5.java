/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

package course;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca = sc.nextInt();
		int numPeca = sc.nextInt();
		double valorPeca = sc.nextDouble();
		
		int codPeca2 = sc.nextInt();
		int numPeca2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		
		double pagar = (numPeca*valorPeca + numPeca2*valorPeca2);
		
		System.out.printf("VALOR A PAGAR :R$ %.2f%n" , pagar);
		sc.close();
	}

}