package cursoJava2024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Quadrados {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        
        // Usando Streams para calcular o quadrado de cada número
        List<Integer> quadrados = numeros.stream()
                                          .map(numero -> numero * numero) // Calculando o quadrado
                                          .collect(Collectors.toList()); // Coletando em uma nova lista

        System.out.println("Quadrados: " + quadrados);
    }
}
