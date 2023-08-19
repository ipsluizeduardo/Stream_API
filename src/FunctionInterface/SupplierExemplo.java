package FunctionInterface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExemplo {
    public static void main(String[] args) {
        // Usar o Supplier com expressoes lambda para fornecer uma saudacao personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem vindo!";

        // Usar Supplier para obter uma lista com 5 saudacoes
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo!")
                .limit(5)
                .toList();

        // Imprimir as saudacoes geradas
        listaSaudacoes.forEach(System.out::println);
    }
}
