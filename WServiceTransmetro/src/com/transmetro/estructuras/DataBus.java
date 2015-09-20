package com.transmetro.estructuras;

import java.io.Serializable;

public class DataBus implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5458332999132348493L;
	private String tiempoLlegada;
	private String tiempoSalida;
	private String fecha;
	private String idBus;
	private String estacion;
	public String getTiempoLlegada() {
		return tiempoLlegada;
	}
	public void setTiempoLlegada(String tiempoLlegada) {
		this.tiempoLlegada = tiempoLlegada;
	}
	public String getTiempoSalida() {
		return tiempoSalida;
	}
	public void setTiempoSalida(String tiempoSalida) {
		this.tiempoSalida = tiempoSalida;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getIdBus() {
		return idBus;
	}
	public void setIdBus(String idBus) {
		this.idBus = idBus;
	}
	public String getEstacion() {
		return estacion;
	}
	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}
	public DataBus() {
	}
	
}
