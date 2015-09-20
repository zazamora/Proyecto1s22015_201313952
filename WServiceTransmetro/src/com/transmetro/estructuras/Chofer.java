package com.transmetro.estructuras;

import java.io.Serializable;

public class Chofer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int clave;
	private String nombre;
	private String apellido;
	private String contrasena;
	private ListaDobleBus listaBuses = new ListaDobleBus();
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public ListaDobleBus getListaBuses() {
		return listaBuses;
	}
	public void reporteBus(DataBus datos) {
		this.listaBuses.insertarNodo(datos);
	}
	public Chofer() {

	}
	
}
