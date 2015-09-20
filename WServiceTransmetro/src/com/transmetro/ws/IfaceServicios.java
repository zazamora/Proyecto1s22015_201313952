package com.transmetro.ws;

import java.util.ArrayList;

import com.transmetro.estructuras.Bus;
import com.transmetro.estructuras.Chofer;
import com.transmetro.estructuras.Estacion;
import com.transmetro.estructuras.Informacion;
import com.transmetro.estructuras.ListaDoble;
import com.transmetro.estructuras.Ruta;

public interface IfaceServicios {
	Informacion validaLogin(String id, String pass, int tipo);
	void crearAdmin(Informacion admin);
	String verAdmins();
	void crearChofer(Chofer chofer);
	void crearBus(Bus bus);
	void crearEstacion(Estacion estacion);
	void crearRuta(Ruta ruta);
	//ArrayList<Bus> getListaBuses();
	ListaDoble getListaBuses();
	String[] getBuses();
	String[] getChoferes();
	String[] getEstaciones();
	String[] getRutas();
	String getGraphAVLChofer();
	String getGraphAVLAdmin();
}

