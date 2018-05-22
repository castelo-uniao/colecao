package coleção;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;

public class Coleção {
	public static void main(String[] args) {
		// Instanciar collection (instanciar uma coleção)
		Collection <String> c1 = new ArrayList <> ();
		// Primeiro Método: método .add (adiciona elementos na coleção)
		c1.add("A");
		c1.add("E");
		c1.add("I");
		c1.add("O");
		c1.add("U");
		
		// Apresentar a coleção no formato String
		System.out.println(c1.toString());
		// Verificar se a coleção c1 está vazia
		System.out.println(c1.isEmpty());
		// Exibir a quantidade de elementos da coleção
		System.out.println(c1.size());
		
		/*
		c1.remove("I");
		System.out.println(c1.toString());
		System.out.println(c1.size());
		*/
		
		// Criar outra coleção de string
		Collection <String> c2 = Arrays.asList("a", "e", "i", "o", "u");
		// .asList --> transforma o array em uma lista (que é uma coleção)
		
		// Adicionar a, e, i, o, u na outra coleção c1
		c1.addAll(c2); // Adiciona todos os elementos de c2 em c1
		System.out.println(c1.toString()); // Visualizar c1 + c2
		// Verificar se c1 possui todos os elementos em c1
		c1.removeAll(c2);
		System.out.println(c1.toString());
		// Verificar se c1 possui todos os elementos de c2
		System.out.println(c1.containsAll(c2));
		
		c1.clear(); // Limpa a coleção c1
		System.out.println(c1);
		
		
		
	}

}
