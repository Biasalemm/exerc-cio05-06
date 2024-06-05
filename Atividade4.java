package vetor;
import java.util.ArrayList;
import java.util.Scanner;
public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> carros = new ArrayList<String>();
		Scanner ler = new Scanner(System.in);
		
		carros.add("Fusca");
		carros.add("Brasilia");
		carros.add("Chevette");
		carros.add("Monza");
		carros.add("Civic");
		carros.add("jeep");
		carros.add("Gol");
		carros.add("Porsche");
		carros.add("g6");
		carros.add("Mclaren");
		
		System.out.println("Carros disponiveis para compra: "+carros+" Qual voce gostaria de ver melhor? Digite um numero de 0 a 9");
		int num = ler.nextInt();
		System.out.println(carros.get(num));
		
		ler.close();
	}
	
	
	
}
