package vetor;
import java.util.ArrayList;
import java.util.Arrays;
public class Exemplo2 {

	public static void main(String[] args) {
		String[] disciplinas = {"Matematica", "filosofia","história","fisica"};
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
         novaLista.add("geografia");
         novaLista.add("Lingua inglesa");

         for (String i: novaLista)
{
	System.out.println("Disciplinas:" + i);
}
	}

}
