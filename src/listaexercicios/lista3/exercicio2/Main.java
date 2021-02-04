package listaexercicios.lista3.exercicio2;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println("Lista completa: " + lista + "\n");
		System.out.println("Lista com apenas números pares:");
		lista.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));
		System.out.println("");
		System.out.println("Ignorado os dois primeiros números:");
		lista.stream().filter(e -> e % 2 == 0).skip(2).forEach(e -> System.out.println(e));
		System.out.println("");
		System.out.println("Limitado o processamento aos dois primeiros números:");
		lista.stream().filter(e -> e % 2 == 0).skip(2).limit(2).forEach(e -> System.out.println(e));
		System.out.println("");		
		System.out.println("Aplicado uma multiplicação por 2 em cada elemento:");
		lista.stream().filter(e -> e % 2 == 0).skip(2).limit(2).map(e -> e *2).forEach(e -> System.out.println(e));
		System.out.println("");	
		System.out.println("Resultado final:");		
		lista.stream().filter(e -> e % 2 == 0).skip(2).limit(2).map(e -> e *2).forEach(e -> System.out.println(e));
		

	}

}
