package cole��o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;

public class Cole��o {
	public static void main(String[] args) {
		// Instanciar collection (instanciar uma cole��o)
		Collection <String> c1 = new ArrayList <> ();
		// Primeiro M�todo: m�todo .add (adiciona elementos na cole��o)
		c1.add("A");
		c1.add("E");
		c1.add("I");
		c1.add("O");
		c1.add("U");
		
		// Apresentar a cole��o no formato String
		System.out.println(c1.toString());
		// Verificar se a cole��o c1 est� vazia
		System.out.println(c1.isEmpty());
		// Exibir a quantidade de elementos da cole��o
		System.out.println(c1.size());
		
		/*
		c1.remove("I");
		System.out.println(c1.toString());
		System.out.println(c1.size());
		*/
		
		// Criar outra cole��o de string
		Collection <String> c2 = Arrays.asList("a", "e", "i", "o", "u");
		// .asList --> transforma o array em uma lista (que � uma cole��o)
		
		// Adicionar a, e, i, o, u na outra cole��o c1
		c1.addAll(c2); // Adiciona todos os elementos de c2 em c1
		System.out.println(c1.toString()); // Visualizar c1 + c2
		// Verificar se c1 possui todos os elementos em c1
		c1.removeAll(c2);
		System.out.println(c1.toString());
		// Verificar se c1 possui todos os elementos de c2
		System.out.println(c1.containsAll(c2));
		
		c1.clear(); // Limpa a cole��o c1
		System.out.println(c1);
		
		
		
	}

}
