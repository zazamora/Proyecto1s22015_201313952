package com.transmetro.estructuras;

import java.io.Serializable;

public class Estacion  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String pass;
	private String tipo;
	private String horaLlegada;
	private int personas;
	private boolean nuevo;
	private int pcargadas;
	private int psistema;
	private String nombre;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getHoraLlegada() {
		return horaLlegada;
	}
	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}
	public int getPersonas() {
		return personas;
	}
	public void setPersonas(int personas) {
		this.personas = personas;
	}
	public boolean isNuevo() {
		return nuevo;
	}
	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}
	public int getPcargadas() {
		return pcargadas;
	}
	public void setPcargadas(int pcargadas) {
		this.pcargadas = pcargadas;
	}
	public int getPsistema() {
		return psistema;
	}
	public void setPsistema(int psistema) {
		this.psistema = psistema;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Estacion() {
		
	}
	
}
