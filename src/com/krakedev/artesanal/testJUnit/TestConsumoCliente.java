package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.Negocio;

public class TestConsumoCliente {
	
	@Test
	public void probarConsumo() {
		
		Maquina mA= new Maquina ("123", "Pilsener", "Rubia", 0.002, 8000);
		Negocio barDeMoe= new Negocio ("Bar de Moe", mA);
		Cliente client = new Cliente ("Andres", "123456789");
		
		barDeMoe.cargarMaquinaA();
		
		barDeMoe.consumirCervezaMaquinaA(client, 100);
		
		assertEquals(7700,mA.getCantidadActual(), 0.0001);
		assertEquals(0.2,client.getTotalConsumido(), 0.0001);
		
		
		barDeMoe.consumirCervezaMaquinaA(client, 200);
		
		assertEquals(7500,mA.getCantidadActual(), 0.0001);
		assertEquals(0.6,client.getTotalConsumido(), 0.0001);
	}

}
