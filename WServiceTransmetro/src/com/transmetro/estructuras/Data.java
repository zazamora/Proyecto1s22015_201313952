package com.transmetro.estructuras;

import java.io.Serializable;

public class Data implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2003080800414697519L;
	private Bus bus;
	private String tiempoLlegada;
	private String tiempoSalida;
	private String fecha;
	private String idBus;
	private String idRuta;
	private Ruta ruta;
	
    public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public String getIdBus() {
		return idBus;
	}

	public void setIdBus(String idBus) {
		this.idBus = idBus;
	}

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

	public String getIdRuta() {
		return idRuta;
	}

	public void setIdRuta(String idRuta) {
		this.idRuta = idRuta;
	}

	public Ruta getRuta() {
		return ruta;
	}

	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}

	public Data() {
    }
}
