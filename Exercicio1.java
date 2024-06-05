package vetor;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[] = new int [5];
		int som=0;
		
		for(int i =0; i<5; i++) {
			System.out.println("Informe o valor " + i);
			a[i]= ler.nextInt();
			
			som+= a[i];
		}
		
		if (som>30)
			System.out.println("A soma dos numeros é maior que 30, resultando em " +som);
		else
			System.out.println("A soma dos numeros é menor que 30, resultando em "+som );
ler.close();

	}
	       }
