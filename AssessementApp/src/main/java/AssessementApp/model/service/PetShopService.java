package AssessementApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import AssessementApp.model.domain.PetShop;

public class PetShopService {
	
	private static Map<Integer, PetShop> petshops =  new HashMap<Integer, PetShop>();
	
	private static Integer id = 0;
	
	public static void incluir(PetShop petshop) {
		
		petshop.setId(++id);
		
		petshops.put(petshop.getId(), petshop);
	
	}
	
	public static void excluir(Integer id) {
		petshops.remove(id);
	}
	
	public static Collection<PetShop> obterLista() {
		return petshops.values();
	}
	
	
	public static PetShop pesquisar(Integer id) {
		return petshops.get(id);
	}
	
}
