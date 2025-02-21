package tpe.ib;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Pelicula {
	private HashMap <String, Atributo> atributos;

	public void setValue(String clav,Atributo val) {
		atributos.put(clav, val);
	}
	
	public Pelicula() {
		atributos = new HashMap<String, Atributo>();
	}
	
	public void addAtributo(String clave, Atributo valor) {
		atributos.put(clave, valor);
	}

	public Atributo getAtributo(String clave) {
		return atributos.get(clave);
	}

	public Set getClave() {
		Set<String> claves = atributos.keySet();
		return claves;
	}

	public String toString() {
		String toString = "---------------------------------------------\n";
				for (Map.Entry<String, Atributo> entry: atributos.entrySet()) {
			toString += entry.getKey() + ": " + entry.getValue().getValor() + "\n";
		}
		return toString;
	}

}
