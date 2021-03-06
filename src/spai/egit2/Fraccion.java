package spai.egit2;

/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el
 * denominador
 * 
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el
 * denominador
 * 
 * Dos fracciones son equivalentes cuando el producto de extremos es igual al
 * producto de medios
 * 
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto
 * sucede cuando el numerador y el denominador son primos entre s�
 * 
 * Reducir varias fracciones a com�n denominador consiste en convertirlas en
 * otras equivalentes que tengan el mismo denominador
 * 
 * Comparar fracciones
 * 
 * Suma fracciones: En primer lugar se reducen los denominadores a com�n
 * denominador, y se suman o se restan los numeradores de las fracciones
 * equivalentes obtenidas
 * 
 * Multiplicaci�n: La multiplicaci�n de dos fracciones es otra fracci�n
 * que tiene: Por numerador el producto de los numeradores. Por denominador el
 * producto de los denominadores.
 * 
 * La divisi�n de dos fracciones es otra fracci�n que tiene: Por numerador
 * el producto de los extremos. Por denominador el producto de los medios.
 * Invertir fraccion
 * 
 * @author jbernal
 * 
 */
public class Fraccion {
	private int numerador;

	private int denominador;

	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public Fraccion() {
		this(1, 1);
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	public double decimal() {
		return (double) numerador / denominador;
	}

	public boolean EsPropia() {
		boolean espropia;
		if (this.denominador > this.numerador) {
			espropia = true;
		} else
			espropia = false;
		return espropia;
	}

	public boolean EsImpropia() {
		boolean esimpropia;
		if (this.denominador < this.numerador) {
			esimpropia = true;
		} else
			esimpropia = false;
		return esimpropia;
	}

	public boolean EsEquivalente(Fraccion fraccion) {
		return (this.getNumerador() * fraccion.getDenominador()) == (this
				.getDenominador() * fraccion.getNumerador());
	}

	// Metodo multiplicar sin implementar..
	public void multiplicar(Fraccion frac) {
		// TODO Auto-generated method stub
		this.numerador = frac.getNumerador() * this.numerador;

		this.denominador = frac.getDenominador() * this.denominador;
	}

	// Metodo multiplicar sin implementar..
	public Fraccion sumar(Fraccion frac) {
		// TODO Auto-generated method stub
		this.numerador = (this.numerador * frac.denominador)
				+ (this.denominador * frac.numerador);

		this.denominador = this.denominador * frac.denominador;

		return this;
	}

}
