package listaexercicios.lista3.exercicio4;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.sun.net.httpserver.Filter;

public class Main {

	public static void main(String[] args) {

		// testes
		List<List<String>> nomes = new ArrayList<>();
		nomes.add(asList("Paulo"));
		nomes.add(asList("Camila"));
		nomes.add(asList("Ana Maria"));
		nomes.add(asList("Patrick"));
		nomes.add(asList("Ana Clara"));
		nomes.add(asList("Pedro"));
		nomes.add(asList("Alfredo"));

		List<String> collect = nomes.stream().flatMap(Collection::stream).collect(Collectors.toList());
		collect.forEach(System.out::println);
		System.out.println(collect);

		List<String> nomes1 = asList("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo");
		String[] split = nomes1.get(0).split("");
		System.out.println(Arrays.toString(split));
		// List<String[]> collect1 = nomes1.stream().map(p ->
		// p.split("")).collect(Collectors.toList());
		// Stream<String> stream = Arrays.stream((String[]) nomes.toArray());
		List<String> collect2 = nomes1.stream().map(p1 -> p1.split("")).flatMap(Arrays::stream)
				.collect(Collectors.toList());
		System.out.println(collect2);

		// List<String> collect3 = nomes1.stream().map(p2 ->
		// p2.startsWith("P")).collect(Collectors.toList());
		// System.out.println(collect3);

		// List<String> collect3 = nomes1.stream().map(p2 ->
		// p2.startsWith("P")).collect(Collectors.toList());
		// System.out.println(collect3);

		// Map<Boolean, List<Integer>> mapa = lista.stream().map(e -> e * 3)
		// .collect(Collectors.groupingBy(e -> e % 2 == 0));
//System.out.println("GroupingBy: " + mapa + "\n");

		List<Boolean> collect4 = nomes1.stream().map(e -> e.startsWith("P")).collect(Collectors.toList());
		System.out.println("Iniciado com P: " + collect4 + "\n");
		
		List<Boolean> collect5 = nomes1.stream().map(e -> e.startsWith("P")).filter(e -> e == true).collect(Collectors.toList());
		System.out.println("Iniciado com P2: " + collect5 + "\n");
		System.out.println(String.valueOf(collect5));
	
		//Map<Object, List<String>> collect5 = nomes1.stream().map(e -> String.valueOf(e.startsWith("P")))
		//		.collect(Collectors.groupingBy(e -> String.valueOf(String.valueOf(true))));
		// String collect = lista.stream().map(e ->
		// String.valueOf(e)).collect(Collectors.joining(":"));
		//System.out.println("Joining: " + collect + "\n");

		//System.out.println("Joining: " + collect5 + "\n");

		// Map<Integer, List<Integer>> mapas =
		// lista.stream().collect(Collectors.groupingBy(e -> e % 3));
		// System.out.println("GroupingBy agrupado pelo resto da divisão por 3: " +
		// mapas + "\n");

	}

}
