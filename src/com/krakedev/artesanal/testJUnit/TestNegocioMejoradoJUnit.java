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
	
	//Prueba de maquina agregada
	
	@Test
	public void probarAgregarMaquinaCorrectamente() {

		NegocioMejorado negocio = new NegocioMejorado();

		boolean resultado = negocio.agregarMaquina("Pilsener", "Cerveza rubia", 0.05);

		assertEquals(true, resultado);
	}
	
	@Test
	public void probarConsultarValorVendido() {

	    // Crear el negocio
	    NegocioMejorado negocio = new NegocioMejorado();

	    // Registrar dos clientes
	    negocio.registrarCliente("Oscar", "1234567890");
	    negocio.registrarCliente("Juan", "0987654321");

	    // Registrar una máquina
	    negocio.agregarMaquina("Pilsener", "Cerveza rubia", 0.05);

	    // Obtener la máquina
	    Maquina maquina = negocio.getMaquinas().get(0);

	    // Cargar la máquina
	    maquina.llenarMaquina();

	    // Obtener el código de la máquina
	    String codigoMaquina = maquina.getCodigo();

	    // Cliente 100 consume 100 ml = $5
	    negocio.consumirCerveza(100, codigoMaquina, 100);

	    // Cliente 101 consume 200 ml = $10
	    negocio.consumirCerveza(101, codigoMaquina, 200);

	    // Consultar el total vendido
	    double totalVendido = negocio.consultarValorVendido();

	    // Comprobar que se acumularon los dos consumos
	    assertEquals(15.0, totalVendido, 0.0001);
	}
	



}

