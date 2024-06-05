package vetor;
import java.util.ArrayList;
import java.util.Random;
public class Atividade1 {

	public static void main(String[] args) {		
    ArrayList<Integer> numeros = new ArrayList<>();
		int som=0;
		Random random = new Random ();
		
		for (int i= 0; i < 5; i++) {
		int numerosAleatorio = random.nextInt(100); 
		numeros.add(numerosAleatorio);	
		}
		
		for (int numero : numeros) {
			if (numero % 2 == 0)
				som+=numero;
			System.out.println(numero);
		}

		System.out.println("O resultado da soma dos numeros pares é: "+som);
	}

}
