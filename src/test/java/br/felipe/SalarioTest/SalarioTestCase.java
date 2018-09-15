package br.felipe.SalarioTest;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;


public class SalarioTestCase {
	
	private Salario salarioTeste;
	private CalculadorSalario calcSal;


	@Before
	public void init() {
		salarioTeste = new Salario(160, 150.00, 3);
	
		
		calcSal = new CalculadorSalario(salarioTeste);
		
		}
	
	@Test
	public void testarSalarioBruto() {
		calcSal.calculaSalarioBruto();
		
		assertEquals(24150, calcSal.getSalarioBruto(), 0.001);
		
	}
	
	@Test
	public void testarDescontoINSS() {
		calcSal.calculaDescontoINSS();
		
		assertEquals(2173.50, calcSal.getDescontoINSS(), 0.001);
		
	}
	
	@Test
	public void testarDescontoIR() {
		calcSal.calculaDescontoIR();
		
		assertEquals(1690.50, calcSal.getImpostoRenda(), 0.001);
		
	}
	
	@Test
	public void testarSalarioLiquido() {
		calcSal.calculaSalarioLiquido();
		
		assertEquals(20286, calcSal.getSalarioLiquido(), 0.001);
		
	}
	
	
}
	