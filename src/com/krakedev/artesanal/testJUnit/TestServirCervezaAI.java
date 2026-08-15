package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;

public class TestServirCervezaAI {

	@Test
	public void testServirCervezaConSuficienteCantidad() {
		// Valida que, cuando hay suficiente cerveza,
		// se descuente la cantidad servida y se retorne el valor a pagar.
		Maquina maquina = new Maquina("123","Pilsener", "Cerveza artesanal", 0.05, 5000);

		maquina.llenarMaquina();

		double cantidadInicial = maquina.getCantidadActual();

		double valor = maquina.servirCerveza(1000);

		assertEquals(50.0, valor, 0.0001);
		assertEquals(cantidadInicial - 1000, maquina.getCantidadActual(), 0.0001);
	}

	@Test
	public void testServirTodaLaCantidadDisponible() {
		// Valida que se pueda servir exactamente toda la cerveza disponible.
		// Al finalizar, la cantidad actual debe quedar en cero.
		Maquina maquina = new Maquina("123","Pilsener", "Cerveza artesanal", 0.05, 5000);

		maquina.llenarMaquina();

		double cantidadDisponible = maquina.getCantidadActual();

		double valor = maquina.servirCerveza(cantidadDisponible);

		assertEquals(cantidadDisponible * 0.05, valor, 0.0001);
		assertEquals(0.0, maquina.getCantidadActual(), 0.0001);
	}

	@Test
	public void testNoServirCuandoNoHaySuficienteCerveza() {
		// Valida que, cuando se solicita más cerveza de la disponible,
		// no se sirva nada y se retorne 0.
		Maquina maquina = new Maquina("123","Pilsener", "Cerveza artesanal", 0.05, 5000);

		maquina.llenarMaquina();

		double cantidadInicial = maquina.getCantidadActual();

		double valor = maquina.servirCerveza(cantidadInicial + 1);

		assertEquals(0.0, valor, 0.0001);
		assertEquals(cantidadInicial, maquina.getCantidadActual(), 0.0001);
	}

	@Test
	public void testNoServirCuandoMaquinaEstaVacia() {
		// Valida que, cuando la máquina está vacía,
		// no se sirva cerveza, no se modifique la cantidad actual
		// y el valor retornado sea 0.
		Maquina maquina = new Maquina("124",
				"Stout",
				"Cerveza oscura",
				0.08,
				5000
		);

		double valor = maquina.servirCerveza(500);

		assertEquals(0.0, valor, 0.0001);
		assertEquals(0.0, maquina.getCantidadActual(), 0.0001);
	}

	@Test
	public void testServirCervezaUsandoConstructorSinCapacidad() {
		// Valida el comportamiento usando el segundo constructor,
		// que establece una capacidad máxima predeterminada de 10000 ml.
		Maquina maquina = new Maquina("125",
				"IPA",
				"Cerveza artesanal",
				0.06
		);

		maquina.llenarMaquina();

		double cantidadInicial = maquina.getCantidadActual();

		double valor = maquina.servirCerveza(2000);

		assertEquals(120.0, valor, 0.0001);
		assertEquals(cantidadInicial - 2000, maquina.getCantidadActual(), 0.0001);
	}

	@Test
	public void testServirCervezaUsandoConstructorConCapacidad() {
		// Valida el comportamiento usando el constructor que permite
		// establecer una capacidad máxima específica.
		Maquina maquina = new Maquina("126",
				"Porter",
				"Cerveza artesanal",
				0.04,
				8000
		);

		maquina.llenarMaquina();

		double cantidadInicial = maquina.getCantidadActual();

		double valor = maquina.servirCerveza(3000);

		assertEquals(120.0, valor, 0.0001);
		assertEquals(cantidadInicial - 3000, maquina.getCantidadActual(), 0.0001);
	}
}