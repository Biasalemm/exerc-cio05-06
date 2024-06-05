package vetor;

import java.util.ArrayList;
import java.util.Random;

public class Atividade2 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		int som=0;
		Random random = new Random ();
		
		for (int i= 0; i < 5; i++) {
		int numerosAleatorio = random.nextInt(); 
		numeros.add(numerosAleatorio);	
		}
		
		for (int numero : numeros) {
			if (numero <0)
				som++;
			System.out.println(numero);
		}

		System.out.println("O resultado da soma dos numeros negativos é: "+som);

	}

}
