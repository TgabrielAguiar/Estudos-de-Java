/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/

package course;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int contador1 = 0;
		int contador2 = 0;
		
		for(int i = 0; i<n; i++) {
			int x = sc.nextInt();
			if(x >=10 && x<=20) {
				contador1 = contador1 + 1;
				
			} else {
				contador2 = contador2 +1;
				
			}
			
		}
		System.out.println("in" + contador1);
		System.out.println("out " + contador2);
		
		sc.close();
	}
		
	}



