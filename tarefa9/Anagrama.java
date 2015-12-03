package tarefa9;

import java.util.ArrayList;
import java.util.List;

public class Anagrama {

	public static boolean comparar(String word1, String word2) 
	{
		word1 = word1.toLowerCase().replaceAll(" ", "");
		word2 = word2.toLowerCase().replaceAll(" ", "");
		
		List<Character> lista1 = new ArrayList<Character>();
		List<Character> lista2 = new ArrayList<Character>();
		
		for(char c : word1.toCharArray())  lista1.add(c);
		for(char c : word2.toCharArray())  lista2.add(c);
		
		return lista1.containsAll(lista2) && lista1.size() == lista2.size();
	}
}
