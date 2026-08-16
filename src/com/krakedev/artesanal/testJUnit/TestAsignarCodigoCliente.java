package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.Negocio;

public class TestAsignarCodigoCliente {
	
	@Test
	public void asignarCodigo() {
		Negocio barDeMoe = new Negocio ();
		
		Cliente oscar = new Cliente ("Oscar", "1723291801");
		Cliente paul = new Cliente ("Paul", "1723291819");
		
		barDeMoe.asignarCodigoCliente(oscar);
		barDeMoe.asignarCodigoCliente(paul);

		assertEquals(100,oscar.getCodigo());
		assertEquals(101,paul.getCodigo());
	}

}
