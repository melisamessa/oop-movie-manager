package tpe.ib;

public class AtributoString extends Atributo{
	private String valor;

	
	public AtributoString(String valor) {
		super();
		this.valor = valor;
	}

	@Override
	public Comparable getValor() {
		return valor;
	}
	
	public boolean contains(String val) {
		return valor.contains(val);
	}

}
