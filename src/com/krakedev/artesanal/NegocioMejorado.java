package com.krakedev.artesanal;

import java.util.ArrayList;

public class NegocioMejorado {
	
	public ArrayList<Maquina> maquinas;
	private ArrayList<Cliente> clientes = new ArrayList<>();
	private int ultimoCodigo =100;
	
	public void registrarCliente (String nombre, String cedula) {
		Cliente cliente = new Cliente (nombre, cedula);
		cliente.setCodigo(ultimoCodigo);
	    ultimoCodigo++;
	    clientes.add(cliente);
	}
	
	
	
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}




	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}




	public NegocioMejorado () {
		maquinas = new ArrayList<Maquina>();
	}

	public ArrayList<Maquina> getMaquinas() {
		return maquinas;
	}

	public void setMaquinas(ArrayList<Maquina> maquinas) {
		this.maquinas = maquinas;
	}
	
	
	public String generarCodigo () {
		int numero = (int) (Math.random()*100) +1;
		return "M- " + numero;
	}
	
	public boolean agregarMaquina(String nombreCerveza, String descripcion, double precioPorMl) {

		String codigo = generarCodigo();
		Maquina maquinaExistente = recuperarMaquina(codigo);
		
		if(maquinaExistente !=null) {
			return false;
		}

		Maquina maquina = new Maquina(codigo, nombreCerveza, descripcion, precioPorMl);

		maquinas.add(maquina);
		
		return true;
	}
	
	
	public void cargarMaquinas () {
		for (int i =0; i<maquinas.size ();i++) {
			Maquina maquina = maquinas.get(i);
			maquina.llenarMaquina();
		}	
		
	}
	
	public Maquina recuperarMaquina(String codigo) {
		for (int i=0; i< maquinas.size();i++) {
			Maquina maquina = maquinas.get(i);
			if (maquina.getCodigo().equals(codigo)) {
				return maquina;
			}
		}
		return null;
	}
	
	
	public Cliente buscarClientePorCedula (String cedula) {
		
		for (int i=0; i<clientes.size();i++) {
			Cliente c= clientes.get(i);
			
			if (c.getCedula().equals(cedula)) {
				return c;
			}
		}
		return null;
	}
	
	public Cliente buscarClientePorCodigo(int codigo) {

	    for (int i = 0; i < clientes.size(); i++) {
	    	Cliente c1 = clientes.get(i);

	        if (c1.getCodigo() == codigo) {
	            return c1;
	        }
	    }

	    return null;
	}
	

}
