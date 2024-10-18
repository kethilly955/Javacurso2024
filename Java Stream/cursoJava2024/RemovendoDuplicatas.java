package cursoJava2024;

import java.util.Arrays;
import java.util.List;

public class RemovendoDuplicatas {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 25, 10, 50, 25, 100, 50, 75);
        
        // Remover duplicatas e exibir os elementos únicos
        System.out.println("Elementos únicos: ");
        numeros.stream()
            .distinct()
            .forEach(System.out::println);
    }
}
