package vetor;
import java.util.ArrayList;

public class ExemploArrayList {

	public static void main(String[] args) {
		// Criando um ArrayList de numeros inteiros
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);// Adicionando elementos ao ArrayList
		numeros.add(20);

		System.out.println(numeros.get(0)); // saida: 10 // Acessando elementos do ArrayList
		System.out.println(numeros.get(1)); //saida: 20 
		
		numeros.set(1,  25);
		System.out.println(numeros.get(1)); //saida: 25 //Modificando um elemento do ArrayList
		
		numeros.remove(0);
		System.out.println(numeros.get(0)); //saida // Removendo um elemento do ArrayList
		
		System.out.println(numeros.size()); // saida: 2 //Obtendo o tamanho do ArrayList
	}

}
