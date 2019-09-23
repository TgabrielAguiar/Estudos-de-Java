/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/

package course;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n;i++) {
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			double divisao = num1/num2;
			if( num2 ==0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.println(divisao);
			}
		}
		
		sc.close();
	}
		
	}



