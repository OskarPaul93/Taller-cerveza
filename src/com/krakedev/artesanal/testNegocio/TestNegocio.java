package com.krakedev.artesanal.testNegocio;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.Negocio;

public class TestNegocio {

	public static void main(String[] args) {
		
		Negocio n1= new Negocio ();
		
		
		System.out.println("Nombre: " + n1.getNombre());
		System.out.println("Maquina: " + n1.getMaquinaA());
		
		
		Maquina m1 = n1.getMaquinaA();
		double capacidad= m1.getCapacidadMaxima();

	}

}
