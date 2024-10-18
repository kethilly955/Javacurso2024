package cursoJava2024;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenarNomes {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>(Arrays.asList("Ana","Vitor","Maria","João","Bia","Aline" ));
		//Ordenando a lista de nomes 
		Collections.sort(nomes);
		System.out.println("Nomes em ordem alfabéticas: " + nomes);
}
}
