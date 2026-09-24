package com.krakedev.artesanal.test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestNegocioMejorado {

	public static void main(String[] args) {

		NegocioMejorado negocio = new NegocioMejorado();

		System.out.println(negocio.generarCodigo());
		System.out.println(negocio.generarCodigo());
		System.out.println(negocio.generarCodigo());
		
		negocio.agregarMaquina("Pilsener", "Cerveza rubia", 0.05);

		System.out.println("Cantidad de maquinas: " + negocio.getMaquinas().size());

		negocio.getMaquinas().get(0).imprimir();
	}
}