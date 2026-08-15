package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestAtributos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maquina rubia = new Maquina("123","Pilsener", "cerveza rubia", 0.02, 20000);
		rubia.imprimir();
		
		//El set cambia el valor del atributo
		rubia.setNombreCerveza("Golden");
		rubia.setDescripcion("Cerveza con aroma mas intenso");
		rubia.imprimir();
	}

}
