package vetor;
import java.util.ArrayList;
public class Atividade3 {

	public static void main(String[] args) {
    ArrayList<String> frutas = new ArrayList<String>();
    
		frutas.add("Abacate");
		frutas.add("Laranja");
		frutas.add("Morango");
		frutas.add("Jabuticaba");
		frutas.add("Amora");
		frutas.add("Melancia");
		frutas.add("Mirtilo");
		frutas.add("Banana");
		frutas.add("Melão");
		frutas.add("Manga");
		System.out.println("Todas as frutas: "+frutas);
		
		 System.out.println("");
		 frutas.remove(8);
			frutas.remove(7);
			frutas.remove(5);
			frutas.remove(4);
			frutas.remove(2);
			System.out.println("Frutas que não foram removidas " +frutas);
		
		}
		
		
	}


