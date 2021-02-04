package listaexercicios.lista3.exercicio3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(11, 247, 345, 444, 578, 6879, 700, 8456, 58, 59);
		System.out.println("Lista:" + lista + "\n");

		Optional<Integer> max = lista.stream().max(Comparator.naturalOrder());
		System.out.println("Maior valor da lista: " + max.get() + "\n");

		Optional<Integer> min = lista.stream().min(Comparator.naturalOrder());
		System.out.println("Menor valor da lista: " + min.get() + "\n");

		long count = lista.stream().count();
		System.out.println("Quantidade de números na lista: " + count + "\n");

		
		int cont = 1;
		Random geradorNumero = new Random();
		int[] listaAleatoria = new int[100];

		System.out.println("Gerado automaticamente:");
		do {
			for (int i = 0; i < listaAleatoria.length; i++) {

				listaAleatoria[i] = geradorNumero.nextInt(100 + 1);
				System.out.println("[" + cont + "]" + listaAleatoria[i]);
				cont++;
			}
		} while (cont <= 100);

	}

}
