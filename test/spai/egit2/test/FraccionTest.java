package spai.egit2.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import spai.egit2.Fraccion;

public class FraccionTest {
	private Fraccion fraccion;

	@Before
	public void initObjects() {
		this.fraccion = new Fraccion(2, 3);
	}

	@Test
	public void testcontructorIntInt() {
		assertEquals(2, this.fraccion.getNumerador());
		assertEquals(3, this.fraccion.getDenominador());
	}

	@Test
	public void testConstructorSinParametros() {
		Fraccion fraccion = new Fraccion();
		assertEquals(1, fraccion.getNumerador());
		assertEquals(1, fraccion.getDenominador());
	}

	@Test
	public void testSetNumerador() {
		this.fraccion.setNumerador(4);
		assertEquals(4, fraccion.getNumerador());
	}

	@Test
	public void testSetDenominador() {
		this.fraccion.setDenominador(4);
		assertEquals(4, fraccion.getDenominador());
	}

	@Test
	public void testDecimal() {
		assertEquals(2.0 / 3.0, fraccion.decimal(), 1e-10);
	}

	@Test
	public void testEsPropia() {
		this.fraccion.setNumerador(2);
		this.fraccion.setDenominador(5);
		assertTrue(this.fraccion.EsPropia());
	}

	@Test
	public void testEsImpropia() {
		this.fraccion.setNumerador(7);
		this.fraccion.setDenominador(3);
		assertTrue(this.fraccion.EsImpropia());
	}

	@Test
	public void testEsEquivalente() {
		Fraccion fraccion = new Fraccion(4, 6);

		assertTrue(this.fraccion.EsEquivalente(fraccion));
	}

	@Test
	public void testMultiplicar() {
		Fraccion frac = new Fraccion(2, 3);
		fraccion.multiplicar(frac);
		assertEquals(4, fraccion.getNumerador());
		assertEquals(9, fraccion.getDenominador());
	}

	@Test
	public void testSumar() {
		Fraccion frac = new Fraccion(3, 4);
		Fraccion result = new Fraccion();
		result = fraccion.sumar(frac);
		assertEquals(17, result.getNumerador());
		assertEquals(12, result.getDenominador());
	}
}
