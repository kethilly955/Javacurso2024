package cursoJava2024;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgrupandoNomes {

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "João", "Maria", "Bia", "Carlos", "Eduarda");
        
        // Agrupar nomes pelo tamanho
        Map<Integer, List<String>> nomesAgrupados = nomes.stream()
            .collect(Collectors.groupingBy(String::length));
        
        // Exibindo os resultados
        for (Map.Entry<Integer, List<String>> entry : nomesAgrupados.entrySet()) {
            System.out.println("Tamanho " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
