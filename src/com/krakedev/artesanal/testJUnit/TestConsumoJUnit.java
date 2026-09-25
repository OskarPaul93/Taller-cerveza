package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestConsumoJUnit {
	@Test
	public void probarClienteActualizado() {

		// Crear el negocio
		NegocioMejorado negocio = new NegocioMejorado();

		// Registrar un cliente
		negocio.registrarCliente("Oscar", "1234567890");

		// Obtener el cliente registrado
		Cliente cliente = negocio.buscarClientePorCodigo(100);

		// Registrar una máquina
		negocio.agregarMaquina("Pilsener", "Cerveza rubia", 0.05);

		// Obtener la máquina registrada
		Maquina maquina = negocio.getMaquinas().get(0);

		// Cargar la máquina
		maquina.llenarMaquina();

		// Obtener el código de la máquina
		String codigoMaquina = maquina.getCodigo();

		// Consumir 100 ml
		negocio.consumirCerveza(100, codigoMaquina, 100);

		// Comprobar que el total consumido del cliente es $5
		assertEquals(5.0, cliente.getTotalConsumido(), 0.0001);
	}

	@Test
	public void probarMaquinaAfectada() {

		// Crear el negocio
		NegocioMejorado negocio = new NegocioMejorado();

		// Registrar un cliente
		negocio.registrarCliente("Oscar", "1234567890");

		// Registrar una máquina
		negocio.agregarMaquina("Pilsener", "Cerveza rubia", 0.05);

		// Obtener la máquina registrada
		Maquina maquina = negocio.getMaquinas().get(0);

		// Cargar la máquina
		maquina.llenarMaquina();

		// Obtener el código de la máquina
		String codigoMaquina = maquina.getCodigo();

		// Consumir 100 ml
		negocio.consumirCerveza(100, codigoMaquina, 100);

		// Comprobar que la máquina perdió 100 ml
		assertEquals(9700, maquina.getCantidadActual(), 0.0001);
	}

	@Test
	public void probarValorCorrecto() {

		// Crear el negocio
		NegocioMejorado negocio = new NegocioMejorado();

		// Registrar un cliente
		negocio.registrarCliente("Oscar", "1234567890");

		// Obtener el cliente
		Cliente cliente = negocio.buscarClientePorCodigo(100);

		// Registrar una máquina
		negocio.agregarMaquina("Pilsener", "Cerveza rubia", 0.05);

		// Obtener la máquina
		Maquina maquina = negocio.getMaquinas().get(0);

		// Cargar la máquina
		maquina.llenarMaquina();

		// Obtener el código de la máquina
		String codigoMaquina = maquina.getCodigo();

		// Consumir 100 ml
		negocio.consumirCerveza(100, codigoMaquina, 100);

		// Comprobar que el valor del consumo es correcto
		assertEquals(5.0, cliente.getTotalConsumido(), 0.0001);
	}
}