package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestRecargar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean resultado;
		Maquina rubia= new Maquina ("123","Pilsener", "Cerveza fria", 0.02, 8000);
		
		System.out.println("---- Estado inicial-----");
		rubia.imprimir();
		
		System.out.println("---Recarga 1-----");
				
		resultado= rubia.recargarCerveza(3000);
		
		System.out.println("¿Se recargo correctamente? " + resultado);
		rubia.imprimir();
		
		System.out.println("---Recarga 2-----");
		
		resultado= rubia.recargarCerveza(2000);
		
		System.out.println("¿ Se recargo correctamente? " + resultado);
		rubia.imprimir();
		
		System.out.println("---Recarga 3-----");
		
		resultado= rubia.recargarCerveza(2900);
		
		System.out.println("¿ Se recargo correctamente? " + resultado);
		rubia.imprimir();
	}

}
