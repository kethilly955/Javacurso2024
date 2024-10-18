package cursoJava2024;
import java.util.Arrays;
import java.util.List;
public class FitrarParImpar{

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7);
		
		//Filtrando apenas os numeros pares: 
		numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		numeros.stream().filter(n -> n % 2 != 0).forEach(System.out::println);

	}

}
