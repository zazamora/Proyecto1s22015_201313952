package org.transmetro.manejador;

import java.rmi.RemoteException;
import java.util.ArrayList;

import org.transmetro.bean.Busito;
import org.transmetro.bean.Choferito;

import com.transmetro.estructuras.Bus;
import com.transmetro.estructuras.ListaDoble;
import com.transmetro.estructuras.NodoDoble;
import com.transmetro.ws.ImplService;
import com.transmetro.ws.ImplServiceProxy;

public class Manejador {
	private static Manejador instancia;
	private String proxy = "http://localhost:8081/WServiceTransmetro/services/ImplService";
	private ImplService webService = new ImplServiceProxy(proxy);
	public static Manejador getInstancia(){
		if(instancia == null){
			instancia = new Manejador();
		}
		return instancia;
	}
	
	public String getProxy(){
		return proxy;
	}
	public ArrayList<Busito> getBuses(){
		ArrayList<Busito> lBuses = new ArrayList<Busito>();
		try {
			String [] lista = webService.getBuses();
			for(String e:lista){
				String[] datos = e.split(",");
				Busito bus = new Busito(datos[0],datos[1],Integer.parseInt(datos[2]),datos[3],datos[4],datos[5]);
				lBuses.add(bus);
			}
		} catch (RemoteException e) {
			System.out.println("No logro convertir");
		}
		
		return lBuses;
	}
	public ArrayList<Choferito> getChoferes(){
		ArrayList<Choferito> lChoferes = new ArrayList<Choferito>();
		try {
			String [] lista = webService.getChoferes();
			for(String e:lista){
				String[] datos = e.split(",");
				Choferito chofer = new Choferito(Integer.parseInt(datos[0]),datos[1],datos[2]);
				lChoferes.add(chofer);
			}
		}catch (RemoteException e) {
			System.out.println("No logro convertir");
		}
		
		return lChoferes;
	}
}
