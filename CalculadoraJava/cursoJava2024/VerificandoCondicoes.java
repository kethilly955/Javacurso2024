package cursoJava2024;
import java.util.Arrays;
import java.util.List;

public class VerificandoCondicoes {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(10,25,50,75,100,-5);
		
		//Verificar se algum número é maior que 50
		boolean algumMaiorQue50 = numeros.stream().anyMatch(n -> n > 50);
		System.out.println("Algum número é maior que 50? " + algumMaiorQue50);
		
		//Verificar se todos os números são positivos
		boolean todosPositivos = numeros.stream().allMatch(n -> n > 0);
		System.out.println("Todos os números são positivos? " + todosPositivos );
		
		//Verificar se nenhum número é negativo 
		boolean nenhumNegativo = numeros.stream().noneMatch(n -> n < 0);
		System.out.println("Nenhum número é negativo? " + nenhumNegativo);
		
	}
}

