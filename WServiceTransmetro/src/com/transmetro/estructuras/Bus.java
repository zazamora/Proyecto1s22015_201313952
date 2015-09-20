package com.transmetro.estructuras;

import java.io.Serializable;

public class Bus implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String ruta;
	private int claveChofer;
	private String horarioInicio;
	private String horarioFin;
	private String fecha;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	public int getClaveChofer() {
		return claveChofer;
	}
	public void setClaveChofer(int claveChofer) {
		this.claveChofer = claveChofer;
	}
	public String getHorarioInicio() {
		return horarioInicio;
	}
	public void setHorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
	}
	public String getHorarioFin() {
		return horarioFin;
	}
	public void setHorarioFin(String horarioFin) {
		this.horarioFin = horarioFin;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Bus() {

	}
	
}
