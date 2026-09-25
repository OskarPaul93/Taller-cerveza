package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;
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
		
		
		//Prueba de recuperar Maquina
		
		NegocioMejorado negocio1 = new NegocioMejorado();

		negocio1.agregarMaquina("Pilsener", "Cerveza rubia", 0.05);

		Maquina maquina = negocio1.getMaquinas().get(0);

		System.out.println("Código: " + maquina.getCodigo());

		Maquina encontrada = negocio1.recuperarMaquina(maquina.getCodigo());

		if (encontrada != null) {
			encontrada.imprimir();
		}
	}
}