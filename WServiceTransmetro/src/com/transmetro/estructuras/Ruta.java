package com.transmetro.estructuras;

import java.io.Serializable;
//import java.util.ArrayList;

public class Ruta  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	//private ArrayList<String> listaEstaciones = new ArrayList<String>();
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/*public ArrayList<String> getListaEstaciones() {
		return listaEstaciones;
	}
	public void addEstacion(String estacion) {
		this.listaEstaciones.add(estacion);
	}
	public void removeEstacion(String estacion){
		this.listaEstaciones.remove(estacion);
	}*/
	
}
