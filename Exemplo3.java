package vetor;
import java.util.ArrayList;
import java.util.Random;
public class Exemplo3 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		Random random = new Random ();
		
		for (int i= 0; i < 5; i++) {
		int numerosAleatorio = random.nextInt(100); 
		numeros.add(numerosAleatorio);	
		}
		
		for (int numero : numeros) {
			System.out.println(numero);
		}
	}

}
