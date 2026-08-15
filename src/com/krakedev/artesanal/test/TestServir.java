package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestServir {

	public static void main(String[] args) {
		Maquina rubia = new Maquina("123","Pilsener", "Cerveza fria", 0.02, 8000);

		System.out.println("---- Estado inicial-----");
		rubia.imprimir();
		
		System.out.println("---- Llenando Maquina-----");
		rubia.llenarMaquina();
		rubia.imprimir();
		
		System.out.println("---- Servir 1000ml-----");
		double valor;
		valor=rubia.servirCerveza(1000);
		System.out.println("Precio a pagar: " + valor + "$");
		
		rubia.imprimir();
		
		System.out.println("---- Servir 2000ml-----");
		double valor1;
		valor1=rubia.servirCerveza(2000);
		System.out.println("Precio a pagar: " + valor1 + "$");
		rubia.imprimir();
		
		System.out.println("---- Servir 6000ml-----");
		double valor2;
		valor2=rubia.servirCerveza(6000);
		System.out.println("Precio a pagar: " + valor2 + "$");
		rubia.imprimir();

	}

}
