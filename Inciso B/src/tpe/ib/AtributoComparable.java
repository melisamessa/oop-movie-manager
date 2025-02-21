package tpe.ib;

public class AtributoComparable extends Atributo{
	private Comparable valor;

	public AtributoComparable(Comparable valor) {
		super();
		this.valor = valor;
	}

	@Override
	public Comparable getValor() {
		return valor;
	}
	
	

}
