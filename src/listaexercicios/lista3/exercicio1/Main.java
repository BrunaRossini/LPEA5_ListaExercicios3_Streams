package listaexercicios.lista3.exercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 9, 8, 22, 15, 15, 8, 4, 5, 6);
		Integer num = 0;
		
		
		/*
		 * Scanner l = new Scanner(System.in);
		 * System.out.println("Informe o último número a lista: "); num = l.nextInt();
		 * //list.stream().boxed.(collect)(Collectors.toList());
		 * System.out.println(num); list.stream(num); System.out.println(list);
		 * 
		 * l.close();
		 */

		// Gere uma lista com números e 1 a n duplicados

		// Mostrar todos os números
		System.out.println("Todos os números:" + list + "\n");

		// mostrar todos os números sem repetição
		System.out.println("Números sem repetição:");
		list.stream().distinct().forEach(e -> System.out.println(e));

		// ímpares sem repetição
		System.out.println("Números ímpares sem repetição:");
		list.stream().distinct().filter(e -> e % 2 != 0).forEach(e -> System.out.println(e));
		
		// pares sem repetição
		System.out.println("Números pares sem repetição:");
		list.stream().distinct().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));
		
		// a partir do  5 algorismo sem repetição
		System.out.println("Números a partir do  5 algorismo:");
		list.stream().distinct().skip(5).forEach(e -> System.out.println(e));		
		
		//todos os números multiplicados por 4 
		
		System.out.println("Números multiplicados por 4: ");
		list.stream().distinct().filter(e -> e % 4 ==0).forEach(e -> System.out.println(e));		
	}

}
