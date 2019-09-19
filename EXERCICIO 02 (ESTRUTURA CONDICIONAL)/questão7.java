/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
*/

package course;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x <0 && y<0) {
			System.out.println("Q3");
		} else if(x<0 && y > 1) {
			System.out.println("Q2");
		} else if (x>1 && y<0) {
			System.out.println("Q4");
		} else if(y == 0 && x==0) {
			System.out.println("Origem");
		} else {
			System.out.println("Q1");
		}
		
		
		sc.close();
	}

}