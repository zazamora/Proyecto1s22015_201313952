package org.transmetro.bean;

public class Choferito {
	private int clave;
	private String nombre;
	private String apellido;
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
	public Choferito() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Choferito(int clave, String nombre, String apellido) {
		super();
		this.clave = clave;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
}
