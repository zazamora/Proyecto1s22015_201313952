package org.transmetro.bean;

public class Busito {
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
	public Busito() {

	}
	public Busito(String id, String ruta, int claveChofer,
			String horarioInicio, String horarioFin, String fecha) {
		super();
		this.id = id;
		this.ruta = ruta;
		this.claveChofer = claveChofer;
		this.horarioInicio = horarioInicio;
		this.horarioFin = horarioFin;
		this.fecha = fecha;
	}
}
