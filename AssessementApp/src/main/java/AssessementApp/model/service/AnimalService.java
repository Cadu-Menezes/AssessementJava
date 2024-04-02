package AssessementApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import AssessementApp.model.domain.Animal;



public class AnimalService {
	
	private static Map<Integer, Animal> animais =  new HashMap<Integer, Animal>();
	
	private static Integer id = 0;
	
	public static void incluir(Animal animal) {
		
		animal.setId(++id);
		
		animais.put(animal.getId(), animal);
	
	}
	
	public static void excluir(Integer id) {
		animais.remove(id);
	}
	
	public static Collection<Animal> obterLista() {
		return animais.values();
	}
	
	
	public static Animal pesquisar(Integer id) {
		return animais.get(id);
	}
	
}
