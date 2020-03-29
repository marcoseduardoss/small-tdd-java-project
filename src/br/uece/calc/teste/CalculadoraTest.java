package br.uece.calc.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.uece.calc.app.Calculadora;

class CalculadoraTest {

	@Test
	void testarSoma() {
		
		int valorAtual = new Calculadora().somar(1, 2);
		int valorEsperado = 3;
		
		assertEquals(valorEsperado, valorAtual);
		
	}
	
	@Test
	void testarValorNuloSoma() {
		int valorAtual = new Calculadora().somar(1, null);
		int valorEsperado = 1;
		
		assertEquals(valorEsperado, valorAtual);
	}

	
	@Test
	void testarSubtracao() {
		
		int valorAtual = new Calculadora().subtrair(1, 2);
		int valorEsperado = -1;
		
		assertEquals(valorEsperado, valorAtual);
	}
	
	

}
