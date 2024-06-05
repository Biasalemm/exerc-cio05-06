package vetor;
import java.util.ArrayList;
public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<>();
		
		int som=0;
		
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		numeros.add(50);
		
		for (Integer num : numeros) {
			som += num;
			System.out.println(num);
			
		}
		System.out.println(som);
		
		

	}

}
