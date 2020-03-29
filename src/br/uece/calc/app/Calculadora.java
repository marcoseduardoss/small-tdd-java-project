package br.uece.calc.app;

public class Calculadora {

	/**
	 * Realiza operação de soma
	 * 
	 * @param i
	 * @param j
	 * @return
	 */
	public Integer somar(Integer i, Integer j) {
			
		Integer valor1 = i, valor2 = j;
		
		if(i == null) 
			valor1 = 0;
		
		if(j == null) 
			valor2 = 0;
		
		return valor1 + valor2;
	}

	/**
	 * Realiza operação de soma
	 * @param i
	 * @param j
	 * @return
	 */
	public Integer subtrair(Integer i, Integer j) {
		return i - j;
	}

}
