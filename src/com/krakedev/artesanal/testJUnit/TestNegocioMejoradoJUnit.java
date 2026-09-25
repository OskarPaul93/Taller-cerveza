package com.krakedev.artesanal.testJUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestNegocioMejoradoJUnit {

	@Test
	public void probarGenerarCodigo() {

		NegocioMejorado negocio = new NegocioMejorado();

		String codigo = negocio.generarCodigo();

		System.out.println("Código generado: " + codigo);

		assertTrue(codigo.startsWith("M-"));
	}
	
	
	//Maquina encontrada
	@Test
	public void probarRecuperarMaquina() {

		NegocioMejorado negocio = new NegocioMejorado();

		negocio.agregarMaquina("Pilsener", "Cerveza rubia", 0.05);

		String codigo = negocio.getMaquinas().get(0).getCodigo();

		Maquina maquina = negocio.recuperarMaquina(codigo);

		assertEquals(codigo, maquina.getCodigo());
	}
	
	//Maquina que no existe
	
	@Test
	public void probarRecuperarMaquinaNoExiste() {

		NegocioMejorado negocio = new NegocioMejorado();

		negocio.agregarMaquina("Pilsener", "Cerveza rubia", 0.05);

		Maquina maquina = negocio.recuperarMaquina("M-999");

		assertEquals(null, maquina);
	}
	



}

