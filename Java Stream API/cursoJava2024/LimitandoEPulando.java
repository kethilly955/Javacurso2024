package cursoJava2024;
import java.util.Arrays;
import java.util.List;

public class LimitandoEPulando {

	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Aline", "Julia", "Allan", "Bianca", "Mario");
		
		//Exibir os tr~es primeiros elementos
		System.out.println("Três primeiros elementos: ");
		nomes.stream().limit(3).forEach(System.out::println);
		
		//Pular os primeiros elementos e exibir o restante
		System.out.println("\nPulando os dois primeiros elementos:");
		nomes.stream().skip(2).forEach(System.out::println);
		
	}

}
