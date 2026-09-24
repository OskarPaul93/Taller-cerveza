package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestNegocioMejoradoJUnit {

	@Test
	public void probarGenerarCodigo() {

		NegocioMejorado negocio = new NegocioMejorado();

		String codigo = negocio.generarCodigo();

		System.out.println("Código generado: " + codigo);

		assertTrue(codigo.startsWith("M-"));
	}
}

