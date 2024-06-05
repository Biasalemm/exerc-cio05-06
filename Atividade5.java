package vetor;
import java.util.ArrayList;
import java.util.Scanner;
public class Atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ingrediente = new ArrayList<String>();
		Scanner ler = new Scanner(System.in);
		int alt;
		System.out.println("Açai da casa");
		ingrediente.add("Granola");
		ingrediente.add("Morango");
		ingrediente.add("Banana");
		ingrediente.add("Leite em pó");
		ingrediente.add("Gotas de chocolate");
		ingrediente.add("leite condensado");
		System.out.println("Ingredientes: "+ingrediente);
		System.out.println("Gostaria de excluir um ingrediente?[1] Gostaria de adicionar um ingrediente?[2] Gostaria de fazer o pedido completo[3]");
		alt = ler.nextInt();
		
		if (alt == 1 ) {
			System.out.println("Qual ingrediente deseja excluir");
			ingrediente.remove(ler.nextInt());
			System.out.println(ingrediente);
		}
		else if (alt == 2) {
			System.out.println(("Qual ingrediente gostaria de adicionar?"));
			ingrediente.add(ler.next());
			System.out.println(ingrediente);
		}
		else System.out.println(ingrediente);
		
		ler.close();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
