package br.com.zup.editora;

import java.util.ArrayList;
import java.util.List;


public class Banco {
	
	private static List<Autores> lista = new ArrayList<>();
	
	public void add(Autores autores) {
		
		lista.add(autores);
		
	}
	
	public List<Autores> getAutores(){
		return Banco.lista;
	}

}
