package FunctionInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExemplo {
    public static void main(String[] args) {
        // Criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //Usar a Function com expressao lambda para dobrar todos os numeros
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Usar a funcao dobrar todos os numeros do Streajm e armazena-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n * 2)
                .toList();

        //Imprimir a lista de numeros dobrados
        numerosDobrados.forEach(System.out::println);
    }
}
